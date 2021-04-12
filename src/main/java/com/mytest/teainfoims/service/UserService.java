package com.mytest.teainfoims.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mytest.teainfoims.dao.TUserMapper;
import com.mytest.teainfoims.dao.TUserRoleMapper;
import com.mytest.teainfoims.model.UserModel;
import com.mytest.teainfoims.query.UserInfo;
import com.mytest.teainfoims.query.UserQuery;
import com.mytest.teainfoims.service.base.BaseService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.utils.Md5Util;
import com.mytest.teainfoims.utils.UserBase64;
import com.mytest.teainfoims.vo.TTeacher;
import com.mytest.teainfoims.vo.TUser;
import com.mytest.teainfoims.vo.TUserRole;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/1/23
 */
@Service
public class UserService extends BaseService<TUser,Integer> {

    @Resource
    private TeacherService teacherService;

    @Resource
    private TUserRoleMapper tUserRoleMapper;

    @Resource
    private TUserMapper userMapper;

    @Resource
    private TUserRoleMapper userRoleMapper;

    /**
     * 根据用户名查询用户信息
     * @param userName
     * @param userPwd
     *
     */
    public UserModel login(String userName, String userPwd){
        //参数校验
        checkLoginParams(userName,userPwd);

        //执行查询操作
        TUser user = userMapper.queryUserByUserName(userName);

        //判断用户是否为空
        AssertUtil.isTrue(null==user,"用户不存在！");

        //判断查询出来的用户密码与加密后的用户输入的用户密码是否一致
        String pwdCode = Md5Util.encode(userPwd);
        AssertUtil.isTrue(!user.getPassword().equals(pwdCode),"密码错误！");

        //构建并返回封装对象
        return buildUserInfo(user);
    }

    /**
     * 构建返回对象
     * @param user
     * @return
     */
    public UserModel buildUserInfo(TUser user){
        UserModel userModel=new UserModel();
        userModel.setUserIdStr(UserBase64.encoderUserID(user.getUid()));
        userModel.setUserName(UserBase64.encoderUserName(user.getUsername()));
        userModel.setUserTrueName(user.getUsertruename());
        return userModel;
    }

    /**
     * 参数校验：
     * 前端虽然做了非空校验，但是有可能用户传递过来空字符串，所以需要后端校验
     * @param userName
     * @param userPwd
     */
    public void checkLoginParams(String userName,String userPwd){
        //判断用户名是否为空
        AssertUtil.isTrue(StringUtils.isBlank(userName),"用户名不能为空！");
        //判断用户密码是否为空
        AssertUtil.isTrue(StringUtils.isBlank(userPwd),"用户密码不能为空！");
    }

    /**
     * 修改密码
     * @param userId
     * @param oldPwd
     * @param newPwd
     * @param repeatPwd
     */
    public void updatePwd(int userId,String oldPwd,String newPwd,String repeatPwd){
        //根据用户id查询用户对象
        TUser tUser = userMapper.selectByPrimaryKey(userId);
        AssertUtil.isTrue(tUser==null,"用户不存在");

        //校验密码正确性
        checkPwd(tUser,oldPwd,newPwd,repeatPwd);

        //执行修改密码操作，并进行结果判断
        tUser.setPassword(Md5Util.encode(newPwd));
        tUser.setUpdateTime(new Date());
        userMapper.updateByPrimaryKeySelective(tUser);

    }

    /**
     * 管理员修改密码
     * @param userId
     * @param newPwd
     * @param repeatPwd
     */
    public void adminUpdatePwd(int userId,String newPwd,String repeatPwd){
        //根据用户id查询用户对象
        TUser tUser = userMapper.selectByPrimaryKey(userId);
        AssertUtil.isTrue(tUser==null,"用户不存在");

        //校验密码正确性
        checkAdminPwd(tUser,newPwd,repeatPwd);

        //执行修改密码操作，并进行结果判断
        tUser.setPassword(Md5Util.encode(newPwd));
        tUser.setUpdateTime(new Date());
        userMapper.updateByPrimaryKeySelective(tUser);

    }

    /**
     * 参数校验
     * @param tUser
     * @param oldPwd
     * @param newPwd
     * @param repeatPwd
     */
    private void checkPwd(TUser tUser,String oldPwd, String newPwd, String repeatPwd) {
        AssertUtil.isTrue(StringUtils.isBlank(oldPwd),"原始密码不能为空");
        AssertUtil.isTrue(StringUtils.isBlank(newPwd),"新密码不能为空");
        AssertUtil.isTrue(StringUtils.isBlank(repeatPwd),"确认密码不能为空");
        AssertUtil.isTrue(!tUser.getPassword().equals(Md5Util.encode(oldPwd)),"原始密码不正确");
        AssertUtil.isTrue(oldPwd.equals(newPwd),"新密码不能与原始密码相同");
        AssertUtil.isTrue(!newPwd.equals(repeatPwd),"确认密码与新密码不相同");
    }

    private void checkAdminPwd(TUser tUser,String newPwd, String repeatPwd) {
        AssertUtil.isTrue(StringUtils.isBlank(newPwd),"新密码不能为空");
        AssertUtil.isTrue(StringUtils.isBlank(repeatPwd),"确认密码不能为空");
        AssertUtil.isTrue(tUser.getPassword().equals(Md5Util.encode(newPwd)),"新密码不能与原始密码相同");
        AssertUtil.isTrue(!newPwd.equals(repeatPwd),"确认密码与新密码不相同");
    }

