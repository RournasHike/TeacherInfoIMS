<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-课程列表</title>
    <#include "../../../common.ftl">
    <link rel="stylesheet" href="${ctx}/css/teaInfo.css" media="all">
</head>
<body>
<form class="layui-form" >


    <table id="classHourList" class="layui-table" lay-filter="classHourList"></table>

    <!--操作-->
    <script id="teacherListBar" type="text/html">
        <a class="layui-btn layui-btn-xs" id="audit" lay-event="audit">审核</a>
        <a class="layui-btn layui-btn-normal" id="classHourDetail" lay-event="classHourDetail">查看详细信息</a>
    </script>


</form>
<script type="text/javascript" src="${ctx}/js/admin/jiaoxue/classhour/classHourList.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;
    });
</script>
</body>
</html>