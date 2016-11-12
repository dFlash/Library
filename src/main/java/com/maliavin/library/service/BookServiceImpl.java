package com.maliavin.library.service;

import com.maliavin.library.dao.BookDAO;
import com.maliavin.library.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDAO bookDAO;

    @Transactional(readOnly = true)
    public List<Book> list() {
        return bookDAO.list();
    }
}
