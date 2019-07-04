package com.jk.controller;

import com.jk.pojo.Book;
import com.jk.pojo.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
     @Autowired
     private UserService userService;
    @GetMapping("showBook")
     public String showBook(Model model){
        List<Book> list =userService.showBook();
        model.addAttribute("list",list);
        return "showbook";
    }
    @GetMapping("toshowBook")
    public String toshowBook(){
        return "showbook2";
    }
    @RequestMapping("queryBook/{start}/{rows}")
    public Map<String,Object> queryBook(@PathVariable(value = "start") int start,@PathVariable(value = "rows") int rows){
        System.out.println(9999);
         return userService.queryBook(start,rows);
    }
    @GetMapping("delBook/{bookid}")
       public void delBook(@PathVariable(value = "bookid") int bookid){
        System.out.println(bookid);
        userService.delBook( bookid);
    }

     @PostMapping("addUser")
     public User addUser(){
         User user =new User();
         user.setUname("feign消费者");
         user.setBirthday("2019-7-2");
          User user2=  userService.addUser(user);
          return user2;
     }
   //@PathVariable不能接收对象，但可以接收多个参数
     @GetMapping("findById/{uid}/{uname}")
     @ResponseBody
    public String  findById (@PathVariable(value = "uid") Integer uid,@PathVariable(value = "uname") String uname){
       return   userService.findById(uid,uname);
     }
    @GetMapping("findById2")
    public String  findById2 (@RequestParam(value = "uid") Integer uid){
        return   userService.findById2(uid);
    }
    @GetMapping("toadd")
    public String  toadd (){
        return  "addBook";
    }
    @GetMapping("add")
    public void  add ( Book book){
       userService.add(book);
    }
}
