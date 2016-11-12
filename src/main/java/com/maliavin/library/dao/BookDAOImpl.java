package com.maliavin.library.dao;

import com.maliavin.library.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public List<Book> list() {
        return hibernateTemplate.getSessionFactory()
                .getCurrentSession().createQuery("from Book order by name").list();
    }
}
