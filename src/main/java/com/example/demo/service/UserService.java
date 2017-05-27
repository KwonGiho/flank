package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.dto.user.UserLogin;
import com.example.demo.dto.user.UserRegister;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by kwongiho on 2017. 5. 21..
 */
public interface UserService {
    UserDTO register(UserRegister userRegister);
    UserDTO updateUser(UserDTO userDTO);
    UserDTO deleteUser(UserDTO userDTO);
    UserDTO login(UserLogin userLoginData , HttpServletRequest request);


}
