package cn.geekhall.dao;

import cn.geekhall.bean.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * BookMapper.java
 *
 * @author yiny
 */
public interface BookMapper {

    int addBook(Book book);
    int delBook(@Param("id") int id);
    int updateBook(Book book);
    int queryBookById(@Param("id") int id);
    List<Book> getAllBooks();

}
