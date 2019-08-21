package com.ray.dao;

import com.ray.entity.Question;

public interface QuestionDao {
    
    public Question selectOne(long id);
    
}
