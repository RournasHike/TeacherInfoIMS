<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>教研室教师信息管理系统主页</title>
    <script src="${ctx}/js/jquery-3.4.1/jquery-3.4.1.min.js" charset="utf-8"></script>
    <#include "common.ftl">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-bg-blue layui-header header" style="color: #33B5E5">
        <div class="layui-logo">
            <a href="#">
                <img src="${ctx}/images/icon/u=3753573608,1104434705&fm=26&gp=0.jpg" class="layui-nav-img">
            </a>
        </div>
        <a>
            <div class="layuimini-tool"><i title="展开" class="fa fa-outdent" data-side-fold="1"></i></div>
        </a>
        <div class="layui-nav" style="float: left;margin-left: 300px;margin-top: 15px;">
            <a href="#">
                <span style="color: #323232;font-family: 'Adobe Arabic';font-size: 28px;font-weight: bolder;color: #FFFFFF">高校教研室教师信息管理系统</span>
            </a>
        </div>

        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="${ctx}/images/icon/1.png" class="layui-nav-img">
                    ${(user.userTrueName)!""}
                </a>
                <dl class="layui-nav-child">
                    <#if permissionList?seq_contains("1010")>
                        <dd>
                            <a href="javascript:;" data-iframe-tab="${ctx}/user/toTeacherInfoPage" data-title="基本资料" data-icon="fa fa-gears">基本资料</a>
                        </dd>
                    </#if>
                    <#if permissionList?seq_contains("1020")>
                        <dd>
                            <a href="javascript:;" data-iframe-tab="${ctx}/user/toUpdatePasswordPage" data-title="修改密码" data-icon="fa fa-gears">修改密码</a>
                        </dd>
                    </#if>
                    <#if permissionList?seq_contains("1030")>
                        <dd>
                            <a href="javascript:;" class="login-out">退出登录</a>
                        </dd>
                    </#if>
                </dl>
            </li>
            <li class="layui-nav-item layuimini-select-bgcolor mobile layui-hide-xs" lay-unselect>
                <a href="javascript:;"></a>
            </li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll layui-left-menu">
            <#-- 判断当前登录用户是否拥有权限 -->
            <#--<#if permissions??>-->
                <ul class="layui-nav layui-nav-tree layui-left-nav-tree layui-this" id="currency">
                    <#-- 通过freemarker中的seq_contains内建指令判断菜单是否显示 -->
                    <#if permissionList?seq_contains("2000")>
                        <li class="layui-nav-item">

                            <a href="javascript:;" class="layui-menu-tips"><i class="fa fa-street-view"></i><span class="layui-left-nav"> 教师基本信息管理</span> <span class="layui-nav-more"></span></a>

                            <dl class="layui-nav-child">
                                    <dd>
                                        <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-1" data-tab="tea/teaInfo" target="_self"><i class="fa fa-info"></i><span class="layui-left-nav"> 教师信息</span></a>
                                    </dd>
                            </dl>
                        </li>
                    </#if>
                    <#--<#if permissionList?seq_contains("3000")>
                        <li class="layui-nav-item">
                            <a href="javascript:;" class="layui-menu-tips"><i class="fa fa-desktop"></i><span class="layui-left-nav"> 审核管理</span> <span class="layui-nav-more"></span></a>
                            <dl class="layui-nav-child">
                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-5" data-tab="project/auditProjectListPage" target="_self"><i class="fa fa-tachometer"></i><span class="layui-left-nav"> 科研项目审核管理</span></a>
                                </dd>
                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-6" data-tab="paper/auditPaperListPage" target="_self"><i class="fa fa-tachometer"></i><span class="layui-left-nav"> 论文审核管理</span></a>
                                </dd>
                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-7" data-tab="search/auditResearchListPage" target="_self"><i class="fa fa-tachometer"></i><span class="layui-left-nav"> 研究课题审核管理</span></a>
                                </dd>
                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-8" data-tab="patent/auditPatentListPage" target="_self"><i class="fa fa-tachometer"></i><span class="layui-left-nav"> 专利审核管理</span></a>
                                </dd>
                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-9" data-tab="honor/auditHonorListPage" target="_self"><i class="fa fa-tachometer"></i><span class="layui-left-nav"> 获奖审核管理</span></a>
                                </dd>
                            </dl>
                        </li>
                    </#if>-->
                    <#if permissionList?seq_contains("9000")>
                        <li class="layui-nav-item">
                            <a href="javascript:;" class="layui-menu-tips"><i class="fa fa-gears"></i><span class="layui-left-nav"> 系统管理</span> <span class="layui-nav-more"></span></a><dl class="layui-nav-child">
                                <#if permissionList?seq_contains("9010")>
                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-10" data-tab="user/listPage" target="_self"><i class="fa fa-user"></i><span class="layui-left-nav"> 用户管理</span></a>
                                </dd>
                                </#if>
                                <#if permissionList?seq_contains("9020")>
                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-10" data-tab="role/listPage" target="_self"><i class="fa fa-address-book"></i><span class="layui-left-nav"> 角色管理</span></a>
                                </dd>
                                </#if>
                                <#--<#if permissionList?seq_contains("9030")>
                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-10" data-tab="module/listPage" target="_self"><i class="fa fa-key"></i><span class="layui-left-nav"> 菜单管理</span></a>
                                </dd>
                                </#if>
                                <#if permissionList?seq_contains("9040")>
                                    <dd>
                                        <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-10" data-tab="dict/listPage" target="_self"><i class="fa fa-book"></i><span class="layui-left-nav"> 数据字典管理</span></a>
                                    </dd>
                                </#if>-->
                            </dl>
                        </li>
                    </#if>
                    <#--<#if permissionList?seq_contains("4000")>
                        <li class="layui-nav-item">
                            <a href="javascript:;" class="layui-menu-tips"><i class="fa fa-flag"></i><span class="layui-left-nav"> 项目管理</span> <span class="layui-nav-more"></span></a><dl class="layui-nav-child">

                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-3" data-tab="project/apply" target="_self"><i class="fa fa-exchange"></i><span class="layui-left-nav"> 项目申请</span></a>
                                </dd>

                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-4" data-tab="project/list" target="_self"><i class="fa fa-paper-plane"></i><span class="layui-left-nav"> 项目列表</span></a>
                                </dd>

                            </dl>
                        </li>
                    </#if>-->
                    <#--<#if permissionList?seq_contains("5000")>
                        <li class="layui-nav-item">
                            <a href="javascript:;" class="layui-menu-tips"><i class="fa fa-flag"></i><span class="layui-left-nav"> 论文管理</span> <span class="layui-nav-more"></span></a><dl class="layui-nav-child">

                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-3" data-tab="paper/apply" target="_self"><i class="fa fa-exchange"></i><span class="layui-left-nav"> 论文申报</span></a>
                                </dd>

                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-4" data-tab="paper/list" target="_self"><i class="fa fa-paper-plane"></i><span class="layui-left-nav"> 论文列表</span></a>
                                </dd>

                            </dl>
                        </li>
                    </#if>-->
                    <#--<#if permissionList?seq_contains("6000")>

                        <li class="layui-nav-item">
                            <a href="javascript:;" class="layui-menu-tips"><i class="fa fa-flag"></i><span class="layui-left-nav"> 专利管理</span> <span class="layui-nav-more"></span></a><dl class="layui-nav-child">

                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-3" data-tab="patent/apply" target="_self"><i class="fa fa-exchange"></i><span class="layui-left-nav"> 专利申请</span></a>
                                </dd>

                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-4" data-tab="patent/list" target="_self"><i class="fa fa-paper-plane"></i><span class="layui-left-nav"> 专利列表</span></a>
                                </dd>

                            </dl>
                        </li>
                    </#if>-->
                    <#--<#if permissionList?seq_contains("7000")>
                        <li class="layui-nav-item">
                            <a href="javascript:;" class="layui-menu-tips"><i class="fa fa-flag"></i><span class="layui-left-nav"> 获奖管理</span> <span class="layui-nav-more"></span></a><dl class="layui-nav-child">

                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-3" data-tab="honor/apply" target="_self"><i class="fa fa-exchange"></i><span class="layui-left-nav"> 荣誉申报</span></a>
                                </dd>

                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-4" data-tab="honor/list" target="_self"><i class="fa fa-paper-plane"></i><span class="layui-left-nav"> 荣誉列表</span></a>
                                </dd>

                            </dl>
                        </li>
                    </#if>-->
                    <#--<#if permissionList?seq_contains("8000")>
                        <li class="layui-nav-item">
                            <a href="javascript:;" class="layui-menu-tips"><i class="fa fa-flag"></i><span class="layui-left-nav"> 课题研究管理</span> <span class="layui-nav-more"></span></a><dl class="layui-nav-child">
                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-3" data-tab="search/apply" target="_self"><i class="fa fa-exchange"></i><span class="layui-left-nav"> 研究课题申报</span></a>
                                </dd>

                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-4" data-tab="search/list" target="_self"><i class="fa fa-paper-plane"></i><span class="layui-left-nav"> 研究课题列表</span></a>
                                </dd>

                            </dl>
                        </li>
                    </#if>-->

                    <#if permissionList?seq_contains("11000")>
                        <li class="layui-nav-item">
                            <a href="javascript:;" class="layui-menu-tips"><i class="fa fa-flag"></i><span class="layui-left-nav"> 课时管理</span> <span class="layui-nav-more"></span></a><dl class="layui-nav-child">
                                <#--<#if permissionList?seq_contains("11010")>
                                    <dd>
                                        <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-3" data-tab="classHour/apply" target="_self"><i class="fa fa-exchange"></i><span class="layui-left-nav"> 课时申请</span></a>
                                    </dd>
                                </#if>-->
                                <#if permissionList?seq_contains("11020")>
                                    <dd>
                                        <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-4" data-tab="classHour/summary" target="_self"><i class="fa fa-paper-plane"></i><span class="layui-left-nav"> 课时统计</span></a>
                                    </dd>
                                </#if>
                                <#if permissionList?seq_contains("11030")>
                                    <dd>
                                        <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-4" data-tab="classHour/query" target="_self"><i class="fa fa-paper-plane"></i><span class="layui-left-nav"> 课时查询</span></a>
                                    </dd>
                                </#if>
                                <#--<#if permissionList?seq_contains("11040")>
                                    <dd>
                                        <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-4" data-tab="classHour/auditList" target="_self"><i class="fa fa-paper-plane"></i><span class="layui-left-nav"> 课时审核列表</span></a>
                                    </dd>
                                </#if>-->
                            </dl>
                        </li>
                    </#if>

                    <#if permissionList?seq_contains("12000")>
                        <li class="layui-nav-item">
                            <a href="javascript:;" class="layui-menu-tips"><i class="fa fa-flag"></i><span class="layui-left-nav"> 课程管理</span> <span class="layui-nav-more"></span></a><dl class="layui-nav-child">
                                <#if permissionList?seq_contains("12010")>
                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-3" data-tab="course/query" target="_self"><i class="fa fa-exchange"></i><span class="layui-left-nav"> 课程查询</span></a>
                                </dd>
                                </#if>
                                <#if permissionList?seq_contains("12020")>
                                <dd>
                                    <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-4" data-tab="course/list" target="_self"><i class="fa fa-paper-plane"></i><span class="layui-left-nav"> 课程列表</span></a>
                                </dd>
                                </#if>
                            </dl>
                        </li>
                    </#if>

                    <#if permissionList?seq_contains("13000")>
                        <li class="layui-nav-item">
                            <a href="javascript:;" class="layui-menu-tips"><i class="fa fa-flag"></i><span class="layui-left-nav"> 授课管理</span> <span class="layui-nav-more"></span></a><dl class="layui-nav-child">
                                <#if permissionList?seq_contains("13010")>
                                    <dd>
                                        <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-3" data-tab="teach/assign" target="_self"><i class="fa fa-exchange"></i><span class="layui-left-nav"> 授课分配(排课)</span></a>
                                    </dd>
                                </#if>
                                <#--<#if permissionList?seq_contains("13020")>
                                    <dd>
                                        <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-4" data-tab="teach/apply" target="_self"><i class="fa fa-paper-plane"></i><span class="layui-left-nav"> 授课申请</span></a>
                                    </dd>
                                </#if>-->
                                <#if permissionList?seq_contains("13030")>
                                    <dd>
                                        <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-4" data-tab="teach/query" target="_self"><i class="fa fa-paper-plane"></i><span class="layui-left-nav"> 授课查询</span></a>
                                    </dd>
                                </#if>
                                <#if permissionList?seq_contains("13040")>
                                    <dd>
                                        <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-4" data-tab="teach/teachListPage" target="_self"><i class="fa fa-paper-plane"></i><span class="layui-left-nav"> 授课列表</span></a>
                                    </dd>
                                </#if>
                            </dl>
                        </li>
                    </#if>

                    <#if permissionList?seq_contains("14000")>
                        <li class="layui-nav-item">
                            <a href="javascript:;" class="layui-menu-tips"><i class="fa fa-flag"></i><span class="layui-left-nav"> 课表管理</span> <span class="layui-nav-more"></span></a><dl class="layui-nav-child">
                                <#if permissionList?seq_contains("14010")>
                                    <dd>
                                        <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-3" data-tab="schedule/query" target="_self"><i class="fa fa-exchange"></i><span class="layui-left-nav"> 课表查询</span></a>
                                    </dd>

                                </#if>

                                <#if permissionList?seq_contains("14020")>
                                    <dd>
                                        <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-3" data-tab="schedule/querys" target="_self"><i class="fa fa-exchange"></i><span class="layui-left-nav"> 我的课表</span></a>
                                    </dd>
                                </#if>
                            </dl>
                        </li>
                    </#if>


                    <span class="layui-nav-bar" style="top: 201px; height: 0px; opacity: 0;"></span>
                </ul>
            <#--</#if>-->
        </div>
    </div>

    <div class="layui-body">
        <div class="layui-tab" lay-filter="layuiminiTab" id="top_tabs_box">
            <ul class="layui-tab-title" id="top_tabs">
                <li class="layui-this" id="layuiminiHomeTabId" lay-id="welcome"><i class="fa fa-home"></i> <span>欢迎页</span></li>
            </ul>

            <div class="layui-tab-content clildFrame">
                <div id="layuiminiHomeTabIframe" class="layui-tab-item layui-show">
                </div>
            </div>
        </div>

    </div>
</div>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });

</script>
<script type="text/javascript" src="${ctx}/js/main.js"></script>
</body>
</html>