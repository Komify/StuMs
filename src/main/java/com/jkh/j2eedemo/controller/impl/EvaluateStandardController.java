package com.jkh.j2eedemo.controller.impl;

import com.jkh.j2eedemo.entity.EvaluateStandard;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("standard")
public class EvaluateStandardController {
    @RequestMapping(value = "getme",method = RequestMethod.POST)
    public void getstandards(EvaluateStandard standard){
        System.out.println("标准名称:"+standard.getName());
        System.out.println("标准明细");
        for (String key: standard.getStandards().keySet()) {
            System.out.println(key+"-->"+standard.getStandards().get(key));
        }
    }
    @RequestMapping("sd")
    public String sd(){
        return "standard";
    }
}
