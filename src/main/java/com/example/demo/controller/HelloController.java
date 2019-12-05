package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Demo Spring Boot!";
    }

    @RequestMapping("/Now")
    public String now() {
        LocalDate date = LocalDate.now();
        return "Demo Spring Boot! -> " + date;
    }

}
