package com.zking.crm.role.util;

/**
 * 说明：权限类型枚举
 */
public enum AuthType {

    ROLE("ROLE"), FOLDER("FOLDER"), DOCUMENT("DOCUMENT");

    private String authType;

    AuthType(String authType) {
        this.authType = authType;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    @Override
    public String toString() {
        return this.authType+"";
    }

}
