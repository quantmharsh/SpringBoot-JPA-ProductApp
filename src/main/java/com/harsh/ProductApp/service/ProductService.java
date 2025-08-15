package com.harsh.ProductApp.service;

import com.harsh.ProductApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;


@Service
public class ProductService {


    List<Product> products= new ArrayList<>( Arrays.asList(new Product(101, "Laptop", 40000) , new Product(102 ,"Realme Mobile" , 20000)));
    public   List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int ProdId){
        return  products.stream().filter(product -> product.getProdId()==ProdId ).findFirst().get();
    }

    public  void addProducts(Product prod)
    {
        products.add(prod);
    }

    public  void  updateProduct( int prodId ,Product updateProd)
    {
        products.stream().filter(product-> product.getProdId()==prodId)
                .findFirst().ifPresent(product
                        -> {product.setProdName(updateProd.getProdName());
        product.setPrice(updateProd.getPrice());
        });
    }

    public  void deleteProduct(int  prodId){
        products.removeIf(product -> product.getProdId()==prodId);

    }
    public Product getProductByName(String prod)
    {
        products.stream().filter(p-> p.getProdName() ="prod");
    }
}
