layui.use(['table','layer',"form"],function(){
    var layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        table = layui.table,
        form = layui.form;

    // 客户列表展示
    var  tableIns = table.render({
        elem: '#classHourList',
        url : ctx+'/classHour/teacherClassHourList',
        cellMinWidth : 95,
        page : true,
        height : "full-125",
        limits : [10,15,20,25],
        limit : 10,
        toolbar: "#toolbarDemo",
        id : "classHourList",
        cols : [[
            {type: "checkbox", fixed:"center"},
            {field: "courseNo", title:'课程编号',fixed:"true"},
            {field: 'courseName', title: '课程名称',align:"center"},
            {field: 'teachClassHour', title: '讲授学时',  align:'center'},
            {field: 'experimentClassHour', title: '实验学时', align:'center'},
            {field: 'computerClassHour', title: '上机学时', align:'center'},
            {field: 'otherClassHour', title: '其他学时', align:'center'},
            {field: 'credit', title: '学分', align:'center'},
            {field: 'weekClassHour', title: '周学时', align:'center'},
            {field: 'prescribedClassHour', title: '理论学时', align:'center'},
            {field: 'actualClassHour', title: '实际学时', align:'center'}
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
                teacherName: $("[name='teacherName']").val() // 客户名称
                ,classYear: $("[name='classYear']").val() // 客户编号
                ,classTerm:$("[name='classTerm']").val() // 客户级别
            }
            ,page: {
                curr: 1 // 重新从第 1 页开始
            }
        });

    });





});
