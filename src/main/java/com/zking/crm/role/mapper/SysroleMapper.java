package com.zking.crm.role.mapper;

import com.zking.crm.role.model.Sysrole;

public interface SysroleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(Sysrole record);

    int insertSelective(Sysrole record);

    Sysrole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(Sysrole record);

    int updateByPrimaryKey(Sysrole record);
}