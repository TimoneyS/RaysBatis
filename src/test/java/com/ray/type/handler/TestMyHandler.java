package com.ray.type.handler;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.ray.common.XmlConfigRunner;
import com.ray.entity.Pair;
import com.ray.entity.dao.PairDao;

@RunWith(XmlConfigRunner.class)
public class TestMyHandler {
    
    @Test
    public void testSelectValue() {
        PairDao dao = new PairDao();
        Pair p = dao.queryPair(1);
        System.out.printf("Pair : id = %d, value = %s\n", p.getId(), p.getValue());
    }
    
}
