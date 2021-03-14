layui.use(['form','jquery','jquery_cookie'], function () {
    var form = layui.form,
        layer = layui.layer,
        $ = layui.jquery,
        $ = layui.jquery_cookie($);

    /**
     * 表单submit提交
     * form.on("submit(login)",function(){
     *     return false;//阻止表单提交
     * })
     */
    form.on('submit(login)',function (data){
        var roleId=$("[name='roleId']").val();
        /*表单元素的非空校验*/

        /*发送ajax请求,传递用户姓名和密码，执行登录*/
        $.ajax({
           type: "get",
           url: ctx+"/user/login",
           data: {
               userName: data.field.username,
               userPwd: data.field.password,
               validateCode:data.field.validateCode,
               roleId: data.field.roleId
           },
            success: function(res){
               console.log(res);
               if (res.code==200){
                   //登录成功
                   /*设置用户是登录状态
                    1.利用session会话。如果会话存在，则用户为登录状态，否则是非登录状态
                    缺点：服务器关闭或者浏览器关闭会话会失效
                    2.利用cookie
                    保存用户信息，cookie为失效则用户为登录状态
                    */

                   layer.msg("登录成功",function(){
                       //将用户信息设置到cookie中
                       $.cookie("userIdStr", res.result.userIdStr, {expires: 7});
                       $.cookie("userName", res.result.userName, {expires: 7});
                       $.cookie("trueName", res.result.userTrueName, {expires: 7});
                       window.location.href=ctx+"/main?roleId="+roleId;
                   });
               }else{
                   //登录失败
                   layer.msg(res.msg,{icon:5});
               }
            }
        });

        //阻止表单跳转，如果需要表单跳转去掉这段即可
       return false;
    });
});