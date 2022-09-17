package com.jkh.j2eedemo.entity;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class Gxkb extends AbsSuperObject{
    private Long jnm;

    private String xqjnm;

    private String kcjnm;

    private String jsjnm;

    private String jzgjnm;

    private String bjjnm;

    private String xq;

    private String jc;

    private String cjsj;

    private String xxbh;

    private String bmjnm;

    private String zt;

    private String czyh;

    public Long getJnm() {
        return jnm;
    }

    public void setJnm(Long jnm) {
        this.jnm = jnm;
    }

    public String getXqjnm() {
        return xqjnm;
    }

    public void setXqjnm(String xqjnm) {
        this.xqjnm = xqjnm == null ? null : xqjnm.trim();
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

    public String getJzgjnm() {
        return jzgjnm;
    }

    public void setJzgjnm(String jzgjnm) {
        this.jzgjnm = jzgjnm == null ? null : jzgjnm.trim();
    }

    public String getBjjnm() {
        return bjjnm;
    }

    public void setBjjnm(String bjjnm) {
        this.bjjnm = bjjnm == null ? null : bjjnm.trim();
    }

    public String getXq() {
        return xq;
    }

    public void setXq(String xq) {
        this.xq = xq == null ? null : xq.trim();
    }

    public String getJc() {
        return jc;
    }

    public void setJc(String jc) {
        this.jc = jc == null ? null : jc.trim();
    }

    public String getCjsj() {
        return cjsj;
    }

    public void setCjsj(String cjsj) {
        this.cjsj = cjsj;
    }

    public String getXxbh() {
        return xxbh;
    }

    public void setXxbh(String xxbh) {
        this.xxbh = xxbh == null ? null : xxbh.trim();
    }

    public String getBmjnm() {
        return bmjnm;
    }

    public void setBmjnm(String bmjnm) {
        this.bmjnm = bmjnm == null ? null : bmjnm.trim();
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
    }

    public String getCzyh() {
        return czyh;
    }

    public void setCzyh(String czyh) {
        this.czyh = czyh == null ? null : czyh.trim();
    }
}