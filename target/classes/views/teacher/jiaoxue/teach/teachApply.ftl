<!DOCTYPE html>
<html>
<head>
    <#include "../../../common.ftl">
    <script type="text/javascript">
        //初始化年
        var now = new Date();
        var nowYear = now.getFullYear();
        for (var i = nowYear-20; i <= nowYear + 10; i++) {
            var option = $("<option/>").val(i).text(i);
            $('#teachClassYear').append(option);
        }
    </script>
</head>
<body class="childrenBody">
<form class="layui-form" style="width:80%;">
    <#--<div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">课程编号</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="courseNo" id="courseNo" placeholder="请输入课程编号" value="${(course.courseNo)!}">
        </div>
    </div>-->

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">课程名称</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="courseName" id="courseName" placeholder="请输入课程名称" value="${(teach.courseName)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">授课方式</label>
        <div class="layui-input-block">
            <select name="teachType" lay-verify="required">
                <option value="" disabled>--请选择--</option>
                <option value="讲授">讲授</option>
                <option value="上机">上机</option>
                <option value="实验">实验</option>
                <option value="其他">其他</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">授课年份</label>
        <div class="layui-input-block">
            <select name="teachClassYear" lay-verify="required">
                <option value="" disabled>--请选择--</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">授课学期</label>
        <div class="layui-input-block">
            <select name="teachClassTerm" lay-verify="required">
                <option value="" disabled>--请选择--</option>
                <option value="第一学期">第一学期</option>
                <option value="第二学期">第二学期</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">授课年级</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="teachGrade" id="teachGrade" placeholder="请输入授课年级" value="${(teach.teachGrade)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">授课专业</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="teachMajor" id="teachMajor" placeholder="请输入实验学时" value="${(teach.experimentClassHour)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">规定学时</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="prescribedClassHour" id="prescribedClassHour" placeholder="请输入规定学时" value="${(teach.prescribedClassHour)!}">
        </div>
    </div>

<#--    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">实际学时</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="actualClassHour" id="actualClassHour" placeholder="请输入实际学时" value="${(teach.actualClassHour)!}">
        </div>
    </div>-->


    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">备注</label>
        <div class="layui-input-block">
            <textarea rows="10" cols="30" class="layui-input" maxlength="200" lay-verify="required" name="remark" id="remark" placeholder="备注"></textarea>
        </div>
    </div>


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
<script type="text/javascript" src="${ctx}/js/teacher/jiaoxue/teach/teachApply.js"></script>
</body>
</html>