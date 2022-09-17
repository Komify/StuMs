package com.jkh.j2eedemo.dao;

import com.jkh.j2eedemo.entity.Gxyh;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IGxyh extends IDoData{
   Gxyh login (Gxyh gxyh);
   int regist(Gxyh gxyh);
   Gxyh finduser(String zh);
}
