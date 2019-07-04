package com.jk.service;

import com.jk.dao.NewsMapper;
import com.jk.pojo.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NewServiceImpl implements NewService {
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> showsnews() {
        return newsMapper.showsnews();
    }
}
