<!DOCTYPE html>
<html>
<head>
    <#include "../../../common.ftl">
    <script src="${ctx}/js/jquery-3.4.1/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function() {
            //初始化年份
            var now = new Date();
            var nowYear = now.getFullYear();
            var option;
            for (var i = nowYear - 20; i <= nowYear + 10; i++) {
                option = $("<option />").val(i+"-"+(i+1)+"学年").text(i+"-"+(i+1)+"学年");
                $('#teachClassYear').append(option);
            }

        });


    </script>
</head>
<body class="childrenBody">
<form class="layui-form" style="width:80%;">

    <input type="hidden" name="id" value="${(teach.id)!}">
    <input type="hidden" name="sid" value="${(sid)!}">
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">课程名称</label>
        <div class="layui-input-block">
            <select name="courseName" lay-verify="required">
                <option value="" selected="selected">--请选择--</option>
                <#list courses as key>
                    <#assign x="${key.courseName!''}"/>
                    <option value="${key.courseName!''}" <#if teach.courseName==x>selected="selected"</#if>>${key.courseName!""}</option>
                </#list>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">授课教室</label>
        <div class="layui-input-block">
            <select name="teachRoomName" lay-verify="required">
                <option value="" selected="selected">--请选择--</option>
                <#list teachRooms as key>
                    <#assign x="${key.teachRoomName!''}"/>
                    <option value="${key.teachRoomName!''}" <#if schedule.teachRoomName==x>selected="selected"</#if>>${key.teachRoomName!""}</option>
                </#list>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">授课年份</label>
        <div class="layui-input-block">
            <select name="teachClassYear" lay-verify="required" id="teachClassYear">
                <option value="" selected="selected">--请选择--</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">授课学期</label>
        <div class="layui-input-block">
            <select name="teachClassTerm" lay-verify="required">
                <option value="" selected="selected">--请选择--</option>
                <option value="第一学期" <#if teach.teachClassTerm=="第一学期">selected="selected"</#if>>第一学期</option>
                <option value="第二学期" <#if teach.teachClassTerm=="第二学期">selected="selected"</#if>>第二学期</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label"> 授课专业</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="teachMajor" id="teachMajor" placeholder="请输入授课专业" value="${(teach.teachMajor)!''}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label"> 授课年级</label>
        <div class="layui-input-block">
            <select name="teachGrade" lay-verify="required">
                <option value="" selected="selected">--请选择--</option>
                <option value="大一" <#if teach.teachGrade=="大一">selected="selected"</#if>>大一</option>
                <option value="大二" <#if teach.teachGrade=="大二">selected="selected"</#if>>大二</option>
                <option value="大三" <#if teach.teachGrade=="大三">selected="selected"</#if>>大三</option>
                <option value="大四" <#if teach.teachGrade=="大四">selected="selected"</#if>>大四</option>
            </select>
        </div>
    </div>


    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label"> 开课学院</label>
        <div class="layui-input-block">
            <select name="collegeId" lay-verify="required">
                <option value="" selected="selected">--请选择--</option>
                <#list colleges as key>
                    <#assign x="${key.collegeName!''}"/>
                    <option value="${key_index+1}" <#if teach.startCollege==x>selected="selected"</#if>>${key.collegeName!""}</option>
                </#list>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label"> 开课系部</label>
        <div class="layui-input-block">
            <select name="deptId" lay-verify="required">
                <option value="" selected="selected">--请选择--</option>
                <#list depts as key>
                    <#assign x="${key.deptName!''}"/>
                    <option value="${key_index+1}" <#if teach.startDept==x>selected="selected"</#if>>${key.deptName!""}</option>
                </#list>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label"> 授课方式</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="teachType" id="teachType" placeholder="请输入授课方式" value="${(teach.teachType)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">授课老师</label>
        <div class="layui-input-block">
            <select name="teacherName" lay-verify="required" id="teacherName">
                <option value="" selected="selected">--请选择--</option>
                <#list teachers as key>
                    <#assign x="${key.teacherName!''}"/>
                    <option value="${key.teacherName!''}" <#if teach.teacherName==x>selected="selected"</#if>>${key.teacherName!""}</option>
                </#list>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">工作日</label>
        <div class="layui-input-block">
            <select name="classWorkDay" lay-verify="required">
                <option value="" selected="selected">--请选择--</option>
                <option value="周一"  <#if schedule.classWorkDay=="周一">selected="selected"</#if>>周一</option>
                <option value="周二"  <#if schedule.classWorkDay=="周二">selected="selected"</#if>>周二</option>
                <option value="周三"  <#if schedule.classWorkDay=="周三">selected="selected"</#if>>周三</option>
                <option value="周四"  <#if schedule.classWorkDay=="周四">selected="selected"</#if>>周四</option>
                <option value="周五"  <#if schedule.classWorkDay=="周五">selected="selected"</#if>>周五</option>
                <option value="周六"  <#if schedule.classWorkDay=="周六">selected="selected"</#if>>周六</option>
                <option value="周日"  <#if schedule.classWorkDay=="周日">selected="selected"</#if>>周日</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">课程节数</label>
        <div class="layui-input-block">
            <select name="classNum" lay-verify="required">
                <option value="" selected="selected">--请选择--</option>
                <option value="第一大节" <#if schedule.classNum=="第一大节">selected="selected"</#if>>第一大节</option>
                <option value="第二大节" <#if schedule.classNum=="第二大节">selected="selected"</#if>>第二大节</option>
                <option value="第三大节" <#if schedule.classNum=="第三大节">selected="selected"</#if>>第三大节</option>
                <option value="第四大节" <#if schedule.classNum=="第四大节">selected="selected"</#if>>第四大节</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">起始周数</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="startWeek" id="startWeek" placeholder="请输入起始周数" value="${(schedule.startWeek)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">上课周数</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="classWeek" id="classWeek" placeholder="请输入上课周数" value="${(schedule.classWeek)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">是否单周</label>
        <div class="layui-input-block">
            <input name="isSingleWeek" type="radio" id="isSingleWeek" value="1" <#if schedule.isSingleWeek==true>checked="checked"</#if>/>是
            <input name="isSingleWeek" type="radio" id="isSingleWeek" value="0" <#if schedule.isSingleWeek==false>checked="checked"</#if>/>否
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">是否双周</label>
        <div class="layui-input-block">
            <input name="isDoubleWeek" type="radio" id="isDoubleWeek" value="1" <#if schedule.isDoubleWeek==true>checked="checked"</#if>/>是
            <input name="isDoubleWeek" type="radio" id="isDoubleWeek" value="0" <#if schedule.isDoubleWeek==false>checked="checked"</#if>>否
        </div>
    </div>

    <br/>
    <div class="layui-form-item layui-row layui-col-xs12">
        <div class="layui-input-block">
            <button class="layui-btn layui-btn-lg" lay-submit=""
                    lay-filter="teachUpdate">确认
            </button>
            <button class="layui-btn layui-btn-lg layui-btn-normal" id="closeBtn">取消</button>
        </div>
    </div>
</form>
<script type="text/javascript" src="${ctx}/js/admin/jiaoxue/teach/teachEdit.js"></script>
</body>
</html>