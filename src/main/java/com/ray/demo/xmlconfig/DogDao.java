package com.ray.demo.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import com.ray.entity.Dog;

public class DogDao {
    
    public Dog selectDog(int id) {
        try (SqlSession session = XmlConfig.sqlSessionFactory.openSession()) {
            Dog d = session.selectOne("DogMapper.queryDog", id);
            return d;
        }
    }
    
}
