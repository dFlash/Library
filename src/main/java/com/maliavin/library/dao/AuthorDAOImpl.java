package com.maliavin.library.dao;

import com.maliavin.library.model.Author;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthorDAOImpl implements AuthorDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public List<Author> list() {
        return hibernateTemplate.getSessionFactory()
                .getCurrentSession().createQuery("from Author").list();
    }
}
