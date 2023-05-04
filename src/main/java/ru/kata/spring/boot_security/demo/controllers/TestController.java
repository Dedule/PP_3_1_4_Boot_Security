package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class TestController {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/userpage")
    public String userPage(Principal principal) {
        String name = principal.getName();
        return  "Hello " + name;
    }
    @GetMapping("/welcome")
    public String userPage() {
        return  "Hello guest!" ;
    }

}
