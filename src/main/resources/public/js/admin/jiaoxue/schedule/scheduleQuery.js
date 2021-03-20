layui.use(['table','layer',"form"],function(){
    var layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        table = layui.table,
        form = layui.form;

    // 客户列表展示
    var  tableIns = table.render({
        elem: '#teaList',
        url : ctx+'/tea/list',
        cellMinWidth : 95,
        page : true,
        height : "full-125",
        limits : [10,15,20,25],
        limit : 10,
        toolbar: "#toolbarDemo",
        id : "teaList",
        cols : [[
            {field: "tid", title:'编号',fixed:"true"},
            {field: 'teacherNo', title: '教师编号',align:"center"},
            {field: 'teacherName', title: '教师姓名',  align:'center'},
            {field: 'sex', title: '性别', align:'center'},
            {field: 'phone', title: '电话号码', align:'center'},
            {field: 'major', title: '所学专业',  align:'center'},
            {field: 'school', title: '教育背景',  align:'center'},
            {field: 'degree', title: '学历背景',  align:'center'},
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



});
