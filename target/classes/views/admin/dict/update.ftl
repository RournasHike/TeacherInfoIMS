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
                   lay-verify="required" name="field" id="field" placeholder="请输入字典字段名称" value="${(dict.field)!}">
        </div>
    </div>
    <#assign x="${(dictDto.isDict)!''}">
    <#if x=="0">
        <div class="layui-form-item layui-row layui-col-xs12">
            <label class="layui-form-label">字典字段值</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input userName"
                       name="val" id="val" placeholder="请输入字典字段值" value="${(dict.val)!}">
            </div>
        </div>
    <#else >
    </#if>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">数据字段值含义</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="dictDesc" id="dictDesc" placeholder="请输入数据字段值含义" value="${(dict.dictDesc)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">字典状态</label>
        <div class="layui-input-block">
            <input name="isValid" type="radio" id="isValid" value="1"/>可用
            <input name="isValid" type="radio" id="isValid" value="0">不可用
        </div>
    </div>


    <!--
       添加根级菜单
    -->
    <input name="parentId" type="hidden" value="${(dict.parentId)!}"/>
    <input name="id" type="hidden" value="${(dict.id)!}"/>
    <br/>
    <div class="layui-form-item layui-row layui-col-xs12">
        <div class="layui-input-block">
            <button class="layui-btn layui-btn-lg" lay-submit=""
                    lay-filter="updateDict">确认
            </button>
            <button class="layui-btn layui-btn-lg layui-btn-normal" id="closeBtn">取消</button>
        </div>
    </div>
</form>
<script type="text/javascript" src="${ctx}/js/dict/update.js"></script>
</body>
</html>