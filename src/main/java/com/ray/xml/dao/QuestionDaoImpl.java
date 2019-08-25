package com.ray.xml.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.ray.common.Config;
import com.ray.dao.QuestionDao;
import com.ray.entity.Question;

public class QuestionDaoImpl implements QuestionDao {

    @Override
    public Question selectOne(long id) {
        try(SqlSession sess = fac().openSession()) {
            return sess.selectOne("Question.selectOne", id);
        }
    }
    
    @Override
    public Question selectOneU(long id) {
        try(SqlSession sess = fac().openSession()) {
            return sess.selectOne("Question.selectOneU", id);
        }
    }
    
    @Override
    public void insert(Question question) {
        try(SqlSession sess = fac().openSession()) {
            sess.insert("Question.insert", question);
            sess.commit();
        }
    }
    
    public SqlSessionFactory fac() {
        return Config.getSqlSessionFactory();
    }

    @Override
    public void delete(long id) {
        try(SqlSession sess = fac().openSession()) {
            sess.delete("Question.deleteOne", id);
            sess.commit();
        }        
    }

    @Override
    public void update(Question question) {
        try(SqlSession sess = fac().openSession()) {
            sess.update("Question.update", question);
            sess.commit();
        }        
    }



}
