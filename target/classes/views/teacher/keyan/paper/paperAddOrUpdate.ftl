<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-教师列表</title>
    <#include "../../../common.ftl">
    <link rel="stylesheet" href="${ctx}/lib/layui-v2.5.5/css/layui.css" media="all">
    <script src="${ctx}/lib/layui-v2.5.5/layui.js"></script>
    <script src="${ctx}/js/jquery-3.4.1/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function(){
            //初始化年
            var now = new Date();
            var nowYear = now.getFullYear();
            for (var i = nowYear-20; i <= nowYear + 10; i++) {
                var option = $("<option/>").val(i).text(i);
                $('#pubYear').append(option);
            }
            // $('#pubYear').val(nowYear);

            //初始化期数
            for (var i = 1; i <= 53; i++) {
                var option = $("<option/>").val(i).text(i);
                $('#pubStage').append(option);
            }

            //初始化卷数
            for (var i = 1; i <= 36; i++) {
                var option = $("<option/>").val(i).text(i);
                $('#pubVolume').append(option);
            }

        });
    </script>
</head>
<body>
<form class="layui-form" style="width:80%;">

    <div class="piddiv" style="display: none"><input type="hidden" id="paid" value="${(paper.paid)!""}"></div>
    <#if paper??>
        <div class="layui-form-item layui-row layui-col-xs12">
            <label class="layui-form-label">论文编号：</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input userName"
                       lay-verify="required" name="pano" id="pano"  value="${(paper.pano)!}" placeholder="请输入论文编号">
            </div>
        </div>
        <#else>
            <div class="layui-form-item layui-row layui-col-xs12">
                <label class="layui-form-label">论文编号：</label>
                <div class="layui-input-block">
                    <input type="text" class="layui-input userName"
                           lay-verify="required" name="pano" id="pano"  value="" placeholder="请输入论文编号">
                </div>
            </div>

    </#if>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">论文名称：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="paname" id="paname"  value="${(paper.paname)!}" placeholder="请输入论文名称">
        </div>
    </div>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">发表人：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="teacherName" id="teacherName" value="${(paper.teacherName)!}" placeholder="请输入发表人">
        </div>
    </div>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">论文类别：</label>

        <div class="layui-input-block">
            <select name="pagrade">
                <option value="">---请输入论文类别-</option>
                <option value="A类">A类</option>
                <option value="B类">B类</option>
                <option value="C类">C类</option>
                <option value="D类">D类</option>
                <option value="E类">E类</option>
                <option value="T类">T类</option>
            </select>

        </div>
    </div>



    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">发表期刊:</label>
        <div class="layui-input-block">
            <select name="papublish">
                <option value="">--请输入发表期刊--</option>
                <option value="中文核心期刊">中文核心期刊</option>
                <option value="中文社会科学引文索引(CSSCI)来源期刊">中文社会科学引文索引(CSSCI)来源期刊</option>
                <option value="中国科技论文统计源期刊">中国科技论文统计源期刊</option>
                <option value="中国人文社会科学核心期刊">中国人文社会科学核心期刊</option>
                <option value="中国科学引文数据库(CSCD)来源期刊">中国科学引文数据库(CSCD)来源期刊</option>
                <option value="中国人文社科学报核心期刊">中国人文社科学报核心期刊</option>
                <option value="SCI">SCI</option>
                <option value="EI">EI</option>
                <option value="ISTP">ISTP</option>

            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">发表时间:</label>
        <div class="layui-input-block">
            <input type="date" class="layui-input userEmail"
                   lay-verify="required" name="padate" value="${(paper.padate?date)!''}" id="padate">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">论文类型：</label>
        <div class="layui-input-block">
            <select name="pakind">
                <option value="">--请选择论文类型--</option>
                <option value="学年论文">学年论文</option>
                <option value="毕业论文">毕业论文</option>
                <option value="学位论文">学位论文</option>
                <option value="科技论文">科技论文</option>
                <option value="成果论文">成果论文</option>
                <option value="其他">其他</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">论文研究范畴：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userEmail"
                   lay-verify="required" name="subject" value="${(paper.subject)!""}" id="subject" placeholder="请输入论文研究范畴">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">主要研究内容：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userEmail"
                   lay-verify="required" name="content" value="${(paper.content)!""}" id="content" placeholder="请输入主要研究内容">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">论文字数：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userEmail"
                   lay-verify="required" name="letternum" value="${(paper.letternum)!}" id="letternum" placeholder="请输入论文字数">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">发表年份：</label>
        <div class="layui-input-block">
                <select data-placeholder="--选择年份--" id="pubYear" name="pubYear"
                        class="form-control chosen-select" onchange="changeYear()" tabindex="2">
                    <option value="">--选择年份--</option>
                </select>
        </div>
    </div>


    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">发表期数：</label>
        <div class="layui-input-block">
            <select data-placeholder="--选择期数--" id="pubStage" name="pubStage"
                    class="form-control chosen-select" onchange="changeYear()" tabindex="2">
                <option value="">--选择期数--</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">发表卷数：</label>
        <div class="layui-input-block">
            <select data-placeholder="--选择卷数--" id="pubVolume" name="pubVolume"
                    class="form-control chosen-select" onchange="changeYear()" tabindex="2">
                <option value="">--选择卷数--</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">依赖项目：</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userEmail"
                   name="dependency" value="${(paper.dependency)!}" id="dependency" placeholder="请输入依赖项目">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label">附件：</label>
        <div class="layui-input-block">
            <input type="hidden" class="layui-input userEmail"
                   name="paccessory" value="${(paper.paccessory)!}" id="paccessory">
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
        <label class="layui-form-label">备注：</label>
        <div class="layui-input-block">
            <textarea name="paremark" id="paremark" rows="10" cols="30" maxlength="200" value="${(paper.paremark)!}" ></textarea>
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
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });

</script>

<script type="text/javascript" src="${ctx}/js/teacher/keyan/paper/paperAddOrUpdate.js"></script>


</body>
</html>