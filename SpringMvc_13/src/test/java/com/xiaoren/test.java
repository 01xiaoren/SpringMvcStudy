package com.xiaoren;

import com.xiaoren.config.SpringConfig;
import com.xiaoren.domain.Book;
import com.xiaoren.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class test {
    @Autowired
    private BookService bookService;

    @Test
    public void testFindById() {
        Book byId = bookService.findById(2);
        System.out.println(byId);
    }

    @Test
    public void testFindAll() {
        List<Book> all = bookService.findAll();
        for (Book book : all) {
            System.out.println(book);
        }
    }
}
