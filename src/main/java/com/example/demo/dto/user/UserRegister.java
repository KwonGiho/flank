package com.example.demo.dto.user;

/**
 * Created by kwongiho on 2017. 5. 27..
 */
public interface UserRegister extends User{
    @Override
    String getEmail();
    String getPassword();
    String getGender();
    String getNickName();
}
