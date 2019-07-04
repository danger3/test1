package com.jk.service;

import com.jk.pojo.Book;
import com.jk.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequestMapping("/error")
@Component
public class UserServiceImpl implements UserService {
    public static final String GET_NEWS_FLAG="网络连接失败，请稍后重试";
    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public String findById(Integer uid, String uname) {
        return null;
    }

    @Override
    public String findById2(Integer uid) {
        return GET_NEWS_FLAG;
    }

    @Override
    public Map<String, Object> queryBook(int start, int rows) {
        return null;
    }

    @Override
    public List<Book> showBook() {
        return null;
    }

    @Override
    public void delBook(int bookid) {

    }

    @Override
    public void add(Book book) {
    }


}
