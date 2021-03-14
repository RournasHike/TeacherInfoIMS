package com.mytest.teainfoims.dao;

import com.mytest.teainfoims.query.ProjectQuery;
import com.mytest.teainfoims.vo.TProject;
import com.mytest.teainfoims.vo.TProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProjectMapper {
    int countByExample(TProjectExample example);

    int deleteByExample(TProjectExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(TProject record);

    int insertSelective(TProject record);

    List<TProject> selectByExample(TProjectExample example);

    TProject selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") TProject record, @Param("example") TProjectExample example);

    int updateByExample(@Param("record") TProject record, @Param("example") TProjectExample example);

    int updateByPrimaryKeySelective(TProject record);

    int updateByPrimaryKey(TProject record);

    List<TProject> selProjectInfoByUserId(int uid);

    TProject selProjectInfoByPid(Integer pid);

    List<TProject> selAuditProjectList(ProjectQuery query);
}