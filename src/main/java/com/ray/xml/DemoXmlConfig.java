package com.ray.xml;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ray.Dog;

public class DemoXmlConfig {
    
    public static void main(String[] args) throws IOException {
        
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsStream("com/ray/xml/mybatis-config.xml"));
        try (SqlSession sess = sqlSessionFactory.openSession()) {
            Dog d = sess.selectOne("com.ray.xml.DogMapper.queryDog", 1);
            System.out.println(d.getName());
            System.out.println(d.getAge());       
        }
        
    }
    
}
