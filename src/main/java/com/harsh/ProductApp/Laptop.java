package com.harsh.ProductApp;


import org.springframework.stereotype.Component;

@Component
public class Laptop  implements  Computer   {

    public void Compile(){
        System.out.println("Compiling code with 404 Bugs");

    }
}
