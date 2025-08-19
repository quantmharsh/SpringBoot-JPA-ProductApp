package com.harsh.ProductApp.repository;

import com.harsh.ProductApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public   interface  ProductRepo  extends JpaRepository<Product, Integer> {


    //user defined functions
    List<Product> findByProdName(String prodName);

}
