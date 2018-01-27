package com.zking.crm.role.mapper;

import com.zking.crm.role.model.Sysfunction;

import java.util.List;

public interface SysfunctionMapper {
    int deleteByPrimaryKey(Long functionId);

    int insert(Sysfunction record);

    int insertSelective(Sysfunction record);

    Sysfunction selectByPrimaryKey(Long functionId);

    int updateByPrimaryKeySelective(Sysfunction record);

    int updateByPrimaryKey(Sysfunction record);

    //获取所有权限
    List<Sysfunction> ls(Sysfunction sysfunction);
}