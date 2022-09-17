package com.jkh.j2eedemo.configration;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    /**
     * 创建API应用
     * apiInfo() 增加API相关信息
     * 通过select()函数返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现，
     * 指定扫描的包路径来定义指定要建立API的目录。
     * @return
     */
    @Bean
    public Docket coreApiConfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("高校用户管理") //模块名称
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jkh.j2eedemo.controller"))
                //扫描的控制器路径
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("高校成绩管理系统")
                .description("高校班级管理系统")
                .version("1.0")
                .contact(new Contact("vue页面","http://localhost:8080/","0000"))
                .build();
    }
}
