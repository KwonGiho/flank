package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.dto.UserLoginData;
import com.example.demo.dto.UserSession;
import com.example.demo.dto.user.User;
import com.example.demo.dto.user.UserLogin;
import com.example.demo.dto.user.UserRegister;
import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by kwongiho on 2017. 5. 21..
 */
@Service(value="UserService")
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;


    @Override
    public UserDTO register(UserRegister userRegister) {
        if( isRegister(userRegister.getEmail()) )
            return new UserDTO();
        return userRepository.save((UserDTO)userRegister);
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
    public UserDTO login(UserLogin userLoginData, HttpServletRequest request) {
        UserDTO willLoginUser = userRepository.findByEmailAndPassword(userLoginData.getEmail(),userLoginData.getPassword());

        if(willLoginUser == null)
            return new UserDTO();
        request.getSession().setAttribute(willLoginUser.getEmail(),willLoginUser);

        return willLoginUser;
    }

    /**
     * check that already register
     * @param email
     * @return
     */
    private boolean isRegister(String email) {
        User user = userRepository.findByEmail(email);
        if(user == null || !user.getEmail().equals(email))
            return false;
        return true;
    }

    @Override
    public void createVerificationTokenForUser(UserDTO user, String token) {

    }
}
