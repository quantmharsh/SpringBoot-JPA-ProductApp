package com.harsh.ProductApp.controller;


import com.harsh.ProductApp.model.Product;
import com.harsh.ProductApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/products")
            public void addProduct(@RequestBody Product prod)
    {
     productService.addProducts(prod);
    }

    @PutMapping("/products/{prodId}")
    public  void  updateProduct(@PathVariable int prodId , @RequestBody Product prod)
    {
        productService.updateProduct(prodId , prod);
    }

    @DeleteMapping("/products/{prodId}")
     public void deleteProduct(@PathVariable int prodId)
     {
         productService.deleteProduct(prodId);
     }
}
