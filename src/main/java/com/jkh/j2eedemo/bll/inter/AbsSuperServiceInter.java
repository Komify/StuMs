package com.jkh.j2eedemo.bll.inter;

import com.jkh.j2eedemo.dao.IDoData;
import com.jkh.j2eedemo.entity.AbsSuperObject;
import com.jkh.j2eedemo.entity.KesunReturn;

import java.util.List;
import java.util.Map;

public interface AbsSuperServiceInter {
    AbsSuperObject getModel();

    void setModel(AbsSuperObject model);

    IDoData getDao();

    KesunReturn findById();

    KesunReturn add();

    KesunReturn edit();

    KesunReturn batchEdit(Map<String, Object> cons);

    KesunReturn finds(Map<String, Object> cons);

    KesunReturn delete();

    KesunReturn batchSave(List<AbsSuperObject> objs);

    KesunReturn batchUpdate(List<Map<String,Object>>objs);

    KesunReturn getRowscount(Map<String, Object> cons);

    KesunReturn findByPage(Map<String, Object> cons, int startPage, int rowsCount);
    KesunReturn batchDel(Map<String,Object> cons);
}
