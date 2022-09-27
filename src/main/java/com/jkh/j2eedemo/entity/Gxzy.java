package com.jkh.j2eedemo.entity;

import org.springframework.stereotype.Component;

@Component

public class Gxzy extends AbsSuperObject{
    private String jnm;

    private String zyh;

    private String zymc;

    private String zyjc;

    private String zyywmc;

    private String zyfx;

    private String ssxx;

    private String xz;

    private String ksny;

    private String qsxq;

    private String ssbm;

    public String getJnm() {
        return jnm;
    }

    public void setJnm(String jnm) {
        this.jnm = jnm == null ? null : jnm.trim();
    }

    public String getZyh() {
        return zyh;
    }

    public void setZyh(String zyh) {
        this.zyh = zyh == null ? null : zyh.trim();
    }

    public String getZymc() {
        return zymc;
    }

    public void setZymc(String zymc) {
        this.zymc = zymc == null ? null : zymc.trim();
    }

    public String getZyjc() {
        return zyjc;
    }

    public void setZyjc(String zyjc) {
        this.zyjc = zyjc == null ? null : zyjc.trim();
    }

    public String getZyywmc() {
        return zyywmc;
    }

    public void setZyywmc(String zyywmc) {
        this.zyywmc = zyywmc == null ? null : zyywmc.trim();
    }

    public String getZyfx() {
        return zyfx;
    }

    public void setZyfx(String zyfx) {
        this.zyfx = zyfx == null ? null : zyfx.trim();
    }

    public String getSsxx() {
        return ssxx;
    }

    public void setSsxx(String ssxx) {
        this.ssxx = ssxx == null ? null : ssxx.trim();
    }

    public String getXz() {
        return xz;
    }

    public void setXz(String xz) {
        this.xz = xz == null ? null : xz.trim();
    }

    public String getKsny() {
        return ksny;
    }

    public void setKsny(String ksny) {
        this.ksny = ksny == null ? null : ksny.trim();
    }

    public String getQsxq() {
        return qsxq;
    }

    public void setQsxq(String qsxq) {
        this.qsxq = qsxq == null ? null : qsxq.trim();
    }

    public String getSsbm() {
        return ssbm;
    }

    public void setSsbm(String ssbm) {
        this.ssbm = ssbm;
    }
}
