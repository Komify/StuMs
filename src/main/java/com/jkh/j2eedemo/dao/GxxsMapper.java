package com.jkh.j2eedemo.dao;

import com.jkh.j2eedemo.entity.Gxxs;

import java.util.List;

import com.jkh.j2eedemo.util.GxxsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GxxsMapper {
//    long countByExample(GxxsExample example);
//
//    int deleteByExample(GxxsExample example);
//
//    int deleteByPrimaryKey(String jnm);

    int insert(Gxxs record);

//    int insertSelective(Gxxs record);
//
//    List<Gxxs> selectByExampleWithBLOBs(GxxsExample example);
//
//    List<Gxxs> selectByExample(GxxsExample example);
//
//    Gxxs selectByPrimaryKey(String jnm);
//
//    int updateByExampleSelective(@Param("record") Gxxs record, @Param("example") GxxsExample example);
//
//    int updateByExampleWithBLOBs(@Param("record") Gxxs record, @Param("example") GxxsExample example);
//
//    int updateByExample(@Param("record") Gxxs record, @Param("example") GxxsExample example);
//
//    int updateByPrimaryKeySelective(Gxxs record);
//
//    int updateByPrimaryKeyWithBLOBs(Gxxs record);
//
//    int updateByPrimaryKey(Gxxs record);
}