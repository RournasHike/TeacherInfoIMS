layui.use(['table','layer',"form"],function(){
    var layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        table = layui.table,
        form = layui.form;

    // 客户列表展示
    var  tableIns = table.render({
        elem: '#projectList',
        url : ctx+'/project/projectList',
        cellMinWidth : 95,
        page : true,
        height : "full-125",
        limits : [10,15,20,25],
        limit : 10,
        toolbar: "#toolbarDemo",
        id : "projectList",
        cols : [[
            {type: "checkbox", fixed:"center"},
            {field: "pid", title:'编号',fixed:"true"},
            {field: 'pno', title: '项目编号',align:"center"},
            {field: 'pname', title: '项目名称',  align:'center'},
            {field: 'teacherName', title: '教师姓名', align:'center'},
            {field: 'pfunds', title: '项目经费',  align:'center'},
            {field: 'participants', title: '参与人',  align:'center'},
            {field: 'pstatime', title: '立项时间',  align:'center'},
            {field: 'pendtime', title: '结项时间',  align:'center'},
            {field: 'psource', title: '项目来源',  align:'center'},
            {field: 'result', title: '科研项目成果形式',  align:'center'},
            {title:'操作',templet:'#projectListBar', fixed: 'right', align:'center', minWidth:300}
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
    table.on('tool(projectList)', function (data) {

        if (data.event == "edit") { // 更新客户信息

            console.log(data.data)
            // 打开添加/修改客户信息的对话框
            openAddOrUpdateProjectDialog(data.data.pid);

        } else if (data.event == "projectDetail") { // 删除客户信息

            // 查看项目详情
            openProjectDetailDialog(data.data.pid);
        }

    });



    /**
     * 打开添加/修改项目信息的对话框
     */
    function openAddOrUpdateProjectDialog(id) {
        var title = "<h3>项目信息管理 - 修改项目信息</h3>";
        var url = ctx + "/project/toAddOrUpdateProjectPage?pid="+id;


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
    function openProjectDetailDialog(data) {
        // 判断用户是否选择客户
        if (data.length == 0) {
            layer.msg("请选择想要查看的项目！",{icon:5});
            return;
        }
        // 判断用户是否多选
        if (data.length > 1) {
            layer.msg("暂不支持批量查看！",{icon:5});
            return;
        }

        // console.log(data[0].pid);

        // 打开对话框
        layui.layer.open({
            // 类型
            type: 2,
            // 标题
            title: "<h3>项目信息管理 - 查看项目详细信息</h3>",
            // 宽高
            area: ['700px', '500px'],
            // url地址
            content: ctx + "/project/toProjectDetail?proId=" + data,
            // 可以最大化与最小化
            maxmin:true
        });

    }


});
