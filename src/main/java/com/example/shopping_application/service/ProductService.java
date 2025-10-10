package com.example.shopping_application.service;

import com.example.shopping_application.domain.Product;
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

    public Product add(Product product) {
        Product savedProduct = listProductRepository.add(product);
        return savedProduct;
    }
}
