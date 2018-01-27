package com.zking.crm.role.controller;


import com.alibaba.fastjson.JSON;
import com.zking.crm.role.biz.ISysfunctionBiz;
import com.zking.crm.role.biz.ISysuserBiz;
import com.zking.crm.role.model.Sysfunction;
import com.zking.crm.role.model.Sysuser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "/sysfunction",method = RequestMethod.POST)
public class SysfunctionController {

    @Autowired
    private ISysfunctionBiz iSysfunctionBiz;


}