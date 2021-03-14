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
    <#--<blockquote class="layui-elem-quote quoteBox">
        <form class="layui-form">
            <div class="layui-inline">
                <div class="layui-input-inline">
                    <input type="text" name="name"
                           class="layui-input
					searchVal" placeholder="教师姓名" />
                </div>
                <div class="layui-input-inline">
                    <select name="college" lay-verify="required">
                        <option value="" disabled>-- 请选择学院 --</option>
                    </select>
                </div>
                <div class="layui-input-inline">
                    <select name="xibu" lay-verify="required">
                        <option value="" disabled>-- 请选择系部 --</option>

                    </select>
                </div>
                <a class="layui-btn search_btn" data-type="reload"><i
                            class="layui-icon">&#xe615;</i> 搜索</a>
            </div>
        </form>
    </blockquote>-->

    <script type="text/html" id="toolbarDemo">
        <div class="layui-btn-container">
            <a class="layui-btn layui-btn-normal addNews_btn" lay-event="add">
                <i class="layui-icon">&#xe608;</i>
                添加课程
            </a>
            <a class="layui-btn layui-btn-normal  " lay-event="courseDetail">
                <i class="layui-icon">&#xe608;</i>
                查看课程详细信息
            </a>

        </div>
    </script>

    <table id="courseList" class="layui-table"  lay-filter="courseList"></table>

    <!--操作-->
    <script id="courseListBar" type="text/html">
        <a class="layui-btn layui-btn-xs" id="edit" lay-event="edit">编辑</a>
        <a class="layui-btn layui-btn-xs layui-btn-danger" lay-event="del">删除</a>
    </script>


</form>
<script type="text/javascript" src="${ctx}/js/admin/jiaoxue/course/courseList.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });

</script>
</body>
</html>