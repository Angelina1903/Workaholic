package com.example.demo.service.impl;
import com.example.demo.model.LoginResultModel;
import com.example.demo.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
    @Override
    public LoginResultModel login(String name, String password){
        LoginResultModel loginResultModel = new LoginResultModel();
        if(("example").equals(name)&&("123").equals(password)) {
            loginResultModel.setSuccess(true);
        }else{
            loginResultModel.setSuccess(false);
            loginResultModel.setFailureReason("Wrong account/password");
        }
        return loginResultModel;
    }
}
