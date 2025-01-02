package com.scaler.firstclass.service;

import com.scaler.firstclass.exceptions.ProductNotFoundException;
import com.scaler.firstclass.modules.Product;

import java.util.List;


public interface ProductService {
    Product getSingleProduct(long id) throws ProductNotFoundException;

    List<Product> getAllProducts();

    Product createProduct(Long id, String title, String description, Double price, String category);
}

///////////////////////////////

//public interface ProductService {
//    Product getSingleProduct(long id) throws ProductNotFoundException;
//
//    List<Product> getAllProducts();
//
//    Product createProduct(Long id, String title, String description, Double price, String category);
//}



//package com.scaler.novprojectmodule.service;
//
//import com.scaler.novprojectmodule.exceptions.ProductNotFoundException;
//import com.scaler.novprojectmodule.models.Product;
//
//import java.util.List;
//
//public interface ProductService {
//    Product getSingleProduct(long id) throws ProductNotFoundException;
//
//    List<Product> getAllProducts();
//
//    Product createProduct(Long id, String title, String description, Double price, String category);
//}