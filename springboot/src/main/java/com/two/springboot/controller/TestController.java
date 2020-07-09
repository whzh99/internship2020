package com.two.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @GetMapping("/temp")
    public String temp(){
        return "test";
    }


}
