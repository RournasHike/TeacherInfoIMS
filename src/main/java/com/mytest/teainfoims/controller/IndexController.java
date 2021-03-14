package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.controller.base.BaseController;
import com.mytest.teainfoims.service.PermissionService;
import com.mytest.teainfoims.service.UserService;
import com.mytest.teainfoims.utils.LoginUserUtil;
import com.mytest.teainfoims.utils.UserBase64;
import com.mytest.teainfoims.vo.TUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/1/23
 */
@Controller
public class IndexController extends BaseController {

    @Resource
    private UserService userService;

    @Resource
    private PermissionService permissionService;


    /**
     * 系统主页
     * @return
     */
    @RequestMapping("main")
    public String main(HttpServletRequest request,@RequestParam Integer roleId){
        Integer userId = LoginUserUtil.releaseUserIdFromCookie(request);
        // 通过当前登录用户ID查询当前登录用户拥有的资源列表 （查询对应资源的授权码）
        List<String> permissions = permissionService.queryUserHasRoleHasPermissionByUserIdAndRoleId(userId,roleId);
        // 将集合设置到session作用域中
        request.getSession().setAttribute("permissionList", permissions);
        return "main";
    }

    /**
     * 系统欢迎页
     * @return
     */
    @RequestMapping("welcome")
    public String welcome(){
        return "welcome";
    }

    /**
     * 系统登录页面
     * @return
     */
    @RequestMapping(value = {"/index","/"})
    public String index(){
        return "index";
    }

}
