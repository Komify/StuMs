package com.jkh.j2eedemo.controller.impl;

import com.jkh.j2eedemo.bll.impl.Gxbmbll;
import com.jkh.j2eedemo.bll.impl.Gxzybll;
import com.jkh.j2eedemo.entity.Gxbm;
import com.jkh.j2eedemo.entity.Gxzy;
import com.jkh.j2eedemo.entity.KesunReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("somedata")
public class SomeDataController {
    @Autowired
    private Gxzybll gxzybll;
    @Autowired
    private Gxbmbll gxbmbll;
    @PostMapping("getbjjilian")
    public KesunReturn getbjjianlian(){
        List<Gxbm> gxbms = new ArrayList<>();


        KesunReturn findall = gxbmbll.findall();
        List obj = (List) findall.getObj();
        for (int i = 0; i <obj.size(); i++) {

            Gxbm gxbm = new Gxbm();

            Gxbm o = (Gxbm) obj.get(i);
            gxbm.setMc(o.getMc());

            KesunReturn findbyzyname = gxzybll.findbyzyname(o.getMc());
            List obj1 = (List) findbyzyname.getObj();
            gxbm.setGxzy(obj1);
            gxbms.add(gxbm);
        }
        return new KesunReturn("111","33",gxbms);
}

}
