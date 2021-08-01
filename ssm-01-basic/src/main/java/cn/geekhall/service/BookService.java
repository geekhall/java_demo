package cn.geekhall.service;

import cn.geekhall.bean.Book;

import java.util.List;

/**
 * BookService.java
 *
 * @author yiny
 */
public interface BookService {

    int addBook(Book book);
    int delBook(int id);
    int updateBook(Book book);
    Book queryBookById(int id);
    List<Book> getAllBooks();
}
