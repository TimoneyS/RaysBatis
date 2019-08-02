package com.ray.init;

import org.apache.ibatis.session.SqlSessionFactory;

public class Init {
    
    public static SqlSessionFactory sqlSessionFactory; 
    static {
        init();
    }
    
    private static void init() {
        // TODO Auto-generated method stub
        
    }
    

}
