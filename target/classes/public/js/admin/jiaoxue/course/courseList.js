layui.use(['table','layer',"form"],function(){
    var layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        table = layui.table,
        form = layui.form;

    // 客户列表展示
    var  tableIns = table.render({
        elem: '#courseList',
        url : ctx+'/course/courseList',
        cellMinWidth : 95,
        page : true,
        height : "full-125",
        limits : [10,15,20,25],
        limit : 10,
        toolbar: "#toolbarDemo",
        id : "courseList",
        cols : [[
            {type: "checkbox", fixed:"center"},
            {field: "id", title:'编号',fixed:"true"},
            {field: 'courseNo', title: '课程编号',align:"center"},
            {field: 'courseName', title: '课程名称',  align:'center'},
            {field: 'courseType', title: '课程类型', align:'center'},
            {field: 'weekClassHour', title: '周学时', align:'center'},
            {field: 'teachClassHour', title: '教授学时',  align:'center'},
            {field: 'experimentClassHour', title: '实验学时',  align:'center'},
            {field: 'computerClassHour', title: '上机学时',  align:'center'},
            {field: 'otherClassHour', title: '其他学时',  align:'center'},
            {field: 'credit', title: '学分',  align:'center'},
            {title:'操作',templet:'#courseListBar', fixed: 'right', align:'center', minWidth:300}
        ]]
    });



    /**
     * 监听头部工具栏
     */
    table.on('toolbar(courseList)', function (data) {

        if (data.event == "add") { // 添加客户信息

            // 打开添加/修改客户信息的对话框
            openAddOrUpdateCourseDialog();

        } else if (data.event == "courseDetail") { // 客户的订单数据查看
            // 获取被选中的数据的相关信息
            console.log(data.config.id);
            var checkStatus = table.checkStatus(data.config.id);
            // 打开客户订单的对话框（传递选中的数据记录）
            openCourseDialog(checkStatus.data[0].id);

        }

    });


    /**
     * 监听行工具栏
     */
    table.on('tool(courseList)', function (data) {

        if (data.event == "edit") { // 更新客户信息

            console.log(data.data.id);
            // 打开添加/修改客户信息的对话框
            openAddOrUpdateCourseDialog(data.data.id);

        } else if (data.event == "del") { // 删除客户信息

            // 删除客户
            deleteCourse(data.data.id);
        } else if (data.event == "courseDetail"){

            //打开课程详情
            openCourseDialog(data.data.id);
        }

    });



    /**
     * 打开添加/修改客户信息的对话框
     */
    function openAddOrUpdateCourseDialog(id) {
        var title = "<h3>课程管理 - 添加课程信息</h3>";
        var url = ctx + "/course/toAddOrUpdateCoursePage";

        // 判断id是否为空 （如果不为空，则为更新操作）
        if (id != null && id != '') {
            title = "<h3>课程管理 - 更新课程信息</h3>";
            url = ctx + "/course/toAddOrUpdateCoursePage?id=" + id;
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
     * 删除指定的客户信息
     * @param id
     */
    function deleteCourse(id) {
        // 弹出确认框，询问用户是否确认删除
        layer.confirm('确定要删除该记录吗？',{icon:3, title:"课程信息管理"}, function (index) {
            // 关闭确认框
            layer.close(index);

            // 发送ajax请求，删除记录
            $.ajax({
                type:"post",
                url:ctx + "/course/deleteCourse",
                data:{
                    id:id
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
    function openCourseDialog(data) {
        // 判断用户是否选择客户
        if (data.length == 0) {
            layer.msg("请选择想要查看的课程！",{icon:5});
            return;
        }
        // 判断用户是否多选
        if (data.length > 1) {
            layer.msg("暂不支持批量查看！",{icon:5});
            return;
        }

        // 打开对话框
        layui.layer.open({
            // 类型
            type: 2,
            // 标题
            title: "<h3>课程管理 - 查看课程详细信息</h3>",
            // 宽高
            area: ['700px', '500px'],
            // url地址
            content: ctx + "/course/toCourseDetail?id=" + data,
            // 可以最大化与最小化
            maxmin:true
        });

    }
});
