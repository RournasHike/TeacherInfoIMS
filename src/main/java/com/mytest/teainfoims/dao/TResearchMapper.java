package com.mytest.teainfoims.dao;

import com.mytest.teainfoims.query.ResearchQuery;
import com.mytest.teainfoims.vo.TResearch;
import com.mytest.teainfoims.vo.TResearchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TResearchMapper {
    int countByExample(TResearchExample example);

    int deleteByExample(TResearchExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TResearch record);

    int insertSelective(TResearch record);

    List<TResearch> selectByExample(TResearchExample example);

    TResearch selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TResearch record, @Param("example") TResearchExample example);

    int updateByExample(@Param("record") TResearch record, @Param("example") TResearchExample example);

    int updateByPrimaryKeySelective(TResearch record);

    int updateByPrimaryKey(TResearch record);

    List<TResearch> selResearchInfoByUserId(Integer uid);

    TResearch selResearchInfoById(Integer id);

    List<TResearch> selAuditResearchList(ResearchQuery query);
}