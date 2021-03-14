<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-教学研究信息</title>
    <#include "../../../common.ftl">
    <link rel="stylesheet" href="${ctx}/css/teaInfo.css" media="all">
</head>
<body>
<div class="layui-container" >
    <div style="text-align: right;width: 100%;">
        <b>[教学研究信息]</b>
        <hr style="color: #000"/>
    </div>
    <div class="layui-row layui-col-space10">
        <div class="layui-col-md9">
            <table style="border: 1px solid black" class="layui-table">
                <tr style="height: 35px">
                    <td class="leftcell"><label>研究课题名称:</label></td>
                    <td class="rightcell">${(search.researchTitle)!""}</td>
                    <td class="leftcell"><label>负责人:</label></td>
                    <td class="rightcell">${(search.teacherName)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>研究类别:</label></td>
                    <td class="rightcell">${(search.retype)!""}</td>
                    <td class="leftcell"><label>主要研究内容:</label></td>
                    <td class="rightcell">${(search.scontent)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>开题时间:</label></td>
                    <td class="rightcell">${(search.starttime?date)!""}</td>
                    <td class="leftcell"><label>结束时间:</label></td>
                    <td class="rightcell">${(search.endtime?date)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>课题状态:</label></td>
                    <td class="rightcell">${(search.restate?string('已完成','未完成'))!""}</td>
                    <td class="leftcell"><label>附件:</label></td>
                    <td class="rightcell"><a style="color: blue;text-decoration: underline;" href="${ctx}/${(search.paccessory)!""}">点此下载</a></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <label>审核状态:</label>${(search.paudit)!""}
                    </td>
                    <td colspan="2">
                        <#assign audit="${(search.paudit)!''}"/>
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
<script type="text/javascript" src="${ctx}/js/admin/search/searchAudit.js"></script>
</body>
</html>