layui.use(['table','layer',"form"],function(){
    var layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        table = layui.table,
        form = layui.form;

    // 客户列表展示
    var  tableIns = table.render({
        elem: '#patentList',
        url : ctx+'/patent/patentList',
        cellMinWidth : 95,
        page : true,
        height : "full-125",
        limits : [10,15,20,25],
        limit : 10,
        toolbar: "#toolbarDemo",
        id : "patentList",
        cols : [[
            {type: "checkbox", fixed:"center"},
            {field: "patid", title:'编号',fixed:"true"},
            {field: 'patno', title: '专利编号',align:"center"},
            {field: 'patname', title: '专利名称',  align:'center'},
            {field: 'teacherName', title: '发明人', align:'center'},
            {field: 'participants', title: '参与人', align:'center'},
            {field: 'patsn', title: '授权编号',  align:'center'},
            {field: 'patappdate', title: '申请时间',  align:'center'},
            {field: 'patendate', title: '授权时间',  align:'center'},
            {title:'操作',templet:'#patentListBar', fixed: 'right', align:'center', minWidth:300}
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
    table.on('tool(patentList)', function (data) {

        if (data.event == "edit") { // 更新客户信息

            // console.log(data.data)
            // 打开添加/修改客户信息的对话框
            openAddOrUpdatePatentDialog(data.data.patid);

        } else if (data.event == "patentDetail") {

            openPatentDialog(data.data.patid);
        }

    });



    /**
     * 打开添加/修改客户信息的对话框
     */
    function openAddOrUpdatePatentDialog(id) {
        var title = "<h3>专利信息管理 - 添加专利信息</h3>";
        var url = ctx + "/patent/toAddOrUpdatePatentPage";

        // 判断id是否为空 （如果不为空，则为更新操作）
        if (id != null && id != '') {
            title = "<h3>专利信息管理 - 更新专利信息</h3>";
            url = ctx + "/patent/toAddOrUpdatePatentPage?patid="+id;
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
     * 打开指定客户的订单对话框
     * @param data
     */
    function openPatentDialog(data) {
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
            title: "<h3>专利信息管理 - 查看专利详细信息</h3>",
            // 宽高
            area: ['700px', '500px'],
            // url地址
            content: ctx + "/patent/toPatentDetail?patid=" + data,
            // 可以最大化与最小化
            maxmin:true
        });

    }


});
