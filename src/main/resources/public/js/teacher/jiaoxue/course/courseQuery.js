layui.use(['table','layer',"form"],function(){
    var layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        table = layui.table,
        form = layui.form;

    // 客户列表展示
    var  tableIns = table.render({
        elem: '#courseList',
        url : ctx+'/course/courseCondList',
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
            {field: 'credit', title: '学分',  align:'center'}
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
                classYear: $("[name='classYear']").val() // 客户编号
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
    table.on('tool(courseList)', function (data) {

        if (data.event == "courseDetail") { // 更新客户信息

            console.log(data.data)
            // 打开添加/修改客户信息的对话框
            openCourseDialog(data.data.id);

        }

    });


    /**
     * 打开指定客户的订单对话框
     * @param data
     */
    function openCourseDialog(data) {
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
            title: "<h3>课程信息管理 - 查看课程详细信息</h3>",
            // 宽高
            area: ['700px', '500px'],
            // url地址
            content: ctx + "/tea/toTeaDetail?teaId=" + data[0].teacherNo,
            // 可以最大化与最小化
            maxmin:true
        });

    }


});
