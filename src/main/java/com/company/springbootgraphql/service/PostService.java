package com.company.springbootgraphql.service;

import com.company.springbootgraphql.repository.PostRepository;

import java.util.List;

import com.company.springbootgraphql.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getPosts(){
        return postRepository.findAll();
    }


}