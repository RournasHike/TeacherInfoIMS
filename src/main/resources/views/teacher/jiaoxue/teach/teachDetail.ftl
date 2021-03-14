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
        <b>[授课详细信息]</b>
        <hr style="color: #000"/>
    </div>
    <div class="layui-row layui-col-space10">
        <div class="layui-col-md9">
            <table style="border: 1px solid black" class="layui-table">
                <tr style="height: 35px">
                    <td class="leftcell"><label>教师姓名:</label></td>
                    <td class="rightcell">${(paper.pano)!""}</td>
                    <td class="leftcell"><label>课程名称:</label></td>
                    <td class="rightcell">${(paper.paname)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>授课方式:</label></td>
                    <td class="rightcell">${(paper.teacherName)!""}</td>
                    <td class="leftcell"><label>授课学年:</label></td>
                    <td class="rightcell">${(paper.pagrade)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>授课学期:</label></td>
                    <td class="rightcell">${(paper.papublish)!""}</td>
                    <td class="leftcell"><label>授课年级:</label></td>
                    <td class="rightcell">${(paper.padate)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>授课专业:</label></td>
                    <td class="rightcell">${(paper.pakind)!""}</td>
                    <td class="leftcell"><label>规定学时:</label></td>
                    <td class="rightcell">${(paper.letternum)!}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>实际学时:</label></td>
                    <td class="rightcell">${(paper.subject)!""}</td>
                    <td class="leftcell"><label>实际讲授学时:</label></td>
                    <td class="rightcell">${(paper.content)!}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>实际实验学时:</label></td>
                    <td class="rightcell">${(paper.pubYear)!""}</td>
                    <td class="leftcell"><label>实际上机学时:</label></td>
                    <td class="rightcell">${(paper.pubVolume)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>实际其他学时:</label></td>
                    <td class="rightcell">${(paper.pubStage)!""}</td>
                    <td class="leftcell"><label>实际总学时:</label></td>
                    <td class="rightcell">${(paper.dependency)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell" colspan="2"><label>开课教室:</label></td>
                    <td class="rightcell" colspan="2">${(paper.pubStage)!""}</td>
                </tr>

            </table>
        </div>
    </div>
</div>
<script type="text/javascript" src="${ctx}/js/admin/paper/paperAudit.js"></script>
</body>
</html>