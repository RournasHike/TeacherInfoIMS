package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.common.ResultInfo;
import com.mytest.teainfoims.controller.base.BaseController;
import com.mytest.teainfoims.query.RoleQuery;
import com.mytest.teainfoims.service.RoleService;
import com.mytest.teainfoims.vo.TRole;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/2/16
 */
@Controller
@RequestMapping("role")
public class RoleController extends BaseController {

    @Resource
    private RoleService roleService;

    @RequestMapping("listPage")
    public String roleList(){
        return "admin/role/role";
    }

    @RequestMapping("queryAllRoles")
    @ResponseBody
    public List<Map<String,Object>> queryAllRoles(Integer userId){
        return roleService.queryAllRoles(userId);
    }

    @RequestMapping("list")
    @ResponseBody
    public Map<String,Object> rolePageList(RoleQuery query){
        return roleService.queryRoleList(query);
    }

    @RequestMapping("toAddOrUpdateRolePage")
    public String toAddOrUpdateRolePage(Integer roleId, Model model){
        if(roleId!=null){
            TRole tRole = roleService.queryRoleByRid(roleId);
            model.addAttribute("role",tRole);
        }
        return "admin/role/add_update";
    }

    @RequestMapping("delete")
    @ResponseBody
    public ResultInfo deleteRole(Integer roleId){
        ResultInfo resultInfo=new ResultInfo();
        roleService.deleteRole(roleId);
        return resultInfo;
    }

    @RequestMapping("add")
    @ResponseBody
    public ResultInfo addRole(TRole tRole){
        ResultInfo resultInfo=new ResultInfo();
        roleService.addRole(tRole);
        return resultInfo;
    }

    @RequestMapping("update")
    @ResponseBody
    public ResultInfo updateRole(TRole tRole){
        ResultInfo resultInfo=new ResultInfo();
        roleService.updateRole(tRole);
        return resultInfo;
    }

    @RequestMapping("addGrant")
    @ResponseBody
    public ResultInfo addGrant(Integer[] mIds,Integer roleId){
        roleService.addGrant(roleId,mIds);
        return success("角色授权成功！");
    }
}
