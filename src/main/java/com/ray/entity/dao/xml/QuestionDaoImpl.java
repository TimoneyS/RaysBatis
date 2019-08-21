package com.ray.entity.dao.xml;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.ray.common.Config;
import com.ray.entity.Question;
import com.ray.entity.dao.QuestionDao;

public class QuestionDaoImpl implements QuestionDao {

    @Override
    public Question selectOne(long id) {
        try(SqlSession sess = fac().openSession()) {
            sess.selectOne("Question.selectOne", id);
        }
        return null;
    }
    
    public SqlSessionFactory fac() {
        return Config.getSqlSessionFactory();
    }

}
