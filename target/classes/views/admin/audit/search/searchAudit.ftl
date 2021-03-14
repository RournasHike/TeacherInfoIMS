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
            <div class="piddiv" style="display: none"><input type="hidden" id="id" name="id" value="${(search.id)!""}"></div>
            <table cellpadding="2px" cellspacing="4px" style="text-align: center" border="1px solid black" class="layui-table">
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
                    <td class="rightcell">
                        <a style="color: blue;text-decoration: underline;" href="${ctx}/${(search.paccessory)!""}">点此下载</a>
                    </td>
                </tr>
                <tr>
                    <td colspan="4">
                        <label>审核状态:</label>未审核
                    </td>
                </tr>
            </table>
        </div>
        <form class="layui-form" style="width:80%;">
            <div class="layui-form-item layui-row layui-col-xs12">
                <label class="layui-form-label">是否通过：</label>
                <div class="layui-input-block">
                    <input type="radio" name="ispass" value="1" title="通过"/>
                    <input type="radio" name="ispass" value="0" title="不通过"/>
                </div>
            </div>
            <div class="layui-form-item layui-row layui-col-xs12">
                <label class="layui-form-label">审核意见：</label>
                <div class="layui-input-block">
                    <textarea name="message" rows="10" cols="30" class="layui-input userName" maxlength="200" lay-verify="required" name="teacherName" id="teacherName" placeholder="请输入审核意见"></textarea>
                </div>
            </div>
            <div class="layui-form-item layui-row layui-col-xs12">
                <div class="layui-input-block">
                    <button class="layui-btn layui-btn-lg" lay-submit=""
                            lay-filter="addOrUpdateResearch">确认
                    </button>
                    <button class="layui-btn layui-btn-lg layui-btn-normal" id="closeBtn">取消</button>
                </div>
            </div>
        </form>
    </div>
</div>
<script type="text/javascript" src="${ctx}/js/admin/audit/search/searchAudit.js"></script>
</body>
</html>