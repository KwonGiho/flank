package com.example.demo.controller.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kwongiho on 2017. 6. 7..
 */
@Controller
public class FrontController {
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index(){
        return "login";
    }
}
