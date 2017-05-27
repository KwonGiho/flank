package com.example.demo.dto.user;

/**
 * Created by kwongiho on 2017. 5. 27..
 */
public interface UserLogin extends User{
    @Override
    String getEmail();
    String getPassword();
}
