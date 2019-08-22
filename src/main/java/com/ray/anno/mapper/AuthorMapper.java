package com.ray.anno.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.ray.entity.Author;

@Mapper()
public interface AuthorMapper {
    
    @Select("select * from AUTHOR where id = #{id}")
    @Results(
            @Result(column="create_date", property="createDate")
            )
    public Author selectOne(long id);
    
}
