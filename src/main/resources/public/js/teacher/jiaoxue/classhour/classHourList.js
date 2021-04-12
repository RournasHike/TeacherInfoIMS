layui.use(['table','layer',"form"],function(){
    var layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        table = layui.table,
        form = layui.form;

    // 客户列表展示
    var  tableIns = table.render({
        elem: '#classHourList',
        url : ctx+'/classHour/classHourList',
        cellMinWidth : 95,
        page : true,
        height : "full-125",
        limits : [10,15,20,25],
        limit : 10,
        toolbar: "#toolbarDemo",
        id : "classHourList",
        cols : [[
            {type: "checkbox", fixed:"center"},
            {field: "id", title:'编号',fixed:"true"},
            {field: 'courseNo', title: '课程编号',align:"center"},
            {field: 'courseName', title: '课程姓名',  align:'center'},
            {field: 'sumupClassHour', title: '总学时', align:'center'},
            {field: 'actualSumupClassHour', title: '实际学时', align:'center'},
            {title:'操作',templet:'#classHourListBar', fixed: 'right', align:'center', minWidth:150}
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
                classYear: $("[name='classYear']").val()
                ,classTerm: $("[name='classTerm']").val()
            }
            ,page: {
                curr: 1 // 重新从第 1 页开始
            }
        });

    });





    /**
     * 监听行工具栏
     */
    table.on('tool(classHourList)', function (data) {


        if(data.event=="classHourDetail"){
            openClassHourDialog(data.data.id);
        }

    });


    /**
     * 打开指定客户的订单对话框
     * @param data
     */
    function openClassHourDialog(data) {
        // 判断用户是否选择客户
        if (data.length == 0) {
            layer.msg("请选择想要查看的课时信息！",{icon:5});
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
            title: "<h3>课时信息管理 - 查看课时详细信息</h3>",
            // 宽高
            area: ['700px', '500px'],
            // url地址
            content: ctx + "/classHour/classHourDetail?id=" + data,
            // 可以最大化与最小化
            maxmin:true
        });

    }


});
