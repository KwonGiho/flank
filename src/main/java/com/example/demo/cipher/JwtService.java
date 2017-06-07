package com.example.demo.cipher;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import org.springframework.stereotype.Service;

import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;


/**
 * Created by kwongiho on 2017. 6. 2..
 */
@Service
public class JwtService {
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
    public String getJWT() {
        Key key = MacProvider.generateKey();
        String compactJws = Jwts.builder().setSubject("flank").signWith(SignatureAlgorithm.HS512,key).compact();
        return compactJws;
    }
}
