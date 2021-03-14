<!DOCTYPE html>
<html>
<head>
    <#include "../../../common.ftl">
</head>
<body class="childrenBody">
<form class="layui-form" style="width:80%;">
    <#-- 用户ID -->
    <input name="id" type="hidden" value="${(course.id)!}"/>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">课程编号</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="courseNo" id="courseNo" placeholder="请输入课程编号" value="${(course.courseNo)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">课程名称</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="courseName" id="courseName" placeholder="请输入课程名称" value="${(course.courseName)!}">
        </div>
    </div>


    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">课程类型</label>
        <div class="layui-input-block">
            <select name="courseType" lay-verify="required">
                <option value="" disabled>--请选择--</option>
                <option value="必修课">必修课</option>
                <option value="选修课">选修课</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">周学时</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="weekClassHour" id="weekClassHour" placeholder="请输入周学时" value="${(course.weekClassHour)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">教授学时</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="teachClassHour" id="teachClassHour" placeholder="请输入教授学时" value="${(course.teachClassHour)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">上机学时</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="computerClassHour" id="computerClassHour" placeholder="请输入上机学时" value="${(course.computerClassHour)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">实验学时</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="experimentClassHour" id="experimentClassHour" placeholder="请输入实验学时" value="${(course.experimentClassHour)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">其他学时</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="otherClassHour" id="otherClassHour" placeholder="请输入其他学时" value="${(course.otherClassHour)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">总学时</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="sumupClassHour" id="sumupClassHour" placeholder="请输入总学时" value="${(course.sumupClassHour)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">学分</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="credit" id="credit" placeholder="请输入总学分" value="${(course.credit)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">开设状态</label>
        <div class="layui-input-block">
            <input name="state" type="radio" id="state" value="1"/>已开设
            <input name="state" type="radio" id="state" value="0"/>未开设
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">备注</label>
        <div class="layui-input-block">
            <textarea name="message" rows="10" cols="30" class="layui-input" maxlength="200" lay-verify="required" name="remark" id="remark" placeholder="备注"></textarea>
        </div>
    </div>


    <br/>
    <div class="layui-form-item layui-row layui-col-xs12">
        <div class="layui-input-block">
            <button class="layui-btn layui-btn-lg" lay-submit=""
                    lay-filter="addOrUpdateCourse">确认
            </button>
            <button class="layui-btn layui-btn-lg layui-btn-normal" id="closeBtn">取消</button>
        </div>
    </div>
</form>
<script type="text/javascript" src="${ctx}/js/admin/jiaoxue/course/courseAddOrUpdate.js"></script>
</body>
</html>