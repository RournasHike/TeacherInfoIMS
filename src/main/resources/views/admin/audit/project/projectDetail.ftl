<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-专利信息</title>
    <#include "../../../common.ftl">
    <link rel="stylesheet" href="${ctx}/css/teaInfo.css" media="all">
</head>
<body>
<div class="layui-container" >
    <div style="text-align: right;width: 100%;">
        <b>[项目信息]</b>
        <hr style="color: #000"/>
    </div>
    <div class="layui-row layui-col-space10">
        <div class="layui-col-md9">
            <table style="border: 1px solid black" class="layui-table">
                <tr style="height: 35px" >
                    <td class="leftcell"><label>项目编号:</label></td>
                    <td class="rightcell">${(project.pno)!""}</td>
                    <td class="leftcell"><label>项目名称:</label></td>
                    <td class="rightcell">${(project.pname)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>负责人:</label></td>
                    <td class="rightcell">${(project.teacherName)!""}</td>
                    <td class="leftcell"><label>参与人:</label></td>
                    <td class="rightcell">${(project.participants)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>项目级别:</label></td>
                    <td class="rightcell">${(project.pgrade)!""}</td>
                    <td class="leftcell"><label>项目类型:</label></td>
                    <td class="rightcell">${(project.pkind)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>项目经费:</label></td>
                    <td class="rightcell">${(project.pfunds)!""}</td>
                    <td class="leftcell"><label>立项时间:</label></td>
                    <td class="rightcell">${(project.pstatime?date)!}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>结项时间:</label></td>
                    <td class="rightcell">${(project.pendtime?date)!""}</td>
                    <td class="leftcell"><label>科研状态:</label></td>
                    <td class="rightcell">${(project.pcondition?string('已完成','未完成'))!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>项目来源:</label></td>
                    <td class="rightcell">${(project.psource)!""}</td>
                    <td class="leftcell"><label>科研类型:</label></td>
                    <td class="rightcell">${(project.kytype)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>项目成果形式:</label></td>
                    <td class="rightcell">${(project.result)!""}</td>
                    <td class="leftcell"><label>科研类型:</label></td>
                    <td class="rightcell"><a style="color: blue;text-decoration: underline;" href="${ctx}/${(project.paccessory)!""}">点此下载</a></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <label>审核状态:</label>
                    </td>
                    <td colspan="2">
                        <#assign audit="${(project.paudit)!''}"/>
                        <#if audit=="1">
                            <img src="${ctx}/images/audit/src=http___bpic.588ku.com_element_origin_min_pic_01_40_61_57573d09670eb48.jpg&refer=http___bpic.588ku.jpg"/>
                        <#elseif audit=="0">
                            <img src="${ctx}/images/audit/src=http___bpic.588ku.com_element_origin_min_pic_01_41_16_34573d2c5f5ad80.jpg&refer=http___bpic.588ku.jpg"/>
                        <#else >
                            <img src="${ctx}/images/audit/src=http___bpic.588ku.com_element_origin_min_pic_01_40_61_58573d0968da06a.jpg&refer=http___bpic.588ku.jpg"/>
                        </#if>
                    </td>
                </tr>
            </table>
        </div>

    </div>
</div>
<script type="text/javascript" src="${ctx}/js/admin/project/paperAudit.js"></script>
</body>
</html>