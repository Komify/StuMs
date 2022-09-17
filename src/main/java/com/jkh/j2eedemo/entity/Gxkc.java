package com.jkh.j2eedemo.entity;

import org.springframework.stereotype.Component;

@Component

public class Gxkc extends AbsSuperObject{
    private String jnm;

    private String kch;

    private String kcmc;

    private Float xf;

    private Integer zhxs;

    private Integer zxs;

    private Integer llxs;

    private Integer syxs;

    private String kcfzr;

    private String kcjj;

    private String sszy;

    public String getJnm() {
        return jnm;
    }

    public void setJnm(String jnm) {
        this.jnm = jnm == null ? null : jnm.trim();
    }

    public String getKch() {
        return kch;
    }

    public void setKch(String kch) {
        this.kch = kch == null ? null : kch.trim();
    }

    public String getKcmc() {
        return kcmc;
    }

    public void setKcmc(String kcmc) {
        this.kcmc = kcmc == null ? null : kcmc.trim();
    }

    public Float getXf() {
        return xf;
    }

    public void setXf(Float xf) {
        this.xf = xf;
    }

    public Integer getZhxs() {
        return zhxs;
    }

    public void setZhxs(Integer zhxs) {
        this.zhxs = zhxs;
    }

    public Integer getZxs() {
        return zxs;
    }

    public void setZxs(Integer zxs) {
        this.zxs = zxs;
    }

    public Integer getLlxs() {
        return llxs;
    }

    public void setLlxs(Integer llxs) {
        this.llxs = llxs;
    }

    public Integer getSyxs() {
        return syxs;
    }

    public void setSyxs(Integer syxs) {
        this.syxs = syxs;
    }

    public String getKcfzr() {
        return kcfzr;
    }

    public void setKcfzr(String kcfzr) {
        this.kcfzr = kcfzr == null ? null : kcfzr.trim();
    }

    public String getSszy() {
        return sszy;
    }

    public void setSszy(String sszy) {
        this.sszy = sszy == null ? null : sszy.trim();
    }

    public String getKcjj() {
        return kcjj;
    }

    public void setKcjj(String kcjj) {
        this.kcjj = kcjj;
    }
}