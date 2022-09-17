package com.jkh.j2eedemo.dao;

import com.jkh.j2eedemo.entity.Gxxs;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GxxsTest {


    int insert(Gxxs record);


}