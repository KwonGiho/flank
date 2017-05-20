package com.example.demo.Controller;

import com.example.demo.Dto.UserDTO;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * Created by kwongiho on 2017. 5. 21..
 */
@RestController("/user")
public class UserController {
    /*
	 * '유저 리스트 조회' 'GET' '/users' 'Observable<List<User>>'
	 */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public UserDTO login(HttpServletRequest request, HttpServletResponse response,
                                              @RequestBody LoginDataDTO loginData) throws Exception {

        if (loginData.getLoginType() == null)
            throw new IllegalArgumentException("NO join Type");

        switch (loginData.getLoginType()) {
            case "012001":
                return userService.login(loginData.getEmail(), loginData.getPw(), request)
                        .toSingle();
            case "012002":
                return userService.loginByKey(loginData.getEmail(), loginData.getKey(), request)
                        .toSingle();
            case "012003":
                return facebookService.getEmail(loginData.getToken())
                        .flatMap(user -> userService.loginByToken(user.getEmail(), loginData.getToken(), request))
                        .toSingle();
            default:
                throw new RuntimeException("invaild login code");
        }
    }
}
