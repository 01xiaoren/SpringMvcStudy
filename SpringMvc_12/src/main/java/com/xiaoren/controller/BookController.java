package com.xiaoren.controller;

import com.xiaoren.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @PostMapping
    public String save(@RequestBody Book book) {
        System.out.println("book>>>>  " + book);
        return "{'module':'save book ...'}";
    }

    @GetMapping
    public List<Book> getALL() {
        List<Book> books = new ArrayList<Book>();
        Book book = new Book("计算机", "缓存", "缓存机制及逻辑");
        books.add(book);


        Book book1 = new Book();
        book1.setType("操作系统");
        book1.setName("linux");
        book1.setDescription("是一个不错的操作系统");
        books.add(book1);
        System.out.println("集合参数book>>." + books);
        return books;
    }
}
