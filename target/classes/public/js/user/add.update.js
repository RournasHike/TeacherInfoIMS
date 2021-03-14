layui.use(['form', 'layer' ,'upload','jquery','element','formSelects'], function () {
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery;
    var upload = layui.upload, $ = layui.jquery, element = layui.element;
    var formSelects = layui.formSelects;
    var checkIdNum = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
    var checkPhone = /^[1][3,4,5,6,7,8,9][0-9]{9}$/;
    var checkEmail = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

    $(function (){
        $("#phone").blur(function(){
            if(!checkPhone.test(this.value)){
                // alert("请输入正确的手机号")
                layer.msg('请输入正确的手机号');
                $("#phone").focus();
            }
        });

        $("#email").blur(function(){
            if(!checkEmail.test(this.value)){
                // alert("请输入正确的邮箱")
                layer.msg('请输入正确的邮箱');
                $("#email").focus();
            }
        });

        $("#idNum").blur(function(){
            if(!checkIdNum.test(this.value)){
                // alert("请输入正确的身份证号")
                layer.msg('请输入正确的身份证号');
                $("#idNum").focus();
            }
        });

    });

    /*文件上传*/
    upload.render({
        accept : "file",
        elem : "#addFile",
        auto : false,   //关闭文件自动上传
        bindAction : "#upload", //文件上传触发按钮
        url : ctx+"/upload",
        progress:function(value){//上传进度回调 value进度值
            element.progress('uploadProgressBar', value+'%')//设置页面进度条
        },
        before : function (obj) {
            /* var intId = setInterval(function () {
                 getUploadStatus(intId);
             }, 1000); //每秒向服务端获取一次当前上传进度情况*/
            obj.preview(function (index,file,result) {
                $('#demo1').attr('src',result);
            })
        },
        done : function (res, index, upload) {
            if(res.code != 200){
                layer.open({
                    icon : 2,
                    skin : "layui-layer-molv",
                    content : res.msg
                });
            }
            if (res.code<0){
                layer.msg("上传失败")
            }
            layer.msg('上传成功');
            $("#photo").val(res.filePath);
        },
        error : function (res) {

        }
    });


    /**
     * 表单Submit监听
     */
    form.on('submit(addOrUpdateUser)', function (data) {

            var isForeign;
            if($("input:radio:checked").val().toString()=="1"){
                isForeign=true;
            }else if ($("input:radio:checked").val().toString()=="0"){
                isForeign=false;
            }

            // if(!checkPhone.test(this.value)||!checkIdNum.test(this.value)||!checkEmail.test(this.value)){
            //     return false;
            // }
            // 提交数据时的加载层 （https://layer.layui.com/）
            var index = top.layer.msg("数据提交中,请稍后...",{
                icon:16, // 图标
                time:false, // 不关闭
                shade:0.8 // 设置遮罩的透明度
            });


            // 得到所有的表单元素的值
            var formData = data.field;
            console.log(formData);

            // 请求的地址
            var url = ctx + "/user/addUser?isForeign="+isForeign; // 添加操作


            // 判断用户ID是否为空，如果不为空则为更新操作
            if ($("[name='id']").val()) {
                var uid = $("[name='id']").val();
                // 更新操作
                url = ctx + "/user/updateUser?isForeign="+isForeign+"&uid="+uid;
            }


            $.post(url, formData, function (result) {
                // 判断操作是否执行成功 200=成功
                if (result.code == 200) {
                    // 成功
                    // 提示成功
                    top.layer.msg("操作成功！",{icon:6});
                    // 关闭加载层
                    top.layer.close(index);
                    // 关闭弹出层
                    layer.closeAll("iframe");
                    // 刷新父窗口，重新加载数据
                    parent.location.reload();
                } else {
                    // 失败
                    layer.msg(result.msg, {icon:5});
                }
            });


        // 阻止表单提交
        return false;
    });


    /**
     * 关闭弹出层
     */
    $("#closeBtn").click(function () {
        // 当你在iframe页面关闭自身时
        var index = parent.layer.getFrameIndex(window.name); // 先得到当前iframe层的索引
        parent.layer.close(index); // 再执行关闭
    });



    /**
     * 加载角色下拉框
     *
     * 配置远程搜索, 请求头, 请求参数, 请求类型等
     *
     * formSelects.config(ID, Options, isJson);
     *
     * @param ID        xm-select的值
     * @param Options   配置项
     * @param isJson    是否传输json数据, true将添加请求头 Content-Type: application/json; charset=UTF-8
     */
    var userId = $("[name='id']").val();
    formSelects.config("selectId",{
        type:"post", // 请求方式
        searchUrl: ctx+"/role/queryAllRoles?userId="+userId, // 请求地址
        keyName: 'roleName',  // 下拉框中的文本内容，要与返回的数据中对应key一致
        keyVal: 'id'
    }, true);
    
});