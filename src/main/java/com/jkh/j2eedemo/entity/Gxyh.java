package com.jkh.j2eedemo.entity;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class Gxyh extends AbsSuperObject{
    private String zh;

    private String nc;

    private String mm;

    private Date zcsj;

    private String zt;

    public String getZh() {
        return zh;
    }

    public void setZh(String zh) {
        this.zh = zh == null ? null : zh.trim();
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc == null ? null : nc.trim();
    }

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm == null ? null : mm.trim();
    }

    public Date getZcsj() {
        return zcsj;
    }

    public void setZcsj(Date zcsj) {
        this.zcsj = zcsj;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
    }
}