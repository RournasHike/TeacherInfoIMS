package com.mytest.teainfoims.dao;

import com.mytest.teainfoims.vo.TRole;
import com.mytest.teainfoims.vo.TRoleExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TRoleMapper {
    int countByExample(TRoleExample example);

    int deleteByExample(TRoleExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(TRole record);

    int insertSelective(TRole record);

    List<TRole> selectByExample(TRoleExample example);

    TRole selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") TRole record, @Param("example") TRoleExample example);

    int updateByExample(@Param("record") TRole record, @Param("example") TRoleExample example);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKey(TRole record);

    List<TRole> selAllRoles();

    // 查询所有的角色列表 (只需要id与roleName)
    List<Map<String,Object>> queryAllRoles(Integer userId);
}