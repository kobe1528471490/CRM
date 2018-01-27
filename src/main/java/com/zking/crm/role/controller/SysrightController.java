package com.zking.crm.role.controller;


import com.alibaba.fastjson.JSON;
import com.zking.crm.role.biz.ISysrightBiz;
import com.zking.crm.role.model.Sysright;
import com.zking.crm.role.util.AuthTree;
import com.zking.crm.role.util.AuthType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/right",produces = "text/html;charset=utf-8")
public class SysrightController extends ParentController{

    @Autowired
    private ISysrightBiz iSysrightBiz;

    @RequestMapping("/get")
    @ResponseBody
    public String getAuth(@ModelAttribute("apId") String apId,@ModelAttribute("at") String at){
        String s = JSON.toJSONString(getAuthList(apId, at));
        return s;
    }

   @RequestMapping("/tree")
   @ResponseBody
    public String getAuthTree(@ModelAttribute("apId") String apId, @ModelAttribute("at") String at){

        List<Sysright> authList = getAuthList(apId, at);
        String ss=JSON.toJSONString(getAuthTreeList(authList, (String) subject.getPrincipal()));
        return ss;
    }

    //获得一个权限集合
    private List<Sysright> getAuthList(String apId, String at){
        //配置查询参数
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("usrName", subject.getPrincipal());
        map.put("rightType", at);
        map.put("rightParentCode", apId);
        return iSysrightBiz.selectMap(map);
    }


    //将结果集合转换为AuthTree树结构
    private List<AuthTree> getAuthTreeList(List<Sysright> sysrights, String usrname){
        //定义保存权限节点的集合
        List<AuthTree> authTreeList = new ArrayList<AuthTree>(sysrights.size());
        //遍历设置相关参数
        for (Sysright sysright : sysrights) {
            AuthTree authTree = new AuthTree();
            authTree.setId(sysright.getRightCode());
            authTree.setText(sysright.getRightText());
            authTree.setUrl(sysright.getRightUrl());
            /*authTree.setIconCls(sysright.getAuthImage());*/
            //如果其是一个分支的根（文件夹）（表明其权限下还有子权限）
            if (sysright.getRightType().equalsIgnoreCase(AuthType.ROLE+"")){
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("usrname", usrname);
                map.put("rightParentCode", sysright.getRightCode());

                List<Sysright> sysAuthoritiesChild = iSysrightBiz.selectMap(map);
                //进行迭代操作
                authTree.setChildren(getAuthTreeList(sysAuthoritiesChild, usrname));
                //文件夹默认不打开

                authTree.setState("closed");

            }
            authTreeList.add(authTree);
        }
        return authTreeList;
    }








}
