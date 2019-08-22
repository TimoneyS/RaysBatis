package com.ray.anno.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.ray.entity.Question;

@Mapper()
public interface QuestionMapper {

    @Select("select * from question where id = #{id}")
    @Results({
        @Result(column="create_date", property="createDate"),
        @Result(property="author", column="author_id", 
                one=@One(fetchType=FetchType.LAZY, select="com.ray.anno.mapper.AuthorMapper.selectOne"))
    })
    public Question selectOne(long id);
    
}
