package com.ray.dao;

import com.ray.entity.Question;

public interface QuestionDao {
    
    Question selectOne(long id);
    Question selectOneU(long id);
    void insert(Question question);
    void delete(long id);
    void update(Question question);
    
}
