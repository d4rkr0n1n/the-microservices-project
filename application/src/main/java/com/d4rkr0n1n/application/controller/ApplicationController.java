package com.d4rkr0n1n.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/application")
public class ApplicationController {
    
    @RequestMapping("/hello")
    public String hello() {
        return "Hello from application";
    }
}
