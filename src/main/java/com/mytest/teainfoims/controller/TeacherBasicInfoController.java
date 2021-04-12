package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.common.ResultInfo;
import com.mytest.teainfoims.controller.base.BaseController;
import com.mytest.teainfoims.query.TeacherQuery;
import com.mytest.teainfoims.service.CollegeService;
import com.mytest.teainfoims.service.DeptService;
import com.mytest.teainfoims.service.TeacherService;
import com.mytest.teainfoims.vo.TCollege;
import com.mytest.teainfoims.vo.TDept;
import com.mytest.teainfoims.vo.TTeacher;
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
 * @Date: create in 2021/1/24
 */
@Controller
@RequestMapping("tea")
public class TeacherBasicInfoController extends BaseController {

    @Resource
    private TeacherService teacherService;

    @Resource
    private CollegeService collegeService;

    @Resource
    private DeptService deptService;


    /**
     * 跳转到教师列表页面
     * @return
     */
    @RequestMapping("teaInfo")
    public String teacherInfo(Model model){
        model.addAttribute("depts",deptService.selAllDept());
        model.addAttribute("colleges",collegeService.selAllCollege());
        return "admin/tea/teaList";
    }


    @RequestMapping("toBatchDataImport")
    public String toBatchDataImport(){
        return "admin/tea/batchDataImport";
    }

    @RequestMapping("toTeacherIframe")
    public String toTeacherIframe(){
        return "admin/jiaoxue/teach/teacherSelector";
    }

    /**
     * 条件查询教师信息
     * @param query
     * @return
     */
    @RequestMapping("list")
    @ResponseBody
    public Map<String,Object> teacherInfoList(TeacherQuery query){
        return teacherService.queryTeacherList(query);
    }


    /**
     * 添加或更新教师页面
     * @param teaId
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("toAddOrUpdateTeaPage")
    public String toAddOrUpdateTeaPage(String teaId, HttpServletRequest request, Model model){
        if(teaId!=null){
            TTeacher tTeacher = teacherService.queryTeaInfo(teaId);
            request.setAttribute("tea",tTeacher);
        }
        model.addAttribute("depts",deptService.selAllDept());
        model.addAttribute("colleges",collegeService.selAllCollege());
        return "admin/tea/teaAddOrUpdate";
    }

    /**
     * 教师详细信息页面
     * @param teaId
     * @param model
     * @return
     */
    @RequestMapping("toTeaDetail")
    public String toTeaDetail(String teaId,Model model){
        TTeacher tTeacher = teacherService.queryTeaInfo(teaId);
        model.addAttribute("tea",tTeacher);
        return "teacher/teaInfo";
    }

    /**
     * 添加教师信息
     * @param tTeacher
     * @param tCollege
     * @param tDept
     * @param isForeign
     * @return
     */
    @RequestMapping("addTeacher")
    @ResponseBody
    public ResultInfo addTeacher(TTeacher tTeacher, TCollege tCollege, TDept tDept,@RequestParam Boolean isForeign){
        ResultInfo resultInfo=new ResultInfo();
        tTeacher.setForeign(isForeign);
        tTeacher.settCollege(tCollege);
        tTeacher.settDept(tDept);
        tTeacher.setValidState(true);
        tTeacher.setDeptid(tDept.getDeptId());
        tTeacher.setCollegeid(tCollege.getCollegeId());
        teacherService.addTeacher(tTeacher);
        return resultInfo;
    }

    /**
     * 更新教师信息
     * @param tTeacher
     * @return
     */
    @RequestMapping("updateTeacher")
    @ResponseBody
    public ResultInfo updateTeacher(TTeacher tTeacher){
        ResultInfo resultInfo=new ResultInfo();
        teacherService.updateTeacher(tTeacher);
        return resultInfo;
    }

    /**
     *
     * @param tTeacher
     * @return
     */
    @RequestMapping("deleteTeacher")
    @ResponseBody
    public ResultInfo deleteTeacher(TTeacher tTeacher){
        ResultInfo resultInfo=new ResultInfo();
        teacherService.deleteTeacher(tTeacher);
        return resultInfo;
    }

}
