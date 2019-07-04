package com.jk.dao;

import com.jk.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Integer bookid);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookid);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    long queryCount();

    List<Book> queryBook(@Param("st") int start,@Param("ro") int rows);

    List<Book> showBook();

    void delBook(int bookid);
}