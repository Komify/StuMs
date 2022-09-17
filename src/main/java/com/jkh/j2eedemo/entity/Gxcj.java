package com.jkh.j2eedemo.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Gxcj extends AbsSuperObject{
    private String jnm;

    private String xsjnm;

    private String kcjnm;

    private String jsjnm;

    private String xqjnm;

    private String cj;

    private String lx;

    private Date kssj;

    private Date sjcjsj;

    private String yhzh;

    public String getJnm() {
        return jnm;
    }

    public void setJnm(String jnm) {
        this.jnm = jnm;
    }

    public String getXsjnm() {
        return xsjnm;
    }

    public void setXsjnm(String xsjnm) {
        this.xsjnm = xsjnm == null ? null : xsjnm.trim();
    }

    public String getKcjnm() {
        return kcjnm;
    }

    public void setKcjnm(String kcjnm) {
        this.kcjnm = kcjnm == null ? null : kcjnm.trim();
    }

    public String getJsjnm() {
        return jsjnm;
    }

    public void setJsjnm(String jsjnm) {
        this.jsjnm = jsjnm == null ? null : jsjnm.trim();
    }

    public String getXqjnm() {
        return xqjnm;
    }

    public void setXqjnm(String xqjnm) {
        this.xqjnm = xqjnm == null ? null : xqjnm.trim();
    }

    public String getCj() {
        return cj;
    }

    public void setCj(String cj) {
        this.cj = cj;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx == null ? null : lx.trim();
    }

    public Date getKssj() {
        return kssj;
    }

    public void setKssj(Date kssj) {
        this.kssj = kssj;
    }

    public Date getSjcjsj() {
        return sjcjsj;
    }

    public void setSjcjsj(Date sjcjsj) {
        this.sjcjsj = sjcjsj;
    }

    public String getYhzh() {
        return yhzh;
    }

    public void setYhzh(String yhzh) {
        this.yhzh = yhzh == null ? null : yhzh.trim();
    }
}