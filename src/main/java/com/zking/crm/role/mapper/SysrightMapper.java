package com.zking.crm.role.mapper;

import com.zking.crm.role.model.Sysright;

import java.util.List;
import java.util.Map;

public interface SysrightMapper {
    int deleteByPrimaryKey(String rightCode);

    int insert(Sysright record);

    int insertSelective(Sysright record);

    Sysright selectByPrimaryKey(String rightCode);

    int updateByPrimaryKeySelective(Sysright record);

    int updateByPrimaryKey(Sysright record);

    //连表查询，查询所有权限
    List<Sysright> selectMap(Map<String, Object> map);

}