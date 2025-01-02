package com.scaler.firstclass;

import com.scaler.firstclass.controller.ProductController;
import com.scaler.firstclass.modules.Product;
import com.scaler.firstclass.repository.ProductRepository;
import com.scaler.firstclass.repository.projections.ProductProjection;
import com.scaler.firstclass.service.ProductService;
import com.scaler.firstclass.service.SelfProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FirstclassApplicationTests {


        @Autowired
        private ProductRepository productRepository;

        @Test
        void testQueries() {
//                    List<Product> allProducts = productRepository.getProductByCategoryId(1L);
//
//        for (Product product : allProducts) {
//            System.out.println(product);
//        }

            List<ProductProjection> productProjectionList = productRepository.getProductByCategoryIdUsingProjections(1L);
            System.out.println(productProjectionList.get(0).getTitle());

        }

}




//Product{id=12, title='null',
//        description='null',
//        price=null, imageUrl='null', category=null}

//class FirstclassApplicationTests {
//
//    @Test
//    void contextLoads() {
//    }
//
//}

///////////////////////////////////////
