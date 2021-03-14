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
        <b>[获奖信息]</b>
        <hr style="color: #000"/>
    </div>
    <div class="layui-row layui-col-space10">
        <div class="layui-col-md9">
            <table style="border: 1px solid black" class="layui-table">
                <tr style="height: 35px">
                    <td class="leftcell"><label>荣誉编号:</label></td>
                    <td class="rightcell">${(honor.hno)!""}</td>
                    <td class="leftcell"><label>教师姓名:</label></td>
                    <td class="rightcell">${(honor.teacherName)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>荣誉名称:</label></td>
                    <td class="rightcell">${(honor.hname)!""}</td>
                    <td class="leftcell"><label>参与人:</label></td>
                    <td class="rightcell">${(honor.participants)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>获奖时间:</label></td>
                    <td class="rightcell">${(honor.hdate?date)!""}</td>
                    <td class="leftcell"><label>颁奖单位:</label></td>
                    <td class="rightcell">${(honor.hcompany)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>授予单位:</label></td>
                    <td class="rightcell">${(honor.hdepartment)!""}</td>
                    <td class="leftcell"><label>获奖级别:</label></td>
                    <td class="rightcell">${(honor.hgrade)!}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>获奖等级:</label></td>
                    <td class="rightcell">${(honor.hlevel)!""}</td>
                    <td class="leftcell"><label>获奖类别:</label></td>
                    <td class="rightcell">${(honor.htype)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>科研类别:</label></td>
                    <td class="rightcell">${(honor.kytype)!""}</td>
                    <td class="leftcell"><label>附件地址:</label></td>
                    <td class="rightcell"><a style="color: blue;text-decoration: underline;" href="${ctx}/${(honor.haccessoryUrl)!""}">点此下载</a></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <label>审核状态:</label>
                    </td>
                    <td colspan="2">
                        <#assign audit="${(honor.haudit)!''}"/>
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
</body>
</html>