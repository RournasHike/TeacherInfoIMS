layui.use(['table','layer',"form"],function(){
    var layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        table = layui.table,
        form = layui.form;

    // 客户列表展示
    var  tableIns = table.render({
        elem: '#searchList',
        url : ctx+'/search/reseachList',
        cellMinWidth : 95,
        page : true,
        height : "full-125",
        limits : [10,15,20,25],
        limit : 10,
        toolbar: "#toolbarDemo",
        id : "searchList",
        cols : [[
            {type: "checkbox", fixed:"center"},
            {field: "id", title:'课题id',fixed:"true"},
            {field: 'researchTitle', title: '研究课题名称',align:"center"},
            {field: 'teacherName', title: '教师姓名',  align:'center'},
            {field: 'retype', title: '研究类别', align:'center'},
            {field: 'scontent', title: '主要研究内容', align:'center'},
            {field: 'starttime', title: '开题时间',  align:'center'},
            {field: 'endtime', title: '结束时间',  align:'center'},
            {field: 'restate', title: '课题状态',  align:'center'},
            {title:'操作',templet:'#searchListBar', fixed: 'right', align:'center', minWidth:300}
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
    table.on('tool(searchList)', function (data) {

        if (data.event == "edit") { // 更新客户信息

            console.log(data.data)
            // 打开添加/修改客户信息的对话框
            openAddOrUpdateSearchDialog(data.data.id);

        } else if (data.event == "searchDetail") { // 删除客户信息

            // 删除客户
            openSearchDialog(data.data.id);
        }

    });



    /**
     * 打开添加/修改客户信息的对话框
     */
    function openAddOrUpdateSearchDialog(id) {
        var title = "<h3>研究课题信息管理 - 添加研究课题信息</h3>";
        var url = ctx + "/search/toAddOrUpdateSearchPage";

        // 判断id是否为空 （如果不为空，则为更新操作）
        if (id != null && id != '') {
            title = "<h3>研究课题信息管理 - 更新研究课题信息</h3>";
            url = ctx + "/search/toAddOrUpdateSearchPage?id="+id;
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
    function openSearchDialog(data) {
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
            title: "<h3>研究课题信息管理 - 查看研究课题详细信息</h3>",
            // 宽高
            area: ['700px', '500px'],
            // url地址
            content: ctx + "/search/toSearchDetail?id=" + data,
            // 可以最大化与最小化
            maxmin:true
        });

    }


});
