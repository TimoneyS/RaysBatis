package com.ray.entity.dao.xml;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ray.common.H2Util;
import com.ray.common.XmlConfigRunner;
import com.ray.dao.AuthorDao;
import com.ray.entity.Author;
import com.ray.xml.dao.AuthorDaoImpl;

@RunWith(XmlConfigRunner.class)
public class TestAuthorDao {
    
    AuthorDao dao;
    PrintStream out = System.out;
    
    @Before
    public void init() {
        H2Util.init();
        dao = new AuthorDaoImpl();
    }
    
    @Test
    public void testSelectOne() {
        long id = 1l;
        Author author = dao.selectOne(id);
        
        out.println(author);
    }
    
}
