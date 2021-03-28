<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-课程列表</title>
    <#include "../../../common.ftl">
    <link rel="stylesheet" href="${ctx}/css/teaInfo.css" media="all">
    <script type="application/javascript" src="${ctx}/js/jquery-3.4.1/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function() {
            //初始化年份
            var now = new Date();
            var nowYear = now.getFullYear();
            var option;
            for (var i = nowYear - 20; i <= nowYear + 10; i++) {
                option = $("<option/>").val(i+"-"+(i+1)+"学年").text(i+"-"+(i+1)+"学年");
                $('#classYear').append(option);
            }
        });
    </script>

    <script>
        function queryTeacherClassHour() {
            $("#classHourTableBody").val("");
            var teacherName = $("input[name='teacherName']").val();
            var classYear = $("#classYear").val();
            var classTerm = $("#classTerm").val();
            var trs;
            $.ajax({
                type: "GET",
                url: ctx + "/classHour/queryTeacherClassHour",
                dataType: "json",
                data:{
                    teacherName: teacherName,
                    classYear: classYear,
                    classTerm: classTerm
                },
                success: function (data) {
                    var tdfoot,ts;
                    var classHourSumup=0;
                    for (var k = 0; k < data.length; k++) {
                        var tr,tds;
                        tds="<td>"+data[k].courseNo+"</td>";
                        tds+="<td>"+data[k].courseName+"</td>";
                        tds+="<td>"+data[k].teachClassHour+"</td>";
                        tds+="<td>"+data[k].experimentClassHour+"</td>";
                        tds+="<td>"+data[k].computerClassHour+"</td>";
                        tds+="<td>"+data[k].otherClassHour+"</td>";
                        tds+="<td>"+data[k].credit+"</td>";
                        tds+="<td>"+data[k].weekClassHour+"</td>";
                        tds+="<td>"+data[k].prescribedClassHour+"</td>";
                        tds+="<td>"+data[k].actualClassHour+"</td>";
                        tr="<tr>"+tds+"</tr>";
                        trs=trs+tr;
                        $("#classHourTableBody").append(trs);
                        classHourSumup+=data[k].actualClassHour;
                    }
                    tdfoot+="<td colspan='2'>"+"总学时"+"</td>";
                    tdfoot+="<td colspan='8'>"+classHourSumup+"</td>";
                    ts="<tr>"+tdfoot+"</tr>";
                    $("#classHourTableBody").append(ts);
                }
            });

        }
    </script>
</head>
<body>
<form class="layui-form" >
    <blockquote class="layui-elem-quote quoteBox">
        <form class="layui-form">
            <div class="layui-inline">
                <div class="layui-input-inline">
                    <input type="text" name="teacherName"
                           class="layui-input
					searchVal" placeholder="教师姓名" />
                </div>
                <div class="layui-input-inline">
                    <select name="classYear" lay-verify="required" id="classYear">
                        <option value="" selected="selected">-- 请选择学年 --</option>
                    </select>
                </div>
                <div class="layui-input-inline">
                    <select name="classTerm" lay-verify="required" id="classTerm">
                        <option value="" selected="selected">-- 请选择学期 --</option>
                        <option value="第一学期">第一学期</option>
                        <option value="第二学期">第二学期</option>
                    </select>
                </div>
                <a class="layui-btn search_btn" data-type="reload" onclick="queryTeacherClassHour()"><i class="layui-icon">&#xe615;</i> 搜索</a>
            </div>
        </form>
    </blockquote>

    <#--<table style="border: 1px solid black" class="layui-table" id="classHourTable">
        <tr style="height: 35px">
            <th class=""><label>课程编号</label></th>
            <th class=""><label>课程名称</label></th>
            <th class=""><label>讲授学时</label></th>
            <th class=""><label>实验学时</label></th>
            <th class=""><label>上机学时</label></th>
            <th class=""><label>其他学时</label></th>
            <th class=""><label>学分</label></th>
            <th class=""><label>周学时</label></th>
            <th class=""><label>理论学时</label></th>
            <th class=""><label>实际学时</label></th>
        </tr>
        <tbody id="classHourTableBody">

        </tbody>


    </table>-->

    <table id="classHourList" class="layui-table" lay-filter="classHourList"></table>

</form>
<script type="text/javascript" src="${ctx}/js/admin/jiaoxue/classhour/classHourSumup.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });

</script>
</body>
</html>