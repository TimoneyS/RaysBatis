package com.ray.common;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Config {
    
    private static SqlSessionFactory sqlSessionFactory;
    
    public static void init(String file) {
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder()
                    .build(Resources.getResourceAsStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
    
    
}
