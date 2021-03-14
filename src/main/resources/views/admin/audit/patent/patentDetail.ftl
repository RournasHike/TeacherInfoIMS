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
        <b>[专利信息]</b>
        <hr style="color: #000"/>
    </div>
    <div class="layui-row layui-col-space10">
        <div class="layui-col-md9">
            <table style="border: 1px solid black" class="layui-table">
                <tr style="height: 35px">
                    <td class="leftcell"><label>专利编号:</label></td>
                    <td class="rightcell">${(patent.patno)!""}</td>
                    <td class="leftcell"><label>专利名称:</label></td>
                    <td class="rightcell">${(patent.patname)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>发明人:</label></td>
                    <td class="rightcell">${(patent.teacherName)!""}</td>
                    <td class="leftcell"><label>参与人:</label></td>
                    <td class="rightcell">${(patent.participants)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>授权编号:</label></td>
                    <td class="rightcell">${(patent.patsn)!""}</td>
                    <td class="leftcell"><label>申请时间:</label></td>
                    <td class="rightcell">${(patent.patappdate?date)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>授权时间:</label></td>
                    <td class="rightcell">${(patent.patendate?date)!""}</td>
                    <td class="leftcell"><label>专利等级:</label></td>
                    <td class="rightcell">${(patent.patgrade)!}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>专利类型:</label></td>
                    <td class="rightcell">${(patent.pattype)!""}</td>
                    <td class="leftcell"><label>附件:</label></td>
                    <td class="rightcell"><a style="color: blue;text-decoration: underline;" href="${ctx}/${(patent.paccessory)!""}">点此下载</a></td>
                </tr>

                <tr>
                    <td colspan="2">
                        <label>审核状态:</label>
                    </td>
                    <td colspan="2">
                        <#assign audit="${(patent.paudit)!''}"/>
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
<script type="text/javascript" src="${ctx}/js/admin/paper/paperAudit.js"></script>
</body>
</html>