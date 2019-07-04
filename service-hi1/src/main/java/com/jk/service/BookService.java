package com.jk.service;

import com.jk.pojo.Book;

import java.util.List;
import java.util.Map;

public interface BookService {
    Map<String,Object> queryBook(int start, int rows);

    List<Book> showBook();

    void delBook(int bookid);

    void add(Book book);
}
