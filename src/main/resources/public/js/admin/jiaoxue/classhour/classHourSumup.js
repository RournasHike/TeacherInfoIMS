layui.use(['table','layer',"form"],function(){
    var layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        table = layui.table,
        form = layui.form;

    // 客户列表展示
    var  tableIns = table.render({
        elem: '#classHourList',
        url : ctx+'/honor/honorList',
        cellMinWidth : 95,
        page : true,
        height : "full-125",
        limits : [10,15,20,25],
        limit : 10,
        toolbar: "#toolbarDemo",
        id : "classHourList",
        cols : [[
            {type: "checkbox", fixed:"center"},
            {field: "hid", title:'编号',fixed:"true"},
            {field: 'hno', title: '荣誉编号',align:"center"},
            {field: 'teacherName', title: '教师姓名',  align:'center'},
            {field: 'hname', title: '荣誉名称', align:'center'},
            {field: 'participants', title: '参与人', align:'center'},
            {field: 'hdate', title: '获奖时间',  align:'center'},
            {field: 'hcompany', title: '颁奖单位',  align:'center'},
            {field: 'hdepartment', title: '授予单位',  align:'center'},
            {title:'操作',templet:'#honorListBar', fixed: 'right', align:'center', minWidth:300}
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
                teacherName: $("[name='name']").val() // 客户名称
                ,collegeId: $("[name='college']").val() // 客户编号
                ,deptId:$("[name='xibu']").val() // 客户级别
            }
            ,page: {
                curr: 1 // 重新从第 1 页开始
            }
        });

    });





    /**
     * 监听行工具栏
     */
    table.on('tool(honorList)', function (data) {

        if (data.event == "edit") { // 更新客户信息

            console.log(data.data.hid);
            // 打开添加/修改客户信息的对话框
            openAddOrUpdateHonorDialog(data.data.hid);

        } else if (data.event == "honorDetail") { // 删除客户信息

            // 删除客户
            openHonorDialog(data.data.hid);
        }

    });



    /**
     * 打开添加/修改客户信息的对话框
     */
    function openAddOrUpdateHonorDialog(id) {
        var title = "<h3>荣誉信息管理 - 添加荣誉信息</h3>";
        var url = ctx + "/honor/toAddOrUpdateHonorPage";

        // 判断id是否为空 （如果不为空，则为更新操作）
        if (id != null && id != '') {
            title = "<h3>荣誉信息管理 - 更新荣誉信息</h3>";
            url = ctx + "/honor/toAddOrUpdateHonorPage?hid=" + id;
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
            maxmin: true
        });
    }

    /**
     * 打开指定客户的订单对话框
     * @param data
     */
    function openHonorDialog(data) {
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

        // console.log(data[0].teacherNo);

        // 打开对话框
        layui.layer.open({
            // 类型
            type: 2,
            // 标题
            title: "<h3>荣誉信息管理 - 查看荣誉详细信息</h3>",
            // 宽高
            area: ['700px', '500px'],
            // url地址
            content: ctx + "/honor/toHonorDetail?hid=" + data,
            // 可以最大化与最小化
            maxmin:true
        });

    }


});
