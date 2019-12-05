package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;

@RestController
@Validated
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Demo Spring Boot!";
    }

    @GetMapping("//Now")
    public String now() {
        LocalDate date = LocalDate.now();
        return "Demo Spring Boot! -> " + date;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void logout(HttpSession session) {
        session.invalidate();
    }

}
