package com.company.springbootgraphql.graphql;

import com.company.springbootgraphql.service.UserService;

import java.util.List;

import com.company.springbootgraphql.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class UserGraphQL implements GraphQLQueryResolver {

    @Autowired
    private UserService userService;

    public List<User> users(){
        return userService.getUsers();
    }


}