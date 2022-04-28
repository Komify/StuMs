package com.jkh.j2eedemo;

import com.jkh.j2eedemo.dao.Ilog;
import com.jkh.j2eedemo.entity.Log;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class LogTest {
    @Autowired
    private Ilog logdao;
    @Test
    void testLogDao(){
        Log log = new Log();
        log.setBussinessDate(new Date());
        log.setName("111");
        log.setId("test1");
        log.setStatus("1111");
        log.setModuleName("xxxx");
        log.setFinishDate(new Date());
        int i = logdao.add(log);
        System.out.println("添加了["+i+"]条数据!");
    }
}
