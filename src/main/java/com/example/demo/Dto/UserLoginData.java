package com.example.demo.dto;

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
public class UserLoginData {
    private String email;
    private String password;
}
