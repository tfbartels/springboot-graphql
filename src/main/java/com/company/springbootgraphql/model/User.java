package com.company.springbootgraphql.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy="user")
    private List<Post> posts;

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

}