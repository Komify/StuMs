package com.jkh.j2eedemo.entity;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class EvaluateStandard extends AbsSuperObject {
    private Map<String,String> standards;

    public Map<String, String> getStandards() {
        return standards;
    }

    public void setStandards(Map<String, String> standards) {
        this.standards = standards;
    }
}
