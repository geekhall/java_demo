package cn.geekhall.controller;

import cn.geekhall.bean.Book;
import cn.geekhall.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String toAddBook(){
        return "addBook";
    }

    // 添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Book book){
        System.out.println("addBook ================================================> " + book);
        bookService.addBook(book);
        return "redirect:/book/allBook"; // 重定向到我们的@RequestMapping("/allBook")
    }

    // 跳转到修改书籍页面
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id, Model model){
        Book book = bookService.queryBookById(id);
        model.addAttribute("old_book", book);
        return "updateBook";
    }

    // 跳转到增加书籍页面
    @RequestMapping("/updateBook")
    public String updateBook(Book book){
        System.out.println("updateBook ================================================> " + book);

        int res = bookService.updateBook(book);
        if (res > 0 ){
            System.out.println("更新书籍成功 ++++++++ " + book );
        }
        return "redirect:/book/allBook"; // 重定向到我们的@RequestMapping("/allBook")
    }

    // 删除书籍
    @RequestMapping("/deleteBook/{book_id}")
    public String deleteBook(@PathVariable("book_id") int id){
        bookService.delBook(id);
        return "redirect:/book/allBook";
    }

}
