package com.jk.controller;

import com.jk.pojo.Book;
import com.jk.pojo.News;
import com.jk.pojo.User;
import com.jk.service.BookService;
import com.jk.service.NewService;
import com.jk.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController//
public class ClientController implements UserService2{
    @Autowired
    private NewService newService;
    @Autowired
    private BookService bookService;
    @Value("${server.port}")//@Value()注解是用java代码获取配置文件的参数，包含层级关系
   private String port;
    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name",defaultValue = "danger4") String name) {
        return "hi " + name + ",i am from port:" + port;
    }
    @RequestMapping("showsnews")
    public List<News> showsnews(){
        return newService.showsnews();
    }

    @PostMapping("addUser")
    public User addUser(@RequestBody User user){
         User user2=new User();
         user2.setUid(2019);
         return  user2;
    }

    @Override
    public String findById(Integer uid, String uname) {
        return uid+"号勇于发言选手是"+uname;
    }


    @GetMapping("findById2")
    public String findById2(@RequestParam(value = "uid")Integer uid){

        return uid+"顺位";
    }
    @RequestMapping("queryBook/{start}/{rows}")
    public Map<String,Object> queryBook(@PathVariable(value = "start") int start,@PathVariable(value = "rows") int rows){
        System.out.println(start+"号"+rows);
        return bookService.queryBook( start,  rows);
    }
    @GetMapping("showBook")
    public List<Book> showBook(){
        return bookService.showBook();
    }
    @RequestMapping("delBook/{bookid}")
    public  void delBook(@PathVariable(value = "bookid")int bookid){
        bookService.delBook(bookid);
    }
    @GetMapping("add")
   public void add(@RequestBody Book book){
        bookService.add( book);
    }
    @RequestMapping("/test")
    public String test(){
       return "Test";
    }
}
