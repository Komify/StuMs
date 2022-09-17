package com.jkh.j2eedemo.entity;

import org.springframework.stereotype.Component;

@Component
public class Gxbm extends AbsSuperObject{
    private String jnm;

    private String bh;

    private String mc;

    private String fzr;

    private String lxdh;

    private String xz;

    private String gxdm;

    public String getJnm() {
        return jnm;
    }

    public void setJnm(String jnm) {
        this.jnm = jnm == null ? null : jnm.trim();
    }

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh == null ? null : bh.trim();
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc == null ? null : mc.trim();
    }

    public String getFzr() {
        return fzr;
    }

    public void setFzr(String fzr) {
        this.fzr = fzr == null ? null : fzr.trim();
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh == null ? null : lxdh.trim();
    }

    public String getXz() {
        return xz;
    }

    public void setXz(String xz) {
        this.xz = xz == null ? null : xz.trim();
    }

    public String getGxdm() {
        return gxdm;
    }

    public void setGxdm(String gxdm) {
        this.gxdm = gxdm == null ? null : gxdm.trim();
    }
}