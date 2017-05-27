package com.example.demo.dto;

import com.example.demo.dto.user.UserJWT;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by kwongiho on 2017. 5. 27..
 */
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserSession implements UserJWT {
    /**
     * 발급 대상자
     */
    private String email;
    /**
     * 발급자 - Flank 서버(Issuer)
     */
    private String iss;
    /**
     * 유효기간 (Expiration Time)
     */
    private String exp;
    /**
     * 토큰이 발급된 시간 (Issued At)
     */
    private String iat;

    /**
     * not implement yet.
     * @return
     */
    private String makeJWT() {
        return "asdf";
    }

}
