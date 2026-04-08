package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller
{
    @GetMapping("/")
    public string wellcome(){
        return "wellcome to gradle"
    }
}