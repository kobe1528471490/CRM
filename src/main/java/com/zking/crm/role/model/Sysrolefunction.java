package com.zking.crm.role.model;

import java.io.Serializable;

public class Sysrolefunction implements Serializable{
    private Long rfId;

    private Long roleId;

    private Long functionId;

    public Sysrolefunction(Long rfId, Long roleId, Long functionId) {
        this.rfId = rfId;
        this.roleId = roleId;
        this.functionId = functionId;
    }

    public Sysrolefunction() {
        super();
    }

    public Long getRfId() {
        return rfId;
    }

    public void setRfId(Long rfId) {
        this.rfId = rfId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Long functionId) {
        this.functionId = functionId;
    }

    @Override
    public String toString() {
        return "Sysrolefunction{" +
                "rfId=" + rfId +
                ", roleId=" + roleId +
                ", functionId=" + functionId +
                '}';
    }

}