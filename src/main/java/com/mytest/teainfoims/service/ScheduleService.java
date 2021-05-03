package com.mytest.teainfoims.service;

import com.mytest.teainfoims.dao.TScheduleMapper;
import com.mytest.teainfoims.query.ScheduleQuery;
import com.mytest.teainfoims.service.base.BaseService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.vo.TSchedule;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/3/17
 */
@Service
public class ScheduleService extends BaseService<TSchedule,Integer> {

    @Resource
    private TScheduleMapper tScheduleMapper;

    @Deprecated
    @Transactional(propagation = Propagation.REQUIRED)
    public void addSchedule(TSchedule tSchedule){
        AssertUtil.isTrue(tSchedule==null,"授课信息为空");
        int index = tScheduleMapper.insertSelective(tSchedule);
        AssertUtil.isTrue(index<1,"添加失败");
    }

    @Deprecated
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateSchedule(TSchedule tSchedule){
        AssertUtil.isTrue(tSchedule==null,"授课信息为空");
        int index = tScheduleMapper.updateByPrimaryKeySelective(tSchedule);
        AssertUtil.isTrue(index<1,"添加失败");
    }

    public TSchedule getScheduleInfoById(Integer sid){
        return tScheduleMapper.selectByPrimaryKey(sid);
    }

    public List<TSchedule> getScheduleInfo(ScheduleQuery scheduleQuery){
        AssertUtil.isTrue(scheduleQuery==null,"参数错误");
        List<TSchedule> scheduleList = tScheduleMapper.getScheduleInfo(scheduleQuery);
        AssertUtil.isTrue(scheduleList==null,"记录为空");
        return scheduleList;
    }

}
