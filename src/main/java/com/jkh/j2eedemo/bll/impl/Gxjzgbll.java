package com.jkh.j2eedemo.bll.impl;

import com.jkh.j2eedemo.dao.IDoData;
import com.jkh.j2eedemo.dao.IGxjzg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Gxjzgbll extends AbsSuperService {

    @Autowired
    private IGxjzg gxjzgdao;
    @Override
    public IDoData getDao() {
        return gxjzgdao;
    }
}
