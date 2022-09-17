package com.jkh.j2eedemo.bll.impl;

import com.jkh.j2eedemo.dao.IDoData;
import com.jkh.j2eedemo.dao.IJsons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Jsonsbll extends AbsSuperService {
    @Autowired
    private IJsons jsonsdao;

    @Override
    public IDoData getDao() {
        return jsonsdao ;
    }
}
