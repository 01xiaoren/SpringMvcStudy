package com.xiaoren.controller;

import com.xiaoren.domain.Book;
import com.xiaoren.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//统一每一个控制器方法返回值
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        /**
         * 因为是boolean；所以存在判断；条件如果成功；状态码成功；且拿取返回数据
         */
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping
    public Result getAll() {
        List<Book> bookList = bookService.findAll();
        /**
         * 如果；传入的 book集合的信息不存在；状态码失败，提示信息“查询失败请重试"
         * 换言之；如果传入的book集合信息存在，状态码成功，提示想信息设置为”“
         */
        Integer code = bookList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = bookList != null ? "" : "数据查询失败，请重试！";
        return new Result(code, bookList, msg);
    }
}
