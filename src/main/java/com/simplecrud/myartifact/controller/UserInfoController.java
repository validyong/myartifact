package com.simplecrud.myartifact.controller;

import com.simplecrud.myartifact.repository.UserInfoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {
    @Autowired
    UserInfoRepository userInfoRepository;
    

}
