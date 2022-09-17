package com.jkh.j2eedemo.bll.impl;

import com.jkh.j2eedemo.bll.impl.AbsSuperService;
import com.jkh.j2eedemo.dao.IDoData;
import com.jkh.j2eedemo.dao.IGxkb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Gxkbbll extends AbsSuperService {
    @Autowired
    private IGxkb gxkbdao;

    @Override
    public IDoData getDao() {
        return gxkbdao;
    }
}
