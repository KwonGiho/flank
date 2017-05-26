package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.dto.UserLoginData;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by kwongiho on 2017. 5. 21..
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;


    @Override
    public UserDTO register(UserDTO userDTO) {
        /*UserDTO saveUser = userRepository.save(userDTO);
        if (saveUser.getEmail().equals("") || saveUser.getEmail() == null)
            return null;
        return saveUser;*/
        return userRepository.save(userDTO);

    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO deleteUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO login(UserLoginData userLoginData, HttpServletRequest request) {
        UserDTO willLoginUser = userRepository.findByEmailAndPassword(userLoginData.getEmail(),userLoginData.getPassword());

        request.getSession().setAttribute(willLoginUser.getEmail(),willLoginUser);

        return willLoginUser;
    }
}
