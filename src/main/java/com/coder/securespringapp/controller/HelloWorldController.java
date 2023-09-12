package com.coder.securespringapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping()
    public String getAllTodo() {
        return "Hello World after login";

    }

}
