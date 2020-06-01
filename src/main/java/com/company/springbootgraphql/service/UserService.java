package com.company.springbootgraphql.service;

import com.company.springbootgraphql.repository.UserRepository;

import java.util.List;

import com.company.springbootgraphql.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.findAll();
    }


}