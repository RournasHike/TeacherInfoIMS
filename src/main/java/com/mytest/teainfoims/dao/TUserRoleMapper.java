package com.mytest.teainfoims.dao;

import com.mytest.teainfoims.dao.base.BaseMapper;
import com.mytest.teainfoims.vo.TUserRole;
import com.mytest.teainfoims.vo.TUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserRoleMapper extends BaseMapper<TUserRole,Integer> {
    int countByExample(TUserRoleExample example);

    int deleteByExample(TUserRoleExample example);

    @Override
    Integer deleteByPrimaryKey(Integer id);

    int insert(TUserRole record);

    @Override
    Integer insertSelective(TUserRole record);

    List<TUserRole> selectByExample(TUserRoleExample example);

    @Override
    TUserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserRole record, @Param("example") TUserRoleExample example);

    int updateByExample(@Param("record") TUserRole record, @Param("example") TUserRoleExample example);

    @Override
    Integer updateByPrimaryKeySelective(TUserRole record);

    int updateByPrimaryKey(TUserRole record);

    Integer countUserRoleByUserId(Integer userId);

    Integer deleteUserRoleByUserId(Integer userId);

    Integer deleteUserRoleByRoleId(Integer roleId);
}