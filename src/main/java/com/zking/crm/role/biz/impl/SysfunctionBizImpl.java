package com.zking.crm.role.biz.impl;

import com.zking.crm.role.biz.ISysfunctionBiz;
import com.zking.crm.role.mapper.SysfunctionMapper;
import com.zking.crm.role.model.Sysfunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysfunctionBizImpl implements ISysfunctionBiz {

    @Autowired
    private SysfunctionMapper sysfunctionMapper;


    //所有权限
    @Override
    public List<Sysfunction> ls(Sysfunction sysfunction) {
        List<Sysfunction> ls=sysfunctionMapper.ls(sysfunction);
        return ls;
    }



}
