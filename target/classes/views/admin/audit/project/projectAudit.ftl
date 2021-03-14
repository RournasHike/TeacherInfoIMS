<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-专利信息</title>
    <#include "../../../common.ftl">
    <link rel="stylesheet" href="${ctx}/css/teaInfo.css" media="all">
    <link rel="stylesheet" href="${ctx}/lib/layui-v2.5.5/css/layui.css" media="all">
    <script src="${ctx}/lib/layui-v2.5.5/layui.js"></script>
</head>
<body>
<div class="layui-container" >
    <div style="text-align: right;width: 100%;">
        <b>[项目信息]</b>
        <hr style="color: #000"/>
    </div>
    <div class="layui-row layui-col-space10">
        <div class="layui-col-md9">
            <div class="piddiv" style="display: none"><input type="hidden" id="pid" name="pid" value="${(project.pid)!""}"></div>
            <table cellpadding="2px" cellspacing="4px" style="text-align: center" border="1px solid black" class="layui-table">
                <tr style="height: 35px">
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
                    <td class="leftcell"><label>附件:</label></td>
                    <td class="rightcell"><a style="color: blue;text-decoration: underline;" href="${ctx}/${(project.paccessory)!""}">点此下载</a></td>
                </tr>
                <tr>
                    <td colspan="4">
                        <label>审核状态:</label>未审核
                    </td>
                </tr>
            </table>
        </div>

    </div>
    <form class="layui-form" style="width: 80%">

        <div class="layui-form-item">
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
                        lay-filter="addOrUpdateProject">确认
                </button>
                <button class="layui-btn layui-btn-lg layui-btn-normal" id="closeBtn">取消</button>
            </div>
        </div>
    </form>
</div>
<script type="text/javascript" src="${ctx}/js/admin/audit/project/projectAudit.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });

</script>
</body>
</html>