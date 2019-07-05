package com.example.demo.controller;

import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMyatbis {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/testmytaits")
    public Object getAll() {
        return studentService.getAll();
    }
}
