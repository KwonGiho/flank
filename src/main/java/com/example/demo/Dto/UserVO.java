package com.example.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by kwongiho on 2017. 5. 21..
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserVO {
    private String email;
    private String nickName;
    private String gender;
    private String password;
}
