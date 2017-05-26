package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.dto.UserLoginData;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by kwongiho on 2017. 5. 21..
 */
@RestController("/user")
public class UserController {

    @Autowired
    UserService userServiceImpl;

    @RequestMapping(value="/test",method = RequestMethod.GET)
    public String testMethod(HttpServletRequest request , HttpServletResponse response ) throws Exception {
        return "testSuccess";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public UserDTO login(HttpServletRequest request , HttpServletResponse response , @RequestBody UserLoginData userLoginData) throws Exception {
        return userServiceImpl.login(userLoginData , request);
    }

    @RequestMapping(value="/register" , method = RequestMethod.POST)
    public UserDTO login(HttpServletRequest request , HttpServletResponse response , @RequestBody UserDTO userDTO) throws Exception {
        System.out.println("asdfaksdbflkjqbwef");
        return userServiceImpl.register(userDTO);
    }
    /*
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public UserDTO login(HttpServletRequest request, HttpServletResponse response,
                                              @RequestBody LoginDataDTO loginData) throws Exception {

        if (loginData.getLoginType() == null)
            throw new IllegalArgumentException("NO join Type");

        switch (loginData.getLoginType()) {
            case "012001":
                return userService.login(loginData.getEmail(), loginData.getPw(), request)
                        .toSingle();
            case "012002":
                return userService.loginByKey(loginData.getEmail(), loginData.getKey(), request)
                        .toSingle();
            case "012003":
                return facebookService.getEmail(loginData.getToken())
                        .flatMap(user -> userService.loginByToken(user.getEmail(), loginData.getToken(), request))
                        .toSingle();
            default:
                throw new RuntimeException("invaild login code");
        }
    }*/
}
