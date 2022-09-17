package com.jkh.j2eedemo.bll.impl;

import com.jkh.j2eedemo.dao.IDoData;
import com.jkh.j2eedemo.dao.IGxjs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Gxjsbll extends AbsSuperService {
    @Autowired
    private IGxjs gxjsdao;
    @Override
    public IDoData getDao() {
        return gxjsdao;
    }
}
