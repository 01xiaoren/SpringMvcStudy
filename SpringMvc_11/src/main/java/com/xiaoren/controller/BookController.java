package com.xiaoren.controller;

import com.xiaoren.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/books")

public class BookController {
    @PostMapping
    public String save(@RequestBody Book book) {
        System.out.println("book>>>>      " + book);
        return "{'module':''save ....do}";
    }

    @GetMapping
    public List<Book> getAll() {
        System.out.println("books>>>>  ");

        List<Book> books1 = new LinkedList<Book>();
        Book book = new Book();
        book.setName("java");
        book.setType("计算机");
        book.setDescription("世界上最好的语言");

        books1.add(book);

        Book book1 = new Book("数据库", "mysql", "必会的数据库");
        books1.add(book1);
        for (Book book2 : books1) {
            System.out.println("book2>>. " + book2);
        }

        return books1;
    }
}
