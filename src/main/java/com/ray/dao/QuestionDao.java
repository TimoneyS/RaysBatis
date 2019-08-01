package com.ray.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class QuestionDao {
    
    SqlSessionFactory sqlSessionFactory;
    
    public Question getSingle(long id) {
        
        SqlSession sess = sqlSessionFactory.openSession();
        
        try {
//            QuestionMapper mapper = sess.getMapper(QuestionMapper.class);
//            return mapper.selectQuestion(id);
            return sess.selectOne("com.ray.dao.QuestionMapper.selectQuestion", id);
        } finally {
            sess.close();
        }
        
        
    }
    
    public void save(Question question) {
        SqlSession sess = sqlSessionFactory.openSession();
        sess.insert("insert into question ( question_id, question_title, question_content, author_id, create_date) values ? ? ? ? ?", question);
        sess.commit();
    }
    
    public static void main(String[] args) throws IOException {
        
        QuestionDao dao =  new QuestionDao();
        
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        dao.sqlSessionFactory = sqlSessionFactory;
        
        Question ques = dao.getSingle(26l);
        
        System.out.println(ques.question_title);
        System.out.println(ques.question_content);        
        
    }

}
