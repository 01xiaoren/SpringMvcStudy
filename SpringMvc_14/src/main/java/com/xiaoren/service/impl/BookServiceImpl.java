package com.xiaoren.service.impl;

import com.xiaoren.dao.BookDao;
import com.xiaoren.domain.Book;
import com.xiaoren.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    public Book findById(Integer id) {
        return bookDao.findById(id);
    }

    public List<Book> findAll() {
        return bookDao.findAll();
    }
}
