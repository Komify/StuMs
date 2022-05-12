package com.jkh.j2eedemo.inspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class Init {
    @Bean
    public ConversionServiceFactoryBean initconvertservicefactory(){
        Set objects = new HashSet();
        objects.add(new DateConvert());
        ConversionServiceFactoryBean conversionServiceFactoryBean = new ConversionServiceFactoryBean();
        conversionServiceFactoryBean.setConverters(objects);
        return conversionServiceFactoryBean;
    }
}
