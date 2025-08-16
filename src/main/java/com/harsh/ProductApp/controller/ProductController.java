package com.harsh.ProductApp.controller;


import com.harsh.ProductApp.model.Product;
import com.harsh.ProductApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/products")
    public   ResponseEntity< List<Product>> getAllProducts(){
        return   new ResponseEntity<>(  productService.getProducts() ,HttpStatus.OK);

    }

    @GetMapping("/products/{prodId}")
    public   ResponseEntity<Product> getProductById(@PathVariable int prodId)
    {
        return   new  ResponseEntity<>( productService.getProductById(prodId)  , HttpStatus.OK);
    }

    @PostMapping("/products")
            public  ResponseEntity<String>  addProduct(@RequestBody Product prod)
    {
     productService.addProducts(prod);
     return new ResponseEntity<>("Product Added Successfully" , HttpStatus.CREATED);
    }

    @PutMapping("/products/{prodId}")
    public  ResponseEntity<Product>  updateProduct(@PathVariable int prodId , @RequestBody Product prod)
    {
        productService.updateProduct(prodId , prod);
        return   new ResponseEntity<>(productService.getProductById(prodId) ,HttpStatus.OK );
    }

    @DeleteMapping("/products/{prodId}")
     public  ResponseEntity<String> deleteProduct(@PathVariable int prodId)
     {
         productService.deleteProduct(prodId);
         return new ResponseEntity<>("Product Deleted Successfully" , HttpStatus.OK);
     }


     @GetMapping("/products/{prodName}")
       public ResponseEntity<List<Product>>  getProductByName(@PathVariable String prodName)
       {

           return new ResponseEntity<>(    productService.getProductByName(prodName) , HttpStatus.OK);
       }
}
