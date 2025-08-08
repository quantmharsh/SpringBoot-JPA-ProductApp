package com.harsh.ProductApp;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements  Computer   {

    public void Compile(){
        System.out.println("Compiling code with 404 Bugs Even faster");

    }
}
