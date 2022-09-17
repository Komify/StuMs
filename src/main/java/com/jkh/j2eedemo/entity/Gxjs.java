package com.jkh.j2eedemo.entity;

import com.jkh.j2eedemo.entity.AbsSuperObject;
import org.springframework.stereotype.Component;

@Component
public class Gxjs extends AbsSuperObject {
    private String jnm;

    private String jsbh;

    private String jsmc;

    private String jslb;

    private String jswz;

    private String zws;

    private String ssbm;

    public String getJnm() {
        return jnm;
    }

    public void setJnm(String jnm) {
        this.jnm = jnm == null ? null : jnm.trim();
    }

    public String getJsbh() {
        return jsbh;
    }

    public void setJsbh(String jsbh) {
        this.jsbh = jsbh == null ? null : jsbh.trim();
    }

    public String getJsmc() {
        return jsmc;
    }

    public void setJsmc(String jsmc) {
        this.jsmc = jsmc == null ? null : jsmc.trim();
    }

    public String getJslb() {
        return jslb;
    }

    public void setJslb(String jslb) {
        this.jslb = jslb == null ? null : jslb.trim();
    }

    public String getJswz() {
        return jswz;
    }

    public void setJswz(String jswz) {
        this.jswz = jswz == null ? null : jswz.trim();
    }

    public String getZws() {
        return zws;
    }

    public void setZws(String zws) {
        this.zws = zws;
    }

    public String getSsbm() {
        return ssbm;
    }

    public void setSsbm(String ssbm) {
        this.ssbm = ssbm == null ? null : ssbm.trim();
    }
}