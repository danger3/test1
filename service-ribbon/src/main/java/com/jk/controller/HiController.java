package com.jk.controller;

import com.jk.pojo.News;
import com.jk.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HiController {
    @Autowired
    HelloService  helloService;
    @GetMapping(value = "/hello")
    @ResponseBody
    public String hi(@RequestParam String name){

        return  helloService.hiService(name);
    }
    @RequestMapping("toshowsnews")
     public String toshowsnews(){
        return "toshowsnews";
    }
    @RequestMapping("showsnews")
    @ResponseBody
    public List<News> showsnews(){
        return  helloService.showsnews();
    }





}
