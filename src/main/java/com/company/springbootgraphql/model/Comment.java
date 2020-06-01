package com.company.springbootgraphql.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "COMMENTS")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "TEXT")
    private String text;
    @Column(name = "DATE")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;


    public Comment() {

    }

    public Comment(String text, Post post, User user,  Date date) {
        this.text = text;
        this.post = post;
        this.user = user;
        this.date = date;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

      
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    

}