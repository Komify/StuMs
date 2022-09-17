package com.jkh.j2eedemo.entity;

import org.springframework.stereotype.Component;

@Component
public class Gxbj extends AbsSuperObject{
    private String jnh;

    private String bh;

    private String bjmc;

    private String jbny;

    private String sszy;

    private String bzrxm;

    private String bzxm;

    public String getJnh() {
        return jnh;
    }

    public void setJnh(String jnh) {
        this.jnh = jnh == null ? null : jnh.trim();
    }

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh == null ? null : bh.trim();
    }

    public String getBjmc() {
        return bjmc;
    }

    public void setBjmc(String bjmc) {
        this.bjmc = bjmc == null ? null : bjmc.trim();
    }

    public String getJbny() {
        return jbny;
    }

    public void setJbny(String jbny) {
        this.jbny = jbny == null ? null : jbny.trim();
    }

    public String getSszy() {
        return sszy;
    }

    public void setSszy(String sszy) {
        this.sszy = sszy == null ? null : sszy.trim();
    }

    public String getBzrxm() {
        return bzrxm;
    }

    public void setBzrxm(String bzrxm) {
        this.bzrxm = bzrxm == null ? null : bzrxm.trim();
    }

    public String getBzxm() {
        return bzxm;
    }

    public void setBzxm(String bzxm) {
        this.bzxm = bzxm == null ? null : bzxm.trim();
    }
}