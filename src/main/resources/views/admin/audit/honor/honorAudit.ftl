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
            <div class="piddiv" style="display: none"><input type="hidden" id="hid" name="hid" value="${(honor.hid)!""}"></div>
            <table cellpadding="2px" cellspacing="4px" style="text-align: center" border="1px solid black" class="layui-table">
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
                    <td class="rightcell">
                        <a style="color: blue;text-decoration: underline;" href="${ctx}/${(honor.haccessoryUrl)!""}">点此下载</a>
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
                    <button class="layui-btn layui-btn-lg" lay-submit="" lay-filter="addOrUpdateHonor">确认</button>
                    <button class="layui-btn layui-btn-lg layui-btn-normal" id="closeBtn">取消</button>
                </div>
            </div>
        </form>
    </div>
</div>
<script type="text/javascript" src="${ctx}/js/admin/audit/honor/honorAudit.js"></script>
</body>
</html>