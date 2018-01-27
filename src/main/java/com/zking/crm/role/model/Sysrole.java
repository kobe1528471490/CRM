package com.zking.crm.role.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Sysrole implements Serializable{
    private Long roleId;

    private String roleName;

    private String roleDesc;

    private Integer roleFlag;

    /**
     * 角色的权限
     * 角色里面有哪些权限
     */
    private List<Sysright> sysrights = new ArrayList<Sysright>();

    /**
     * 角色的功能
     * 角色里面有哪些功能
     */
    private List<Sysfunction> sysfunctions = new ArrayList<Sysfunction>();

    //角色的别名
    private String roleAlias;



    public Sysrole(Long roleId, String roleName, String roleDesc, Integer roleFlag) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.roleFlag = roleFlag;
    }

    public Sysrole() {
        super();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public Integer getRoleFlag() {
        return roleFlag;
    }

    public void setRoleFlag(Integer roleFlag) {
        this.roleFlag = roleFlag;
    }

    public List<Sysright> getSysrights() {
        return sysrights;
    }

    public void setSysrights(List<Sysright> sysrights) {
        this.sysrights = sysrights;
    }

    public List<Sysfunction> getSysfunctions() {
        return sysfunctions;
    }

    public void setSysfunctions(List<Sysfunction> sysfunctions) {
        this.sysfunctions = sysfunctions;
    }

    public String getRoleAlias() {
        return roleAlias;
    }

    public void setRoleAlias(String roleAlias) {
        this.roleAlias = roleAlias;
    }

    @Override
    public String toString() {
        return "Sysrole{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", roleFlag=" + roleFlag +
                '}';
    }
}