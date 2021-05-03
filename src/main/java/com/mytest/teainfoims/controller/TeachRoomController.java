package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.controller.base.BaseController;
import com.mytest.teainfoims.service.TeachRoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/4/12
 */
@Controller
@RequestMapping("teachRoom")
public class TeachRoomController extends BaseController {
    @Resource
    private TeachRoomService teachRoomService;

    @RequestMapping("toTeachRoomIframe")
    public String toTeacherIframe(Model model){
        model.addAttribute("data",teachRoomService.getAllTeachRooms());
        return "admin/jiaoxue/teach/teachRoomSelector";
    }
}