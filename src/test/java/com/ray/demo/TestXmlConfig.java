package com.ray.demo;

import org.junit.Before;
import org.junit.Test;

import com.ray.common.H2Util;
import com.ray.demo.xmlconfig.DogDao;
import com.ray.demo.xmlconfig.XmlConfig;
import com.ray.entity.Dog;

public class TestXmlConfig {
    
    DogDao dao;
    
    @Before
    public void init() {
        XmlConfig.init();
        H2Util.init("com/ray/demo/schema.sql");
        dao = new DogDao();
    }
    
    @Test
    public void testSelect() {
        Dog d = dao.selectDog(1);
        System.out.printf("Dog : name = %s, age = %d\n", d.getName(), d.getAge());
    }
    
}
