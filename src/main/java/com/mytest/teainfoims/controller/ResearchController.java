package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.common.ResultInfo;
import com.mytest.teainfoims.controller.base.BaseController;
import com.mytest.teainfoims.query.PatentQuery;
import com.mytest.teainfoims.query.ResearchQuery;
import com.mytest.teainfoims.query.base.BaseQuery;
import com.mytest.teainfoims.service.ResearchService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.utils.LoginUserUtil;
import com.mytest.teainfoims.vo.TPatent;
import com.mytest.teainfoims.vo.TProject;
import com.mytest.teainfoims.vo.TResearch;
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
@RequestMapping("search")
public class ResearchController extends BaseController {

    @Resource
    private ResearchService researchService;

    @RequestMapping("auditSearch")
    public String toAuditSearchPage(){
        return "admin/audit/search/searchAudit";
    }

    @RequestMapping("list")
    public String toSearchListPage(){
        return "teacher/keyan/search/searchList";
    }

    @RequestMapping("auditResearchList")
    @ResponseBody
    public Map<String, Object> auditResearchList(ResearchQuery query){
        return researchService.queryAuditResearchInfo(query);
    }

    @RequestMapping("toAddOrUpdateAuditResearchPage")
    public String toAddOrUpdateAuditResearchPage(@RequestParam Integer id, Model model){
        TResearch tResearch = researchService.queryResearchDetail(id);
        model.addAttribute("search",tResearch);
        return "admin/audit/search/searchAudit";
    }

    @RequestMapping("deleteResearch")
    @ResponseBody
    public ResultInfo deleteProject(@RequestParam Integer id){
        ResultInfo resultInfo=new ResultInfo();
        researchService.deleteResearchByPK(id);
        return resultInfo;

    }

    @RequestMapping("toResearchAuditDetail")
    public String toProjectAuditDetail(@RequestParam Integer id,Model model){
        TResearch tResearch = researchService.queryResearchDetail(id);
        model.addAttribute("search",tResearch);
        return "admin/audit/search/searchDetail";
    }

    @RequestMapping("auditResearchListPage")
    public String auditResearchListPage(){
        return "admin/audit/search/searchList";
    }

    @RequestMapping("apply")
    public String toSearchApplyPage(){
        return "teacher/keyan/search/searchAddOrUpdate";
    }

    @RequestMapping("addResearch")
    @ResponseBody
    public ResultInfo addResearch(TResearch tResearch,Boolean restate){
        ResultInfo resultInfo=new ResultInfo();
        //参数判断
        AssertUtil.isTrue(restate==null,"参数传入失败");
        tResearch.setRestate(restate);
        researchService.addResearch(tResearch);
        return resultInfo;
    }

    @RequestMapping("reseachList")
    @ResponseBody
    public Map<String,Object> reseachList(HttpServletRequest request, BaseQuery baseQuery){
        int userId = LoginUserUtil.releaseUserIdFromCookie(request);
        return researchService.queryResearchInfo(baseQuery,userId);
    }

    @RequestMapping("toAddOrUpdateSearchPage")
    public String toAddOrUpdateSearchPage(@RequestParam Integer id, Model model){
        TResearch tResearch = researchService.queryResearchDetail(id);
        model.addAttribute("search",tResearch);
        return "teacher/keyan/search/searchAddOrUpdate";
    }

    @RequestMapping("toSearchDetail")
    public String toSearchDetail(@RequestParam Integer id, Model model){
        TResearch tResearch = researchService.queryResearchDetail(id);
        model.addAttribute("search",tResearch);
        return "teacher/keyan/search/searchInfo";
    }

    @RequestMapping("updateResearch")
    @ResponseBody
    public ResultInfo updateResearch(TResearch tResearch,@RequestParam Integer id){
        ResultInfo resultInfo=new ResultInfo();
        //参数校验
        AssertUtil.isTrue(id==null,"参数传入失败");
        tResearch.setId(id);
        //执行更新操作
        researchService.updateResearch(tResearch);
        return resultInfo;
    }

    @RequestMapping("updateAuditResearch")
    @ResponseBody
    public ResultInfo updateResearch(TResearch tResearch,@RequestParam Integer id,@RequestParam Boolean ispass){
        ResultInfo resultInfo=new ResultInfo();
        //参数校验
        AssertUtil.isTrue(id==null,"参数传入失败");
        tResearch.setId(id);
        tResearch.setPaudit(ispass);
        //执行更新操作
        researchService.updateResearch(tResearch);
        return resultInfo;
    }
}
