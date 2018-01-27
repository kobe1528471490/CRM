package com.zking.crm.role.model;

import java.io.Serializable;

public class Sysroleright implements Serializable{
    private Long rfId;

    private Long roleId;

    private String rightCode;

    public Sysroleright(Long rfId, Long roleId, String rightCode) {
        this.rfId = rfId;
        this.roleId = roleId;
        this.rightCode = rightCode;
    }

    public Sysroleright() {
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

    public String getRightCode() {
        return rightCode;
    }

    public void setRightCode(String rightCode) {
        this.rightCode = rightCode;
    }

    @Override
    public String toString() {
        return "Sysroleright{" +
                "rfId=" + rfId +
                ", roleId=" + roleId +
                ", rightCode='" + rightCode + '\'' +
                '}';
    }
}