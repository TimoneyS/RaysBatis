package com.ray.entity.xml.dao;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ray.common.XmlConfigRunner;
import com.ray.dao.QuestionDao;
import com.ray.entity.Question;
import com.ray.xml.dao.QuestionDaoImpl;

@RunWith(XmlConfigRunner.class)
public class TestQuestionDao {
    
    public QuestionDao dao;
    public PrintStream out = System.out;
    
    @Before
    public void init() {
        dao = new QuestionDaoImpl();
    }
    
    public void testQueryOne() {
        Question ques = dao.selectOne(1);
        System.out.println("查询完毕");
        out.println(ques);
    }
    
    @Test
    public void testQueryOneU() {
        Question ques = dao.selectOneU(1);
        System.out.println("查询完毕");
        out.println(ques);
    }
    
}
