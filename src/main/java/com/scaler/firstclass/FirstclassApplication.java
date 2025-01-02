package com.scaler.firstclass;

import com.scaler.firstclass.modules.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstclassApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstclassApplication.class, args);

//        Product p = new Product();
//        p.setId(12L);
//        System.out.println(p);

        /////////////////////////////////////////////////
//        Product p = new Product();
//        p.setId(12L);
//        System.out.println(p);
//        ProductService productService = new SelfProductService();
//        ProductController pc = new ProductController(productService);
}


}

//Product{id=12, title='null',
//        description='null',
//        price=null, imageUrl='null', category=null}