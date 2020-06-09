package com.chenx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userController {

    @RequestMapping("/test")
    public String test() {
        return "hello";
    }

    @RequestMapping("/test1")
    public String test1() {
        return "hello";
    }
}
