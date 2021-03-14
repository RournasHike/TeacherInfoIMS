package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.common.ResultInfo;
import com.mytest.teainfoims.controller.base.BaseController;
import com.mytest.teainfoims.query.PatentQuery;
import com.mytest.teainfoims.query.ProjectQuery;
import com.mytest.teainfoims.query.base.BaseQuery;
import com.mytest.teainfoims.service.ProjectService;
import com.mytest.teainfoims.utils.LoginUserUtil;
import com.mytest.teainfoims.vo.TPatent;
import com.mytest.teainfoims.vo.TProject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/2/2
 */
@Controller
@RequestMapping("project")
public class ProjectController extends BaseController {

    @Resource
    private ProjectService projectService;

    @RequestMapping("auditPro")
    public String toAuditProPage(){
        return "admin/audit/project/projectAudit";
    }

    @RequestMapping("auditProjectListPage")
    public String auditProjectListPage(){
        return "admin/audit/project/projectList";
    }

    @RequestMapping("list")
    public String toProjectListPage(){
        return "teacher/keyan/project/projectList";
    }


    @RequestMapping("auditProjectList")
    @ResponseBody
    public Map<String, Object> auditProjectList(ProjectQuery query){
        return projectService.queryAuditProjectInfo(query);
    }

    @RequestMapping("toAddOrUpdateAuditProjectPage")
    public String toAddOrUpdateAuditProjectPage(@RequestParam Integer pid, Model model){
        TProject project = projectService.queryProjectDetail(pid);
        model.addAttribute("project",project);
        return "admin/audit/project/projectAudit";
    }

    @RequestMapping("deleteProject")
    @ResponseBody
    public ResultInfo deleteProject(@RequestParam Integer patid){
        ResultInfo resultInfo=new ResultInfo();
        projectService.deleteProjectByPK(patid);
        return resultInfo;

    }

    @RequestMapping("toProjectAuditDetail")
    public String toProjectAuditDetail(@RequestParam Integer pid,Model model){
        TProject tProject = projectService.queryProjectDetail(pid);
        model.addAttribute("project",tProject);
        return "admin/audit/project/projectDetail";
    }

    @RequestMapping("apply")
    public String toProjectApplyPage(){
        return "teacher/keyan/project/projectAddOrUpdate";
    }

    /**
     * 添加项目信息
     * @param project
     * @param isFinished
     * @return
     */
    @RequestMapping("addProject")
    @ResponseBody
    public ResultInfo addProject(TProject project,@RequestParam Boolean isFinished){
        ResultInfo resultInfo=new ResultInfo();
        project.setPcondition(isFinished);
        projectService.addProject(project);
        return resultInfo;
    }

    /**
     * 项目列表
     * @param request
     * @param baseQuery
     * @return
     */
    @RequestMapping("projectList")
    @ResponseBody
    public Map<String,Object> projectList(HttpServletRequest request, BaseQuery baseQuery){
        int userId = LoginUserUtil.releaseUserIdFromCookie(request);
        return projectService.queryProjectInfo(baseQuery,userId);
    }

    /**
     * 项目详细信息
     * @param proId
     * @param model
     * @return
     */
    @RequestMapping("toProjectDetail")
    public String projectDetail(@RequestParam Integer proId, Model model){
        TProject tProject = projectService.queryProjectDetail(proId);
        model.addAttribute("project",tProject);
        return "teacher/keyan/project/projectInfo";
    }

    @RequestMapping("toAddOrUpdateProjectPage")
    public String toAddOrUpdateProjectPage(@RequestParam Integer pid,Model model){
        TProject tProject = projectService.queryProjectDetail(pid);
        model.addAttribute("project",tProject);
        return "teacher/keyan/project/projectAddOrUpdate";
    }

    @RequestMapping("updateProject")
    @ResponseBody
    public ResultInfo updateProject(TProject project,@RequestParam Integer pid,@RequestParam Boolean isFinished){
        ResultInfo resultInfo=new ResultInfo();
        project.setPcondition(isFinished);
        project.setPid(pid);
        projectService.updateProject(project);
        return resultInfo;
    }

    @RequestMapping("updateAuditProject")
    @ResponseBody
    public ResultInfo updateAuditProject(TProject project,@RequestParam Integer pid,@RequestParam Boolean ispass){
        ResultInfo resultInfo=new ResultInfo();
        project.setPaudit(ispass);
        project.setPid(pid);
        projectService.updateProject(project);
        return resultInfo;
    }

}
