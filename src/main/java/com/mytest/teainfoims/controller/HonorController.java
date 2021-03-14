package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.common.ResultInfo;
import com.mytest.teainfoims.controller.base.BaseController;
import com.mytest.teainfoims.query.HonorQuery;
import com.mytest.teainfoims.query.base.BaseQuery;
import com.mytest.teainfoims.service.HonorService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.utils.LoginUserUtil;
import com.mytest.teainfoims.vo.THonor;
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
@RequestMapping("honor")
public class HonorController extends BaseController {

    @Resource
    private HonorService honorService;

    @RequestMapping("auditHonor")
    public String toAuditHonorPage(){
        return "admin/audit/honor/honorAudit";
    }

    @RequestMapping("auditHonorListPage")
    public String auditHonorListPage(){
        return "admin/audit/honor/honorList";
    }

    @RequestMapping("list")
    public String toHonorListPage(){
        return "teacher/keyan/honor/honorList";
    }

    @RequestMapping("apply")
    public String toHonorApplyPage(){
        return "teacher/keyan/honor/honorAddOrUpdate";
    }

    @RequestMapping("auditHonorList")
    @ResponseBody
    public Map<String, Object> auditHonorList(HonorQuery honorQuery){
        return honorService.queryHonorList(honorQuery);
    }

    @RequestMapping("addHonor")
    @ResponseBody
    public ResultInfo addHonor(THonor tHonor){
        ResultInfo resultInfo=new ResultInfo();
        honorService.addHonor(tHonor);
        return resultInfo;
    }

    @RequestMapping("honorList")
    @ResponseBody
    public Map<String,Object> honorList(HttpServletRequest request, BaseQuery baseQuery){
        int userId = LoginUserUtil.releaseUserIdFromCookie(request);
        return honorService.queryHonorInfo(baseQuery,userId);
    }


    @RequestMapping("toAddOrUpdateAuditHonorPage")
    public String toAddOrUpdateAuditHonorPage(@RequestParam Integer hid, Model model){
        THonor tHonor = honorService.queryHonorDetail(hid);
        model.addAttribute("honor",tHonor);
        return "admin/audit/honor/honorAudit";
    }

    @RequestMapping("deleteHonor")
    @ResponseBody
    public ResultInfo deleteHonor(@RequestParam Integer hid){
        ResultInfo resultInfo=new ResultInfo();
        honorService.deleteHonorByPK(hid);
        return resultInfo;

    }

    @RequestMapping("toHonorAuditDetail")
    public String toHonorAuditDetail(@RequestParam Integer hid,Model model){
        THonor tHonor = honorService.queryHonorDetail(hid);
        model.addAttribute("honor",tHonor);
        return "admin/audit/honor/honorDetail";
    }


    @RequestMapping("toAddOrUpdateHonorPage")
    public String toAddOrUpdateHonorPage(@RequestParam Integer hid, Model model){
        THonor tHonor = honorService.queryHonorDetail(hid);
        model.addAttribute("honor",tHonor);
        return "teacher/keyan/honor/honorAddOrUpdate";
    }

    @RequestMapping("toHonorDetail")
    public String toHonorDetail(@RequestParam Integer hid, Model model){
        THonor tHonor = honorService.queryHonorDetail(hid);
        model.addAttribute("honor",tHonor);
        return "teacher/keyan/honor/honorInfo";
    }


    @RequestMapping("updateHonor")
    @ResponseBody
    public ResultInfo updateHonor(THonor tHonor,@RequestParam Integer hid){
        ResultInfo resultInfo=new ResultInfo();
        //参数校验
        AssertUtil.isTrue(hid==null,"参数传入失败");
        tHonor.setHid(hid);
        //执行更新操作
        honorService.updateHonor(tHonor);
        return resultInfo;
    }

    @RequestMapping("updateAuditHonor")
    @ResponseBody
    public ResultInfo updateAuditHonor(THonor tHonor,@RequestParam Integer hid,@RequestParam Boolean ispass){
        ResultInfo resultInfo=new ResultInfo();
        //参数校验
        AssertUtil.isTrue(hid==null,"参数传入失败");
        tHonor.setHid(hid);
        tHonor.setHaudit(ispass);
        //执行更新操作
        honorService.updateHonor(tHonor);
        return resultInfo;
    }
}
