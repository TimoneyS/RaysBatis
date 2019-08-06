package com.ray.entity;

import java.util.Date;
import java.util.List;

public class Question {

    Long         id;
    String       title;
    String       content;
    List<Answer> answers;
    Author       author;
    Date         createDate;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
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
        
        sb.append("Question ").append(id).append(" : ").append(title).append('\n')
        .append("  ").append(author).append(" : ").append(content).append("\n")
        .append("  ").append(createDate).append('\n')
        .append("-----------------------------------------------------\n");
        
        if (answers != null) {
            for (Answer a : answers) {
                sb.append(a).append('\n');
            }
        }
        return sb.toString();
    }

}
