package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.common.ResultInfo;
import com.mytest.teainfoims.controller.base.BaseController;
import com.mytest.teainfoims.query.TeacherQuery;
import com.mytest.teainfoims.query.base.BaseQuery;
import com.mytest.teainfoims.service.CourseService;
import com.mytest.teainfoims.vo.TCourse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/3/13
 */
@Controller
@RequestMapping("course")
public class CourseController extends BaseController {

    @Resource
    private CourseService courseService;

    @RequestMapping("list")
    public String courseList(){
        return "admin/jiaoxue/course/courseList";
    }

    @RequestMapping("query")
    public String courseQuery(){
        return "teacher/jiaoxue/course/courseQuery";
    }

    @RequestMapping("toAddOrUpdateCoursePage")
    public String toAddOrUpdateCoursePage(Integer id){
        if(id!=null){
            return "admin/jiaoxue/course/courseUpdate";
        }
        return "admin/jiaoxue/course/courseAdd";
    }


    @RequestMapping("courseList")
    @ResponseBody
    public Map<String,Object> courseList(BaseQuery query){
        return courseService.queryCourseList(query);
    }

    @RequestMapping("addCourse")
    @ResponseBody
    public ResultInfo addCourse(TCourse tCourse){
        ResultInfo resultInfo=new ResultInfo();
        courseService.addCourse(tCourse);
        return resultInfo;
    }

}