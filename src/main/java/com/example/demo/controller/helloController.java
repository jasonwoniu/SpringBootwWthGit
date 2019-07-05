package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class helloController {
    //如果是字符串就直接返回字符串，如果是对象就返回json
   @RequestMapping("/boot")
    public @ResponseBody String helloSpringboot(){
        return "hello spring Boot.热部署阿达fad hello 它是不影响你写代码的";
    }

    @Value("${jason.name}")
    private String name;

   @RequestMapping("/jasonname")
    public @ResponseBody String jasonname(){
        return name;
    }
}
