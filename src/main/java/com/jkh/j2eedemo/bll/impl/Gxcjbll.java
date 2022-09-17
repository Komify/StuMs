package com.jkh.j2eedemo.bll.impl;

import com.jkh.j2eedemo.dao.IDoData;
import com.jkh.j2eedemo.dao.IGxcj;
import com.jkh.j2eedemo.dao.IGxxx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Gxcjbll extends AbsSuperService{
    @Autowired
    private IGxcj gxcjdao;
    @Override
    public IDoData getDao() {
        return gxcjdao;
    }
}
