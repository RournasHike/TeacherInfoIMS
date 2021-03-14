package com.mytest.teainfoims.service;

import com.mytest.teainfoims.model.TreeModel;
import com.mytest.teainfoims.dao.TModuleMapper;
import com.mytest.teainfoims.dao.TPermissionMapper;
import com.mytest.teainfoims.service.base.BaseService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.vo.TModule;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/2/17
 */
@Service
public class ModuleService extends BaseService<TModule,Integer> {

    @Resource
    private TModuleMapper tModuleMapper;

    @Resource
    private TPermissionMapper tPermissionMapper;

    public List<TreeModel> queryAllModules(Integer roleId) {
        // 查询所有的资源列表
        List<TreeModel> treeModelList = tModuleMapper.queryAllModules();
        // 查询指定角色已经授权过的资源列表 (查询角色拥有的资源ID)
        List<Integer> permissionIds = tPermissionMapper.queryRoleHasModuleIdsByRoleId(roleId);
        // 判断角色是否拥有资源ID
        if (permissionIds != null && permissionIds.size() > 0) {
            // 循环所有的资源列表，判断用户拥有的资源ID中是否有匹配的，如果有，则设置checked属性为true
            treeModelList.forEach(treeModel -> {
                // 判断角色拥有的资源ID中是否有当前遍历的资源ID
                if (permissionIds.contains(treeModel.getId())) {
                    // 如果包含你，则说明角色授权过，设置checked为true
                    treeModel.setChecked(true);
                }
            });
        }
        return treeModelList;
    }

    public Map<String,Object> queryModuleList() {
        Map<String, Object> map = new HashMap<>();
        // 查询资源列表
        List<TModule> moduleList = tModuleMapper.queryModuleList();
        map.put("code",0);
        map.put("msg","");
        map.put("count", moduleList.size());
        map.put("data",moduleList);
        return map;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void addModule(TModule tModule){
        AssertUtil.isTrue(tModule==null,"模块信息为空");
        tModule.setModuleState(true);
        Date date=new Date();
        tModule.setCreateTime(date);
        tModule.setUpdateTime(date);
        int index = tModuleMapper.insertSelective(tModule);
        AssertUtil.isTrue(index<1,"添加菜单失败");
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void deleteModule(Integer id){
        AssertUtil.isTrue(id==null,"参数错误");
        AssertUtil.isTrue(tModuleMapper.deleteByPrimaryKey(id)<1,"删除菜单失败");
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void updateModule(TModule tModule){
        AssertUtil.isTrue(tModule==null,"模块信息为空");
        tModule.setUpdateTime(new Date());
        AssertUtil.isTrue(tModuleMapper.updateByPrimaryKeySelective(tModule)<1,"更新菜单失败");
    }

    public TModule getModuleById(Integer id){
        AssertUtil.isTrue(id==null,"参数传入错误");
        TModule tModule = tModuleMapper.selectByPrimaryKey(id);
        AssertUtil.isTrue(tModule==null,"菜单不存在");
        return tModuleMapper.selectByPrimaryKey(id);
    }
}
