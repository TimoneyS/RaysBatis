package com.ray.dao;

import com.ray.entity.Author;

public interface AuthorDao {
    public Author selectOne(long id);
}
