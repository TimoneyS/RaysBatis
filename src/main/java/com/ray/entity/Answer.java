package com.ray.entity;

import java.util.Date;
import java.util.List;

public class Answer {

    int        id;
    Author     author;
    String     content;
    List<Post> posts;
    Date       createDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
    
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("    ").append(author).append(":").append(content).append('\n');
        if (posts != null) {
            for (Post p : posts) {
                sb.append("      ").append(p).append('\n');
            }
        }
        return sb.toString();
    }

}
