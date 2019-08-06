package com.ray.demo.xmlconfig;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class XmlConfig {
    
    static SqlSessionFactory sqlSessionFactory;
    
    public static void init() {
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder()
                    .build(Resources.getResourceAsStream("com/ray/demo/xmlconfig/mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
