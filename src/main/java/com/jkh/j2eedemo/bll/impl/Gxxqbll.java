package com.jkh.j2eedemo.bll.impl;

import com.jkh.j2eedemo.dao.IDoData;
import com.jkh.j2eedemo.dao.IGxxq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Gxxqbll extends AbsSuperService{
    @Autowired
    private IGxxq gxxq;
    @Override
    public IDoData getDao() {
        return gxxq;
    }
}
