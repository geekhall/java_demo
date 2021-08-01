package cn.geekhall.service;

import cn.geekhall.bean.Book;
import cn.geekhall.dao.BookMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * BookServiceImpl.java
 *
 * @author yiny
 */
public class BookServiceImpl implements BookService {
    private BookMapper bookMapper;

    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    public int delBook(int id) {
        return bookMapper.delBook(id);
    }

    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    public Book queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    public Book queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }
}
