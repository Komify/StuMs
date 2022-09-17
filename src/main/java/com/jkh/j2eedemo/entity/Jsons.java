package com.jkh.j2eedemo.entity;

import org.springframework.stereotype.Component;

@Component
public class Jsons extends  AbsSuperObject{
    private String jsonname;

    private String jsonvalue;

    public String getJsonname() {
        return jsonname;
    }

    public void setJsonname(String jsonname) {
        this.jsonname = jsonname == null ? null : jsonname.trim();
    }

    public String getJsonvalue() {
        return jsonvalue;
    }

    public void setJsonvalue(String jsonvalue) {
        this.jsonvalue = jsonvalue == null ? null : jsonvalue.trim();
    }
}