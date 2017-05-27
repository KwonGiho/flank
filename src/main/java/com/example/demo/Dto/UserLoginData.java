package com.example.demo.dto;

import com.example.demo.dto.user.User;
import com.example.demo.dto.user.UserLogin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by kwongiho on 2017. 5. 21..
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class UserLoginData implements UserLogin {
    private String email;
    private String password;
}
