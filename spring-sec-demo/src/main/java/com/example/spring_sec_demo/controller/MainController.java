package com.example.spring_sec_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {



    @GetMapping("accessToken")
    public CsrfToken csrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");

    }

    @GetMapping("hello")
    public String hello(HttpServletRequest request){
        return "Hello world"+request.getSession().getId();
    }
}
