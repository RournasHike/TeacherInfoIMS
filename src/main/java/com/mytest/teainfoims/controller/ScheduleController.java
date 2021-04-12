package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.controller.base.BaseController;
import com.mytest.teainfoims.query.ScheduleQuery;
import com.mytest.teainfoims.service.ScheduleService;
import com.mytest.teainfoims.service.TeachRoomService;
import com.mytest.teainfoims.service.TeacherService;
import com.mytest.teainfoims.service.UserService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.utils.LoginUserUtil;
import com.mytest.teainfoims.vo.TSchedule;
import com.mytest.teainfoims.vo.TTeacher;
import com.mytest.teainfoims.vo.TUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/3/13
 */
@Controller
@RequestMapping("schedule")
public class ScheduleController extends BaseController {

    @Resource
    private ScheduleService scheduleService;

    @Resource
    private TeachRoomService teachRoomService;

    @Resource
    private TeacherService teacherService;

    @Resource
    private UserService userService;

    @RequestMapping("query")
    public String querySchedule(Model model){
        model.addAttribute("teachRooms",teachRoomService.getAllTeachRooms());
        return "admin/jiaoxue/schedule/scheduleQuery";
    }

    @RequestMapping("querys")
    public String querysSchedule(Model model){
        model.addAttribute("teachRooms",teachRoomService.getAllTeachRooms());
        return "teacher/jiaoxue/schedule/scheduleQuery";
    }

    @RequestMapping("scheduleQuery")
    @ResponseBody
    public List<TSchedule> scheduleQuery(ScheduleQuery scheduleQuery){
        return scheduleService.getScheduleInfo(scheduleQuery);
    }

    @RequestMapping("scheduleTeaQuery")
    @ResponseBody
    public List<TSchedule> scheduleTeaQuery(ScheduleQuery scheduleQuery, HttpServletRequest request){
        int userId = LoginUserUtil.releaseUserIdFromCookie(request);
        TUser tUser = userService.selectByPrimaryKey(userId);
        scheduleQuery.setTeacherName(tUser.getUsertruename());
        return scheduleService.getScheduleInfo(scheduleQuery);
    }
}
