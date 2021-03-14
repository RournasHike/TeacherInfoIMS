layui.use(['element', 'layer', 'layuimini','jquery','jquery_cookie'], function () {
    var $ = layui.jquery,
        layer = layui.layer,
        $ = layui.jquery_cookie($);

    // 菜单初始化
    $('#layuiminiHomeTabIframe').html('<iframe width="100%" height="100%" frameborder="0"  src="welcome"></iframe>')
    layuimini.initTab();

    $('.login-out').click(function (){

        layer.confirm("您确定要退出吗？",{icon: 3, title:'系统提示'}, function(index){

            // 关闭询问框
            layer.close(index);

            $.ajax({
                type: "get",
                url: ctx + "/user/logout",
                success: function (res) {
                    console.log(res);
                    layer.msg("退出成功",function(){
                        //清除用户的cookie信息
                        $.removeCookie("userIdStr",{domain:"localhost",path:"/teainfoims"});
                        $.removeCookie("userName",{domain:"localhost",path:"/teainfoims"});
                        $.removeCookie("trueName",{domain:"localhost",path:"/teainfoims"});
                        // 跳转到登录页面（父窗口跳转）
                        window.parent.location.href = ctx + "/index";
                    });

                }
            });

        });


    });

});