    public Map<String,Object> queryUserList(UserQuery query){
        Map<String,Object> result=new HashMap<>();

        //使用PageHelper进行分页
        PageHelper.startPage(query.getPage(),query.getLimit());
        List<UserInfo> userList = userMapper.selAllUsers(query);

        PageInfo pageInfo=new PageInfo(userList);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void deleteByIds(Integer[] ids) {
        // 判断ids是否为空，长度是否大于0
        AssertUtil.isTrue(ids == null || ids.length == 0, "待删除记录不存在！");
        // 执行删除操作，判断受影响的行数
        AssertUtil.isTrue(userMapper.deleteBatch(ids) != ids.length, "用户删除失败！");

        // 遍历用户ID的数组
        for (Integer userId : ids) {
            // 通过用户ID查询对应的用户角色记录
            Integer count  = tUserRoleMapper.countUserRoleByUserId(userId);
            // 判断用户角色记录是否存在
            if (count > 0) {
                //  通过用户ID删除对应的用户角色记录
                AssertUtil.isTrue(tUserRoleMapper.deleteUserRoleByUserId(userId) != count, "删除用户失败！");
            }
        }
    }

    public TUser queryUserInfo(Integer id){
        AssertUtil.isTrue(id==null,"参数传入错误");
        TUser tUser = userMapper.selectByPrimaryKey(id);
        //校验是否为空
        AssertUtil.isTrue(tUser==null,"查询用户信息失败");
        return tUser;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void addUser(TTeacher tTeacher,Integer[] roleIds){

        teacherService.addTeacher(tTeacher);
        List<Integer> uid = userMapper.selUserIdByUserName(tTeacher.getTeacherName());

        for (int i = 0; i < roleIds.length; i++) {
            Date date=new Date();
            TUserRole userRole = new TUserRole();
            userRole.setId(null);
            userRole.setRoleid(roleIds[i]);
            userRole.setUserid(uid.get(i));
            userRole.setCreateTime(date);
            userRole.setUpdateTime(date);
            userRoleMapper.insertSelective(userRole);
        }
    }


    /**
     * 用户角色关联
     *  添加操作
     *      原始角色不存在
     *          1. 不添加新的角色记录    不操作用户角色表
     *          2. 添加新的角色记录      给指定用户绑定相关的角色记录
     *
     *  更新操作
     *      原始角色不存在
     *          1. 不添加新的角色记录     不操作用户角色表
     *          2. 添加新的角色记录       给指定用户绑定相关的角色记录
     *      原始角色存在
     *          1. 添加新的角色记录       判断已有的角色记录不添加，添加没有的角色记录
     *          2. 清空所有的角色记录     删除用户绑定角色记录
     *          3. 移除部分角色记录       删除不存在的角色记录，存在的角色记录保留
     *          4. 移除部分角色，添加新的角色    删除不存在的角色记录，存在的角色记录保留，添加新的角色
     *
     *   如何进行角色分配？？？
     *      判断用户对应的角色记录存在，先将用户原有的角色记录删除，再添加新的角色记录
     *
     *  删除操作
     *      删除指定用户绑定的角色记录
     *
     *
     * @param userId  用户ID
     * @param roleIds 角色ID
     * @return
     */
    private void relationUserRole(Integer userId, String roleIds) {

        // 通过用户ID查询角色记录
        Integer count = userRoleMapper.countUserRoleByUserId(userId);
        // 判断角色记录是否存在
        if (count > 0) {
            // 如果角色记录存在，则删除该用户对应的角色记录
            AssertUtil.isTrue(userRoleMapper.deleteUserRoleByUserId(userId).intValue() != count, "删除用户对应角色失败！");
        }

        // 判断角色ID是否存在，如果存在，则添加该用户对应的角色记录
        if (StringUtils.isNotBlank(roleIds)) {
            // 将用户角色数据设置到集合中，执行批量添加
            List<TUserRole> userRoleList = new ArrayList<>();
            // 将角色ID字符串转换成数组
            String[] roleIdsArray = roleIds.split(",");
            // 遍历数组，得到对应的用户角色对象，并设置到集合中
            for (String roleId : roleIdsArray) {
                TUserRole userRole = new TUserRole();
                userRole.setRoleid(Integer.parseInt(roleId));
                userRole.setUserid(userId);
                userRole.setCreateTime(new Date());
                userRole.setUpdateTime(new Date());
                // 设置到集合中
                userRoleList.add(userRole);
            }
            // 批量添加用户角色记录
            AssertUtil.isTrue(userRoleMapper.insertBatch(userRoleList) != userRoleList.size(), "批量添加用户角色记录失败！");
        }

    }


    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void updateUser(TTeacher tTeacher,TUser tUser,String roleIds){
        // 判断用户ID是否为空，且数据存在
        AssertUtil.isTrue(null == tUser.getUid(), "待更新记录不存在！");
        // 通过id查询数据
        TUser temp = userMapper.selectByPrimaryKey(tUser.getUid());
        // 判断是否存在
        AssertUtil.isTrue(null == temp, "待更新记录不存在！");

        // 设置默认值
        tUser.setUpdateTime(new Date());

        // 执行更新操作，判断受影响的行数
        AssertUtil.isTrue(userMapper.updateByPrimaryKeySelective(tUser) != 1, "用户更新失败！");

        //更新教师记录
        teacherService.updateTeacher(tTeacher);

        /* 用户角色关联 */
        relationUserRole(tUser.getUid(), roleIds);

    }

    public void updatePassword(int userId,String newPwd,String repeatPwd){

    }




}
