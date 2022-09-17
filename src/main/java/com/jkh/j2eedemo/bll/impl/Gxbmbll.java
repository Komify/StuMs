package com.jkh.j2eedemo.bll.impl;

import com.jkh.j2eedemo.dao.IDoData;
import com.jkh.j2eedemo.dao.IGxbm;
import com.jkh.j2eedemo.dao.IGxjzg;
import com.jkh.j2eedemo.entity.AbsSuperObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Gxbmbll extends AbsSuperService{
    @Autowired
    private IGxbm gxbmdao;
    @Override
    public IDoData getDao() {
        return gxbmdao;
    }
}
