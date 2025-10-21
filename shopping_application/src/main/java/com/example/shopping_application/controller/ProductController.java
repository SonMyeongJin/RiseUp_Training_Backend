package com.example.shopping_application.controller;

import com.example.shopping_application.dto.ProductDto;
import com.example.shopping_application.service.ProductService;
import jakarta.validation.Valid;
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

    // ---------------------------------- 상품 등록하기(Register) --------------------------------------
    // 상품을 추가하는 API
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ProductDto createProduct(@Valid @RequestBody ProductDto productDto) {
        // 프로덕트를 생성하고 리스트에 넣는 작업
        return productService.add(productDto);
    }

    // ---------------------------------- 상품 조회하기(Find) --------------------------------------
    // 상품을 id로 조회하는 API
    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public ProductDto findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    /* 전체 상품 목록을 조회하는 API
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<ProductDto> findAllProduct() {
        return productService.findAll();
    }*/

    // 상품 이름으로 검색하는 API
    // 위의 함수와 합침 (이름이 없으면 전체상품 목록 조회)
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<ProductDto> findProductByName(@RequestParam(required = false) String name) {

        if (name == null) {
            return productService.findAll();
        }

        return productService.findByNameContaining(name);
    }

// ---------------------------------- 상품 수정하기(Edit) --------------------------------------

    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public ProductDto updateProduct(@PathVariable Long id, @RequestBody ProductDto productDto) {
        productDto.setId(id);
        return productService.update(productDto);
    }
// ---------------------------------- 상품 삭제하기(Delete) --------------------------------------
    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable Long id) {
        productService.delete(id);
    }
}
