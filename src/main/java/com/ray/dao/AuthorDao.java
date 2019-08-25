package com.ray.dao;

import java.util.List;

import com.ray.entity.Author;

public interface AuthorDao {
    public Author selectOne(long id);
    public List<Author> selectByUsername(String username);
    
}
