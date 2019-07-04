package com.jk.service;

import com.jk.pojo.Book;
import com.jk.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

public interface UserService2 {
    @PostMapping("addUser")
    public User addUser(User user);
    @GetMapping("findById/{uid}/{uname}")
    public String findById(@PathVariable(value = "uid") Integer uid, @PathVariable(value = "uname") String uname);
    @GetMapping("findById2")
    public String findById2(@RequestParam(value = "uid") Integer uid);
    @RequestMapping("queryBook/{start}/{rows}")
    public Map<String,Object> queryBook(@PathVariable(value = "start") int start, @PathVariable(value = "rows") int rows);
    @GetMapping("showBook")
    List<Book> showBook();
    @GetMapping("delBook/{bookid}")
    void delBook(@PathVariable(value = "bookid") int bookid);
    @GetMapping("add")
    void add(@RequestBody Book book);
}
