package com.jkh.j2eedemo.entity;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class Gxxq  extends AbsSuperObject{
    private String jnm;

    private String bh;

    private String mc;

    private String qsxn;

    private String jsxn;

    private String xq;

    private Date dyzrq;

    private Integer zzs;

    private String ssxx;

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

    public String getQsxn() {
        return qsxn;
    }

    public void setQsxn(String qsxn) {
        this.qsxn = qsxn;
    }

    public String getJsxn() {
        return jsxn;
    }

    public void setJsxn(String jsxn) {
        this.jsxn = jsxn;
    }

    public String getXq() {
        return xq;
    }

    public void setXq(String xq) {
        this.xq = xq == null ? null : xq.trim();
    }

    public Date getDyzrq() {
        return dyzrq;
    }

    public void setDyzrq(Date dyzrq) {
        this.dyzrq = dyzrq;
    }

    public Integer getZzs() {
        return zzs;
    }

    public void setZzs(Integer zzs) {
        this.zzs = zzs;
    }

    public String getSsxx() {
        return ssxx;
    }

    public void setSsxx(String ssxx) {
        this.ssxx = ssxx == null ? null : ssxx.trim();
    }
}