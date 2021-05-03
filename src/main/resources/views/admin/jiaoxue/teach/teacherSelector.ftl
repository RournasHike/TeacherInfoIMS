
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>layer</title>
    <#include "../../../common.ftl">
    <script src="${ctx}/js/jquery-3.4.1/jquery-3.4.1.min.js"></script>

</head>
<body>
<#--
<div class="box" style="text-align:center">
    <a href="javascript:;" id="vide_cl">关于</a>

</div>-->

<div>
    <#--<p><strong><label>请在关闭该层之前留个标记：</label></strong><input id="name" value="000"></p>
    <div><i class="layui-icon layui-icon-heart-fill"></i><span></span></div>-->
    <#--<button id="add">让层自适应iframe</button>
    <button id="new">在父层弹出一个层</button>
    <button id="transmit">给父页面传值</button>
    <button id="closeIframe">关闭iframe</button>-->

    <div style="width: 100%;">
        <#list data as d>
            <i class="layui-icon layui-icon-rate" onclick="changeCss(this)" value="${d.teacherName!''}" style="margin: 10px;padding: 2px;font-size: 24px;font-weight: 700">${d.teacherName!""}</i>
        </#list>
    </div>

    <button id="transmit" class="layui-btn layui-btn-lg">选择</button>
</div>
<!--弹出框js css-->
<script>
    var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
    var chooseVal;

    function changeCss(obj) {

        //margin: 10px;padding: 2px;font-size: 24px;font-weight: 700
        $("i").css("margin","10px").css("padding","2px").css("font-size","24px").css("font-weight","700");
        $(obj).css("color","red");
        chooseVal= $(obj).text();
    }

    //让层自适应iframe
    /*$('#add').on('click', function(){
        $('body').append('插入很多酱油。插入很多酱油。插入很多酱油。插入很多酱油。插入很多酱油。插入很多酱油。插入很多酱油。');
        parent.layer.iframeAuto(index);
    });*/
    //在父层弹出一个层
    /* $('#new').on('click', function(){
         parent.layer.msg('Hi, man', {shade: 0.3})
     });*/
    //给父页面传值
    $('#transmit').on('click', function(){
        parent.$('#parentTeacherIframe').text(chooseVal);
        parent.layer.tips('Look here', '#parentTeacherIframe', {time: 5000});
        parent.layer.close(index);
    });
    //关闭iframe
    $('#closeIframe').click(function(){
        var t_val = $('#name').val();
        if(t_val === ''){
            parent.layer.msg('请填写标记');
            return;
        }
        parent.layer.msg('您将标记 [ ' +t_val + ' ] 成功传送给了父窗口');
        parent.$('#name2').val(t_val);
        parent.layer.close(index);
    });
</script>
<!--弹出框js css-->
</body>
</html>