package com.example.demo.controller;
import com.example.demo.model.LoginResultModel;
import com.example.demo.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;

@Controller
public class LoginController {
    @Resource
    LoginService loginService;

    @RequestMapping(value ="/login", method = RequestMethod.GET)
    @ResponseBody
    public Object login(@RequestParam(name ="name", required = false) String name,
                        @RequestParam(name="password",required=false) String password){
        LoginResultModel loginResultModel= loginService.login(name,password);
        return loginResultModel;
    }

}
