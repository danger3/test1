package com.jk.service;

import com.jk.dao.BookMapper;
import com.jk.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public Map<String, Object> queryBook(int start, int rows) {
        Map<String, Object>map=new HashMap<>();
        long count= bookMapper.queryCount();
        List<Book> list= bookMapper.queryBook(start,rows);
        map.put("total",count);
        map.put("rows",list);
        return map;
    }

    @Override
    public List<Book> showBook() {
        return bookMapper.showBook();
    }


    @Override
    public void delBook(int bookid) {
        bookMapper.delBook(bookid);
    }

    @Override
    public void add( Book book) {
        bookMapper.insert(book);
    }
}
