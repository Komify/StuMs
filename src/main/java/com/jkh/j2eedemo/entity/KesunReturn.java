package com.jkh.j2eedemo.entity;

public class KesunReturn {
    private String code;
    private String message;
    private Object obj;

    public KesunReturn(String code, String message, Object obj) {
        this.code = code;
        this.message = message;
        this.obj = obj;
    }

    public KesunReturn(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public KesunReturn() {

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
