<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-荣誉列表</title>
    <#include "../../../common.ftl">
    <link rel="stylesheet" href="${ctx}/css/teaInfo.css" media="all">
</head>
<body>
<form class="layui-form" >

    <div style="text-align: right;width: 100%;">
        <b>[我的荣誉列表]</b>
        <hr style="color: #000"/>
    </div>
    <table id="honorList" class="layui-table"  lay-filter="honorList"></table>

    <!--操作-->
    <script id="honorListBar" type="text/html">
        <a class="layui-btn layui-btn-xs" id="edit" lay-event="edit">编辑</a>
        <a class="layui-btn layui-btn-xs layui-btn-normal" lay-event="honorDetail">
            查看详细信息
        </a>
    </script>

</form>
<script type="text/javascript" src="${ctx}/js/teacher/keyan/honor/honorList.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;
    });

</script>
</body>
</html>