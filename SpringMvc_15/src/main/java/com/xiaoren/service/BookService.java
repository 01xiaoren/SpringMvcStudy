package com.xiaoren.service;

import com.xiaoren.domain.Book;

import java.util.List;

public interface BookService {/**
 * 保存
 *
 * @param book
 * @return
 */
public boolean save(Book book);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 修改
     *
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 查询单个
     *
     * @param id
     * @return
     */
    public Book findById(Integer id);

    /**
     * 查询所有
     *
     * @return
     */
    public List<Book> findAll();
}
