<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-论文信息</title>
    <#include "../../../common.ftl">
    <link rel="stylesheet" href="${ctx}/css/teaInfo.css" media="all">
</head>
<body>
<div class="layui-container" >
    <div style="text-align: right;width: 100%;">
        <b>[课时详情信息]</b>
        <hr style="color: #000"/>
    </div>
    <div class="layui-row layui-col-space10">
        <div class="layui-col-md9">
            <table style="border: 1px solid black" class="layui-table">
                <tr style="height: 35px">
                    <td class="leftcell"><label>课程编号:</label></td>
                    <td class="rightcell">${(classHour.courseNo)!""}</td>
                    <td class="leftcell"><label>课程名称:</label></td>
                    <td class="rightcell">${(classHour.courseName)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>讲授学时:</label></td>
                    <td class="rightcell">${(classHour.teachClassHour)!""}</td>
                    <td class="leftcell"><label>实验学时:</label></td>
                    <td class="rightcell">${(classHour.experimentClassHour)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>上机学时:</label></td>
                    <td class="rightcell">${(classHour.computerClassHour)!""}</td>
                    <td class="leftcell"><label>其他学时:</label></td>
                    <td class="rightcell">${(classHour.otherClassHour)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>学分:</label></td>
                    <td class="rightcell">${(classHour.credit)!""}</td>
                    <td class="leftcell"><label>周学时:</label></td>
                    <td class="rightcell">${(classHour.weekClassHour)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>实际讲授学时:</label></td>
                    <td class="rightcell">${(classHour.actualTeachClassHour)!""}</td>
                    <td class="leftcell"><label>实际实验学时:</label></td>
                    <td class="rightcell">${(classHour.actualExperimentClassHour)!}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>实际上机学时:</label></td>
                    <td class="rightcell">${(classHour.actualComputerClassHour)!""}</td>
                    <td class="leftcell"><label>实际其他学时:</label></td>
                    <td class="rightcell">${(classHour.actualOtherClassHour)!}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>理论学时:</label></td>
                    <td class="rightcell">${(classHour.prescribedClassHour)!""}</td>
                    <td class="leftcell"><label>实际学时:</label></td>
                    <td class="rightcell">${(classHour.actualClassHour)!""}</td>
                </tr>

            </table>
        </div>
    </div>
</div>
</body>
</html>