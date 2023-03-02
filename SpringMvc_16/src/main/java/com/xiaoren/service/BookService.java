package com.xiaoren.service;

import com.xiaoren.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    /****
     * 新增添加操作
     * @param book
     * @return
     */
    public boolean save(Book book);

    /***
     * 修改操作
     * @param book
     * @return
     */
    public boolean update(Book book);


    /***
     * 删除操作
     * 判断是否成功
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /***
     * 查找单个
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /***
     * 查找所有
     * @return
     */
    public List<Book> getALL();
}
