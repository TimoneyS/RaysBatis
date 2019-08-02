package com.ray.entity.mapper;

import org.apache.ibatis.annotations.Select;

import com.ray.entity.Pair;

public interface PairMapper {
    
    @Select("select * from pair where id = #{id}")
    public Pair queryPair(int id);
    
}
