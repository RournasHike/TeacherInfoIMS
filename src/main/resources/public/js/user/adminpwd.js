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
            url:ctx+"/user/adminUpdatePwd",
            data:{
                uid:data.field.uid,
                newPwd:data.field.new_password,
                repeatPwd:data.field.repeat_password
            },
            success:function(result){
                // 提交数据时的加载层 （https://layer.layui.com/）
                var index = top.layer.msg("数据提交中,请稍后...",{
                    icon:16, // 图标
                    time:false, // 不关闭
                    shade:0.8 // 设置遮罩的透明度
                });
               //判断是否修改成功
                if (result.code==200){
                    //修改面成功后，情况cookie数据，跳转到登录页面
                    layer.msg("用户修改密码成功",function (){
                        // 成功
                        // 提示成功
                        top.layer.msg("操作成功！",{icon:6});
                        // 关闭加载层
                        top.layer.close(index);
                        // 关闭弹出层
                        layer.closeAll("iframe");
                        // 刷新父窗口，重新加载数据
                        parent.location.reload();
                    });
                }else{
                    layer.msg(result.msg,{icon:5});
                }
            }
        });
    });
});