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

    <div class="piddiv" style="display: none"><input type="hidden" id="patid" value="${(patent.patid)!""}"></div>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">专利编号：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="patno" id="patno"  value="${(patent.patno)!}" placeholder="请输入专利编号">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">专利名称：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="patname" id="patname"  value="${(patent.patname)!}" placeholder="请输入专利名称">
        </div>
    </div>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">发明人：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="teacherName" id="teacherName" value="${(patent.teacherName)!}" placeholder="请输入发明人">
        </div>
    </div>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">参与人：</label>

        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="participants" id="participants" value="${(patent.participants)!}" placeholder="请输入参与人">

        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">授权编号:</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userEmail"
                   lay-verify="required" name="patsn" value="${(patent.patsn)!}" id="patsn" placeholder="请输入授权编号">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">申请时间:</label>
        <div class="layui-input-block">
            <input type="date" class="layui-input userName"
                   lay-verify="required" name="patappdate" id="patappdate" value="${(patent.patappdate?date)!}" />
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">授权时间：</label>
        <div class="layui-input-block">
            <input type="date" class="layui-input userEmail"
                   lay-verify="required" name="patendate" value="${(patent.patendate?date)!""}" id="patendate" />
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">专利等级：</label>
        <div class="layui-input-block">
            <select name="patgrade">
                <option value="市级">--请选择专利等级--</option>
                <option value="市级">市级</option>
                <option value="省级">省级</option>
                <option value="国家级">国家级</option>
                <option value="世界级">世界级</option>
            </select>

        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">专利类型：</label>
        <div class="layui-input-block">
            <select name="pattype">
                <option value="发明专利">发明专利</option>
                <option value="实用型专利">实用型专利</option>
                <option value="外观专利">外观专利</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">专利附件：</label>
        <div class="layui-input-block">
            <input type="hidden" class="layui-input userEmail"
                   name="paccessory" value="${(patent.paccessory)!}" id="paccessory">
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
        <div class="layui-input-block">
            <button class="layui-btn layui-btn-lg" lay-submit=""
                    lay-filter="addOrUpdatePatent">确认
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

<script type="text/javascript" src="${ctx}/js/teacher/keyan/patent/patentAddOrUpdate.js"></script>


</body>
</html>