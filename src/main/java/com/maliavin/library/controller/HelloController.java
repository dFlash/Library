package com.maliavin.library.controller;

import com.maliavin.library.model.Author;
import com.maliavin.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private AuthorService authorService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloPage(){

        List<Author> authors = authorService.list();
        System.out.println("Authors: \r\n"+authors.toString());
        return "hello";
    }
}
