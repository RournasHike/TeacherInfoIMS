<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-教师列表</title>
    <#include "../../../common.ftl">
    <link rel="stylesheet" href="${ctx}/lib/layui-v2.5.5/css/layui.css" media="all">
    <script src="${ctx}/lib/layui-v2.5.5/layui.js"></script>
</head>
<body>
<form class="layui-form" style="width:80%;">
    <div class="piddiv" style="display: none"><input type="hidden" id="id" value="${(search.id)!""}"></div>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">课题名称：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="researchTitle" id="researchTitle"  value="${(search.researchTitle)!}" placeholder="请输入课题名称">
        </div>
    </div>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">负责人：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="teacherName" id="teacherName" value="${(search.teacherName)!}" placeholder="请输入负责人">
        </div>
    </div>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">研究类别：</label>

        <div class="layui-input-block">
            <input type="text" class="layui-input userEmail"
                   lay-verify="required" name="retype" value="${(search.retype)!}" id="retype" placeholder="请输入研究类别">

        </div>
    </div>



    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">主要研究内容:</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userEmail"
                   lay-verify="required" name="scontent" value="${(search.scontent)!}" id="scontent" placeholder="请输入主要研究内容">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">开题时间:</label>
        <div class="layui-input-block">
            <input type="date" class="layui-input userEmail"
                   lay-verify="required" name="starttime" value="${(search.starttime?date)!""}" id="starttime">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">结束时间：</label>
        <div class="layui-input-block">
            <input type="date" class="layui-input userEmail"
                   lay-verify="required" name="endtime" value="${(search.endtime?date)!""}" id="endtime">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">课题状态：</label>
        <div class="layui-input-block">
            <input name="restate" type="radio" id="restate" value="1"/>已完成
            <input name="restate" type="radio" id="restate" value="0">未完成

        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">附件：</label>
        <div class="layui-input-block">
            <input type="hidden" class="layui-input userEmail"
                   name="paccessory" value="${(search.paccessory)!}" id="paccessory">
            <button type="button" class="layui-btn" id="addFile">
                <i class="layui-icon">&#xe67c;</i>添加文件
            </button>
            <button type="button" class="layui-btn" id="upload">上传</button>
            <div class="layui-progress layui-progress-big" lay-showpercent="true" lay-filter="uploadProgressBar">
                <div class="layui-progress-bar" lay-percent="0%"></div>
            </div>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">备注：</label>
        <div class="layui-input-block">
            <textarea name="remark" id="remark" rows="10" cols="30" maxlength="200" value="${(search.remark)!}"></textarea>

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
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });

</script>

<script type="text/javascript" src="${ctx}/js/teacher/keyan/search/searchAddOrUpdate.js"></script>

</body>
</html>