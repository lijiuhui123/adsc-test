package com.adsc.service;

import com.adsc.domain.ResponseResult;
import com.adsc.domain.User;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
