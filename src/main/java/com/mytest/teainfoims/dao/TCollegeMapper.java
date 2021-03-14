package com.mytest.teainfoims.dao;

import com.mytest.teainfoims.vo.TCollege;
import com.mytest.teainfoims.vo.TCollegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCollegeMapper {
    int countByExample(TCollegeExample example);

    int deleteByExample(TCollegeExample example);

    int deleteByPrimaryKey(Integer collegeId);

    int insert(TCollege record);

    int insertSelective(TCollege record);

    List<TCollege> selectByExample(TCollegeExample example);

    TCollege selectByPrimaryKey(Integer collegeId);

    int updateByExampleSelective(@Param("record") TCollege record, @Param("example") TCollegeExample example);

    int updateByExample(@Param("record") TCollege record, @Param("example") TCollegeExample example);

    int updateByPrimaryKeySelective(TCollege record);

    int updateByPrimaryKey(TCollege record);

    TCollege selByCollegeName(String collegeName);

    List<TCollege> selAllCollege();
}