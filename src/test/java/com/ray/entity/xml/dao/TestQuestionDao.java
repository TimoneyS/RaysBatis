package com.ray.entity.xml.dao;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.TransactionIsolationLevel;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ray.common.Config;
import com.ray.common.XmlConfigRunner;
import com.ray.dao.QuestionDao;
import com.ray.entity.Author;
import com.ray.entity.Question;
import com.ray.entity.Reply;
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

    public void testQueryOneU() {
        Question ques = dao.selectOneU(1);
        System.out.println("查询完毕");
        out.println(ques);
    }

    public void testInsert() {
        long id = 5;
        Question q = newQuestion(id, 1l);
        dao.insert(q);
    }
    
    @Test
    public void testCache() {
        
        Question q = dao.selectOne(1);
        
        q.setTitle("1241");
        dao.update(q);
        
        q = dao.selectOne(q.getId());
        out.println(q);
        
    }

    public void testTransaction() {
        
        long id = 1;
        Question q1, q2;
        
        SqlSession sess1 = Config.openSession(TransactionIsolationLevel.REPEATABLE_READ);
        SqlSession sess2 = Config.openSession(TransactionIsolationLevel.REPEATABLE_READ); 
        
        q1 = sess1.selectOne("Question.selectOne", id);
        
        sess2.delete("Question.deleteOne", id);
        sess2.commit();
        
        sess1.clearCache();
        q2 = sess1.selectOne("Question.selectOne", id);
        
        out.println(q1);
        out.println(q2);
        
        sess1.close();
        sess2.close();
        
    }
    
    Question newQuestion(long id, long autorId) {
        Question q = new Question();
        q.setAuthor(null);
        q.setContent("question content" + id);
        q.setTitle("question title " + id);
        q.setId(id);
        q.setCreateDate(new Date());
        
        Author author = new Author();
        author.setId(autorId);
        
        q.setAuthor(author);
        
        q.setReplys(new ArrayList<Reply>());
        
        return q;
    }
    
    
}
