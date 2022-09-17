package com.jkh.j2eedemo.bll.impl;

import com.jkh.j2eedemo.dao.IDoData;
import com.jkh.j2eedemo.dao.IGxzy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Gxzybll extends AbsSuperService{
    @Autowired
private IGxzy gxzydao;
    @Override
    public IDoData getDao() {
        return gxzydao;
    }
}
