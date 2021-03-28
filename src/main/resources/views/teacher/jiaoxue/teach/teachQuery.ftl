<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-课程列表</title>
    <#include "../../../common.ftl">
    <link rel="stylesheet" href="${ctx}/css/teaInfo.css" media="all">
    <script src="${ctx}/js/jquery-3.4.1/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        //初始化年
        $(function () {
            //初始化年份
            var now = new Date();
            var nowYear = now.getFullYear();
            var option;
            for (var i = nowYear - 20; i <= nowYear + 10; i++) {
                option = $("<option/>").val(i+"-"+(i+1)+"学年").text(i+"-"+(i+1)+"学年");
                $('#classYear').append(option);
            }
        })

    </script>
</head>
<body>
<form class="layui-form" >
    <blockquote class="layui-elem-quote quoteBox">
        <form class="layui-form">
            <div class="layui-inline">
                <div class="layui-input-inline">
                    <select name="classYear" lay-verify="required" id="classYear">
                        <option value="" selected="selected">-- 请选择学年 --</option>
                    </select>
                </div>
                <div class="layui-input-inline">
                    <select name="classTerm" lay-verify="required">
                        <option value="" selected="selected">-- 请选择学期 --</option>
                        <option value="第一学期">第一学期</option>
                        <option value="第二学期">第二学期</option>
                    </select>
                </div>
                <a class="layui-btn search_btn" data-type="reload"><i
                            class="layui-icon">&#xe615;</i> 搜索</a>
            </div>
        </form>
    </blockquote>

    <table id="teachList" class="layui-table"  lay-filter="teachList"></table>

    <!--操作-->
<#--    <script id="teachListBar" type="text/html">
        <a class="layui-btn layui-btn-xs" id="edit" lay-event="detail">查看详情</a>
    </script>-->


</form>
<script type="text/javascript" src="${ctx}/js/teacher/jiaoxue/teach/teachQuery.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });

</script>
</body>
</html>