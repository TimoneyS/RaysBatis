package com.ray.entity.dao;

import org.apache.ibatis.session.SqlSession;

import com.ray.common.Config;
import com.ray.entity.Pair;
import com.ray.entity.mapper.PairMapper;

public class PairDao {
    
    public Pair queryPair(int id) {
        try (SqlSession sess = Config.getSqlSessionFactory().openSession()) {
            return sess.getMapper(PairMapper.class).queryPair(id);
        }
    }
    
}
