package com.mytest.teainfoims.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mytest.teainfoims.dao.TModuleMapper;
import com.mytest.teainfoims.dao.TPermissionMapper;
import com.mytest.teainfoims.dao.TRoleMapper;
import com.mytest.teainfoims.dao.TUserRoleMapper;
import com.mytest.teainfoims.query.RoleQuery;
import com.mytest.teainfoims.service.base.BaseService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.vo.TPermission;
import com.mytest.teainfoims.vo.TRole;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/2/16
 */
@Service
public class RoleService extends BaseService<TRole,Integer> {
    @Resource
    private TRoleMapper tRoleMapper;

    @Resource
    private TModuleMapper moduleMapper;

    @Resource
    private TUserRoleMapper tUserRoleMapper;

    @Resource
    private TPermissionMapper permissionMapper;

    public List<Map<String,Object>> queryAllRoles(Integer userId){
        return tRoleMapper.queryAllRoles(userId);
    }


    public Map<String, Object> queryRoleList(RoleQuery query){
        Map<String,Object> result=new HashMap<>();

        //使用PageHelper进行分页
        PageHelper.startPage(query.getPage(),query.getLimit());
        List<TRole> tRoles = tRoleMapper.selAllRoles();

        PageInfo pageInfo=new PageInfo(tRoles);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }

    public TRole queryRoleByRid(Integer rid){
        AssertUtil.isTrue(rid==null,"参数传入错误");
        return tRoleMapper.selectByPrimaryKey(rid);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void deleteRole(Integer roleId){
        AssertUtil.isTrue(roleId==null,"参数传入错误");
        permissionMapper.deletePermissionByRoleId(roleId);
        tUserRoleMapper.deleteUserRoleByRoleId(roleId);
        AssertUtil.isTrue(tRoleMapper.deleteByPrimaryKey(roleId)<1,"角色删除失败");
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void addRole(TRole tRole){
        AssertUtil.isTrue(tRole==null,"角色信息为空");
        Date date=new Date();
        tRole.setCreateTime(date);
        tRole.setUpdateTime(date);
        AssertUtil.isTrue(tRoleMapper.insertSelective(tRole)<1,"角色添加失败");
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void updateRole(TRole tRole){
        AssertUtil.isTrue(tRole==null,"角色信息为空");
        Date date=new Date();
        tRole.setCreateTime(date);
        tRole.setUpdateTime(date);
        AssertUtil.isTrue(tRoleMapper.updateByPrimaryKeySelective(tRole)<1,"角色添加失败");
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void addGrant(Integer roleId, Integer[] mIds) {
        // 1. 通过角色ID查询对应的权限记录
        Integer count = permissionMapper.countPermissionByRoleId(roleId);
        // 2. 如果权限记录存在，则删除对应的角色拥有的权限记录
        if (count > 0) {
            // 删除权限记录
            permissionMapper.deletePermissionByRoleId(roleId);
        }
        // 3. 如果有权限记录，则添加权限记录
        if (mIds != null &&  mIds.length > 0) {
            // 定义Permission集合
            List<TPermission> permissionList = new ArrayList<>();

            // 遍历资源ID数组
            for(Integer mId: mIds) {
                TPermission permission = new TPermission();
                permission.setModuleId(mId);
                permission.setRoleId(roleId);
                permission.setAclValue(moduleMapper.selectByPrimaryKey(mId).getOptValue());
                permission.setCreateTime(new Date());
                permission.setUpdateTime(new Date());
                // 将对象设置到集合中
                permissionList.add(permission);
            }

            // 执行批量添加操作，判断受影响的行数
            AssertUtil.isTrue(permissionMapper.insertBatch(permissionList) != permissionList.size(), "角色授权失败！");
        }
    }
}
