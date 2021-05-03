<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-课程信息</title>
    <#include "../../../common.ftl">
    <link rel="stylesheet" href="${ctx}/css/teaInfo.css" media="all">
</head>
<body>
<div class="layui-container" >
    <div style="text-align: right;width: 100%;">
        <b>[课程信息]</b>
        <hr style="color: #000"/>
    </div>
    <div class="layui-row layui-col-space10">
        <div class="layui-col-md9">
            <table style="border: 1px solid black" class="layui-table">
                <tr style="height: 35px">
                    <td class="leftcell"><label>课程编号:</label></td>
                    <td class="rightcell">${(course.courseNo)!""}</td>
                    <td class="leftcell"><label>课程名称:</label></td>
                    <td class="rightcell">${(course.courseName)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>课程类型:</label></td>
                    <td class="rightcell">${(course.courseType)!""}</td>
                    <td class="leftcell"><label>周学时:</label></td>
                    <td class="rightcell">${(course.weekClassHour)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>教授学时:</label></td>
                    <td class="rightcell">${(course.teachClassHour)!""}</td>
                    <td class="leftcell"><label>上机学时:</label></td>
                    <td class="rightcell">${(course.computerClassHour)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>实验学时:</label></td>
                    <td class="rightcell">${(course.experimentClassHour)!""}</td>
                    <td class="leftcell"><label>其他学时:</label></td>
                    <td class="rightcell">${(course.otherClassHour)!}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>总学时:</label></td>
                    <td class="rightcell">${(course.sumupClassHour)!""}</td>
                    <td class="leftcell"><label>学分:</label></td>
                    <td class="rightcell">${(course.credit)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>开设状态:</label></td>
                    <td class="rightcell">${(course.state?string('已开设','未开设'))!""}</td>
                    <td class="leftcell"><label></label></td>
                    <td class="rightcell"></td>
                </tr>
            </table>
        </div>
    </div>
</div>
</body>
</html>