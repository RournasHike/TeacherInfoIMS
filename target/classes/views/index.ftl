<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-登录</title>
    <#include "common.ftl">
    <link rel="stylesheet" href="${ctx}/css/index.css" media="all">
</head>
<body>
<div class="layui-container">
    <div class="admin-login-background">
        <div class="layui-form login-form">
            <form class="layui-form" action="">
                <div class="layui-form-item logo-title">
                    <h1 style="color: #33B5E5">高校教研室教师信息管理系统登录</h1>
                </div>
                <div class="layui-form-item">
                    <label class="layui-icon layui-icon-username" for="username"></label>
                    <input type="text" name="username" lay-verify="required|account" placeholder="用户名或者邮箱" autocomplete="off" class="layui-input" >
                </div>
                <div class="layui-form-item">
                    <label class="layui-icon layui-icon-password" for="password"></label>
                    <input type="password" name="password" lay-verify="required|password" placeholder="密码" autocomplete="off" class="layui-input" >
                </div>
                <div class="layui-form-item" style="overflow: hidden">
                    <input type="text" name="validateCode" lay-verify="required" placeholder="请输入验证码" autocomplete="off" class="layui-input" style="width: 150px;float: left;">
                    <img src="${ctx}/ValidateCode" style="float: left; margin-left: 15px" id="validationCode"/>
                </div>
                <div class="layui-form-item">
                    <select name="roleId" lay-verify="required">
                        <option value="">-- 请选择登录身份 --</option>
                        <option value="2">教师</option>
                        <option value="7">教研室主任</option>
                    </select>
                </div>
                <div class="layui-form-item" style="color: #33B5E5">
                    <button class="layui-btn layui-btn-fluid" lay-submit="" lay-filter="login" style="color: #FFF">登 录</button>
                </div>
            </form>
        </div>
    </div>
</div>

<script src="${ctx}/js/jquery-3.4.1/jquery-3.4.1.min.js" charset="utf-8"></script>
<script>
//这里主要是用于刷新验证码图片，
$('#validationCode').click(function () {
//加上时间戳就可以和原来的src地址有区别，如果他们两个地址没有区别，浏览器默认是同一个，并不会刷新验证码图片
$(this).attr('src',ctx+'/ValidateCode?time='+ new Date().getTime());
});
</script>
<script src="${ctx}/js/index.js" charset="utf-8"></script>
</body>
</html>