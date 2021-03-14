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
                        <#list colleges as key>
                            <option value="${key_index+1}">${key.collegeName!""}</option>
                        </#list>
                    </select>
                </div>
                <div class="layui-input-inline">
                    <select name="xibu" lay-verify="required">
                        <option value="" disabled>-- 请选择系部 --</option>
                        <#list depts as key>
                            <option value="${key_index+1}">${key.deptName!""}</option>
                        </#list>

                    </select>
                </div>
                <a class="layui-btn search_btn" data-type="reload"><i
                            class="layui-icon">&#xe615;</i> 搜索</a>
            </div>
        </form>
    </blockquote>-->


    <table id="teaList" class="layui-table"  lay-filter="courseList"></table>

    <!--操作-->
    <script id="teacherListBar" type="text/html">
        <a class="layui-btn layui-btn-xs" id="classHourDetail" lay-event="classHourDetail">查看学时详情</a>
    </script>


</form>
<script type="text/javascript" src="${ctx}/js/teacher/jiaoxue/classhour/classHourQuery.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });

</script>
</body>
</html>