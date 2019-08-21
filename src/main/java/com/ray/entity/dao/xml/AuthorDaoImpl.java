package com.ray.entity.dao.xml;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.ray.common.Config;
import com.ray.entity.Author;
import com.ray.entity.dao.AuthorDao;

public class AuthorDaoImpl implements AuthorDao {

    @Override
    public Author selectOne(long id) {
        try(SqlSession sess = fac().openSession()) {
            return sess.selectOne("Author.selectOne", id);
        }
    }
    
    public SqlSessionFactory fac() {
        return Config.getSqlSessionFactory();
    }

}
