
$(function(){
    //用于保存分组类型的下标对应的ID
    var auth_id_sz = [];
    var auth_id_index = 0;

    //生成左侧树级菜单
    $.ajax({
        type: "post",
        dataType: "json",
        url:"right/get",
        data:{
            apId:1001,
            at:'FOLDER',
        },
        success: function(data){
            $.each(data, function(i, n){
                $("#accordion_div").accordion("add",{
                    title:n.rightText,
                    selected: false,
                /*  iconCls: n.authImage,*/
                    content: "<ul name='accordion_tree_"+n.rightText+"'></ul>"
                });
                auth_id_sz[auth_id_index++] = n.rightCode;
            });
        }
    });


    //获取选中的分类面板
    $("#accordion_div").accordion({
        onSelect:function (title, index) {
            //在其内部生成树
            $("ul[name='accordion_tree_"+title+"']").tree({
                url:"right/tree?apId="+auth_id_sz[index],
                onClick:function (node) {
                    //根据选项卡的“标题”来判断这个选项卡是否存在
                    if("FOLDER"!=node.attributes.authType){
                        var tbas_select=$("#sys_tab").tabs("exists",node.text);
                        //如果存在
                        if(tbas_select){
                            //则直接选中这个选项卡
                            $("#sys_tab").tabs("select",node.text);
                        }
                        //如果不存在
                    else{
                            //生成这个选项卡
                            $("#center_tabs").tabs("add",{
                                title:node.text,
                                fit:true,
                                href:'input/',
                                closable:true,
                            });
                        }
                    }
                }
            });
        }

    });

});