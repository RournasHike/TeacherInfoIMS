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

    <div class="piddiv" style="display: none"><input type="hidden" id="pid" value="${(project.pid)!""}"></div>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">项目编号：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="pno" id="pno"  value="${(project.pno)!}" placeholder="请输入项目编号">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">项目名称：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="pname" id="pname"  value="${(project.pname)!}" placeholder="请输入项目名称">
        </div>
    </div>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">负责人：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="teacherName" id="teacherName" value="${(project.teacherName)!}" placeholder="请输入负责人">
        </div>
    </div>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">项目级别：</label>

        <div class="layui-input-block">
            <select name="pgrade" lay-verify="required">
                <option value="">--请选择--</option>
                <option value="校级">校级</option>
                <option value="市级">市级</option>
                <option value="省级">省级</option>
                <option value="国家级">国家级</option>
            </select>

        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">项目类别:</label>
        <div class="layui-input-block">
            <select name="pkind" lay-verify="required">
                <option value="">--请选择--</option>
                <option value="人文社科项目">人文社科项目</option>
                <option value="科研项目">科研项目</option>
                <option value="自然科学项目">自然科学项目</option>
                <option value="其他">其他</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">项目经费:</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userEmail"
                   lay-verify="required" name="pfunds" value="${(project.pfunds)!""}" id="pfunds" placeholder="请输入项目经费"> <label style="color: red">项目金额不能带逗号</label>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">参与人:</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userEmail"
                   lay-verify="required" name="participants" value="${(project.participants)!""}" id="participants" placeholder="请输入参与人">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">立项时间：</label>
        <div class="layui-input-block">
            <input type="date" class="layui-input userEmail"
                   lay-verify="required" name="pstatime" value="${(project.pstatime?date)!""}" id="pstatime" placeholder="请输入立项时间">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">结项时间：</label>
        <div class="layui-input-block">
            <input type="date" class="layui-input userEmail"
                   lay-verify="required" name="pendtime" value="${(project.pendtime?date)!""}" id="pendtime" placeholder="请输入结项时间">

        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">科研状态：</label>
        <div class="layui-input-block">
            <input type="radio" name="pcondition" id="pcondition" value="1">已完成
            <input type="radio" name="pcondition" id="pcondition" value="0">未完成
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">项目来源：</label>
        <div class="layui-input-block">
            <#--<input type="text" class="layui-input userEmail"
                   lay-verify="required" name="psource" value="${(project.psource)!}" id="psource" placeholder="请输入项目来源" disabled>-->
            <select name="psource" lay-verify="required">
                <option value="">--请选择--</option>
                <option value="国家计划">国家计划</option>
                <option value="省计划">省计划</option>
                <option value="市计划">市计划</option>
                <option value="企业自行开发">企业自行开发</option>
                <option value="其他">其他</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">项目附件：</label>
        <div class="layui-input-block">
            <input type="hidden" class="layui-input userEmail"
                    name="paccessory" value="${(project.paccessory)!}" id="paccessory">
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
        <label class="layui-form-label">科研类型：</label>
        <div class="layui-input-block">
            <#--<input type="text" class="layui-input userEmail"
                   lay-verify="required" name="kytype" value="${(project.kytype)!}" id="kytype" placeholder="请输入科研类型">-->

            <select name="kytype" lay-verify="required">
                <option value="">--请选择--</option>
                <option value="自然科学">自然科学</option>
                <option value="人文社科">人文社科</option>
                <option value="教育科研(教改工程)">教育科研(教改工程)</option>
                <option value="教育科研(校指导项目)">教育科研(校指导项目)</option>
                <option value="教育科研(自选)">教育科研(自选)</option>
                <option value="其他">其他</option>
            </select>

        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">项目成果形式：</label>
        <div class="layui-input-block">
            <select name="result" lay-verify="required">
                <option value="">--请选择--</option>
                <option value="论文和专著">论文和专著</option>
                <option value="自主研发的新产品原型">自主研发的新产品原型</option>
                <option value="自主开发的新技术">自主开发的新技术</option>
                <option value="发明专利">发明专利</option>
                <option value="实用新型专利">实用新型专利</option>
                <option value="外观设计专利">外观设计专利</option>
                <option value="带有技术参数的场纸等">带有技术参数的场纸等</option>
                <option value="基础软件">基础软件</option>
                <option value="应用软件">应用软件</option>
                <option value="其他">其他</option>
            </select>

        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">备注：</label>
        <div class="layui-input-block">
            <textarea name="premark" id="premark" rows="10" cols="30" maxlength="200" value="${(project.premark)!}" ></textarea>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <div class="layui-input-block">
            <button class="layui-btn layui-btn-lg" lay-submit="" lay-filter="addOrUpdateProject">确认</button>
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

<script type="text/javascript" src="${ctx}/js/teacher/keyan/project/projectAddOrUpdate.js"></script>


</body>
</html>