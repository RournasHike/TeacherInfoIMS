package com.mytest.teainfoims.dao;

import com.mytest.teainfoims.vo.TDict;
import com.mytest.teainfoims.vo.TDictExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TDictMapper {
    int countByExample(TDictExample example);

    int deleteByExample(TDictExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDict record);

    int insertSelective(TDict record);

    List<TDict> selectByExample(TDictExample example);

    TDict selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDict record, @Param("example") TDictExample example);

    int updateByExample(@Param("record") TDict record, @Param("example") TDictExample example);

    int updateByPrimaryKeySelective(TDict record);

    int updateByPrimaryKey(TDict record);

    List<Map<Object, String>> queryValByField(String field);

    List<TDict> queryDictList();

    int deleteByParentId(@Param("parentId") Integer parentId);

    List<TDict> selByParentId(@Param("parentId") Integer parentId);
}