package com.mytest.teainfoims.dao;

import com.mytest.teainfoims.query.CourseQuery;
import com.mytest.teainfoims.query.base.BaseQuery;
import com.mytest.teainfoims.vo.TCourse;
import com.mytest.teainfoims.vo.TCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCourseMapper {
    int countByExample(TCourseExample example);

    int deleteByExample(TCourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCourse record);

    int insertSelective(TCourse record);

    List<TCourse> selectByExample(TCourseExample example);

    TCourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCourse record, @Param("example") TCourseExample example);

    int updateByExample(@Param("record") TCourse record, @Param("example") TCourseExample example);

    int updateByPrimaryKeySelective(TCourse record);

    int updateByPrimaryKey(TCourse record);

    List<TCourse> selCourseList(BaseQuery query);

    List<TCourse> selCourseCondList(CourseQuery query);

    TCourse selCourseById(Integer id);

    List<TCourse> selAllCourse();

    TCourse selCourseByName(String courseName);
}