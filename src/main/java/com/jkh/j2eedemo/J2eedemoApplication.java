package com.jkh.j2eedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.jkh.j2eedemo.dao")
@ComponentScan(basePackages = {"com.jkh.j2eedemo.entity", "com.jkh.j2eedemo.bll.impl",
        "com.jkh.j2eedemo.aspect", "com.jkh.j2eedemo.controller","com.jkh.j2eedemo.inspect"})
public class J2eedemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(J2eedemoApplication.class, args);
    }
}
