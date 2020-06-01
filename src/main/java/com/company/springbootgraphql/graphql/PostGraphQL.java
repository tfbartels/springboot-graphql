package com.company.springbootgraphql.graphql;

import com.company.springbootgraphql.service.PostService;

import java.util.List;

import com.company.springbootgraphql.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class PostGraphQL implements GraphQLQueryResolver {

    @Autowired
    private PostService postService;

    public List<Post> posts(){
        return postService.getPosts();
    }


}