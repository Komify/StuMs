package com.jkh.j2eedemo.entity;

import org.springframework.stereotype.Component;

@Component
public class Gxbj extends AbsSuperObject{
    private String jnm;

    private String bjbh;

    private String bjmc;

    private String jbny;

    private String sszy;

    private String bzrxm;

    private String bzxm;

    public String getJnm() {
        return jnm;
    }

    public void setJnm(String jnm) {
        this.jnm = jnm == null ? null : jnm.trim();
    }

    public String getBjbh() {
        return bjbh;
    }

    public void setBjbh(String bjbh) {
        this.bjbh = bjbh == null ? null : bjbh.trim();
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