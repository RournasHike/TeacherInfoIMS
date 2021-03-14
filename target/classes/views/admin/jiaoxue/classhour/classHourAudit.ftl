<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-授课信息</title>
    <#include "../../../common.ftl">
    <link rel="stylesheet" href="${ctx}/css/teaInfo.css" media="all">
</head>
<body>
<div class="layui-container" >
    <div style="text-align: right;width: 100%;">
        <b>[课时信息]</b>
        <hr style="color: #000"/>
    </div>
    <div class="layui-row layui-col-space10">
        <div class="layui-col-md9">
            <div class="piddiv" style="display: none"><input type="hidden" id="paid" name="paid" value="${(paper.paid)!""}"></div>
            <table cellpadding="2px" cellspacing="4px" style="text-align: center" border="1px solid black" class="layui-table">
                <tr style="height: 35px">
                    <td class="leftcell"><label>教师姓名:</label></td>
                    <td class="rightcell">${(teach.pano)!""}</td>
                    <td class="leftcell"><label>教授课程:</label></td>
                    <td class="rightcell">${(teach.paname)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>讲授学时:</label></td>
                    <td class="rightcell">${(course.teachClassHour)!""}</td>
                    <td class="leftcell"><label>实验学时:</label></td>
                    <td class="rightcell">${(course.experimentClassHour)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>上机学时:</label></td>
                    <td class="rightcell">${(course.computerClassHour)!""}</td>
                    <td class="leftcell"><label>其他学时:</label></td>
                    <td class="rightcell">${(course.otherClassHour)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>规定学时:</label></td>
                    <td class="rightcell">${(teach.letternum)!}</td>
                    <td class="leftcell"><label>实际学时:</label></td>
                    <td class="rightcell">${(teach.letternum)!}</td>
                </tr>


                <tr>
                    <td colspan="4">
                        <span style="color: black;font-weight: bolder;">学时调整明细</span>
                    </td>
                </tr>

                <tr>
                    <td class="leftcell"><label>实际讲授学时:</label></td>
                    <td class="rightcell">${(course.actualTeachClassHour)!""}</td>
                    <td class="leftcell"><label>实际实验学时:</label></td>
                    <td class="rightcell">${(course.actualExperimentClassHour)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>实际上机学时:</label></td>
                    <td class="rightcell">${(course.actualComputerClassHour)!""}</td>
                    <td class="leftcell"><label>实际其他学时:</label></td>
                    <td class="rightcell">${(course.actualOtherClassHour)!""}</td>
                </tr>

                <tr>
                    <td colspan="2" style="text-align: center;" class="leftcell">总学时:</td>
                    <td colspan="2" style="text-align: center;" class="rightcell">${(course.actualOtherClassHour)!""}</td>
                </tr>
            </table>
        </div>
        <form class="layui-form" style="width:80%;">
            <div class="layui-form-item layui-row layui-col-xs12">
                <label class="layui-form-label">是否通过：</label>
                <div class="layui-input-block">
                    <input type="radio" name="ispass" value="1" title="通过"/>
                    <input type="radio" name="ispass" value="0" title="不通过"/>
                </div>
            </div>
            <div class="layui-form-item layui-row layui-col-xs12">
                <label class="layui-form-label">审核意见：</label>
                <div class="layui-input-block">
                    <textarea name="message" rows="10" cols="30" class="layui-input userName" maxlength="200" lay-verify="required" name="teacherName" id="teacherName" placeholder="请输入审核意见"></textarea>
                </div>
            </div>
            <div class="layui-form-item layui-row layui-col-xs12">
                <div class="layui-input-block">
                    <button class="layui-btn layui-btn-lg" lay-submit=""
                            lay-filter="addOrUpdatePaper">确认
                    </button>
                    <button class="layui-btn layui-btn-lg layui-btn-normal" id="closeBtn">取消</button>
                </div>
            </div>
        </form>
    </div>
</div>
<script type="text/javascript" src="${ctx}/js/admin/jiaoxue/classhour/classHourAudit.js"></script>
</body>
</html>