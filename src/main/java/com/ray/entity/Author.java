package com.ray.entity;

import java.util.Date;

public class Author {

    private Long   id;
    private String username;
    private String realname;
    private Date   createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
    @Override
    public String toString() {
        return "id = " + id + "\n" +
                "username = " + username + "\n" +
                "realname = " + realname + "\n" +
                "createDate = " + createDate + "\n";
    }

}
