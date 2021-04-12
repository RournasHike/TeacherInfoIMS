<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-论文信息</title>
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
    <script type="application/javascript">

        var weekJson={
            "周一":"1",
            "周二":"2",
            "周三":"3",
            "周四":"4",
            "周五":"5",
            "周六":"6",
            "周日":"7"
        };

        var classJson={
            "第一大节":"1",
            "第二大节":"2",
            "第三大节":"3",
            "第四大节":"4"
        };

        function querySchedule() {
            var x,y;
            for(var i=1;i<8;i++){
                for(var j=1;j<5;j++){
                    x="tr:eq("+j+")";
                    y="td:eq("+i+")";
                    $(x).find(y).text("");
                }
            }
            var rid=$("#rid").val();
            var classYear=$("#classYear").val();
            var classTerm=$("#classTerm").val();
            $.ajax({
                type: "GET",
                url: ctx + "/schedule/scheduleTeaQuery",
                data: {
                    classYear: classYear,
                    classTerm: classTerm,
                },
                dataType: "json",
                success: function (data) {
                    var content;
                    var indexX;
                    var indexY;
                    for (var k = 0; k < data.length; k++) {
                        content = data[k].courseName + "  "+ data[k].startWeek + "-" + (data[k].startWeek + data[k].classWeek) + "周  " + data[k].teacherName + "  " + data[k].teachRoomName;
                        for (var ck in classJson) {
                            for (var key in weekJson) {
                                if (data[k].classWorkDay == key && data[k].classNum == ck) {
                                    var wj = weekJson[key];
                                    var ks = classJson[ck];
                                    indexX = "tr:eq(" + ks + ")";
                                    indexY = "td:eq(" + wj + ")";
                                }
                            }

                        }
                        $(indexX).find(indexY).text(content);

                    }
                }
            });

        }
    </script>
</head>
<body>
<form class="layui-form" >
<div class="layui-container" >
    <div style="text-align: right;width: 100%;">
        <b>[课表信息]</b>
        <hr style="color: #000"/>
    </div>

    <blockquote class="layui-elem-quote quoteBox">
        <form class="layui-form">

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
            <div class="layui-inline">
                <a class="layui-btn search_btn" onclick="querySchedule()"><i class="layui-icon">&#xe615;</i> 搜索</a>
            </div>
        </form>
    </blockquote>

<#--    <script type="text/html" id="toolbarDemo">
        <div class="layui-btn-container">
            <a class="layui-btn layui-btn-normal addNews_btn" lay-event="add">
                <i class="layui-icon">&#xe608;</i>
                添加
            </a>
            <a class="layui-btn layui-btn-normal  " lay-event="teaDetail">
                <i class="layui-icon">&#xe608;</i>
                查看详细信息
            </a>

        </div>
    </script>

    <table id="schedule" class="layui-table"  lay-filter="schedule"></table>-->

    <div class="layui-row layui-col-space12">
        <div class="layui-col-md12">
            <table style="border: 1px solid black;text-align: center;" class="layui-table" lay-filter="schedule">
                <tr style="height: 100px;">
                    <td style="width: 200px"></td>
                    <td style="width: 200px">周一</td>
                    <td style="width: 200px">周二</td>
                    <td style="width: 200px">周三</td>
                    <td style="width: 200px">周四</td>
                    <td style="width: 200px">周五</td>
                    <td style="width: 200px">周六</td>
                    <td style="width: 200px">周日</td>
                </tr>
                <tr style="height: 100px;">
                    <td>第一大节</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr style="height: 100px;">
                    <td>第二大节</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr style="height: 100px;">
                    <td>第三大节</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr style="height: 100px;">
                    <td>第四大节</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
            </table>
        </div>
    </div>
</div>
</form>
<script type="text/javascript" src="${ctx}/js/admin/jiaoxue/schedule/scheduleQuery.js"></script>
</body>
</html>