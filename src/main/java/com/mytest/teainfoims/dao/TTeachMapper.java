package com.mytest.teainfoims.dao;

import com.mytest.teainfoims.query.TeachQuery;
import com.mytest.teainfoims.query.base.BaseQuery;
import com.mytest.teainfoims.vo.TTeach;
import com.mytest.teainfoims.vo.TTeachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTeachMapper {
    int countByExample(TTeachExample example);

    int deleteByExample(TTeachExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTeach record);

    int insertSelective(TTeach record);

    List<TTeach> selectByExample(TTeachExample example);

    TTeach selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTeach record, @Param("example") TTeachExample example);

    int updateByExample(@Param("record") TTeach record, @Param("example") TTeachExample example);

    int updateByPrimaryKeySelective(TTeach record);

    int updateByPrimaryKey(TTeach record);

    List<TTeach> selTeachList(BaseQuery query);

    List<TTeach> selTeachCondList(TeachQuery query);
}