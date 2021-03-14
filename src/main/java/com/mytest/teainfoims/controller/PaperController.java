package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.common.ResultInfo;
import com.mytest.teainfoims.controller.base.BaseController;
import com.mytest.teainfoims.query.PaperQuery;
import com.mytest.teainfoims.query.base.BaseQuery;
import com.mytest.teainfoims.service.PaperService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.utils.LoginUserUtil;
import com.mytest.teainfoims.vo.THonor;
import com.mytest.teainfoims.vo.TPaper;
import com.mytest.teainfoims.vo.TProject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;
import java.util.Map;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/2/2
 */
@Controller
@RequestMapping("paper")
public class PaperController extends BaseController {

    @Resource
    private PaperService paperService;

    @RequestMapping("auditPaper")
    public String toAuditPaperPage(){
        return "admin/audit/paper/paperAudit";
    }

    @RequestMapping("list")
    public String toPaperListPage(){
        return "teacher/keyan/paper/paperList";
    }

    @RequestMapping("auditPaperListPage")
    public String auditPaperListPage(){
        return "admin/audit/paper/paperList";
    }

    @RequestMapping("apply")
    public String toPaperApplyPage(){
        return "teacher/keyan/paper/paperAddOrUpdate";
    }

    @RequestMapping("addPaper")
    @ResponseBody
    public ResultInfo addPaper(TPaper tPaper){
        ResultInfo resultInfo=new ResultInfo();
        paperService.addPaper(tPaper);
        return resultInfo;
    }

    @RequestMapping("paperList")
    @ResponseBody
    public Map<String,Object> projectList(HttpServletRequest request, BaseQuery baseQuery){
        int userId = LoginUserUtil.releaseUserIdFromCookie(request);
        return paperService.queryPaperInfo(baseQuery,userId);
    }

    @RequestMapping("auditPaperList")
    @ResponseBody
    public Map<String, Object> auditPaperList(PaperQuery query){
        return paperService.queryAuditPaperInfo(query);
    }

    @RequestMapping("toAddOrUpdatePaperPage")
    public String toAddOrUpdatePaperPage(@RequestParam Integer paid, Model model){
        TPaper tPaper = paperService.queryPaperDetail(paid);
        model.addAttribute("paper",tPaper);
        return "teacher/keyan/paper/paperAddOrUpdate";
    }

    @RequestMapping("toAddOrUpdateAuditPaperPage")
    public String toAddOrUpdateAuditPaperPage(@RequestParam Integer paid, Model model){
        TPaper paper = paperService.queryPaperDetail(paid);
        model.addAttribute("paper",paper);
        return "admin/audit/paper/paperAudit";
    }

    @RequestMapping("deletePaper")
    @ResponseBody
    public ResultInfo deletePaper(@RequestParam Integer paid){
        ResultInfo resultInfo=new ResultInfo();
        paperService.deletePaperByPK(paid);
        return resultInfo;

    }

    @RequestMapping("toPaperAuditDetail")
    public String toHonorAuditDetail(@RequestParam Integer paid,Model model){
        TPaper paper = paperService.queryPaperDetail(paid);
        model.addAttribute("paper",paper);
        return "admin/audit/paper/paperDetail";
    }

    @RequestMapping("toPaperDetail")
    public String toPaperDetail(@RequestParam Integer paid, Model model){
        TPaper tPaper = paperService.queryPaperDetail(paid);
        model.addAttribute("tPaper",tPaper);
        return "teacher/keyan/paper/paperInfo";
    }

    @RequestMapping("updatePaper")
    @ResponseBody
    public ResultInfo updatePaper(TPaper tPaper,@RequestParam Integer paid){
        ResultInfo resultInfo=new ResultInfo();
        //参数校验
        AssertUtil.isTrue(paid==null,"参数传入失败");
        tPaper.setPaid(paid);
        //执行更新操作
        paperService.updatePaper(tPaper);
        return resultInfo;
    }

    @RequestMapping("updateAuditPaper")
    @ResponseBody
    public ResultInfo updateAuditPaper(TPaper tPaper,@RequestParam Integer paid,@RequestParam Boolean ispass){
        ResultInfo resultInfo=new ResultInfo();
        //参数校验
        AssertUtil.isTrue(paid==null,"参数传入失败");
        tPaper.setPaid(paid);
        tPaper.setPaudit(ispass);
        //执行更新操作
        paperService.updatePaper(tPaper);
        return resultInfo;
    }
}
