package com.mytest.teainfoims.dao;

import com.mytest.teainfoims.vo.TDept;
import com.mytest.teainfoims.vo.TDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDeptMapper {
    int countByExample(TDeptExample example);

    int deleteByExample(TDeptExample example);

    int deleteByPrimaryKey(Integer deptId);

    int insert(TDept record);

    int insertSelective(TDept record);

    List<TDept> selectByExample(TDeptExample example);

    TDept selectByPrimaryKey(Integer deptId);

    int updateByExampleSelective(@Param("record") TDept record, @Param("example") TDeptExample example);

    int updateByExample(@Param("record") TDept record, @Param("example") TDeptExample example);

    int updateByPrimaryKeySelective(TDept record);

    int updateByPrimaryKey(TDept record);

    TDept selDeptByDeptName(String deptName);

    List<TDept> selAllDept();
}