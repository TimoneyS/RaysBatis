package com.ray.entity.dao;

import org.apache.ibatis.session.SqlSession;

import com.ray.common.Config;
import com.ray.entity.Author;
import com.ray.mapper.AuthorMapper;

public class AuthorDao {
    
    public void add(Author author) {
        try (SqlSession sess = Config.getSqlSessionFactory().openSession()) {
            AuthorMapper mapper = sess.getMapper(AuthorMapper.class);
            mapper.add(author);
            sess.commit();
        }
    }
    
    public Author querySingle(long id) {
        try (SqlSession sess = Config.getSqlSessionFactory().openSession()) {
            AuthorMapper mapper = sess.getMapper(AuthorMapper.class);
            return mapper.querySingle(id);
        }
    }

}
