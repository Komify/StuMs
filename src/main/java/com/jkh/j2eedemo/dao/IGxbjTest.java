package com.jkh.j2eedemo.dao;

import com.jkh.j2eedemo.entity.Gxxs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IGxbjTest extends IDoData {
 List<Gxxs> findStus(String id);
}
