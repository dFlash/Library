package com.maliavin.library.service;

import com.maliavin.library.dao.AuthorDAO;
import com.maliavin.library.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    private AuthorDAO authorDAO;

    @Transactional(readOnly = true)
    public List<Author> list() {
        return authorDAO.list();
    }
}
