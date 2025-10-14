package com.example.shopping_application.controller;

import com.example.shopping_application.domain.Product;
import com.example.shopping_application.dto.ProductDto;
import com.example.shopping_application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private ProductService productService;

    // 생섲아를 이용하여 생성될때 자동으로 @Autowired 를 통해 Service와 연결
    @Autowired
    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public ProductDto creatProduct(@RequestBody ProductDto productDto) {
        // 프로덕트를 생성하고 리스트에 넣는 작업
        return productService.add(productDto);
    }

}
