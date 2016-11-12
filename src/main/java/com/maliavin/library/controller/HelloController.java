package com.maliavin.library.controller;

import com.maliavin.library.model.Author;
import com.maliavin.library.model.Book;
import com.maliavin.library.service.AuthorService;
import com.maliavin.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public ModelAndView authorsPage(){

        List<Author> authors = authorService.list();
        ModelAndView view = new ModelAndView("authors");
        view.addObject("authors", authors);
        return view;
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public ModelAndView booksPage(){

        List<Book> books = bookService.list();
        ModelAndView view = new ModelAndView("books");
        view.addObject("books", books);
        return view;
    }
}
