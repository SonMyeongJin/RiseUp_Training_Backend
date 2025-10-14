package com.example.shopping_application.controller;

import com.example.shopping_application.domain.Product;
import com.example.shopping_application.dto.ProductDto;
import com.example.shopping_application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    // 생섲아를 이용하여 생성될때 자동으로 @Autowired 를 통해 Service와 연결
    @Autowired
    ProductController(ProductService productService) {
        this.productService = productService;
    }

    // 상품을 추가하는 API
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        // 프로덕트를 생성하고 리스트에 넣는 작업
        return productService.add(productDto);
    }

    // 상품을 id로 조회하는 API
    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public ProductDto findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    // 전체 상품 목록을 조회하는 API
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<ProductDto> findAllProduct() {
        return productService.findAll();
    }

    // 상품 이름으로 검색하는 API
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<ProductDto> findProductByName(@RequestParam(required = false) String name) {

        if (name == null) {
            return productService.findAll();
        }

        return productService.findByNameContaining(name);

    }
}
