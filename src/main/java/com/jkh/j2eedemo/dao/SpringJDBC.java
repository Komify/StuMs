package com.jkh.j2eedemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringJDBC {
    @Autowired
    @Lazy
    private DriverManagerDataSource source;
    @Bean
    public DriverManagerDataSource initDataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql:///student?&useSSL=false&serverTimezone=GMT%2B8&&\\\n" +
                "  rewriteBatchedStatements=true&allowMultiQueries=true");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("123");
        return driverManagerDataSource;
    }
    @Bean
    public JdbcTemplate initJDBCtemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(source);
        return jdbcTemplate;
    }
}
