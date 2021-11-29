package com.example.demo.service;

import com.example.demo.model.LoginResultModel;


public interface LoginService {
    LoginResultModel login(String name,String password);
}
