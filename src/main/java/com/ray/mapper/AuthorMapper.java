package com.ray.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.ray.entity.Author;

public interface AuthorMapper {
    
    @Insert("insert into author values (#{id}, #{username}, #{realname}, #{createDate})")
    public void add(Author author);
    
    @Select("select * from author where id = #{id}")
    @Results({
        @Result(property="createDate", column="create_date"),
    })
    public Author querySingle(long id);

}
