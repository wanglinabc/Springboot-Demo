package com.example.demo.Entity;

import java.util.Date;

public class Admin {
    private Integer adminid;

    private String loginname;

    private String realname;

    private String loginpwd;

    private String telphone;

    private Integer state;

    private Date createtime;

    private Integer superadmin;

    private String remark;

    private Integer sex;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd == null ? null : loginpwd.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getSuperadmin() {
        return superadmin;
    }

    public void setSuperadmin(Integer superadmin) {
        this.superadmin = superadmin;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "{" +
                "adminid:" + adminid +
                ", loginname:'" + loginname + '\'' +
                ", realname:'" + realname + '\'' +
                ", loginpwd:'" + loginpwd + '\'' +
                ", telphone:" + telphone  +
                ", state:" + state +
                ", createtime:\"" + createtime +
                "\", superadmin:" + superadmin +
                ", remark:'" + remark + '\'' +
                ", sex:" + sex +
                '}';
    }
}