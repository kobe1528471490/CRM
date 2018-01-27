package com.zking.crm.role.biz.impl;

import com.zking.crm.role.biz.ISysrightBiz;
import com.zking.crm.role.mapper.SysrightMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class SysrightBizImpl implements ISysrightBiz {

    @Autowired
    private SysrightMapper sysrightMapper;


    @Override
    public List<com.zking.crm.role.model.Sysright> selectMap(Map<String, Object> map) {

        List<com.zking.crm.role.model.Sysright> sysrightList=sysrightMapper.selectMap(map);

        return sysrightList;
    }


}
