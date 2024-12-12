package com.scaler.firstclass.service;

import com.scaler.firstclass.modules.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(long id);

    List<Product> getAllProducts();

    Product createProduct(Long id, String title, String description, Double price, String category);
}
