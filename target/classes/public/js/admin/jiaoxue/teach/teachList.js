layui.use(['table','layer',"form"],function(){
    var layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        table = layui.table,
        form = layui.form;

    // 客户列表展示
    var  tableIns = table.render({
        elem: '#teachList',
        url : ctx+'/teach/teachList',
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
            {field: "sid", title:'课表编号',fixed:"true"},
            {field: "courseName", title:'课程名称',fixed:"true"},
            {field: 'teacherName', title: '教师姓名',align:"center"},
            {field: 'teachClassYear', title: '教学学年',  align:'center'},
            {field: 'teachClassTerm', title: '教学学期', align:'center'},
            {field: 'teachGrade', title: '授课年级', align:'center'},
            {field: 'teachMajor', title: '授课专业',  align:'center'},
            {field: 'startCollege', title: '开课学院',  align:'center'},
            {field: 'startDept', title: '开课系部',  align:'center'},
            {title:'操作',templet:'#teachListBar', fixed: 'right', align:'center', minWidth:300}
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
    table.on('tool(teachList)', function (data) {

        if (data.event == "edit") { // 更新客户信息

            // console.log(data.data.hid);
            // 打开添加/修改客户信息的对话框
            openAddOrUpdateTeachDialog(data.data.id,data.data.sid);

        } else if (data.event == "del") { // 删除客户信息

            // 删除客户
            deleteTeach(data.data.id,data.data.sid);
        }

    });


    function deleteTeach(id,sid) {
        // 弹出确认框，询问用户是否确认删除
        layer.confirm('确定要删除该记录吗？',{icon:3, title:"授课信息管理"}, function (index) {
            // 关闭确认框
            layer.close(index);

            // 发送ajax请求，删除记录
            $.ajax({
                type:"post",
                url:ctx + "/teach/delTeach",
                data:{
                    id:id,
                    sid:sid
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
     * 打开添加/修改客户信息的对话框
     */
    function openAddOrUpdateTeachDialog(tid,sid) {
        var title = "<h3>授课信息管理 - 更新授课信息</h3>";
        var url = ctx + "/teach/UpdateTeachPage?tid=" + tid+"&sid="+sid;

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
    function openTeachDialog(data) {
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
            title: "<h3>授课信息管理 - 查看授课详细信息</h3>",
            // 宽高
            area: ['700px', '500px'],
            // url地址
            content: ctx + "/teach/toTeachDetail?id=" + data,
            // 可以最大化与最小化
            maxmin:true
        });

    }


});
