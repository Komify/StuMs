package com.jkh.j2eedemo;

import com.jkh.j2eedemo.bll.impl.Gxjzgbll;
import com.jkh.j2eedemo.dao.IGxjzg;
import com.jkh.j2eedemo.entity.Gxjzg;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class Testgxjzg {
    @Autowired
    private Gxjzgbll  bll;
    @Test
    void testadd(){
        Gxjzg gxjzg = new Gxjzg();
        gxjzg.setXm("niaho");
        gxjzg.setSsbm("880001");
        gxjzg.setDwh("8608");
        bll.setModel(gxjzg);
        bll.add();
    }
    @Test
    void testfindbypage(){
        Map<String, Object> cons = new HashMap<>();
        cons.put("xm", "1");
        System.out.println(bll.findByPage(cons, 1, 10));
    }
}
