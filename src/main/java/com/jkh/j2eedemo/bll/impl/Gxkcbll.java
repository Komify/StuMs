package com.jkh.j2eedemo.bll.impl;

import com.jkh.j2eedemo.dao.IDoData;
import com.jkh.j2eedemo.dao.IGxkc;
import com.jkh.j2eedemo.entity.AbsSuperObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Gxkcbll extends AbsSuperService{
@Autowired
private IGxkc gxkcdao;

    @Override
    public IDoData getDao() {
        return gxkcdao;
    }
}
