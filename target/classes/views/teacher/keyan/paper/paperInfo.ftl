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
        <b>[论文信息]</b>
        <hr style="color: #000"/>
    </div>
    <div class="layui-row layui-col-space10">
        <div class="layui-col-md9">
            <table style="border: 1px solid black" class="layui-table">
                <tr style="height: 35px">
                    <td class="leftcell"><label>论文编号:</label></td>
                    <td class="rightcell">${(tPaper.pano)!""}</td>
                    <td class="leftcell"><label>论文名称:</label></td>
                    <td class="rightcell">${(tPaper.paname)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>发表人:</label></td>
                    <td class="rightcell">${(tPaper.teacherName)!""}</td>
                    <td class="leftcell"><label>论文等级:</label></td>
                    <td class="rightcell">${(tPaper.pagrade)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>发表期刊:</label></td>
                    <td class="rightcell">${(tPaper.papublish)!""}</td>
                    <td class="leftcell"><label>发表时间:</label></td>
                    <td class="rightcell">${(tPaper.padate?date)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>论文类型:</label></td>
                    <td class="rightcell">${(tPaper.pakind)!""}</td>
                    <td class="leftcell"><label>论文字数:</label></td>
                    <td class="rightcell">${(tPaper.letternum)!}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>发表年份:</label></td>
                    <td class="rightcell">${(tPaper.pubYear)!""}</td>
                    <td class="leftcell"><label>发表期数:</label></td>
                    <td class="rightcell">${(tPaper.pubStage)!""}</td>
                </tr>


                <tr>
                    <td class="leftcell"><label>发表卷数:</label></td>
                    <td class="rightcell">${(tPaper.pubVolume)!""}</td>
                    <td class="leftcell"><label>依赖项目:</label></td>
                    <td class="rightcell"><a href="">${(tPaper.dependency)!""}</a></td>
                </tr>

                <tr>
                    <td class="leftcell"><label>论文研究范畴:</label></td>
                    <td class="rightcell">${(tPaper.subject)!""}</td>
                    <td class="leftcell"><label>主要研究内容:</label></td>
                    <td class="rightcell">${(tPaper.content)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell" colspan="2"><label>附件:</label></td>
                    <td class="rightcell" colspan="2">
                        <a style="color: blue;text-decoration: underline;" href="${ctx}/${(tPaper.paccesssory)!""}">点此下载</a>
                    </td>

                </tr>
                <tr>
                    <td colspan="2">
                        <label>审核状态:</label>
                    </td>
                    <td colspan="2">

                        <#if tPaper.paudit??>
                            <#assign audit="${tPaper.paudit?string('1','0')}"/>
                        <#else >
                            <#assign audit="${(tPaper.paudit)!''}"/>
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