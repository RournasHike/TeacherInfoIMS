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
@RequestMapping("schedule")
public class ScheduleController extends BaseController {
    @RequestMapping("query")
    public String querySchedule(){
        return "admin/jiaoxue/schedule/scheduleQuery";
    }
}
