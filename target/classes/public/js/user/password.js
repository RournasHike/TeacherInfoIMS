/*加载layui模块*/
layui.use(['form','jquery','jquery_cookie'], function () {
    var form = layui.form,
        layer = layui.layer,
        $ = layui.jquery,
        $ = layui.jquery_cookie($);

    form.on('submit(saveBtn)',function(data){
        //表单所有元素的值
        console.log(data.field);
        //发送ajax请求
        $.ajax({
           type:"post",
            url:ctx+"/user/updatePwd",
            data:{
                oldPwd:data.field.old_password,
                newPwd:data.field.new_password,
                repeatPwd:data.field.repeat_password
            },
            success:function(result){
               //判断是否修改成功
                if (result.code==200){
                    //修改面成功后，情况cookie数据，跳转到登录页面
                    layer.msg("用户修改密码成功，系统将在3秒钟后退出...",function (){
                        //清空cookie
                        $.removeCookie("userIdStr",{domain:"localhost",path:"/crm"});
                        $.removeCookie("userName",{domain:"localhost",path:"/crm"});
                        $.removeCookie("trueName",{domain:"localhost",path:"/crm"});

                        //跳转到登录页面（父窗口跳转）
                        window.parent.location.href=ctx+"/index";
                    });
                }else{
                    layer.msg(result.msg,{icon:5});
                }
            }
        });
    });
});