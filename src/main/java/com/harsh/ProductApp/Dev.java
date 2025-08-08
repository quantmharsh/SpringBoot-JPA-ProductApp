package com.harsh.ProductApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//adding component annotation to tell IOC container to create the  object of this class
@Component
public class Dev {
     // 3 Ways of using Autowired Dependency Injection
    // 1. Field Injection
//    @Autowired //Connect Dev Component with Laptop Component without need to create object of laptop
    //Using Loose Coupling create Interface and implement it in  multiple classes .

    @Autowired
    @Qualifier("laptop")  //Which Class We want to use . Name is in small letter as Class
    private Computer computer;
//    laptop.Compile();

    // 2.Constructor Injection
    public Dev(Computer computer)
    {
       this.computer=computer;
    }
    // 3. Setter Injection
//    @Autowired
//    public  void GetLaptop(Laptop laptop){
//        laptop.Compile();
//    }





    public void build(){


        System.out.println("Building Springboot application");
        computer.Compile();
    }
}
