package com.jk.dao;

import com.jk.pojo.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer nid);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer nid);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    List<News> queryArt(/*@Param("st") int start,@Param("ro") int rows,*/@Param("news") News news);

    long queryCount(@Param("news")News news);

    List<News> showsnews();
}