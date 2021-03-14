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
@RequestMapping("teach")
public class TeachController extends BaseController {

    @RequestMapping("assign")
    public String assignTeach(){
        return "admin/jiaoxue/teach/teachAssign";
    }

    @RequestMapping("apply")
    public String applyTeach(){
        return "teacher/jiaoxue/teach/teachApply";
    }

    @RequestMapping("query")
    public String queryTeach(){
        return "teacher/jiaoxue/teach/teachQuery";
    }

    @RequestMapping("auditList")
    public String auditTeachList(){
        return "admin/jiaoxue/teach/teachList";
    }

}
