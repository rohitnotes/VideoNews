package com.fuicuiedu.xc.videonew_20170309.bombapi.result;

//{
//        "createdAt": YYYY-mm-dd HH:ii:ss,    // 用户注册时间
//        "objectId": objectId,                // 用户唯一Id
//        "sessionToken": sessionToken         // 用来认证更新或删除用户的请求
//        }

//{
//        "username": username,               // 登录用户名称
//        "updatedAt": YYYY-mm-dd HH:ii:ss,   // 用户更新时间
//        }

public class UserResult {

    private String createdAt;
    private String objectId;
    private String username;
    private String updatedAt;
    private String sessionToken;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }
}
