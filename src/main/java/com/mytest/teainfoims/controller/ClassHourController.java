package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/3/13
 */
@Controller
@RequestMapping("classHour")
public class ClassHourController extends BaseController {
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
        return "teacher/jiaoxue/classhour/classHourQuery";
    }

    @RequestMapping("auditList")
    public String auditClassHourList(){
        return "admin/jiaoxue/classhour/classHourList";
    }
}
