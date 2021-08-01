package cn.geekhall.controller;

import cn.geekhall.bean.Book;
import cn.geekhall.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * BookController.java
 *
 * @author yiny
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    // 查询全部书籍，并且返回到一个书籍展示页面。
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Book> books = bookService.getAllBooks();

        model.addAttribute("books", books);
        return "allBook";
    }

    // 跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String addBook(){
        return "addBook";
    }

    // 添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Book book){
        System.out.println("addBook ================================================> " + book);
        bookService.addBook(book);
        return "redirect:/book/allBook"; // 重定向到我们的@RequestMapping("/allBook")
    }
}
