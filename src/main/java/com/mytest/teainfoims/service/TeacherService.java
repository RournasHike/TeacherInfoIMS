package com.mytest.teainfoims.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mytest.teainfoims.dao.TCollegeMapper;
import com.mytest.teainfoims.dao.TDeptMapper;
import com.mytest.teainfoims.dao.TTeacherMapper;
import com.mytest.teainfoims.dao.TUserMapper;
import com.mytest.teainfoims.entity.SysMailMessage;
import com.mytest.teainfoims.mail.MailService;
import com.mytest.teainfoims.query.TeacherQuery;
import com.mytest.teainfoims.service.base.BaseService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.utils.Md5Util;
import com.mytest.teainfoims.utils.NoUtil;
import com.mytest.teainfoims.utils.SysMessageUtil;
import com.mytest.teainfoims.vo.TTeach;
import com.mytest.teainfoims.vo.TTeacher;
import com.mytest.teainfoims.vo.TUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/2/5
 */
@Service
public class TeacherService extends BaseService<TTeacher,Integer> {

    @Resource
    private MailService mailService;

    @Autowired
    private SysMailMessage message;

    @Resource
    private TUserMapper tUserMapper;

    @Resource
    private TTeacherMapper tTeacherMapper;

    @Resource
    private TCollegeMapper tCollegeMapper;

    @Resource
    private TDeptMapper tDeptMapper;

    public TTeacher getTeacherById(Integer id){
        return tTeacherMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据用户名(即教师编号)查询教师个人信息
     *
     * @param teacherNo
     * @return
     */
    public TTeacher queryTeaInfo(String teacherNo) {
        //参数校验
        AssertUtil.isTrue(StringUtils.isBlank(teacherNo), "教师编号为空，无法查询");
        TTeacher tTeacher = tTeacherMapper.queryTeaInfoByTno(teacherNo);


        //判断教师对象是否为空
        AssertUtil.isTrue(tTeacher == null, "该教师不存在");
        return tTeacher;
    }

    /**
     * 获取所有的教师
     * @return
     */
    public List<TTeacher> getAllTeachers(){
        return tTeacherMapper.getAllTeachers();
    }

    /**
     * 根据参数查找教师
     * @param collegeId
     * @param deptId
     * @return
     */
    public List<TTeacher> getTeachersByCond(Integer collegeId,Integer deptId){
        AssertUtil.isTrue(collegeId==null||deptId==null,"参数错误");
        return tTeacherMapper.getTeachersByCond(collegeId,deptId);
    }

    /**
     * 查询教师信息列表
     * @param query
     * @return
     */
    public Map<String,Object> queryTeacherList(TeacherQuery query){
        Map<String,Object> result=new HashMap<>();

        //使用PageHelper进行分页
        PageHelper.startPage(query.getPage(),query.getLimit());
        List<TTeacher> tTeachers = tTeacherMapper.selTeaInfo(query);

        PageInfo pageInfo=new PageInfo(tTeachers);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }

    /**
     * 添加教师信息
     * 1.生成教师编号，检测教师编号是否重复，重复则重新生成
     * 判断是否是外教，如果是外教，首位为L
     * 2.生成教师用户信息，并将教师信息插入教师信息表，教师用户信息插入用户表
     * 生成教师用户信息，用户名为教师职工编号,初始密码为123
     * 3.上传用户个人证件照片
     * @param tTeacher
     */
    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void addTeacher(TTeacher tTeacher){
        //参数校验
        AssertUtil.isTrue(tTeacher==null,"教师信息不能为空");

        //生成教师编号
        String teacherNo = getTeacherNo(tTeacher);

        tTeacher.setTeacherNo(teacherNo);
        //构造教师用户对象
        TUser tUser = buildTuser(tTeacher, teacherNo);

        //执行sql，将教师信息和用户信息插入数据库
        int teacherIndex = tTeacherMapper.insertSelective(tTeacher);
        int userIndex = tUserMapper.insert(tUser);

        SysMailMessage mailMessage = SysMessageUtil.getMailMessage(message, teacherNo,"123");
        //发送简单邮件
        mailService.sendSimpleMail(tTeacher.getEmail(),mailMessage.getSubject(),mailMessage.getContents());

        AssertUtil.isTrue(teacherIndex<1||userIndex<1,"添加教师信息失败！");

    }

    /**
     * 构建用户对象
     * @param tTeacher
     * @param teacherNo
     * @return
     */
    public TUser buildTuser(TTeacher tTeacher,String teacherNo){
        Date date = new Date();
        TUser tUser=new TUser();
        tUser.setUid(null);
        tUser.setUsername(teacherNo);
        tUser.setUsertruename(tTeacher.getTeacherName());
        tUser.setPassword(Md5Util.encode("123"));
        tUser.setIsValid(true);
        tUser.setRoleid(2);
        tUser.setCreateTime(date);
        tUser.setUpdateTime(date);
        return tUser;
    }

    /**
     * 生成教师编号
     * @param tTeacher
     * @return
     */
    public String getTeacherNo(TTeacher tTeacher){
        boolean flag=false;
        //查询所有教师的编号
        List<String> teacherNos = tTeacherMapper.selAll();

        String teacherNo = null;

        while (true){
            //生成教师编号
            teacherNo = NoUtil.randomNo("0"+tTeacher.gettCollege().getCollegeId().toString(), "0"+tTeacher.gettDept().getDeptId().toString(),tTeacher.getForeign());

            for (String no : teacherNos) {
                if(no.equals(teacherNo)){
                    //如果教师编号相同，则重新生成教师编号
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }

        return teacherNo;
    }

    /**
     * 更新教师信息
     * @param tTeacher
     */
    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void updateTeacher(TTeacher tTeacher){
        //参数校验
        AssertUtil.isTrue(tTeacher==null,"教师信息为空");

        int teacher_update = tTeacherMapper.updateByTno(tTeacher);


        AssertUtil.isTrue(teacher_update<1,"更新失败");

    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void deleteTeacher(TTeacher tTeacher){
        String teacherNo=tTeacher.getTeacherNo();
        //参数校验
        AssertUtil.isTrue(teacherNo==null&&teacherNo.equals(""),"教师编号为空");
        int delete_index = tTeacherMapper.deleteByTno(teacherNo);
        int user_update = tUserMapper.deleteUserByUserName(tTeacher.getTeacherNo());
        AssertUtil.isTrue(delete_index<1||user_update<1,"删除失败");
    }

    public TTeacher getTeacherByName(String teacherName){
        AssertUtil.isTrue(teacherName==null,"参数错误");
        TTeacher tTeacher = tTeacherMapper.selTeacherByName(teacherName);
        AssertUtil.isTrue(tTeacher==null,"记录为空");
        return tTeacher;
    }
}
