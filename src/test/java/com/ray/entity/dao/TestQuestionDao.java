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
        Question question = dao.selectQuestion(26);
        System.out.println(question);
    }
    
}
