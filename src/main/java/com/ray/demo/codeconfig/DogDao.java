package com.ray.demo.codeconfig;

import org.apache.ibatis.session.SqlSession;

import com.ray.demo.Dog;

public class DogDao {
    
    public Dog selectDog(int id) {
        
        try (SqlSession session = CodeConfig.sqlSessionFactory.openSession()) {
            DogMapper mapper = session.getMapper(DogMapper.class);
            Dog d = mapper.selectDog(id);
            return d;
        }
        
    }
    
}
