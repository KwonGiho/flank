package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.dto.UserLoginData;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by kwongiho on 2017. 5. 21..
 */
public interface UserService {
    UserDTO register(UserDTO userDTO);
    UserDTO updateUser(UserDTO userDTO);
    UserDTO deleteUser(UserDTO userDTO);
    UserDTO login(UserLoginData userLoginData , HttpServletRequest request);

}
