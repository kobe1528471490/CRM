package com.zking.crm.role.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Sysuser implements Serializable{
    private Long usrId;

    private String usrName;

    private String usrPassword;

    private Long roleId;

    private Integer usrFlag;

    //用户的角色
    //系统用户里的哪些角色
    private List<Sysrole> sysroleList=new ArrayList<Sysrole>();


    public Sysuser(Long usrId, String usrName, String usrPassword, Long roleId, Integer usrFlag) {
        this.usrId = usrId;
        this.usrName = usrName;
        this.usrPassword = usrPassword;
        this.roleId = roleId;
        this.usrFlag = usrFlag;
    }

    public List<Sysrole> getSysroleList() {
        return sysroleList;
    }

    public void setSysroleList(List<Sysrole> sysroleList) {
        this.sysroleList = sysroleList;
    }

    public Sysuser() {
        super();
    }

    public Long getUsrId() {
        return usrId;
    }

    public void setUsrId(Long usrId) {
        this.usrId = usrId;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Integer getUsrFlag() {
        return usrFlag;
    }

    public void setUsrFlag(Integer usrFlag) {
        this.usrFlag = usrFlag;
    }

    @Override
    public String toString() {
        return "Sysuser{" +
                "usrId=" + usrId +
                ", usrName='" + usrName + '\'' +
                ", usrPassword='" + usrPassword + '\'' +
                ", roleId=" + roleId +
                ", usrFlag=" + usrFlag +
                '}';
    }

    public Sysuser(String usrName, String usrPassword) {
        this.usrName = usrName;
        this.usrPassword = usrPassword;
    }

    public Sysuser(String usrName) {
        this.usrName = usrName;
    }
}