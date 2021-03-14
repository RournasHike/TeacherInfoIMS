package com.mytest.teainfoims.dao;

import com.mytest.teainfoims.query.HonorQuery;
import com.mytest.teainfoims.vo.THonor;
import com.mytest.teainfoims.vo.THonorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THonorMapper {
    int countByExample(THonorExample example);

    int deleteByExample(THonorExample example);

    int deleteByPrimaryKey(Integer hid);

    int insert(THonor record);

    int insertSelective(THonor record);

    List<THonor> selectByExample(THonorExample example);

    THonor selectByPrimaryKey(Integer hid);

    int updateByExampleSelective(@Param("record") THonor record, @Param("example") THonorExample example);

    int updateByExample(@Param("record") THonor record, @Param("example") THonorExample example);

    int updateByPrimaryKeySelective(THonor record);

    int updateByPrimaryKey(THonor record);

    List<THonor> selHonorInfoByUserId(Integer uid);

    THonor selHonorInfoByHid(Integer hid);

    List<THonor> selAuditHonorList(HonorQuery query);
}