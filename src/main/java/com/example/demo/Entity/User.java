package com.example.demo.Entity;

import java.util.Date;

public class User {
    private Integer userid;

    private String phone;

    private String password;

    private String tradepwd;

    private String name;

    private String logo;

    private Integer type;

    private Integer templateid;

    private Integer authstate;

    private String idnum;

    private String realname;

    private String frontimg;

    private String reverseimg;

    private String fullimg;

    private String authremark;

    private Integer state;

    private Integer referrer;

    private Integer frozenday;

    private String xcode;

    private String invitecode;

    private Date createtime;

    private Date endtime;

    private Integer switchbtn;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTradepwd() {
        return tradepwd;
    }

    public void setTradepwd(String tradepwd) {
        this.tradepwd = tradepwd == null ? null : tradepwd.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTemplateid() {
        return templateid;
    }

    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }

    public Integer getAuthstate() {
        return authstate;
    }

    public void setAuthstate(Integer authstate) {
        this.authstate = authstate;
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum == null ? null : idnum.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getFrontimg() {
        return frontimg;
    }

    public void setFrontimg(String frontimg) {
        this.frontimg = frontimg == null ? null : frontimg.trim();
    }

    public String getReverseimg() {
        return reverseimg;
    }

    public void setReverseimg(String reverseimg) {
        this.reverseimg = reverseimg == null ? null : reverseimg.trim();
    }

    public String getFullimg() {
        return fullimg;
    }

    public void setFullimg(String fullimg) {
        this.fullimg = fullimg == null ? null : fullimg.trim();
    }

    public String getAuthremark() {
        return authremark;
    }

    public void setAuthremark(String authremark) {
        this.authremark = authremark == null ? null : authremark.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getReferrer() {
        return referrer;
    }

    public void setReferrer(Integer referrer) {
        this.referrer = referrer;
    }

    public Integer getFrozenday() {
        return frozenday;
    }

    public void setFrozenday(Integer frozenday) {
        this.frozenday = frozenday;
    }

    public String getXcode() {
        return xcode;
    }

    public void setXcode(String xcode) {
        this.xcode = xcode == null ? null : xcode.trim();
    }

    public String getInvitecode() {
        return invitecode;
    }

    public void setInvitecode(String invitecode) {
        this.invitecode = invitecode == null ? null : invitecode.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getSwitchbtn() {
        return switchbtn;
    }

    public void setSwitchbtn(Integer switchbtn) {
        this.switchbtn = switchbtn;
    }

    @Override
    public String toString() {
        return "{" +
                "userid:" + userid +
                ", phone:'" + phone + '\'' +
                ", password:'" + password + '\'' +
                ", tradepwd:'" + tradepwd + '\'' +
                ", name:'" + name + '\'' +
                ", logo:'" + logo + '\'' +
                ", type:" + type +
                ", templateid:" + templateid +
                ", authstate:" + authstate +
                ", idnum:'" + idnum + '\'' +
                ", realname:'" + realname + '\'' +
                ", frontimg:'" + frontimg + '\'' +
                ", reverseimg:'" + reverseimg + '\'' +
                ", fullimg:'" + fullimg + '\'' +
                ", authremark:'" + authremark + '\'' +
                ", state:" + state +
                ", referrer:" + referrer +
                ", frozenday:" + frozenday +
                ", xcode:'" + xcode + '\'' +
                ", invitecode:'" + invitecode + '\'' +
                ", createtime:\"" + createtime +
                "\", endtime:\"" + endtime +
                "\", switchbtn:" + switchbtn +
                '}';
    }
}