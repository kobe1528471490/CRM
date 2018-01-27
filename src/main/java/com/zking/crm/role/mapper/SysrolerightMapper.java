package com.zking.crm.role.mapper;

import com.zking.crm.role.model.Sysroleright;

public interface SysrolerightMapper {
    int deleteByPrimaryKey(Long rfId);

    int insert(Sysroleright record);

    int insertSelective(Sysroleright record);

    Sysroleright selectByPrimaryKey(Long rfId);

    int updateByPrimaryKeySelective(Sysroleright record);

    int updateByPrimaryKey(Sysroleright record);
}