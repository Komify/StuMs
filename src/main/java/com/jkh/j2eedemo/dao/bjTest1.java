package com.jkh.j2eedemo.dao;


import com.jkh.j2eedemo.entity.Gxbj;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface bjTest1 {
    @Select("select id,name,charger from studentclass where charger=#{charger}")
    List<Gxbj> findStudentClass(Map<String,Object>cons);
    @Insert("insert into studentclass (id,name,charger)"+"values(#{sc.id},#{sc.name},#{sc.charger})")
    int addClass(Gxbj sc);
    @Update("update studentclass set name=#{sc.name} where id =#{sc.id}")
    int editStuClass(Gxbj sc);
}
