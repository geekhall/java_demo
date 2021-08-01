package cn.geekhall.test;

import cn.geekhall.bean.Book;
import cn.geekhall.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * MyTest.java
 *
 * @author yiny
 */
public class MyTest {
    @Test
    public void test(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("BookServiceImpl", BookService.class);
        List<Book> books = bookService.getAllBooks();
        for (Book book : books) {
            System.out.println(book);
        }


    }
}
