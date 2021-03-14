<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-课程列表</title>
    <#include "../../../common.ftl">
    <link rel="stylesheet" href="${ctx}/css/teaInfo.css" media="all">
    <script type="text/javascript">
        //初始化年
        var now = new Date();
        var nowYear = now.getFullYear();
        for (var i = nowYear-20; i <= nowYear + 10; i++) {
            var option = $("<option/>").val(i).text(i);
            $('#teachClassYear').append(option);
        }
    </script>
</head>
<body>
<form class="layui-form" >
    <blockquote class="layui-elem-quote quoteBox">
        <form class="layui-form">
            <div class="layui-inline">

                <div class="layui-input-inline">
                    <select name="classYear" lay-verify="required">
                        <option value="" disabled>-- 请选择学年 --</option>
                        <option value=""></option>
                    </select>
                </div>
                <div class="layui-input-inline">
                    <select name="classTerm" lay-verify="required">
                        <option value="" disabled>-- 请选择学期 --</option>
                        <option value="第一学期">第一学期</option>
                        <option value="第二学期">第二学期</option>
                    </select>
                </div>
                <a class="layui-btn search_btn" data-type="reload"><i
                            class="layui-icon">&#xe615;</i> 搜索</a>
            </div>
        </form>
    </blockquote>

    <table id="teaList" class="layui-table"  lay-filter="courseList"></table>

    <!--操作-->
    <script id="teacherListBar" type="text/html">
        <a class="layui-btn layui-btn-xs" id="edit" lay-event="detail">查看详情</a>
    </script>


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