<!DOCTYPE html>
<html>
<head>
    <#include "../../../common.ftl">
    <script src="${ctx}/js/jquery-3.4.1/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        //初始化年份
        var now = new Date();
        var nowYear = now.getFullYear();
        var option;
        for (var i = nowYear-20; i <= nowYear + 10; i++) {
            option = $("<option/>").val(i+"-"+(i+1)).text(i+"-"+(i+1));
        }
        $('#teachClassYear').append(option);
    </script>
</head>
<body class="childrenBody">
<form class="layui-form" style="width:80%;">

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">课程名称</label>
        <div class="layui-input-block">
            <select name="courseName" lay-verify="required">
                <option value="" disabled>--请选择--</option>

            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">授课老师</label>
        <div class="layui-input-block">
            <select name="teachType" lay-verify="required">
                <option value="" disabled>--请选择--</option>

            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">授课教室</label>
        <div class="layui-input-block">
            <select name="teachRoom" lay-verify="required">
                <option value="" disabled>--请选择--</option>

            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">授课年份</label>
        <div class="layui-input-block">
            <select name="teachClassYear" lay-verify="required" id="teachClassYear">
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
        <label class="layui-form-label">工作日</label>
        <div class="layui-input-block">
            <select name="teachClassTerm" lay-verify="required">
                <option value="" disabled>--请选择--</option>
                <option value="周一">周一</option>
                <option value="周二">周二</option>
                <option value="周三">周三</option>
                <option value="周四">周四</option>
                <option value="周五">周五</option>
                <option value="周六">周六</option>
                <option value="周日">周日</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">课程节数</label>
        <div class="layui-input-block">
            <select name="teachClassTerm" lay-verify="required">
                <option value="" disabled>--请选择--</option>
                <option value="第一大节">第一大节</option>
                <option value="第二大节">第二大节</option>
                <option value="第三大节">第三大节</option>
                <option value="第四大节">第四大节</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">起始周数</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="prescribedClassHour" id="prescribedClassHour" placeholder="请输入起始周数" value="${(teach.prescribedClassHour)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">上课周数</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="actualClassHour" id="actualClassHour" placeholder="请输入上课周数" value="${(teach.actualClassHour)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">是否单周</label>
        <div class="layui-input-block">
            <select name="isSingleWeek" lay-verify="required">
                <option value="" disabled>--请选择--</option>
                <option value="1" disabled>是</option>
                <option value="0" disabled>否</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">是否双周</label>
        <div class="layui-input-block">
            <select name="isDoubleWeek" lay-verify="required">
                <option value="" disabled>--请选择--</option>
                <option value="1" disabled>是</option>
                <option value="0" disabled>否</option>
            </select>
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
<script type="text/javascript" src="${ctx}/js/admin/jiaoxue/teach/teachAssign.js"></script>
</body>
</html>