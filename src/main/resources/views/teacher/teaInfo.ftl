<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-教师信息</title>
    <#include "../common.ftl">
    <link rel="stylesheet" href="${ctx}/css/teaInfo.css" media="all">
</head>
<body>
<div class="layui-container" >
    <div style="text-align: right;width: 100%;">
        <b>[个人信息]</b>
        <hr style="color: #000"/>
    </div>
    <div class="layui-row layui-col-space10">
        <div class="layui-col-md9">
            <table class="layui-table">
                <tr style="height: 35px">
                    <td class="leftcell"><label>教师职工编号:</label></td>
                    <td class="rightcell">${(tea.teacherNo)!""}</td>
                    <td class="leftcell"><label>姓名:</label></td>
                    <td class="rightcell">${(tea.teacherName)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>英文姓名:</label></td>
                    <td class="rightcell">${(tea.teacherEngname)!""}</td>
                    <td class="leftcell"><label>性别:</label></td>
                    <td class="rightcell">${(tea.sex)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>所学专业:</label></td>
                    <td class="rightcell">${(tea.major)!""}</td>
                    <td class="leftcell"><label>最高学历:</label></td>
                    <td class="rightcell">${(tea.degree)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>教育背景:</label></td>
                    <td class="rightcell">${(tea.school)!""}</td>
                    <td class="leftcell"><label>出生日期:</label></td>
                    <td class="rightcell">${(tea.birth?date)!}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>研究方向:</label></td>
                    <td class="rightcell">${(tea.researchDirection)!""}</td>
                    <td class="leftcell"><label>身份证号:</label></td>
                    <td class="rightcell">${(tea.idNum)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>家庭住址:</label></td>
                    <td class="rightcell">${(tea.familyAddress)!""}</td>
                    <td class="leftcell"><label>政治面貌:</label></td>
                    <td class="rightcell">${(tea.politicsStatus)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>电话号码:</label></td>
                    <td class="rightcell">${(tea.phone)!""}</td>
                    <td class="leftcell"><label>邮箱:</label></td>
                    <td class="rightcell">${(tea.email)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>所在学院:</label></td>
                    <td class="rightcell">${(tea.tCollege.collegeName)!""}</td>
                    <td class="leftcell"><label>所在部门:</label></td>
                    <td class="rightcell">${(tea.tDept.deptName)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>是否在职:</label></td>
                    <td class="rightcell">${(tea.validState?string('在职','离职'))!}</td>
                    <td class="leftcell"><label>职称</label></td>
                    <td class="rightcell">${(tea.occupation)!}</td>
                </tr>
            </table>
        </div>
        <div class="layui-col-md3" style="text-align: center;vertical-align: center">
            <img src="${ctx}/${(tea.photoUrl)!}" alt="个人证件照" style="width: 150px; height: 220px;"/>
        </div>
    </div>
</div>
</body>
</html>