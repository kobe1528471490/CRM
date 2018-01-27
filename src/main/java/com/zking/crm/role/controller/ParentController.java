package com.zking.crm.role.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;

@Controller
public class ParentController {

    private Logger  logger = LoggerFactory.getLogger(ParentController.class);

    //基本的request、response
    public HttpServletRequest request;
    public HttpServletResponse response;

    //授权、认证的对象
    public Subject subject;

    @ModelAttribute
    public void init(Model model, HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.subject = SecurityUtils.getSubject();
        logger.debug("创建的Subject对象为："+subject);
    }


}
