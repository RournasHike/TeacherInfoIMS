package com.mytest.teainfoims.dao;

import com.mytest.teainfoims.model.TreeModel;
import com.mytest.teainfoims.vo.TModule;
import com.mytest.teainfoims.vo.TModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TModuleMapper {
    int countByExample(TModuleExample example);

    int deleteByExample(TModuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TModule record);

    int insertSelective(TModule record);

    List<TModule> selectByExample(TModuleExample example);

    TModule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TModule record, @Param("example") TModuleExample example);

    int updateByExample(@Param("record") TModule record, @Param("example") TModuleExample example);

    int updateByPrimaryKeySelective(TModule record);

    int updateByPrimaryKey(TModule record);

    List<TreeModel> queryAllModules();

    List<TModule> queryModuleList();
}