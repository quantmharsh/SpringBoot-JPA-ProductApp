package com.harsh.ProductApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductAppApplication {

	public static void main(String[] args) {

		//It is known as IOC Container which is inside JVM.All classes objects
		//are created here.
		 ApplicationContext context =SpringApplication.run(ProductAppApplication.class, args);
		 Dev obj = context.getBean(Dev.class);
		 obj.build();
	}

}
