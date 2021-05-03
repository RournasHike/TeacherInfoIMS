package com.mytest.teainfoims.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mytest.teainfoims.dao.TCourseMapper;
import com.mytest.teainfoims.dao.TScheduleMapper;
import com.mytest.teainfoims.dao.TTeachMapper;
import com.mytest.teainfoims.vo.ClassHourEntity;
import com.mytest.teainfoims.query.ClassHourQuery;
import com.mytest.teainfoims.query.TeachQuery;
import com.mytest.teainfoims.query.base.BaseQuery;
import com.mytest.teainfoims.service.base.BaseService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.vo.TCourse;
import com.mytest.teainfoims.vo.TSchedule;
import com.mytest.teainfoims.vo.TTeach;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/3/17
 */
@Service
public class TeachService extends BaseService<TTeach,Integer> {

    @Resource
    private TTeachMapper tTeachMapper;

    @Resource
    private TScheduleMapper tScheduleMapper;

    @Resource
    private TCourseMapper tCourseMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    public void addTeachInfo(TTeach tTeach, TSchedule tSchedule){
        AssertUtil.isTrue(tTeach==null||tSchedule==null,"授课信息为空");
        int index = tTeachMapper.insertSelective(tTeach);
        index += tScheduleMapper.insertSelective(tSchedule);
        AssertUtil.isTrue(index!=2,"添加失败");
    }


    @Transactional(propagation = Propagation.REQUIRED)
    public void updateTeachInfo(TTeach tTeach,TSchedule tSchedule){
        AssertUtil.isTrue(tTeach==null,"授课信息为空");
        int index = tTeachMapper.updateByPrimaryKeySelective(tTeach);
        index+= tScheduleMapper.updateByPrimaryKeySelective(tSchedule);
        AssertUtil.isTrue(index!=2,"更新失败");
    }

    public TTeach getTeachInfoById(Integer tid){
        return tTeachMapper.selectByPrimaryKey(tid);
    }

    public Map<String,Object> getTeachInfoByCond(TeachQuery query){
        Map<String,Object> result=new HashMap<>();

        //使用PageHelper进行分页
        PageHelper.startPage(query.getPage(),query.getLimit());
        List<TTeach> tTeaches = tTeachMapper.selTeachCondList(query);

        PageInfo pageInfo=new PageInfo(tTeaches);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }


    public Map<String,Object> queryTeachList(BaseQuery query){
        Map<String,Object> result=new HashMap<>();

        //使用PageHelper进行分页
        PageHelper.startPage(query.getPage(),query.getLimit());
        List<TTeach> tTeaches = tTeachMapper.selTeachList(query);

        PageInfo pageInfo=new PageInfo(tTeaches);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void delTeachAndSchedule(Integer id,Integer sid){
        AssertUtil.isTrue(id==null||sid==null,"参数错误");
        int index = tTeachMapper.deleteByPrimaryKey(id);
        index+=tScheduleMapper.deleteByPrimaryKey(sid);
        AssertUtil.isTrue(index!=2,"删除失败");
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void updateClassHourInfo(TTeach tTeach,Integer tid,Integer cid){
        AssertUtil.isTrue(tTeach==null,"授课记录不能为空");
        AssertUtil.isTrue(tid==null,"授课教师不存在");
        AssertUtil.isTrue(cid==null,"课程信息不存在");
        tTeach.setTid(tid);
        tTeach.setCid(cid);
        TCourse tCourse = tCourseMapper.selCourseById(cid);
        tTeach.setPrescribedClassHour(tCourse.getSumupClassHour());
        tTeach.setActualClassHour(tTeach.getActualSumupClassHour());
        int index = tTeachMapper.updateTTeachInfoByTidAndCid(tTeach);
        AssertUtil.isTrue(index<1,"添加课时信息失败");
    }

    public Map<String,Object> queryClassHourList(ClassHourQuery query){
        Map<String,Object> result=new HashMap<>();

        //使用PageHelper进行分页
        PageHelper.startPage(query.getPage(),query.getLimit());
        List<ClassHourEntity> classHourEntities = tTeachMapper.selClassHourList(query);

        PageInfo pageInfo=new PageInfo(classHourEntities);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }

    public Map<String,Object> queryAuditClassHourList(BaseQuery query){
        Map<String,Object> result=new HashMap<>();

        //使用PageHelper进行分页
        PageHelper.startPage(query.getPage(),query.getLimit());
        List<ClassHourEntity> classHourEntities = tTeachMapper.selAuditClassHourList(query);

        PageInfo pageInfo=new PageInfo(classHourEntities);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }

    public ClassHourEntity queryClassHourDetail(Integer id){
        AssertUtil.isTrue(id==null,"参数错误");
        ClassHourEntity classHourEntity = tTeachMapper.selClassHourById(id);
        AssertUtil.isTrue(classHourEntity==null,"学时信息为空");
        return classHourEntity;
    }

    public ClassHourEntity queryAuditClassHourById(Integer id){
        AssertUtil.isTrue(id==null,"参数错误");
        ClassHourEntity classHourEntity = tTeachMapper.selAuditClassHourById(id);
        AssertUtil.isTrue(classHourEntity==null,"学时信息为空");
        return classHourEntity;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void updateAudit(TTeach tTeach){
        AssertUtil.isTrue(tTeach==null,"信息为空");
        int index = tTeachMapper.updateByPrimaryKeySelective(tTeach);
        AssertUtil.isTrue(index<1,"更新失败");
    }


    public Map<String,Object> queryTeacherClassHour(ClassHourQuery classHourQuery){
        Map<String,Object> result=new HashMap<>();

        //使用PageHelper进行分页
        PageHelper.startPage(classHourQuery.getPage(),classHourQuery.getLimit());
        AssertUtil.isTrue(classHourQuery==null,"参数传入失败");
        List<ClassHourEntity> classHourEntities = tTeachMapper.selTeacherCondClassHour(classHourQuery);
        AssertUtil.isTrue(classHourEntities==null,"结果为空");

        PageInfo pageInfo=new PageInfo(classHourEntities);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }
}
