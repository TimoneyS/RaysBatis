package com.ray.entity.dao;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ray.common.H2Util;
import com.ray.common.XmlConfigRunner;
import com.ray.entity.Author;

@RunWith(XmlConfigRunner.class)
public class TestAuthorDao {
    
    AuthorDao dao;
    
    @Before
    public void init() {
        H2Util.init();
        dao = new AuthorDao();
    }
    
    @Test
    public void testQuerySingle() {
        System.out.println("====== testQuerySingle ========================");
        
        Author author = new Author();
        author.setId(123456L);
        author.setUsername("dwmlqflqw");
        author.setRealname("分为七个");
        author.setCreateDate(new Date());
        dao.add(author);
        
        Author a = dao.querySingle(author.getId());
        
        System.out.println(a);
        
        
    }
    
}
