package com.ray.xml.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.ray.common.Config;
import com.ray.dao.AuthorDao;
import com.ray.entity.Author;

public class AuthorDaoImpl implements AuthorDao {

    @Override
    public Author selectOne(long id) {
        try(SqlSession sess = fac().openSession()) {
            return sess.selectOne("Author.selectOne", id);
        }
    }
    
    @Override
    public List<Author> selectByUsername(String username) {
        try(SqlSession sess = fac().openSession()) {
             return sess.selectList("Author.selectByUsername", username);
        }
    }
    
    public SqlSessionFactory fac() {
        return Config.getSqlSessionFactory();
    }



}
