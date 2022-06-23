package com.steven.boot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller
//* 这个RestController 就是上面两个注解的集合

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handleReturn() {
        return "Hello World!";
    }
}
