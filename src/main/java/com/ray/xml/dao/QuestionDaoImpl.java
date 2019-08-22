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
    
    public SqlSessionFactory fac() {
        return Config.getSqlSessionFactory();
    }

}
