package com.example.demo.cipher;

import com.example.demo.dto.UserDTO;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.UnsupportedCharsetException;
import java.security.Key;
import java.util.Date;


/**
 * Created by kwongiho on 2017. 6. 2..
 */
//@Service
public class JwtService {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${plank.jwt.secret.key}")
    String jwtSecretKey;

    /**
     * Not used and not implementation
     * @param id
     * @param issuer
     * @param subject
     * @param millis
     * @return
     */
    public String getJWT(String id,String issuer , String subject , long millis) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        long nowMillis = System.currentTimeMillis();

        Date now = new Date(nowMillis);

        byte[] apiKeySecreByte = DatatypeConverter.parseBase64Binary("secret");


        return null;
    }
    public String getJWT(UserDTO userDTO){
        try {

            return createJWT(userDTO) ;

        } catch(UnsupportedEncodingException uee) {

            logger.error(uee.getMessage());

            return null;
        }
    }
    public String getJWT(String email, String nickName , String gender) {
        return getJWT(new UserDTO(
                email,
                nickName,
                gender,
                "password" // not avaliable.
        ));
    }

    private String createJWT(UserDTO userDTO) throws UnsupportedEncodingException{

        return Jwts.builder().
                setSubject("userInfo").
                setIssuer("plank").
                claim("email", userDTO.getEmail()).
                claim("nickName",userDTO.getNickName()).
                claim("gender",userDTO.getGender()).
                signWith(SignatureAlgorithm.HS512,
                        jwtSecretKey.getBytes("UTF-8")).
                compact().replace("=",""); // Symbol "=" is spacing padding only.

    }
}
