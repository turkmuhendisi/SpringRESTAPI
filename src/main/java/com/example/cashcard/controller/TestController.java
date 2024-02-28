package com.example.cashcard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/hello")
    public String getString() {
        return "Selamun aleyküm Serhat";
    }
}
