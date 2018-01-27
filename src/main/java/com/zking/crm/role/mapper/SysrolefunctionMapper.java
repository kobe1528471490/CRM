package com.zking.crm.role.mapper;

import com.zking.crm.role.model.Sysrolefunction;

public interface SysrolefunctionMapper {
    int deleteByPrimaryKey(Long rfId);

    int insert(Sysrolefunction record);

    int insertSelective(Sysrolefunction record);

    Sysrolefunction selectByPrimaryKey(Long rfId);

    int updateByPrimaryKeySelective(Sysrolefunction record);

    int updateByPrimaryKey(Sysrolefunction record);
}