package com.maliavin.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Dmitriy on 07.11.2016.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloPage(){
        return "hello";
    }
}
