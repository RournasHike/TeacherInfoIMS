package com.mytest.teainfoims.dao;

import com.mytest.teainfoims.query.PatentQuery;
import com.mytest.teainfoims.vo.TPatent;
import com.mytest.teainfoims.vo.TPatentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPatentMapper {
    int countByExample(TPatentExample example);

    int deleteByExample(TPatentExample example);

    int deleteByPrimaryKey(Integer patid);

    int insert(TPatent record);

    int insertSelective(TPatent record);

    List<TPatent> selectByExample(TPatentExample example);

    TPatent selectByPrimaryKey(Integer patid);

    int updateByExampleSelective(@Param("record") TPatent record, @Param("example") TPatentExample example);

    int updateByExample(@Param("record") TPatent record, @Param("example") TPatentExample example);

    int updateByPrimaryKeySelective(TPatent record);

    int updateByPrimaryKey(TPatent record);

    List<TPatent> selPatentInfoByUserId(Integer uid);

    TPatent selPatentInfoByPatid(Integer patid);

    List<TPatent> selAuditPatentList(PatentQuery query);
}