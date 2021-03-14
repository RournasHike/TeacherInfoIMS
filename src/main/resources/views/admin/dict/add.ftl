<!DOCTYPE html>
<html>
<head>
    <#include "../../common.ftl">
</head>
<body class="childrenBody">
<form class="layui-form" style="width:80%;">
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">字典字段名称</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="field" id="field"   placeholder="请输入字典字段名称">
        </div>
    </div>
    <#assign x="${(dictDto.isDict)!''}">
    <#if x=="0">
        <div class="layui-form-item layui-row layui-col-xs12">
            <label class="layui-form-label">字典字段值</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input userName"
                       name="val" id="val" placeholder="请输入字典字段值">
            </div>
        </div>

        <div class="layui-form-item layui-row layui-col-xs12">
            <label class="layui-form-label">数据字段值含义</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input userName"
                       lay-verify="required" name="dictDesc" id="dictDesc" placeholder="请输入数据字段值含义">
            </div>
        </div>
    <#elseif x=="1">
            <div class="layui-form-item layui-row layui-col-xs12">
                <label class="layui-form-label">数据字典含义</label>
                <div class="layui-input-block">
                    <input type="text" class="layui-input userName"
                           lay-verify="required" name="dictDesc" id="dictDesc" placeholder="请输入数据字段值含义">
                </div>
            </div>
        <#else >

    </#if>


    <!--
       添加根级菜单
    -->
    <input name="parentId" type="hidden" value="${(dictDto.parentId)!}"/>
    <br/>
    <div class="layui-form-item layui-row layui-col-xs12">
        <div class="layui-input-block">
            <button class="layui-btn layui-btn-lg" lay-submit=""
                    lay-filter="addDict">确认
            </button>
            <button class="layui-btn layui-btn-lg layui-btn-normal" id="closeBtn">取消</button>
        </div>
    </div>
</form>
<script type="text/javascript" src="${ctx}/js/dict/add.js"></script>
</body>
</html>