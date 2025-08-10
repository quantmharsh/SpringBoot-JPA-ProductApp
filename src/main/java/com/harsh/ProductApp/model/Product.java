package com.harsh.ProductApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//to generate getter setters of Product will be using @data lombok annotation
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int prodId;
    private String prodName;
    private int price;

//        public Product(int prodId, String prodName, int price) {
//            this.price=price;
//            this.prodId=prodId;
//            this.prodName=prodName;
//    }
}
