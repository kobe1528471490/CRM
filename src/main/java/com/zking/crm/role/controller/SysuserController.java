package com.zking.crm.role.controller;
import com.zking.crm.role.biz.ISysuserBiz;
import com.zking.crm.role.model.Sysuser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RequestMapping(value = "/sysuser",method = RequestMethod.POST)
public class SysuserController {

    @Autowired
    private ISysuserBiz iSysuserBiz;


    //一个跳转
    @RequestMapping("/tologin")
    public String tologin(){
        return "index";
    }

    //系统用户登录
    @RequestMapping("/login")
    public String login(@ModelAttribute Sysuser sysuser, HttpServletRequest req, HttpSession session) {

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(sysuser.getUsrName(), sysuser.getUsrPassword());

        // 如果登陆成功
            try{
                //令牌
                subject.login(token);
            }catch (Exception e){
                return "login";
            }
            session.setAttribute("usrname",sysuser.getUsrName());

        return "index";
    }



}
