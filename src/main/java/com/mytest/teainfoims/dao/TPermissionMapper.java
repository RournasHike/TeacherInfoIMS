package com.mytest.teainfoims.dao;

import com.mytest.teainfoims.dao.base.BaseMapper;
import com.mytest.teainfoims.vo.TPermission;
import com.mytest.teainfoims.vo.TPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPermissionMapper extends BaseMapper<TPermission,Integer> {
    int countByExample(TPermissionExample example);

    int deleteByExample(TPermissionExample example);

    @Override
    Integer deleteByPrimaryKey(Integer id);

    int insert(TPermission record);

    @Override
    Integer insertSelective(TPermission record);

    List<TPermission> selectByExample(TPermissionExample example);

    @Override
    TPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TPermission record, @Param("example") TPermissionExample example);

    int updateByExample(@Param("record") TPermission record, @Param("example") TPermissionExample example);

    @Override
    Integer updateByPrimaryKeySelective(TPermission record);

    int updateByPrimaryKey(TPermission record);

    List<Integer> queryRoleHasModuleIdsByRoleId(Integer roleId);

    Integer countPermissionByRoleId(Integer roleId);

    int deletePermissionByRoleId(Integer roleId);

    List<String> queryUserHasRoleHasPermissionByUserIdAndRoleId(@Param("userId") Integer userId,@Param("roleId") Integer roleId);
}