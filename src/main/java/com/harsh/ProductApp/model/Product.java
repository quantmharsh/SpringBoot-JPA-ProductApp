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

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    private int price;

//        public Product(int prodId, String prodName, int price) {
//            this.price=price;
//            this.prodId=prodId;
//            this.prodName=prodName;
//    }
}
