package com.example.demo.controller;

import com.example.demo.cipher.JwtService;
import com.example.demo.dto.UserDTO;
import com.example.demo.dto.UserLoginData;
import com.example.demo.dto.UserSession;
import com.example.demo.dto.user.User;
import com.example.demo.dto.user.UserLogin;
import com.example.demo.dto.user.UserRegister;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.springframework.http.MediaType.*;

/**
 * Created by kwongiho on 2017. 5. 21..
 */
@RestController
public class UserController {

    @Autowired
    UserService userServiceImpl;

    @RequestMapping(value="/test",method = RequestMethod.GET)
    public String testMethod(HttpServletRequest request , HttpServletResponse response ) throws Exception {
        return "testSuccess";
    }

    /*@PostMapping("/login")
    public UserDTO login(HttpServletRequest request
            , HttpServletResponse response , @RequestBody UserLoginData userLoginData) throws Exception {
        System.out.println(userLoginData.toString());
        return userServiceImpl.login(userLoginData , request);
    }*/

    @RequestMapping(value="/register" , method = RequestMethod.POST)
    public UserRegister register(HttpServletRequest request , HttpServletResponse response , @RequestBody UserDTO userDTO) throws Exception {
        return userServiceImpl.register(userDTO);
    }

    @RequestMapping(value="/jwtest",method = RequestMethod.GET)
    public String jwtest(HttpServletRequest request , HttpServletResponse response ) throws Exception {
        return null;//return new JwtService().getJWT();
    }
}