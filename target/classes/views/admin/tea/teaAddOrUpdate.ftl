<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-教师列表</title>
    <#include "../../common.ftl">
</head>
<body>
<form class="layui-form" style="width:80%;">

    <#-- 用户ID -->
    <input name="id" type="hidden" value="${(user.uid)!}"/>
    <#if tea??>
        <div class="layui-form-item layui-row layui-col-xs12">
            <label class="layui-form-label">教师编号：</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input userName"
                       lay-verify="required" name="teacherNo" id="teacherNo"  value="${(tea.teacherNo)!}" placeholder="请输入用户名" disabled>
            </div>
        </div>
        <#else>

    </#if>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">姓名：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="teacherName" id="teacherName" maxlength="20" value="${(tea.teacherName)!}" placeholder="请输入用户名">
        </div>
    </div>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">英文姓名：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="teacherEngname" id="teacherEngname" maxlength="20" value="${(tea.teacherEngname)!}" placeholder="请输入英文姓名">
        </div>
    </div>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">性别：</label>

        <div class="layui-input-block">
            <#if tea??>
                <input id="sex" value="${(tea.sex)!""}" class="layui-input userName" disabled/>
                <#else >
                    <select name="sex" lay-verify="required">

                        <option value="">--请选择--</option>
                        <option value="男">男</option>
                        <option value="女">女</option>
                    </select>
            </#if>

        </div>
    </div>



    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">所学专业:</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userEmail"
                   lay-verify="required" name="major" value="${(tea.major)!}" id="major" maxlength="20" placeholder="请输入专业">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">最高学历:</label>
        <div class="layui-input-block">
            <select name="degree" lay-verify="required">
                <#if tea??>
                    <option value="${(tea.degree)!""}"></option>
                </#if>
                <option value="">--请选择--</option>
                <option value="本科">本科</option>
                <option value="硕士">硕士</option>
                <option value="博士">博士</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">毕业院校：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userEmail"
                   lay-verify="required" name="school" value="${(tea.school)!""}" id="school" maxlength="20" placeholder="请输入毕业院校">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">出生日期：</label>
        <div class="layui-input-block">
            <#if tea??>
                <input type="date" class="layui-input userEmail"
                       lay-verify="required" name="birth" value="${(tea.birth)?string('yyyy-MM-dd')}" id="birth" placeholder="请输入出生日期">
                <#else>
                <input type="date" class="layui-input userEmail"
                       lay-verify="required" name="birth" value="${(tea.birth)!""}" id="birth" placeholder="请输入出生日期">
            </#if>

        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">研究方向：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userEmail"
                   lay-verify="required" name="researchDirection" maxlength="50" value="${(tea.researchDirection)!}" id="researchDirection" placeholder="请输入研究方向">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">身份证号：</label>
        <div class="layui-input-block">
            <#if tea??>
                <input type="text" class="layui-input userEmail"
                       lay-verify="required" name="idNum" value="${(tea.idNum)!}" id="idNum" placeholder="请输入身份证号" disabled>
                <#else >
                    <input type="text" class="layui-input userEmail"
                           lay-verify="required" name="idNum" max="18" value="${(tea.idNum)!}" id="idNum" placeholder="请输入身份证号">
            </#if>

        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">家庭住址：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userEmail"
                   lay-verify="required" name="familyAddress" maxlength="200" value="${(tea.familyAddress)!}" id="familyAddress" placeholder="请输入家庭地址">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">政治面貌：</label>
        <div class="layui-input-block">
            <select name="politicsStatus">
                <#if tea??>
                    <option value="${(tea.politicsStatus)!""}"></option>
                </#if>
                <option value="${(tea.politicsStatus)!}">--请选择--</option>
                <option value="团员">团员</option>
                <option value="党员">党员</option>
                <option value="群众">群众</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">电话号码：</label>
        <div class="layui-input-block">
            <input type="tel" class="layui-input userEmail"
                   lay-verify="required" name="phone" value="${(tea.phone)!}" id="phone" placeholder="请输入手机号" maxlength="11">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">邮箱：</label>
        <div class="layui-input-block">
            <input type="email" class="layui-input userEmail"
                   lay-verify="required" name="email" value="${(tea.email)!}" id="email" placeholder="请输入邮箱">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">所在学院：</label>
        <div class="layui-input-block">

            <select name="collegeId" lay-verify="required">
                <#if tea??>
                    <option value="${(tea.tCollege.collegeName)!""}"></option>
                </#if>
                <option value="">--请选择--</option>
                <#if colleges?exists>
                    <#list colleges as key>
                        <option value="${key_index+1}">${key.collegeName!""}</option>
                    </#list>
                </#if>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">所在部门：</label>
        <div class="layui-input-block">
            <select name="deptId" lay-verify="required">
                <#if tea??>
                    <option value="${(tea.tDept.deptName)!""}"></option>
                </#if>
                <option value="">--请选择--</option>
                <#if depts?exists>
                    <#list depts as key>
                        <option value="${key_index+1}">${key.deptName!""}</option>
                    </#list>
                </#if>
            </select>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">是否为外聘教师:</label>
        <div class="layui-input-block">
            <input name="isForeign" type="radio" id="isForeign" value="1"/>外聘教师
            <input name="isForeign" type="radio" id="isForeign" value="0">非外聘教师
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">职称：</label>
        <div class="layui-input-block">
            <select name="occupation">
                <#if tea??>
                    <option value="${(tea.occupation)!""}"></option>
                </#if>
                <option value="">--请选择--</option>
                <option value="讲师">讲师</option>
                <option value="副教授">副教授</option>
                <option value="教授">教授</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">个人证件照片：</label>
        <div class="layui-input-block">
            <button type="button" class="layui-btn" id="addFile">
                <i class="layui-icon">&#xe67c;</i>添加文件
            </button>
            <button type="button" class="layui-btn" id="upload">上传</button>
            <div class="layui-upload-list">
                <img style="width: 400px;height: 400px" id="demo1">
            </div>
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
<script type="text/javascript">
    var checkIdNum = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
    var checkPhone = /^[1][3,4,5,6,7,8,9][0-9]{9}$/;
    var checkEmail = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

    function checkId(id){
        console.log(checkIdNum.test(id.val()))
        return checkIdNum.test(id.val());
    }

    function checkEmails(email) {
        console.log(checkEmail.test(email.val()))
        return checkEmail.test(email.val());
    }

    function checkPhone(phone) {
        console.log(checkPhone.test(phone.val()))
        return checkPhone.test(phone.val());
    }

    $(function (){
        var phone,idnum,email;
        $("#phone").onblur(function(){
            if(checkPhone(this)){
                // alert("请输入正确的手机号")
                layer.msg('请输入正确的手机号');
            }
        });

        $("#email").onblur(function(){
            if(checkEmails(this)){
                // alert("请输入正确的邮箱")
                layer.msg('请输入正确的邮箱');
            }
        });

        $("#idNum").onblur(function(){
            if(checkId(this)){
                // alert("请输入正确的身份证号")
                layer.msg('请输入正确的身份证号');
            }
        });

    });


</script>

</body>
</html>