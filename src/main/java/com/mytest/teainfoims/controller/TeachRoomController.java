package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/4/12
 */
@Controller
@RequestMapping("teachRoom")
public class TeachRoomController extends BaseController {
    @RequestMapping("toTeachRoomIframe")
    public String toTeacherIframe(){
        return "admin/jiaoxue/teach/teachRoomSelector";
    }
}