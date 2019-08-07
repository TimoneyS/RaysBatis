package com.ray.entity.dao;

import java.util.Date;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import com.ray.common.XmlConfigRunner;
import com.ray.entity.Author;
import com.ray.entity.Question;

@RunWith(XmlConfigRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestQuestionTransaction {
    
    QuestionDao dao;
    
    @Before
    public void init() {
        dao = new QuestionDao();
    }
    
    @Test()
    public void test1() {
        System.out.println("新增");
        Question ques = new Question();
        Author a = new Author();
        a.setId(2L);
        
        ques.setAuthor(a);
        ques.setId(2L);
        ques.setTitle("随便问问");
        ques.setContent("有么有什么好玩的");
        ques.setCreateDate(new Date());
        
        dao.insertQuestion(ques);
        
    }
    
    @Test()
    public void test2() {
        System.out.println("查询");
        
        Question ques = dao.selectQuestion(2);
        
        System.out.println(ques);
    }
    
}
