package com.ray.entity.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ray.common.H2Util;
import com.ray.common.XmlConfigRunner;
import com.ray.entity.Question;

@RunWith(XmlConfigRunner.class)
public class TestQuestionDao {
    
    QuestionDao dao;
    
    @Before
    public void init() {
        H2Util.init();
        dao = new QuestionDao();
    }
    
    @Test
    public void testQuestionSelect() {
        System.out.println("====== testQuestionSelect ========================");
        
        Question question = dao.selectQuestion(1);
        System.out.println(question);
    }
    
    @Test
    public void testQuestionSelectEmbed() {
        System.out.println("====== selectQuestionEmbed ========================");
        Question question = dao.selectQuestionEmbed(1);
        System.out.println(question);
    }
    
    @Test
    public void testQuestionSelectUnion() {
        System.out.println("====== testQuestionSelectUnion ========================");
        Question question = dao.selectQuestionUnion(1);
        System.out.println(question);
    }
    
    @Test
    public void testQuestionSelectAutoMapping() {
        
        System.out.println("====== testQuestionAutoMapping ========================");
        Question question = dao.selectQuestionAutoMapping(1);
        System.out.println(question);
        
    }
    
    
}
