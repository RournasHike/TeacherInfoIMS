package com.mytest.teainfoims.service;

import com.mytest.teainfoims.dao.TPermissionMapper;
import com.mytest.teainfoims.exceptions.AuthException;
import com.mytest.teainfoims.service.base.BaseService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.vo.TPermission;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/2/19
 */
@Service
public class PermissionService extends BaseService<TPermission,Integer> {
    @Resource
    private TPermissionMapper permissionMapper;

    public List<String> queryUserHasRoleHasPermissionByUserIdAndRoleId(Integer userId,Integer roleId){
        List<String> permissions = permissionMapper.queryUserHasRoleHasPermissionByUserIdAndRoleId(userId,roleId);
        AssertUtil.isTrue(permissions.size()==0||permissions==null,"用户角色错误");
        return permissions;
    }
}
