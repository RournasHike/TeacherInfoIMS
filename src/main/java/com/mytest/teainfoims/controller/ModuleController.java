package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.common.ResultInfo;
import com.mytest.teainfoims.model.TreeModel;
import com.mytest.teainfoims.controller.base.BaseController;
import com.mytest.teainfoims.service.ModuleService;
import com.mytest.teainfoims.vo.TModule;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/2/16
 */
@Controller
@RequestMapping("module")
public class ModuleController extends BaseController {

    @Resource
    private ModuleService moduleService;

    @RequestMapping("listPage")
    public String moduleList(){
        return "admin/module/module";
    }

    @RequestMapping("toAddGrantPage")
    public String toAddGrantPage(Integer roleId, HttpServletRequest request){
        request.setAttribute("roleId", roleId);
        return "admin/role/grant";
    }

    @RequestMapping("queryAllModules")
    @ResponseBody
    public List<TreeModel> queryAllModules(Integer roleId) {
        return moduleService.queryAllModules(roleId);
    }

    @RequestMapping("list")
    @ResponseBody
    public Map<String,Object> queryModuleList() {
        return moduleService.queryModuleList();
    }

    @RequestMapping("toAddModulePage")
    public String toAddModulePage(Integer grade, Integer parentId, Boolean isFolder,Model model){
        model.addAttribute("grade",grade);
        model.addAttribute("parentId",parentId);
        model.addAttribute("isFolder",isFolder);
        return "admin/module/add";
    }

    @RequestMapping("toUpdateModulePage")
    public String toUpdateModulePage(Integer id, Model model){
        TModule module = moduleService.getModuleById(id);
        model.addAttribute("module",module);
        return "admin/module/update";
    }

    @RequestMapping("add")
    @ResponseBody
    public ResultInfo addModule(TModule tModule){
        ResultInfo resultInfo=new ResultInfo();
        moduleService.addModule(tModule);
        return resultInfo;
    }

    @RequestMapping("update")
    @ResponseBody
    public ResultInfo updateModule(TModule tModule,Boolean moduleState){
        ResultInfo resultInfo=new ResultInfo();
        tModule.setModuleState(moduleState);
        moduleService.updateModule(tModule);
        return resultInfo;
    }

    @RequestMapping("delete")
    @ResponseBody
    public ResultInfo deleteModule(Integer id){
        ResultInfo resultInfo = new ResultInfo();
        moduleService.deleteModule(id);
        return resultInfo;
    }
}
