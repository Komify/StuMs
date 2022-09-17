package com.jkh.j2eedemo.bll.impl;

import com.jkh.j2eedemo.dao.IDoData;
import com.jkh.j2eedemo.dao.IGxxx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Gxxxbll extends AbsSuperService{
    @Autowired
    private IGxxx gxxxdao;
    @Override
    public IDoData getDao() {
        return gxxxdao;
    }
}
