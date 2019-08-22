package com.ray.anno.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.ray.entity.Reply;

public interface ReplyMapper {
    
    @Select("SELECT * FROM REPLY WHERE QUESTION_ID = #{q_id}")
    public List<Reply> selectByQ(long q_id);
}
