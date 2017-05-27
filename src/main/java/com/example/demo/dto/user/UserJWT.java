package com.example.demo.dto.user;

/**
 * Created by kwongiho on 2017. 5. 27..
 */
public interface UserJWT extends User{
    String getIss();
    String getExp();
    String getIat();
}
