<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-论文列表</title>
    <#include "../../../common.ftl">
    <link rel="stylesheet" href="${ctx}/css/teaInfo.css" media="all">
</head>
<body>
<form class="layui-form" >
    <blockquote class="layui-elem-quote quoteBox">
        <form class="layui-form">
            <div class="layui-inline">
                <div class="layui-input-inline">
                    <input type="text" name="name"
                           class="layui-input
					searchVal" placeholder="请输入教师姓名" />
                </div>

                <div class="layui-input-inline">
                    <input type="text" name="paname"
                           class="layui-input
					searchVal" placeholder="请输入论文名称" />
                </div>
                <div class="layui-input-inline">
                    <select name="haudit" lay-verify="required">
                        <option value="" disabled>-- 请选择审核状态 --</option>
                        <option value="0">未审核</option>
                        <option value="1">已审核</option>
                    </select>
                </div>
                <a class="layui-btn search_btn" data-type="reload"><i
                            class="layui-icon">&#xe615;</i> 搜索</a>
            </div>
        </form>
    </blockquote>

    <table id="paperList" class="layui-table"  lay-filter="paperList"></table>

    <!--操作-->
    <script id="paperListBar" type="text/html">
        <a class="layui-btn layui-btn-xs" id="edit" lay-event="edit">审批</a>
        <a class="layui-btn layui-btn-xs layui-btn-danger" lay-event="del">删除</a>
        <a class="layui-btn layui-btn-xs layui-btn-normal" lay-event="paperDetail">
            查看详细信息
        </a>
    </script>

</form>
<script type="text/javascript" src="${ctx}/js/admin/audit/paper/paperList.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;
    });

</script>
</body>
</html>