package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.common.ResultInfo;
import com.mytest.teainfoims.controller.base.BaseController;
import com.mytest.teainfoims.query.PaperQuery;
import com.mytest.teainfoims.query.PatentQuery;
import com.mytest.teainfoims.query.base.BaseQuery;
import com.mytest.teainfoims.service.PatentService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.utils.LoginUserUtil;
import com.mytest.teainfoims.vo.TPaper;
import com.mytest.teainfoims.vo.TPatent;
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
@RequestMapping("patent")
public class PatentController extends BaseController {

    @Resource
    private PatentService patentService;

    @RequestMapping("auditPatent")
    public String toAuditPatentPage(){
        return "admin/audit/patent/patentAudit";
    }

    @RequestMapping("auditPatentListPage")
    public String auditPatentListPage(){
        return "admin/audit/patent/patentList";
    }

    @RequestMapping("list")
    public String toPatentListPage(){
        return "teacher/keyan/patent/patentList";
    }

    @RequestMapping("apply")
    public String toPatentApplyPage(){
        return "teacher/keyan/patent/patentAddOrUpdate";
    }

    @RequestMapping("addPatent")
    @ResponseBody
    public ResultInfo addPatent(TPatent tPatent){
        ResultInfo resultInfo=new ResultInfo();
        patentService.addPatent(tPatent);
        return resultInfo;
    }

    @RequestMapping("toAddOrUpdateAuditPatentPage")
    public String toAddOrUpdateAuditPatentPage(@RequestParam Integer patid, Model model){
        TPatent patent = patentService.queryPatentDetail(patid);
        model.addAttribute("patent",patent);
        return "admin/audit/patent/patentAudit";
    }

    @RequestMapping("deletePatent")
    @ResponseBody
    public ResultInfo deletePatent(@RequestParam Integer patid){
        ResultInfo resultInfo=new ResultInfo();
        patentService.deletePatentByPK(patid);
        return resultInfo;

    }

    @RequestMapping("toPatentAuditDetail")
    public String toPatentAuditDetail(@RequestParam Integer patid,Model model){
        TPatent patent = patentService.queryPatentDetail(patid);
        model.addAttribute("patent",patent);
        return "admin/audit/patent/patentDetail";
    }

    @RequestMapping("auditPatentList")
    @ResponseBody
    public Map<String, Object> auditPatentList(PatentQuery query){
        return patentService.queryAuditPatentInfo(query);
    }

    @RequestMapping("patentList")
    @ResponseBody
    public Map<String,Object> patentList(HttpServletRequest request, BaseQuery baseQuery){
        int userId = LoginUserUtil.releaseUserIdFromCookie(request);
        return patentService.queryPatentInfo(baseQuery,userId);
    }

    @RequestMapping("toAddOrUpdatePatentPage")
    public String toAddOrUpdatePatentPage(@RequestParam Integer patid, Model model){
        TPatent tPatent = patentService.queryPatentDetail(patid);
        model.addAttribute("patent",tPatent);
        return "teacher/keyan/patent/patentAddOrUpdate";
    }

    @RequestMapping("toPatentDetail")
    public String toPatentDetail(@RequestParam Integer patid, Model model){
        TPatent tPaper = patentService.queryPatentDetail(patid);
        model.addAttribute("patent",tPaper);
        return "teacher/keyan/patent/patentInfo";
    }

    @RequestMapping("updatePatent")
    @ResponseBody
    public ResultInfo updatePatent(TPatent tPatent,@RequestParam Integer patid){
        ResultInfo resultInfo=new ResultInfo();
        //参数校验
        AssertUtil.isTrue(patid==null,"参数传入失败");
        tPatent.setPatid(patid);
        //执行更新操作
        patentService.updatePatent(tPatent);
        return resultInfo;
    }

    @RequestMapping("updateAuditPatent")
    @ResponseBody
    public ResultInfo updateAuditPatent(TPatent tPatent,@RequestParam Integer patid,@RequestParam Boolean ispass){
        ResultInfo resultInfo=new ResultInfo();
        //参数校验
        AssertUtil.isTrue(patid==null,"参数传入失败");
        tPatent.setPatid(patid);
        tPatent.setPaudit(ispass);
        //执行更新操作
        patentService.updatePatent(tPatent);
        return resultInfo;
    }
}
