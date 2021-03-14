<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-论文信息</title>
    <#include "../../../common.ftl">
    <link rel="stylesheet" href="${ctx}/css/teaInfo.css" media="all">
</head>
<body>
<div class="layui-container" >
    <div style="text-align: right;width: 100%;">
        <b>[论文信息]</b>
        <hr style="color: #000"/>
    </div>
    <div class="layui-row layui-col-space10">
        <div class="layui-col-md9">
            <div class="piddiv" style="display: none"><input type="hidden" id="paid" name="paid" value="${(paper.paid)!""}"></div>
            <table cellpadding="2px" cellspacing="4px" style="text-align: center" border="1px solid black" class="layui-table">
                <tr style="height: 35px">
                    <td class="leftcell"><label>论文编号:</label></td>
                    <td class="rightcell">${(paper.pano)!""}</td>
                    <td class="leftcell"><label>论文名称:</label></td>
                    <td class="rightcell">${(paper.paname)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>发表人:</label></td>
                    <td class="rightcell">${(paper.teacherName)!""}</td>
                    <td class="leftcell"><label>论文等级:</label></td>
                    <td class="rightcell">${(paper.pagrade)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>发表期刊:</label></td>
                    <td class="rightcell">${(paper.papublish)!""}</td>
                    <td class="leftcell"><label>发表时间:</label></td>
                    <td class="rightcell">${(paper.padate?date)!""}</td>
                </tr>
                <tr>
                    <td class="leftcell"><label>论文类型:</label></td>
                    <td class="rightcell">${(paper.pakind)!""}</td>
                    <td class="leftcell"><label>论文字数:</label></td>
                    <td class="rightcell">${(paper.letternum)!}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>论文研究范畴:</label></td>
                    <td class="rightcell">${(paper.subject)!""}</td>
                    <td class="leftcell"><label>主要研究内容:</label></td>
                    <td class="rightcell">${(paper.content)!}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>发表年份:</label></td>
                    <td class="rightcell">${(paper.pubYear)!""}</td>
                    <td class="leftcell"><label>发表卷数:</label></td>
                    <td class="rightcell">${(paper.pubVolume)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell"><label>发表期数:</label></td>
                    <td class="rightcell">${(paper.pubStage)!""}</td>
                    <td class="leftcell"><label>依赖项目:</label></td>
                    <td class="rightcell">${(paper.dependency)!""}</td>
                </tr>

                <tr>
                    <td class="leftcell" colspan="4"><label>附件:</label>
                        <a style="color: blue;text-decoration: underline;" href="${ctx}/${(paper.paccesssory)!""}">点此下载</a>
                    </td>
                </tr>
                <tr>
                    <td colspan="4">
                        <label>审核状态:</label>未审核
                    </td>
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
<script type="text/javascript" src="${ctx}/js/admin/audit/paper/paperAudit.js"></script>
</body>
</html>