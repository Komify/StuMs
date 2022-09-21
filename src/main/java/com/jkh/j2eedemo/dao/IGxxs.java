package com.jkh.j2eedemo.dao;

import com.jkh.j2eedemo.entity.Gxxs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IGxxs extends IDoData{

@Select("select * from student where id=#{id}")
Gxxs findMe(String id);
int uploadtouxiang(Gxxs gxxs);
Gxxs findtouxiang(String jnm);
}

