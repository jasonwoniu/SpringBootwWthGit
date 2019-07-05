package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JSPController {
    @GetMapping("/hellojsp")
    public String getMsg(Model model){
        model.addAttribute("msg","springboot 集成 jsp 开发，需要加入三个jar包，如果还是不行，可能是没有生成.class文件，我把资源文件加上了");
        return "index";
    }
}
