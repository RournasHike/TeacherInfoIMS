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
                option = $("<option/>").val(i+"-"+(i+1)+"学年").text(i+"-"+(i+1)+"学年");
                $('#teachClassYear').append(option);
            }
            // $('#teachClassYear').append(option);
            $('#parentCourseIframe').on('click', function(){
                var url = ctx + "/course/toCourseIframe";
                layer.ready(function(){
                    layer.open({
                        type: 2,
                        title: '请选择',
                        maxmin: true,
                        area: ['800px', '500px'],
                        content: url,
                        end: function(){
                            // layer.tips('选择成功', '#about', {tips: 1})
                            layer.msg("选择成功",function(){

                            });
                        }
                    });
                });
            });

            $('#parentTeachRoomIframe').on('click', function(){
                var url = ctx + "/teachRoom/toTeachRoomIframe";
                layer.ready(function(){
                    layer.open({
                        type: 2,
                        title: '请选择',
                        maxmin: true,
                        area: ['800px', '500px'],
                        content: url,
                        end: function(){
                            // layer.tips('选择成功', '#about', {tips: 1})
                            layer.msg("选择成功",function(){

                            });
                        }
                    });
                });
            });

            $('#parentTeacherIframe').on('click', function(){
                var url = ctx + "/tea/toTeacherIframe";
                layer.ready(function(){
                    layer.open({
                        type: 2,
                        title: '请选择',
                        maxmin: true,
                        area: ['800px', '500px'],
                        content: url,
                        end: function(){
                            // layer.tips('选择成功', '#about', {tips: 1})
                            layer.msg("选择成功",function(){

                            });
                        }
                    });
                });
            });
        });


    </script>
</head>
<body class="childrenBody">
<form class="layui-form" style="width:80%;">

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">课程名称</label>
        <div class="layui-input-block">
            <#--<select name="courseName" lay-verify="required">
                <option value="" selected="selected">--请选择--</option>
                <#list courses as key>
                    <option value="${key.courseName!""}">${key.courseName!""}</option>
                </#list>

            </select>-->
            <a class="layui-btn layui-btn-primary layer-demolist" href="javascript:;" id="parentCourseIframe">点击选择</a>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">授课教室</label>
        <div class="layui-input-block">
            <#--<select name="teachRoomName" lay-verify="required">
                <option value="" selected="selected">--请选择--</option>
                <#list teachRooms as key>
                    <option value="${key.teachRoomName!""}">${key.teachRoomName!""}</option>
                </#list>
            </select>-->
            <a class="layui-btn layui-btn-primary layer-demolist" href="javascript:;" id="parentTeachRoomIframe">点击选择</a>
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
                <option value="第一学期">第一学期</option>
                <option value="第二学期">第二学期</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label"> 授课专业</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="teachMajor" id="teachMajor" placeholder="请输入授课专业" value="${(teach.actualClassHour)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label"> 授课年级</label>
        <div class="layui-input-block">
            <select name="teachGrade" lay-verify="required">
                <option value="" selected="selected">--请选择--</option>
                <option value="大一">大一</option>
                <option value="大二">大二</option>
                <option value="大三">大三</option>
                <option value="大四">大四</option>
            </select>
        </div>
    </div>


    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label"> 开课学院</label>
        <div class="layui-input-block">
            <select name="collegeId" lay-verify="required" onchange="change()">
                <option value="" selected="selected">--请选择--</option>
                <#list colleges as key>
                    <option value="${key_index+1}">${key.collegeName!""}</option>
                </#list>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label"> 开课系部</label>
        <div class="layui-input-block">
            <select name="deptId" lay-verify="required" onchange="change()">
                <option value="" selected="selected">--请选择--</option>
                <#list depts as key>
                    <option value="${key_index+1}">${key.deptName!""}</option>
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
            <#--<select name="teacherName" lay-verify="required" id="tid">
                <option value="" selected="selected">--请选择--</option>
                <#list teachers as key>
                    <option value="${key.teacherName!''}">${key.teacherName!""}</option>
                </#list>
            </select>-->
            <a class="layui-btn layui-btn-primary layer-demolist" href="javascript:;" id="parentTeacherIframe">点击选择</a>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">工作日</label>
        <div class="layui-input-block">
            <select name="classWorkDay" lay-verify="required">
                <option value="" selected="selected">--请选择--</option>
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
            <select name="classNum" lay-verify="required">
                <option value="" selected="selected">--请选择--</option>
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
                   name="startWeek" id="startWeek" placeholder="请输入起始周数" value="${(schedule.prescribedClassHour)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">上课周数</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   name="classWeek" id="classWeek" placeholder="请输入上课周数" value="${(schedule.actualClassHour)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">是否单周</label>
        <div class="layui-input-block">
            <input name="isSingleWeek" type="radio" id="isSingleWeek" value="1"/>是
            <input name="isSingleWeek" type="radio" id="isSingleWeek" value="0">否
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">是否双周</label>
        <div class="layui-input-block">
            <input name="isDoubleWeek" type="radio" id="isDoubleWeek" value="1"/>是
            <input name="isDoubleWeek" type="radio" id="isDoubleWeek" value="0">否
        </div>
    </div>

    <br/>
    <div class="layui-form-item layui-row layui-col-xs12">
        <div class="layui-input-block">
            <button class="layui-btn layui-btn-lg" lay-submit=""
                    lay-filter="teachAssign">确认
            </button>
            <button class="layui-btn layui-btn-lg layui-btn-normal" id="closeBtn">取消</button>
        </div>
    </div>
</form>
<script type="text/javascript" src="${ctx}/js/admin/jiaoxue/teach/teachAssign.js"></script>
</body>
</html>