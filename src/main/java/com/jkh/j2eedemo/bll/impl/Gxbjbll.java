package com.jkh.j2eedemo.bll.impl;

import com.jkh.j2eedemo.dao.IDoData;
import com.jkh.j2eedemo.dao.IGxbj;
import com.jkh.j2eedemo.entity.AbsSuperObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Gxbjbll extends AbsSuperService {
    @Autowired
    private IGxbj gxbjdao;

    @Override
    public IDoData getDao() {
        return gxbjdao;
    }
}
