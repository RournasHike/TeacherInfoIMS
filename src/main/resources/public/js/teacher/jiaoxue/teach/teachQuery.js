layui.use(['table','layer',"form"],function(){
    var layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        table = layui.table,
        form = layui.form;

    // 客户列表展示
    var  tableIns = table.render({
        elem: '#teachList',
        url : ctx+'/teach/teachCondList',
        cellMinWidth : 95,
        page : true,
        height : "full-125",
        limits : [10,15,20,25],
        limit : 10,
        toolbar: "#toolbarDemo",
        id : "teachList",
        cols : [[
            {type: "checkbox", fixed:"center"},
            {field: "id", title:'编号',fixed:"true"},
            {field: 'courseName', title: '课程名称',  align:'center'},
            {field: 'teacherName', title: '教师姓名',  align:'center'},
            {field: 'teachRoomName', title: '授课地点', align:'center'},
            {field: 'teachType', title: '授课方式', align:'center'},
            {field: 'teachClassYear', title: '授课学年',  align:'center'},
            {field: 'teachClassTerm', title: '授课学期',  align:'center'},
            {field: 'teachGrade', title: '授课年级',  align:'center'},
            {field: 'teachMajor', title: '授课专业',  align:'center'}
        ]]
    });


    /**
     * 搜索按钮的点击事件
     */
    $(".search_btn").click(function () {

        /**
         * 表格重载
         *  多条件查询
         */
        tableIns.reload({
            // 设置需要传递给后端的参数
            where: { //设定异步数据接口的额外参数，任意设
                // 通过文本框，设置传递的参数
                // 通过文本框，设置传递的参数
                teacherName:$("[name='teacherName']").val()
                ,classYear: $("[name='classYear']").val() // 客户编号
                ,classTerm:$("[name='classTerm']").val() // 客户级别
            }
            ,page: {
                curr: 1 // 重新从第 1 页开始
            }
        });

    });



    /**
     * 监听行工具栏
     */
    table.on('tool(teachList)', function (data) {

        if (data.event == "edit") { // 更新客户信息

            console.log(data.data)
            // 打开添加/修改客户信息的对话框
            openAddOrUpdateTeaDialog(data.data.teacherNo);

        } else if (data.event == "del") { // 删除客户信息

            // 删除客户
            deleteCustomer(data.data.teacherNo);
        }

    });



    /**
     * 打开添加/修改客户信息的对话框
     */
    function openAddOrUpdateTeaDialog(id) {
        var title = "<h3>教师信息管理 - 添加教师信息</h3>";
        var url = ctx + "/tea/toAddOrUpdateTeaPage";

        // 判断id是否为空 （如果不为空，则为更新操作）
        if (id != null && id != '') {
            title = "<h3>教师信息管理 - 更新教师信息</h3>";
            url = ctx + "/tea/toAddOrUpdateTeaPage?teaId="+id;
        }

        // iframe层
        layui.layer.open({
            // 类型
            type: 2,
            // 标题
            title: title,
            // 宽高
            area: ['700px', '500px'],
            // url地址
            content: url,
            // 可以最大化与最小化
            maxmin:true
        });
    }

    /**
     * 删除指定的客户信息
     * @param id
     */
    function deleteCustomer(id) {
        // 弹出确认框，询问用户是否确认删除
        layer.confirm('确定要删除该记录吗？',{icon:3, title:"教师信息管理"}, function (index) {
            // 关闭确认框
            layer.close(index);

            // 发送ajax请求，删除记录
            $.ajax({
                type:"post",
                url:ctx + "/tea/deleteTeacher",
                data:{
                    teacherNo:id
                },
                success:function (result) {
                    // 判断删除结果
                    if (result.code == 200) {
                        // 提示成功
                        layer.msg("删除成功！",{icon:6});
                        // 刷新表格
                        tableIns.reload();
                    } else {
                        // 提示失败
                        layer.msg(result.msg, {icon:5});
                    }
                }
            });
        });
    }

    /**
     * 打开指定客户的订单对话框
     * @param data
     */
    function openTeaDialog(data) {
        // 判断用户是否选择客户
        if (data.length == 0) {
            layer.msg("请选择想要查看的教师！",{icon:5});
            return;
        }
        // 判断用户是否多选
        if (data.length > 1) {
            layer.msg("暂不支持批量查看！",{icon:5});
            return;
        }

        console.log(data[0].teacherNo);

        // 打开对话框
        layui.layer.open({
            // 类型
            type: 2,
            // 标题
            title: "<h3>教师信息管理 - 查看教师详细信息</h3>",
            // 宽高
            area: ['700px', '500px'],
            // url地址
            content: ctx + "/tea/toTeaDetail?teaId=" + data[0].teacherNo,
            // 可以最大化与最小化
            maxmin:true
        });

    }


});
