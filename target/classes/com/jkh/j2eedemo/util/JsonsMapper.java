package com.jkh.j2eedemo.util;

import com.jkh.j2eedemo.entity.Jsons;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JsonsMapper {
    long countByExample(JsonsExample example);

    int deleteByExample(JsonsExample example);

    int deleteByPrimaryKey(String jsonname);

    int insert(Jsons record);

    int insertSelective(Jsons record);

    List<Jsons> selectByExampleWithBLOBs(JsonsExample example);

    List<Jsons> selectByExample(JsonsExample example);

    Jsons selectByPrimaryKey(String jsonname);

    int updateByExampleSelective(@Param("record") Jsons record, @Param("example") JsonsExample example);

    int updateByExampleWithBLOBs(@Param("record") Jsons record, @Param("example") JsonsExample example);

    int updateByExample(@Param("record") Jsons record, @Param("example") JsonsExample example);

    int updateByPrimaryKeySelective(Jsons record);

    int updateByPrimaryKeyWithBLOBs(Jsons record);
}