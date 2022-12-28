package com.adsc.controller;

import com.adsc.domain.ResponseResult;
import com.adsc.domain.User;
import com.adsc.service.LoginServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginServcie loginServcie;

    @PostMapping("/user/login")
    public ResponseResult login(@RequestBody User user){
        return loginServcie.login(user);
    }

    @RequestMapping("/user/logout")
    public ResponseResult logout() {
        return loginServcie.logout();
    }
}


