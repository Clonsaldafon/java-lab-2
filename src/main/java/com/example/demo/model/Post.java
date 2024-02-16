package com.example.demo.model;

import java.util.Date;

public class Post {

    public Long id;
    final private String text;
    private Integer likes;
    final private Date creationDate;

    public Post(Long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
        this.likes = 0;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
