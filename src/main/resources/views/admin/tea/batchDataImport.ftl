<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-教师列表</title>
    <#include "../../common.ftl">
</head>
<body>
<form class="layui-form" style="width:80%;">

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">数据文件：</label>
        <div class="layui-input-block">
            <button type="button" class="layui-btn" id="addFile">
                <i class="layui-icon">&#xe67c;</i>添加文件
            </button>
            <button type="button" class="layui-btn" id="upload">上传</button>
            <div class="layui-progress layui-progress-big" lay-showpercent="true" lay-filter="uploadProgressBar">
                <div class="layui-progress-bar" lay-percent="0%"></div>
            </div>
            <input type="hidden" name="photoUrl" value="" id="photo"/>
        </div>
    </div>
    <br/>
    <div class="layui-form-item layui-row layui-col-xs12">
        <div class="layui-input-block">
            <button class="layui-btn layui-btn-lg" lay-submit=""
                    lay-filter="addOrUpdateUser">确认
            </button>
            <button class="layui-btn layui-btn-lg layui-btn-normal" id="closeBtn">取消</button>
        </div>
    </div>
</form>

<script type="text/javascript" src="${ctx}/js/admin/tea/teaAddOrUpdate.js"></script>
<script type="text/javascript" src="${ctx}/js/jquery-3.4.1/jquery-3.4.1.min.js"></script>


</body>
</html>