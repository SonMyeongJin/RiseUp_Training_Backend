package com.example.shopping_application.controller;

import com.example.shopping_application.domain.Product;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public Product creatProduct(@RequestBody Product product) {
        // 프로덕트를 생성하고 리스트에 넣는 작업
        return product;
    }

}
