package com.harsh.ProductApp.service;

import com.harsh.ProductApp.model.Product;
import com.harsh.ProductApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;


@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
//    List<Product> products= new ArrayList<>( Arrays.asList(new Product(101, "Laptop", 40000) , new Product(102 ,"Realme Mobile" , 20000)));
    public   List<Product> getProducts(){

        return  repo.findAll();
    }

    public Product getProductById(int ProdId){
        return   repo.findById(ProdId).orElse( new Product());
    }

    public  void addProducts(Product prod)
    {
        repo.save(prod);
    }

    public  void  updateProduct( int prodId ,Product updateProd)
    {
         repo.save(updateProd);
    }

    public  void deleteProduct(int  prodId){
      repo.deleteById(prodId);

    }
    public List<Product>  getProductByName(String prod)
    {
        System.out.println("Product by name" +repo.findByProdName(prod));
       return repo.findByProdName(prod);
    }
}
