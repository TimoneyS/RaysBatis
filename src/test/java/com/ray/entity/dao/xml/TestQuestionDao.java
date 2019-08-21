package com.ray.entity.dao.xml;

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
    
    @Test
    public void testQueryOne() {
        Question ques = dao.selectOne(1);
        out.println(ques);
        
    }
    
}
