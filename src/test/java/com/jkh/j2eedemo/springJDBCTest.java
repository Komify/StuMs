package com.jkh.j2eedemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
@SpringBootTest
public class springJDBCTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    void testCreate(){
        int update = jdbcTemplate.update("create table blance(id int primary key auto_increment," +
                "name varchar(25),balance decimal(18,2))");
        System.out.println(update);
    }
    @Test
    void testAdd(){
        int update = jdbcTemplate.update("insert into blance(id,name,balance) " +
                "values (1,'吉康辉',8000000) ");
        System.out.println("新增了"+update+"条数据");
    }
    @Test
    void testUpdat(){
        int update = jdbcTemplate.update("update blance set balance ='9000000' " +
                "where name='吉康辉'");
        System.out.println("修改了"+update+"条数据");
    }
    @Test
    void testDel(){
        int update = jdbcTemplate.update("delete from blance where id =1");
        System.out.println("删除了"+update+"条数据");
    }

}
