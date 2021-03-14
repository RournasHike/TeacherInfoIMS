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

<#--    <script type="text/html" id="toolbarDemo">
        <div class="layui-btn-container">
            <a class="layui-btn layui-btn-normal addNews_btn" lay-event="add">
                <i class="layui-icon">&#xe608;</i>
                添加课程
            </a>
            <a class="layui-btn layui-btn-normal  " lay-event="teachDetail">
                <i class="layui-icon">&#xe608;</i>
                查看详细信息
            </a>
        </div>
    </script>-->

    <table id="teachList" class="layui-table" lay-filter="teachList"></table>

    <!--操作-->
    <script id="teacherListBar" type="text/html">
        <a class="layui-btn layui-btn-xs" id="edit" lay-event="audit">审核</a>
    </script>


</form>
<script type="text/javascript" src="${ctx}/js/admin/jiaoxue/teach/teachList.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });

</script>
</body>
</html>