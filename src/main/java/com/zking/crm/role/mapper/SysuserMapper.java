package com.zking.crm.role.mapper;

import com.zking.crm.role.model.Sysuser;

import java.util.Map;

public interface SysuserMapper {
    int deleteByPrimaryKey(Long usrId);

    int insert(Sysuser record);

    int insertSelective(Sysuser record);

    Sysuser selectByPrimaryKey(Long usrId);

    int updateByPrimaryKeySelective(Sysuser record);

    int updateByPrimaryKey(Sysuser record);

    //系统用户登录
     Sysuser logins(Sysuser sysuser);

    /**
     * 根据条件查询一个用户
     */
    Sysuser selectMapUser(Map<String, Object> map);


}