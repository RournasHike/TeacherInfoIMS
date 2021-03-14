<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-教师列表</title>
    <#include "../../../common.ftl">
    <link rel="stylesheet" href="${ctx}/css/teaInfo.css" media="all">
</head>
<body>
<form class="layui-form" >


    <table id="patentList" class="layui-table"  lay-filter="patentList"></table>

    <!--操作-->
    <script id="patentListBar" type="text/html">
        <a class="layui-btn layui-btn-xs" id="edit" lay-event="edit">编辑</a>
        <a class="layui-btn layui-btn-xs layui-btn-normal" lay-event="patentDetail">查看详细信息</a>
    </script>


</form>
<script type="text/javascript" src="${ctx}/js/teacher/keyan/patent/patentList.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });

</script>
</body>
</html>