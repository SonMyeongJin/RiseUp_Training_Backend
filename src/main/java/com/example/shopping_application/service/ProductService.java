package com.example.shopping_application.service;

import com.example.shopping_application.domain.Product;
import com.example.shopping_application.dto.ProductDto;
import com.example.shopping_application.repository.ListProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ListProductRepository listProductRepository;

    @Autowired
    public ProductService(ListProductRepository listProductRepository) {
        this.listProductRepository = listProductRepository;
    }

    public ProductDto add(ProductDto productDto) {
        // ProductDto 를 Product 로 변환하는 코드
        Product product = ??;

        // 레포지토리를 호출하는 코드
        Product savedProduct = listProductRepository.add(product);

        // Product 를 ProductDto 로 변환하는 코드
        ProductDto savedProductDto = ??;

        // 변환된 ProductDto 를 리턴하는 코드
        return savedProductDto;
    }
}
