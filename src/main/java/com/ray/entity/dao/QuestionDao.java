package com.ray.entity.dao;

import org.apache.ibatis.session.SqlSession;

import com.ray.common.Config;
import com.ray.entity.Question;

public class QuestionDao {
    
    public Question selectQuestion(int id) {
        try (SqlSession sess = Config.getSqlSessionFactory().openSession()) {
            return sess.selectOne("Question.selectQuestion", id);
        }
    }
    
    public Question selectQuestionEmbed(int id) {
        try (SqlSession sess = Config.getSqlSessionFactory().openSession()) {
            return sess.selectOne("Question.selectQuestionEmbed", id);
        }
    }

    public Question selectQuestionUnion(int id) {
        try (SqlSession sess = Config.getSqlSessionFactory().openSession()) {
            return sess.selectOne("Question.selectQuesUnion", id);
        }
    }

    public Question selectQuestionAutoMapping(int id) {
        try (SqlSession sess = Config.getSqlSessionFactory().openSession()) {
            return sess.selectOne("Question.selectQuesAutoMapping", id);
        }
    }
    
}
