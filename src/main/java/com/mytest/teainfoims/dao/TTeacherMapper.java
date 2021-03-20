package com.mytest.teainfoims.dao;

import com.mytest.teainfoims.query.TeacherQuery;
import com.mytest.teainfoims.vo.TTeacher;
import com.mytest.teainfoims.vo.TTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTeacherMapper {
    int countByExample(TTeacherExample example);

    int deleteByExample(TTeacherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTeacher record);

    int insertSelective(TTeacher record);

    List<TTeacher> selectByExample(TTeacherExample example);

    TTeacher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTeacher record, @Param("example") TTeacherExample example);

    int updateByExample(@Param("record") TTeacher record, @Param("example") TTeacherExample example);

    int updateByPrimaryKeySelective(TTeacher record);

    int updateByPrimaryKey(TTeacher record);

    TTeacher queryTeaInfoByTno(String tno);

    List<TTeacher> selTeaInfo(TeacherQuery query);

    List<String> selAll();

    int updateByTno(TTeacher tTeacher);

    int deleteByTno(String teacherNo);

    int queryTeaIdByTeacherName(String teacherName);

    List<TTeacher> getTeachersByCond(Integer collegeId,Integer deptId);

    TTeacher selTeacherByName(String teacherName);

    List<TTeacher> getAllTeachers();
}