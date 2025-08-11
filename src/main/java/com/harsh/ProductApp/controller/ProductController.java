package com.harsh.ProductApp.controller;


import com.harsh.ProductApp.model.Product;
import com.harsh.ProductApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("/products")
    public List<Product> getAllProducts(){
        return
                productService.getProducts();
    }

    @RequestMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId)
    {
        return productService.getProductById(prodId);
    }
}
