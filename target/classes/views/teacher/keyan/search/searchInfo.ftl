<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-荣誉信息</title>
    <#include "../../../common.ftl">
    <link rel="stylesheet" href="${ctx}/css/teaInfo.css" media="all">
</head>
<body>
<div class="layui-container" >
    <div style="text-align: right;width: 100%;">
        <b>[课题研究信息]</b>
        <hr style="color: #000"/>
    </div>
    <div class="layui-row layui-col-space10">
        <div class="layui-col-md9">
            <table style="border: 1px solid black" class="layui-table">
                <tr style="height: 35px">
                    <td class="leftcell"><label>课题名称:</label></td>
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
                    <td class="leftcell" colspan="2"><label>附件:</label></td>
                    <td class="rightcell" colspan="2"><a href="">${(search.paccessory)!""}</a></td>
                </tr>

                <tr>
                    <td colspan="2">
                        <label>审核状态:</label>
                    </td>
                    <td colspan="2">
                        <#if search.paudit??>
                            <#assign audit="${search.paudit?string('1','0')}"/>
                        <#else >
                            <#assign audit="${(search.paudit)!''}"/>
                        </#if>

                        <#if audit=="1">
                            <img src="${ctx}/images/audit/src=http___bpic.588ku.com_element_origin_min_pic_01_41_16_34573d2c5f5ad80.jpg&refer=http___bpic.588ku.jpg"/>
                        <#elseif audit=="0">
                            <img src="${ctx}/images/audit/src=http___bpic.588ku.com_element_origin_min_pic_01_40_61_57573d09670eb48.jpg&refer=http___bpic.588ku.jpg"/>
                        <#elseif audit=='' >
                            <img src="${ctx}/images/audit/src=http___bpic.588ku.com_element_origin_min_pic_01_35_07_72573bd0edb32fc.jpg&refer=http___bpic.588ku.jpg"/>
                        </#if>
                    </td>
                </tr>
            </table>
        </div>
    </div>
</div>
</body>
</html>