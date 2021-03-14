layui.use(['table', 'treetable'], function () {
    var $ = layui.jquery;
    var table = layui.table;
    var treeTable = layui.treetable;

    // 渲染表格
    treeTable.render({
        treeColIndex: 1,
        treeSpid: 0,
        treeIdName: 'id',
        treePidName: 'parentId',
        elem: '#dict-table',
        url: ctx+'/dict/list',
        toolbar: "#toolbarDemo",
        treeDefaultClose:true,
        page: true,
        cols: [[
            {type: 'numbers'},
            {field: 'field', minWidth: 100, title: '字段名称'},
            {field: 'val', title: '字段值'},
            {field: 'dictDesc', title: '字段值含义'},
            {field: 'isValid', width: 80, align: 'center', templet: function (d) {
                    if (d.isValid == false) {
                        return '<span class="layui-badge layui-bg-blue">无效</span>';
                    }
                    if(d.isValid == true){
                        return '<span class="layui-badge-rim">有效</span>';
                    }
                },
                title: '是否有效'},
            {field: 'parentId', title: '数据字典父编号'},
            {field: 'createTime', title: '创建时间'},
            {field: 'updateTime', title: '更新时间'},
            {templet: '#auth-state', width: 300, align: 'center', title: '操作'}
        ]],
        done: function () {
            layer.closeAll('loading');
        }
    });

    /**
     * 监听头部工具栏
     */
    table.on('toolbar(dict-table)', function (data) {
        // 判断lay-event属性
        if (data.event == "expand") {
            // 全部展开
            treeTable.expandAll("#dict-table");

        } else if (data.event == "fold") {

            treeTable.foldAll("#dict-table");

        } else if (data.event == "add") {
            // 添加目录 层级=0 父菜单=-1
            openAddModuleDialog(1,0)
        }
    });

    /**
     * 监听行工具栏
     */
    table.on('tool(dict-table)',function (data) {
        // 判断lay-event属性
        if (data.event == "add") {
            // 添加子项

            openAddModuleDialog(0, data.data.id);

        } else if (data.event == "edit") {
            // 修改资源
            openUpdateModuleDialog(data.data.id);

        } else if (data.event == "del") {
            // 删除资源
            deleteModule(data.data.id,data.data.parentId);
        }
    });


    /**
     * 打开添加资源的对话框
     * @param grade 层级
     * @param parentId 父菜单ID
     */
    function openAddModuleDialog(isDict, parentId) {
        var title = "<h3>字典管理 - 添加字典</h3>";
        var url = ctx + "/dict/toAddDictPage?parentId=" + parentId+"&isDict="+isDict;

        layui.layer.open({
            type:2,
            title:title,
            content:url,
            area:["700px","450px"],
            maxmin:true
        });
    }

    /**
     * 打开修改资源的对话框
     * @param id
     */
    function openUpdateModuleDialog(id) {
        var title = "<h3>字典管理 - 修改字典</h3>";
        var url = ctx + "/dict/toUpdateDictPage?id=" + id;

        layui.layer.open({
            type:2,
            title:title,
            content:url,
            area:["700px","450px"],
            maxmin:true
        });
    }

    /**
     * 删除资源
     * @param id
     */
    function deleteModule(id,parentId) {
        // 弹出确认框询问用户是否确认删除
        layer.confirm('您确认删除该记录吗？',{icon:3, title:"资源管理"}, function (data) {
            // 如果确认删除，则发送ajax请求
            $.post(ctx+ "/dict/delete",{id:id,parentId:parentId},function (result) {
                // 判断是否成功
                if (result.code == 200) {
                    layer.msg("删除成功！",{icon:6});
                    // 刷新页面
                    window.location.reload();
                } else {
                    layer.msg(result.msg,{icon:5});
                }
            });
        });
    }
    
});