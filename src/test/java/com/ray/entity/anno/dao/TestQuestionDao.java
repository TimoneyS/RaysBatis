package com.ray.entity.anno.dao;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ray.anno.dao.QuestionDaoImpl;
import com.ray.common.AnnoConfigRunner;
import com.ray.dao.QuestionDao;
import com.ray.entity.Question;

@RunWith(AnnoConfigRunner.class)
public class TestQuestionDao {
    
    QuestionDao dao;
    PrintStream out = System.out;
    
    @Before
    public void init() {
        dao = new QuestionDaoImpl();
    }
    
    @Test
    public void testSelectOne() {
        long id = 1l;
        Question question = dao.selectOne(id);
        out.println("查询完毕");
        out.println(question);
    }
   
    public void testSelectOneU() {
        long id = 1l;
        Question question = dao.selectOneU(id);
        out.println("查询完毕");
        out.println(question);
    }
    
}
