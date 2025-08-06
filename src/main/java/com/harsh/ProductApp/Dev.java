package com.harsh.ProductApp;

import org.springframework.stereotype.Component;

//adding component annotation to tell IOC container to create the  object of this class
@Component
public class Dev {

    public void build(){
        System.out.println("Building Springboot application");
    }
}
