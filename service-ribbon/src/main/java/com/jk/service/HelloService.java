package com.jk.service;

import com.jk.pojo.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class HelloService {
   @Autowired
    RestTemplate  restTemplate;
   public String hiService(String name){
       return restTemplate.getForObject(
               "http://SERVICE-Hi2/hi?name=" + name, String.class);
   }

    public List<News> showsnews() {
       return restTemplate.getForObject(
               "http://SERVICE-Hi2/showsnews", List.class);
    }


}
