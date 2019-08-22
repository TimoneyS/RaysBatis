package com.ray.anno.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.ray.anno.mapper.AuthorMapper;
import com.ray.common.Config;
import com.ray.dao.AuthorDao;
import com.ray.entity.Author;

public class AuthorDaoImpl implements AuthorDao {

    @Override
    public Author selectOne(long id) {
        try(SqlSession session = fac().openSession()) {
            AuthorMapper authorMapper = session.getMapper(AuthorMapper.class);
            return authorMapper.selectOne(id);
        }
    }
    
    public SqlSessionFactory fac() {
        return Config.getSqlSessionFactory();
    }

}
