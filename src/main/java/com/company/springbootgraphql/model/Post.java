package com.company.springbootgraphql.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "POSTS")
public class Post {

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

    @OneToMany(fetch = FetchType.EAGER, mappedBy="post")
    private List<Comment> comments;

    public Post() {

    }

    public Post(String text, Date date, User user, List<Comment> comments) {
        this.text = text;
        this.date = date;
        this.user = user;
        this.comments = comments;
        
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

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
    

}