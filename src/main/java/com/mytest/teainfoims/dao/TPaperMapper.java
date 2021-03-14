package com.mytest.teainfoims.dao;

import com.mytest.teainfoims.query.PaperQuery;
import com.mytest.teainfoims.vo.TPaper;
import com.mytest.teainfoims.vo.TPaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPaperMapper {
    int countByExample(TPaperExample example);

    int deleteByExample(TPaperExample example);

    int deleteByPrimaryKey(Integer paid);

    int insert(TPaper record);

    int insertSelective(TPaper record);

    List<TPaper> selectByExample(TPaperExample example);

    TPaper selectByPrimaryKey(Integer paid);

    int updateByExampleSelective(@Param("record") TPaper record, @Param("example") TPaperExample example);

    int updateByExample(@Param("record") TPaper record, @Param("example") TPaperExample example);

    int updateByPrimaryKeySelective(TPaper record);

    int updateByPrimaryKey(TPaper record);

    List<TPaper> selPaperInfoByUserId(Integer uid);

    TPaper selPaperByPaid(Integer paid);

    List<TPaper> selAuditPaperList(PaperQuery query);
}