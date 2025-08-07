package com.harsh.ProductApp;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/hello")
    public String greet(){
        return "Hello World Welcome to Springboot";
    }
}
