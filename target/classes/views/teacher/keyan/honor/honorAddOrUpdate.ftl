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

    <div class="piddiv" style="display: none"><input type="hidden" id="hid" value="${(honor.hid)!""}"></div>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">荣誉编号：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="hno" id="hno"  value="${(honor.hno)!}" placeholder="请输入荣誉编号">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">教师姓名：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="teacherName" id="teacherName"  value="${(honor.teacherName)!}" placeholder="请输入教师姓名">
        </div>
    </div>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">荣誉名称：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="hname" id="hname" value="${(honor.hname)!}" placeholder="请输入荣誉名称">
        </div>
    </div>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">参与人：</label>

        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="participants" id="participants" value="${(honor.participants)!}" placeholder="请输入参与人">
        </div>
    </div>



    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">获奖时间:</label>
        <div class="layui-input-block">
            <input type="date" class="layui-input userEmail"
                   lay-verify="required" name="hdate" value="${(honor.hdate?date)!}" id="hdate" placeholder="">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">颁奖单位:</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userEmail"
                   lay-verify="required" name="hcompany" value="${(honor.hcompany)!}" id="hcompany" placeholder="请输入颁奖单位">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">授予单位：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userEmail"
                   lay-verify="required" name="hdepartment" value="${(honor.hdepartment)!""}" id="hdepartment" placeholder="请输入授予单位">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">获奖级别：</label>
        <div class="layui-input-block">
            <select name="hgrade">
                <option value="">--请选择--</option>
                <option value="校级">校级</option>
                <option value="市级">市级</option>
                <option value="省级">省级</option>
                <option value="国家级">国家级</option>
                <option value="国际级">国际级</option>
            </select>

        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">获奖等级：</label>
        <div class="layui-input-block">
            <select name="hlevel">
                <option value="">--请选择--</option>
                <option value="优秀奖">优秀奖</option>
                <option value="一等奖">一等奖</option>
                <option value="二等奖">二等奖</option>
                <option value="三等奖">三等奖</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">获奖类别：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userEmail"
                   lay-verify="required" name="htype" value="${(honor.htype)!}" id="htype" placeholder="请输入获奖类别">
            <select name="htype">
                <option value="" disabled>--请选择--</option>
                <option value="专利">专利</option>
                <option value="科研项目">科研项目</option>
                <option value="比赛竞赛">比赛竞赛</option>
                <option value="其他">其他</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">科研类别：</label>
        <div class="layui-input-block">
            <#--<input type="text" class="layui-input userEmail"
                   lay-verify="required" name="kytype" value="${(honor.kytype)!}" id="kytype" placeholder="请输入科研类别">-->
            <select name="kytype" lay-verify="required">
                <option value="">--请选择--</option>
                <option value="自然科学">自然科学</option>
                <option value="人文社科">人文社科</option>
                <option value="教育科研">教育科研</option>
                <option value="其他">其他</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">附件：</label>
        <div class="layui-input-block">

            <input type="hidden" class="layui-input userEmail"
                   name="haccessoryUrl" value="${(honor.haccessoryUrl)!}" id="haccessoryUrl">
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
                    lay-filter="addOrUpdateHonor">确认
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

<script type="text/javascript" src="${ctx}/js/teacher/keyan/honor/honorAddOrUpdate.js"></script>


</body>
</html>