package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.common.ResultInfo;
import com.mytest.teainfoims.controller.base.BaseController;
import com.mytest.teainfoims.entity.ClassHourEntity;
import com.mytest.teainfoims.query.ClassHourQuery;
import com.mytest.teainfoims.query.TeacherQuery;
import com.mytest.teainfoims.query.base.BaseQuery;
import com.mytest.teainfoims.service.CourseService;
import com.mytest.teainfoims.service.TeachService;
import com.mytest.teainfoims.service.TeacherService;
import com.mytest.teainfoims.vo.TTeach;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/3/13
 */
@Controller
@RequestMapping("classHour")
public class ClassHourController extends BaseController {

    @Resource
    private TeachService teachService;

    @Resource
    private CourseService courseService;

    @Resource
    private TeacherService teacherService;

    @RequestMapping("apply")
    public String applyClassHour(){
        return "teacher/jiaoxue/classhour/classHourApply";
    }

    @RequestMapping("summary")
    public String summaryClassHour(){
        return "admin/jiaoxue/classhour/classHourSumup";
    }

    @RequestMapping("query")
    public String queryClassHour(){
        return "teacher/jiaoxue/classhour/classHourList";
    }

    @RequestMapping("auditList")
    public String auditClassHourList(){
        return "admin/jiaoxue/classhour/classHourList";
    }

    @RequestMapping("addClassHour")
    @ResponseBody
    public ResultInfo addClassHour(TTeach tTeach,String teacherName,String courseName){
        ResultInfo resultInfo=new ResultInfo();
        Integer tid = teacherService.getTeacherByName(teacherName).getTid();
        Integer cid = courseService.getCourseByName(courseName).getId();
        teachService.updateClassHourInfo(tTeach,tid,cid);
        return resultInfo;
    }

    @RequestMapping("classHourList")
    @ResponseBody
    public Map<String,Object> queryClassHourList(BaseQuery query){
        return teachService.queryClassHourList(query);
    }

    @RequestMapping("auditClassHourList")
    @ResponseBody
    public Map<String,Object> queryAuditClassHourList(BaseQuery query){
        return teachService.queryAuditClassHourList(query);
    }

    @RequestMapping("classHourDetail")
    public String queryClassHourDetail(Integer id, Model model){
        model.addAttribute("classHour",teachService.queryClassHourDetail(id));
        return "teacher/jiaoxue/classHour/classHourDetail";
    }

    @RequestMapping("classHourAudit")
    public String classHourAudit(Integer id, Model model){
        model.addAttribute("classHour",teachService.queryAuditClassHourById(id));
        return "admin/jiaoxue/classHour/classHourAudit";
    }

    @RequestMapping("audit")
    @ResponseBody
    public ResultInfo audit(TTeach tTeach, Boolean ispass){
        ResultInfo resultInfo=new ResultInfo();
        tTeach.setAuditState(ispass);
        teachService.updateAudit(tTeach);
        return resultInfo;
    }


    @RequestMapping("teacherClassHourList")
    @ResponseBody
    public Map<String,Object> teacherClassHourList(ClassHourQuery query){
        return teachService.queryTeacherClassHour(query);
    }

}
