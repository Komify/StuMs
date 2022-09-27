package com.jkh.j2eedemo.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IGxzy  extends IDoData{
    public List findbyssbmname(String zyname);
}
