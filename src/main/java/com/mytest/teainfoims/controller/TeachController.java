package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.common.ResultInfo;
import com.mytest.teainfoims.controller.base.BaseController;
import com.mytest.teainfoims.query.TeachQuery;
import com.mytest.teainfoims.query.base.BaseQuery;
import com.mytest.teainfoims.service.*;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.utils.LoginUserUtil;
import com.mytest.teainfoims.vo.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/3/13
 */
@Controller
@RequestMapping("teach")
public class TeachController extends BaseController {

    @Resource
    private TeacherService teacherService;

    @Resource
    private ScheduleService scheduleService;

    @Resource
    private TeachService teachService;

    @Resource
    private TeachRoomService teachRoomService;

    @Resource
    private DeptService deptService;

    @Resource
    private CollegeService collegeService;

    @Resource
    private CourseService courseService;

    @Resource
    private UserService userService;

    @RequestMapping("assign")
    public String assignTeach(Model model){
        model.addAttribute("depts",deptService.selAllDept());
        model.addAttribute("colleges",collegeService.selAllCollege());
        model.addAttribute("teachRooms",teachRoomService.getAllTeachRooms());
        model.addAttribute("courses",courseService.getAllCourse());
        model.addAttribute("teachers",teacherService.getAllTeachers());
        return "admin/jiaoxue/teach/teachAssign";
    }

    @RequestMapping("UpdateTeachPage")
    public String UpdateTeachPage(Integer sid,Integer tid,Model model){
        model.addAttribute("depts",deptService.selAllDept());
        model.addAttribute("colleges",collegeService.selAllCollege());
        model.addAttribute("teachRooms",teachRoomService.getAllTeachRooms());
        model.addAttribute("courses",courseService.getAllCourse());
        model.addAttribute("teachers",teacherService.getAllTeachers());
        model.addAttribute("sid",sid);
        AssertUtil.isTrue(sid==null,"参数错误");
        AssertUtil.isTrue(tid==null,"参数错误");
        TTeach teach = teachService.getTeachInfoById(tid);
        teach.setCourseName(courseService.getCourseById(teach.getCid()).getCourseName());
        teach.setTeacherName(teacherService.getTeacherById(teach.getTid()).getTeacherName());
        model.addAttribute("teach",teach);
        TSchedule schedule = scheduleService.getScheduleInfoById(sid);
        schedule.setTeachRoomName(teachRoomService.getTeachRoomById(schedule.getRid()).getTeachRoomName());
        model.addAttribute("schedule",schedule);
        return "admin/jiaoxue/teach/teachEdit";
    }

/*    @RequestMapping("getTeacher")
    @ResponseBody
    public List<TTeacher> getTeachers(Integer collegeId,Integer deptId){
        List<TTeacher> teachersByCond = teacherService.getTeachersByCond(collegeId, deptId);
        return teachersByCond;
    }*/

    @RequestMapping("apply")
    public String applyTeach(){
        return "teacher/jiaoxue/teach/teachApply";
    }

    @RequestMapping("query")
    public String queryTeach(){
        return "teacher/jiaoxue/teach/teachQuery";
    }


    @RequestMapping("teachAssign")
    @ResponseBody
    public ResultInfo teachAssign(TTeach tTeach, TSchedule tSchedule, TCourse tCourse, TTeacher teacher, TTeachRoom teachRoom,TCollege tCollege,TDept tDept, Boolean isSingleWeek, Boolean isDoubleWeek){
        ResultInfo resultInfo=new ResultInfo();
        //设置对象数据
        tTeach.setCid(courseService.getCourseByName(tCourse.getCourseName()).getId());
        tTeach.setTid(teacherService.getTeacherByName(teacher.getTeacherName()).getTid());
        tTeach.setStartCollege(collegeService.selCollegeById(tCollege.getCollegeId()).getCollegeName());
        tTeach.setStartDept(deptService.selDeptById(tDept.getDeptId()).getDeptName());
        tSchedule.setCid(courseService.getCourseByName(tCourse.getCourseName()).getId());
        tSchedule.setRid(teachRoomService.getTeachRoomByName(teachRoom.getTeachRoomName()).getId());
        tSchedule.setTid(teacherService.getTeacherByName(teacher.getTeacherName()).getTid());
        tSchedule.setClassYear(tTeach.getTeachClassYear());
        tSchedule.setClassTerm(tTeach.getTeachClassTerm());
        tSchedule.setIsSingleWeek(isSingleWeek);
        tSchedule.setIsDoubleWeek(isDoubleWeek);
        //添加数据
        teachService.addTeachInfo(tTeach,tSchedule);
        return resultInfo;
    }

    @RequestMapping("teachEdit")
    @ResponseBody
    public ResultInfo teachEdit(TTeach tTeach, TSchedule tSchedule, TCourse tCourse, TTeacher teacher, TTeachRoom teachRoom,TCollege tCollege,TDept tDept, Boolean isSingleWeek, Boolean isDoubleWeek,Integer sid){
        ResultInfo resultInfo=new ResultInfo();
        //设置对象数据
        tTeach.setCid(courseService.getCourseByName(tCourse.getCourseName()).getId());
        tTeach.setTid(teacherService.getTeacherByName(teacher.getTeacherName()).getTid());
        tTeach.setStartCollege(collegeService.selCollegeById(tCollege.getCollegeId()).getCollegeName());
        tTeach.setStartDept(deptService.selDeptById(tDept.getDeptId()).getDeptName());
        tSchedule.setCid(courseService.getCourseByName(tCourse.getCourseName()).getId());
        tSchedule.setRid(teachRoomService.getTeachRoomByName(teachRoom.getTeachRoomName()).getId());
        tSchedule.setTid(teacherService.getTeacherByName(teacher.getTeacherName()).getTid());
        tSchedule.setClassYear(tTeach.getTeachClassYear());
        tSchedule.setClassTerm(tTeach.getTeachClassTerm());
        tSchedule.setIsSingleWeek(isSingleWeek);
        tSchedule.setIsDoubleWeek(isDoubleWeek);
        tSchedule.setId(sid);
        //添加数据
        teachService.updateTeachInfo(tTeach,tSchedule);
        return resultInfo;
    }

    @RequestMapping("teachListPage")
    public String teachListPage(){
        return "admin/jiaoxue/teach/teachList";
    }

    @RequestMapping("teachList")
    @ResponseBody
    public Map<String,Object> teachList(BaseQuery query){
        return teachService.queryTeachList(query);
    }

    @RequestMapping("teachCondList")
    @ResponseBody
    public Map<String,Object> getTeachCondList(TeachQuery query, HttpServletRequest request){
        int userId = LoginUserUtil.releaseUserIdFromCookie(request);
        TUser tUser = userService.selectByPrimaryKey(userId);
        query.setTeacherName(tUser.getUsertruename());
        return teachService.getTeachInfoByCond(query);
    }

    @RequestMapping("delTeach")
    @ResponseBody
    public ResultInfo delTeach(Integer tid,Integer sid){
        ResultInfo resultInfo=new ResultInfo();
        teachService.delTeachAndSchedule(tid,sid);
        return resultInfo;
    }

}
