package com.mytest.teainfoims.dao;

import com.mytest.teainfoims.vo.TSchedule;
import com.mytest.teainfoims.vo.TScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TScheduleMapper {
    int countByExample(TScheduleExample example);

    int deleteByExample(TScheduleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSchedule record);

    int insertSelective(TSchedule record);

    List<TSchedule> selectByExample(TScheduleExample example);

    TSchedule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSchedule record, @Param("example") TScheduleExample example);

    int updateByExample(@Param("record") TSchedule record, @Param("example") TScheduleExample example);

    int updateByPrimaryKeySelective(TSchedule record);

    int updateByPrimaryKey(TSchedule record);
}