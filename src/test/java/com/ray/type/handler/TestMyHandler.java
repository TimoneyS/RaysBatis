package com.ray.type.handler;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import com.ray.common.Config;
import com.ray.entity.Pair;
import com.ray.entity.mapper.PairMapper;

public class TestMyHandler {
    
    @Before
    public void init() {
        Config.init("com/ray/typehandler/mybatis-config.xml");
    }
    
    @Test
    public void testSelectValue() {
        
        try(SqlSession sess = Config.getSqlSessionFactory().openSession()) {
            Pair p = sess.getMapper(PairMapper.class).queryPair(1);
            System.out.printf("Pair : id = %d, value = %s\n", p.getId(), p.getValue());
        }
        
    }
    
}
