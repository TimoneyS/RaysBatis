package com.ray.demo;

import org.junit.Before;
import org.junit.Test;

import com.ray.demo.codeconfig.CodeConfig;
import com.ray.demo.codeconfig.DogDao;

public class TestCodeConfig {

    DogDao dao;
    
    @Before
    public void init() {
        CodeConfig.init();
        dao = new DogDao();
    }
    
    @Test
    public void testSelect() {
        Dog d = dao.selectDog(1);
        System.out.printf("Dog : name = %s, age = %d\n", d.name, d.age);
    }
    
}
