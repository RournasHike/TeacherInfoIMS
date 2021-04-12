package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.common.ResultInfo;
import com.mytest.teainfoims.controller.base.BaseController;
import com.mytest.teainfoims.query.CourseQuery;
import com.mytest.teainfoims.query.TeachQuery;
import com.mytest.teainfoims.query.TeacherQuery;
import com.mytest.teainfoims.query.base.BaseQuery;
import com.mytest.teainfoims.service.CourseService;
import com.mytest.teainfoims.vo.TCourse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
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
    public String toAddOrUpdateCoursePage(Integer id, Model model){
        if(id!=null){
            model.addAttribute("course",courseService.getCourseById(id));
            return "admin/jiaoxue/course/courseUpdate";
        }
        return "admin/jiaoxue/course/courseAdd";
    }

    @RequestMapping("toCourseIframe")
    public String toCourseIframe(){
        return "admin/jiaoxue/teach/courseSelector";
    }

    @RequestMapping("courseList")
    @ResponseBody
    public Map<String,Object> courseList(BaseQuery query){
        return courseService.queryCourseList(query);
    }

    @RequestMapping("courseCondList")
    @ResponseBody
    public Map<String,Object> courseCondList(CourseQuery query){
        return courseService.queryCourseCondList(query);
    }

    @RequestMapping("addCourse")
    @ResponseBody
    public ResultInfo addCourse(@Validated TCourse tCourse, BindingResult result){
        ResultInfo resultInfo=new ResultInfo();
        List<String> errors = new ArrayList<>();
        // 如果 BindingResult 的 hasErrors 方法返回true，则表示有错误信息
        if (result.hasErrors()) {
            List<ObjectError> allErrors = result.getAllErrors();
            /// 遍历错误信息，返回给前端
            for (ObjectError error : allErrors) {
                errors.add(error.getDefaultMessage());
            }
        }

        if(errors.size()==0){
            courseService.addCourse(tCourse);
        }else{
            resultInfo.setCode(500);
            resultInfo.setMsg("添加失败");
            resultInfo.setResult(errors);
        }
        return resultInfo;
    }

    @RequestMapping("deleteCourse")
    @ResponseBody
    public ResultInfo deleteCourse(Integer id){
        ResultInfo resultInfo=new ResultInfo();
        courseService.deleteCourse(id);
        return resultInfo;
    }

    @RequestMapping("updateCourse")
    @ResponseBody
    public ResultInfo updateCourse(TCourse tCourse){
        ResultInfo resultInfo=new ResultInfo();
        courseService.updateCourse(tCourse);
        return resultInfo;
    }

    @RequestMapping("toCourseDetail")
    public String toCourseDetail(Integer id,Model model){
        model.addAttribute("course",courseService.getCourseById(id));
        return "admin/jiaoxue/course/courseDetail";
    }

}