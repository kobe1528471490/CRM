package com.zking.crm.role.biz;

import com.zking.crm.role.model.Sysright;

import java.util.List;
import java.util.Map;

public interface ISysrightBiz {

    List<Sysright> selectMap(Map<String, Object> map);

}
