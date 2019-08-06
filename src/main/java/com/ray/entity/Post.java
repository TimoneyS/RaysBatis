package com.ray.entity;

import java.util.Date;

public class Post {
    int    id;
    String content;
    Author author;
    Date   createDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("      ").append(content).append("\n       (").append(author).append(")").append(createDate);
        
        return sb.toString();
    }

}
