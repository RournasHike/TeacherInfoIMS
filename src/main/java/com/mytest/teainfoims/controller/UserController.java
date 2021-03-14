package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.common.ResultInfo;
import com.mytest.teainfoims.controller.base.BaseController;
import com.mytest.teainfoims.dao.TRoleMapper;
import com.mytest.teainfoims.model.UserModel;
import com.mytest.teainfoims.query.UserQuery;
import com.mytest.teainfoims.service.*;
import com.mytest.teainfoims.utils.LoginUserUtil;
import com.mytest.teainfoims.utils.UserBase64;
import com.mytest.teainfoims.vo.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/1/23
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {

    @Resource
    private DeptService deptService;

    @Resource
    private CollegeService collegeService;

    @Resource
    private UserService userService;

    @Resource
    private TeacherService teacherService;

    @Resource
    private PermissionService permissionService;


    @RequestMapping("listPage")
    public String userList(){
        return "admin/user/user";
    }

    /**
     * 用户登录
     * @param userName
     * @param userPwd
     * @param validateCode
     * @return
     */
    @RequestMapping("login")
    @ResponseBody
    public ResultInfo userLogin(String userName, String userPwd, String validateCode,@RequestParam(required = false) Integer roleId, HttpServletRequest request){
        ResultInfo resultInfo=new ResultInfo();
        //获得服务器生成的登录验证码
        String authCode = (String)request.getSession().getAttribute("authCode");
        if(authCode.equalsIgnoreCase(validateCode)){
            UserModel userModel = userService.login(userName, userPwd);
            request.getSession().setAttribute("user",userModel);
            resultInfo.setResult(userModel);
            // 获取cookie中的用户Id
            Integer userId = UserBase64.decoderUserID(userModel.getUserIdStr());
            // 通过当前登录用户ID查询当前登录用户拥有的资源列表 （查询对应资源的授权码）
            List<String> permissions = permissionService.queryUserHasRoleHasPermissionByUserIdAndRoleId(userId,roleId);
            // 将集合设置到session作用域中
//            request.getSession().setAttribute("permissionList", permissions);
        }
        return resultInfo;
    }

    @RequestMapping("logout")
    @ResponseBody
    public ResultInfo userLogout(HttpServletRequest request){
        ResultInfo resultInfo = new ResultInfo();
        request.getSession().removeAttribute("authCode");
        request.getSession().removeAttribute("user");
        request.getSession().removeAttribute("permissions");
        return resultInfo;
    }

    @RequestMapping("list")
    @ResponseBody
    public Map<String,Object>  queryUserList(UserQuery query){
        return userService.queryUserList(query);
    }

    @RequestMapping("toAddOrUpdateUserPage")
    public String toAddOrUpdateUserPage(Integer id, HttpServletRequest request,Model model){
        if(id!=null){
            TUser tUser = userService.queryUserInfo(id);
            request.setAttribute("user",tUser);
            TTeacher tTeacher = teacherService.queryTeaInfo(tUser.getUsername());
            request.setAttribute("tea",tTeacher);
        }
        model.addAttribute("depts",deptService.selAllDept());
        model.addAttribute("colleges",collegeService.selAllCollege());
        return "admin/user/add_update";
    }


    @RequestMapping("addUser")
    @ResponseBody
    public ResultInfo addUser(TTeacher tTeacher, TCollege tCollege, TDept tDept,@RequestParam Boolean isForeign,Integer[] roleIds){
        ResultInfo resultInfo=new ResultInfo();
        tTeacher.setForeign(isForeign);
        tTeacher.settCollege(tCollege);
        tTeacher.settDept(tDept);
        tTeacher.setValidState(true);
        tTeacher.setDeptid(tDept.getDeptId());
        tTeacher.setCollegeid(tCollege.getCollegeId());
        userService.addUser(tTeacher,roleIds);
        return resultInfo;
    }

    @RequestMapping("delete")
    @ResponseBody
    public ResultInfo deleteUser(Integer[] ids){
        ResultInfo resultInfo=new ResultInfo();
        userService.deleteBatch(ids);
        return resultInfo;
    }



    /**
     * 用户信息页面
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("toTeacherInfoPage")
    public String toTeacherInfo(Model model,HttpServletRequest request){
        //获取用户名
        String userName = LoginUserUtil.releaseUserNameFromCookie(request);
        TTeacher tTeacher = teacherService.queryTeaInfo(userName);
        model.addAttribute("tea",tTeacher);
        return "teacher/teaInfo";
    }



    @RequestMapping("toPasswordPage")
    public String toPasswordPage(Integer uid,Model model){
        model.addAttribute("uid",uid);
        return "admin/user/adminpwd";
    }

    @RequestMapping("toUpdatePasswordPage")
    public String toUpdatePasswordPage(Integer uid){
        return "user/password";
    }

    /**
     * 修改密码
     * @param request
     * @param oldPwd
     * @param newPwd
     * @param repeatPwd
     * @return
     */
    @RequestMapping("updatePwd")
    @ResponseBody
    public ResultInfo updatePassword(HttpServletRequest request,String oldPwd,String newPwd,String repeatPwd){
        ResultInfo resultInfo=new ResultInfo();
        int userId = LoginUserUtil.releaseUserIdFromCookie(request);
        userService.updatePwd(userId,oldPwd,newPwd,repeatPwd);
        return resultInfo;
    }

    @RequestMapping("adminUpdatePwd")
    @ResponseBody
    public ResultInfo adminUpdatePwd(HttpServletRequest request,Integer uid,String newPwd,String repeatPwd){
        ResultInfo resultInfo=new ResultInfo();
        userService.adminUpdatePwd(uid,newPwd,repeatPwd);
        return resultInfo;
    }

    @RequestMapping("updateUser")
    @ResponseBody
    public ResultInfo updateUser(TTeacher tTeacher,TCollege tCollege, TDept tDept,@RequestParam Boolean isForeign,TUser tUser,String roleIds){
        ResultInfo resultInfo=new ResultInfo();
        tTeacher.setForeign(isForeign);
        tTeacher.settCollege(tCollege);
        tTeacher.settDept(tDept);
        tTeacher.setValidState(true);
        tTeacher.setDeptid(tDept.getDeptId());
        tTeacher.setCollegeid(tCollege.getCollegeId());
        userService.updateUser(tTeacher,tUser,roleIds);
        return resultInfo;
    }

}
