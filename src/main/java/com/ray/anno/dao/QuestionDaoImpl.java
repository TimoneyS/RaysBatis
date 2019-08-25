package com.ray.anno.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.ray.anno.mapper.QuestionMapper;
import com.ray.common.Config;
import com.ray.dao.QuestionDao;
import com.ray.entity.Question;

public class QuestionDaoImpl implements QuestionDao {

    @Override
    public Question selectOne(long id) {
        try(SqlSession session = fac().openSession()) {
            QuestionMapper map = session.getMapper(QuestionMapper.class);
            return map.selectOne(id);
        }
    }
    
    public SqlSessionFactory fac() {
        return Config.getSqlSessionFactory();
    }

    @Override
    public Question selectOneU(long id) {
        throw new RuntimeException("not support right now()");
    }

    @Override
    public void insert(Question question) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(Question question) {
        // TODO Auto-generated method stub
        
    }

}
