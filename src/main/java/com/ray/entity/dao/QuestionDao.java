package com.ray.entity.dao;

import org.apache.ibatis.session.SqlSession;

import com.ray.common.Config;
import com.ray.entity.Question;

public class QuestionDao {
    
    public Question selectQuestion(int id) {
        try (SqlSession sess = Config.getSqlSessionFactory().openSession()) {
            return sess.selectOne("Question.selectQuestion", 26);
        }
    }
    
}
