package com.jkh.j2eedemo.controller.impl;

import com.alibaba.fastjson.JSON;
import com.jkh.j2eedemo.bll.impl.Jsonsbll;
import com.jkh.j2eedemo.entity.KesunReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spring.web.json.Json;

import java.util.Map;

@RestController
public class JsonsController {
    @Autowired
    private Jsonsbll jsonsbll;
    @PostMapping(value = "/getjsons")
    public KesunReturn getjsons(@RequestBody Map<String,Object> cons){
        System.out.println();
        System.out.println(jsonsbll.findbyjsonname(String.valueOf(cons.get("name"))));
        return jsonsbll.findbyjsonname(String.valueOf(cons.get("name")));
    }
}
