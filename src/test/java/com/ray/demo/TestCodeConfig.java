package com.ray.demo;

import org.junit.Before;
import org.junit.Test;

import com.ray.common.H2Util;
import com.ray.demo.codeconfig.CodeConfig;
import com.ray.demo.codeconfig.DogDao;
import com.ray.entity.Dog;

public class TestCodeConfig {

    DogDao dao;
    
    @Before
    public void init() {
        CodeConfig.init();
        H2Util.init("schema.sql");
        dao = new DogDao();
    }
    
    @Test
    public void testSelect() {
        Dog d = dao.selectDog(1);
        System.out.printf("Dog : name = %s, age = %d\n", d.getName(), d.getAge());
    }
    
}
