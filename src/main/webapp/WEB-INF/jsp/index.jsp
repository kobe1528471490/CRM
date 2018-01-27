
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>


<head>
    <%@include file="/common/head.jsp"%>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="copyright" content="All Rights Reserved, Copyright (C) 2013, Wuyeguo, Ltd." />
    <title>EasyUI Web Admin Power by Wuyeguo</title>
    <link rel="stylesheet" type="text/css" href="easyui/1.3.4/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="css/wu.css" />
    <link rel="stylesheet" type="text/css" href="css/icon.css" />
    <script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="easyui/1.3.4/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="easyui/1.3.4/locale/easyui-lang-zh_CN.js"></script>
        <script type="text/javascript">
            function fun_exit(){
                if(confirm('确定退出登录?')){
                    location.href="input/login";
                }
            }
        </script>


</head>
<body class="easyui-layout">
<!-- begin of header -->
<div class="wu-header" data-options="region:'north',border:false,split:true">
    <div class="wu-header-left">
        <h1>客  户  关  系  管  理  系  统</h1>
    </div>
    <div class="wu-header-right">
        <p><strong class="easyui-tooltip" title="2条未读消息">${usrname}</strong>，欢迎您！</p>
        <p><a href="input/index">网站首页</a>|<a href="#">支持论坛</a>|<a href="#">帮助中心</a>|<a href="javascript:fun_exit()">安全退出</a></p>
    </div>
</div>
<!-- end of header -->
<!-- begin of sidebar -->
<div class="wu-sidebar" data-options="region:'west',split:true,border:true,title:'客户关系管理系统'">
    <div id="accordion_div" class="easyui-accordion" data-options="border:false,fit:true">

            <ul id="center_tabs"class="easyui-tree wu-side-tree">
               <%-- <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="input/layout-2" iframe="0">菜单导航</a></li>
                <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="input/layout-3" iframe="0">客户信息管理</a></li>
                <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="input/layout-5" iframe="0">客户流失管理</a></li>
                <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-book" data-link="input/layout-3" iframe="0">客户服务管理</a></li>--%>
            </ul>


           <script type="text/javascript" src="easyui/js/left.js"></script>




      <%--  <div title="权限管理" data-options="iconCls:'icon-application-form-edit'" style="padding:5px;">
            <ul class="easyui-tree wu-side-tree">
                <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="layout-3" iframe="0">导航标题</a></li>
                <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="input/layout-3" iframe="0">导航标题</a></li>
                <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="input/layout-3" iframe="0">导航标题</a></li>
                <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-book" data-link="input/layout-3" iframe="0">导航标题</a></li>
                <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-cog" data-link="input/layout-3" iframe="0">导航标题</a></li>
                <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" data-icon="icon-application-osx-error" data-link="input/layout-3" iframe="0">导航标题</a></li>
            </ul>
        </div>
        <div title="销售机会管理" data-options="iconCls:'icon-creditcards'" style="padding:5px;">
            <ul class="easyui-tree wu-side-tree">
                <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="layout-3" iframe="0">导航标题</a></li>
                <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="input/layout-3" iframe="0">导航标题</a></li>
                <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="input/layout-3" iframe="0">导航标题</a></li>
                <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-book" data-link="input/layout-3" iframe="0">导航标题</a></li>
                <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-cog" data-link="input/layout-3" iframe="0">导航标题</a></li>
                <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" data-icon="icon-application-osx-error" data-link="input/layout-3" iframe="0">导航标题</a></li>
            </ul>
        </div>
        <div title="数据字典管理" data-options="iconCls:'icon-cart'" style="padding:5px;">
            <ul class="easyui-tree wu-side-tree">
                <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="layout-3" iframe="0">导航标题</a></li>
                <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="input/layout-3" iframe="0">导航标题</a></li>
                <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="input/layout-3" iframe="0">导航标题</a></li>
                <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-book" data-link="input/layout-3" iframe="0">导航标题</a></li>
                <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-cog" data-link="input/layout-3" iframe="0">导航标题</a></li>
                <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" data-icon="icon-application-osx-error" data-link="input/layout-3" iframe="0">导航标题</a></li>
            </ul>
        </div>--%>


    </div>
</div>
<!-- end of sidebar -->
<!-- begin of main -->
<div class="wu-main" data-options="region:'center'">
    <div id="wu-tabs" class="easyui-tabs" data-options="border:false,fit:true">
        <div title="首页" data-options="href:'input/layout-4',closable:false,iconCls:'icon-tip',cls:'pd3'"></div>
    </div>
</div>
<!-- end of main -->
<!-- begin of footer -->
<div class="wu-footer" data-options="region:'south',border:true,split:true">
    &copy; 2013 Wu All Rights Reserved
</div>
<!-- end of footer -->
<script type="text/javascript">
    $(function(){
        $('.wu-side-tree a').bind("click",function(){
            var title = $(this).text();
            var url = $(this).attr('data-link');
            var iconCls = $(this).attr('data-icon');
            var iframe = $(this).attr('iframe')==1?true:false;
            addTab(title,url,iconCls,iframe);
        });
    })


    /**
     * Name 载入树形菜单
     */
    $('#wu-side-tree').tree({
        url:'temp/menu.php',
        cache:false,
        onClick:function(node){
            var url = node.attributes['url'];
            if(url==null || url == ""){
                return false;
            }
            else{
                addTab(node.text, url, '', node.attributes['iframe']);
            }
        }
    });

    /**
     * Name 选项卡初始化
     */
    $('#wu-tabs').tabs({
        tools:[{
            iconCls:'icon-reload',
            border:false,
            handler:function(){
                $('#wu-datagrid').datagrid('reload');
            }
        }]
    });

    /**
     * Name 添加菜单选项
     * Param title 名称
     * Param href 链接
     * Param iconCls 图标样式
     * Param iframe 链接跳转方式（true为iframe，false为href）
     */
    function addTab(title, href, iconCls, iframe){
        var tabPanel = $('#wu-tabs');
        if(!tabPanel.tabs('exists',title)){
            var content = '<iframe scrolling="auto" frameborder="0"  src="'+ href +'" style="width:100%;height:100%;"></iframe>';
            if(iframe){
                tabPanel.tabs('add',{
                    title:title,
                    content:content,
                    iconCls:iconCls,
                    fit:true,
                    cls:'pd3',
                    closable:true
                });
            }
            else{
                tabPanel.tabs('add',{
                    title:title,
                    href:href,
                    iconCls:iconCls,
                    fit:true,
                    cls:'pd3',
                    closable:true
                });
            }
        }
        else
        {
            tabPanel.tabs('select',title);
        }
    }
    /**
     * Name 移除菜单选项
     */
    function removeTab(){
        var tabPanel = $('#wu-tabs');
        var tab = tabPanel.tabs('getSelected');
        if (tab){
            var index = tabPanel.tabs('getTabIndex', tab);
            tabPanel.tabs('close', index);
        }
    }
</script>
</body>

