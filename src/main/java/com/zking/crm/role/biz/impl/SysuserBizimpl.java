package com.zking.crm.role.biz.impl;

import com.zking.crm.role.biz.ISysuserBiz;
import com.zking.crm.role.mapper.SysuserMapper;
import com.zking.crm.role.model.Sysuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysuserBizimpl implements ISysuserBiz {


    @Autowired
    private SysuserMapper sysuserMapper;



    //用户登录
    @Override
    public Sysuser logins(Sysuser sysuser) {
        return sysuserMapper.logins(sysuser);
    }




}
