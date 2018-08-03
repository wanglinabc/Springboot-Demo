package com.example.demo.Entity;

import java.util.Date;

public class ProxyReferrerAward {
    public  ProxyReferrerAward(Double _direct,Double _indirect,Double _doubleindirect,Double _tripleindirect){
        direct = _direct;
        indirect = _indirect;
        doubleindirect = _doubleindirect;
        tripleindirect = _tripleindirect;
    }

    private Integer id;

    private Double direct;

    private Double indirect;

    private Double doubleindirect;

    private Double tripleindirect;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getDirect() {
        return direct;
    }

    public void setDirect(Double direct) {
        this.direct = direct;
    }

    public Double getIndirect() {
        return indirect;
    }

    public void setIndirect(Double indirect) {
        this.indirect = indirect;
    }

    public Double getDoubleindirect() {
        return doubleindirect;
    }

    public void setDoubleindirect(Double doubleindirect) {
        this.doubleindirect = doubleindirect;
    }

    public Double getTripleindirect() {
        return tripleindirect;
    }

    public void setTripleindirect(Double tripleindirect) {
        this.tripleindirect = tripleindirect;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}