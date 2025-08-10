package com.harsh.ProductApp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@Controller  : layout is also send with it  .use it with @ResponseBody annotation above function
@RestController  //only data is sent no layout

public class Hello {

    @RequestMapping("/hello")
    public String greet(){
        return "Hello World Welcome to Springboot";
    }
}
