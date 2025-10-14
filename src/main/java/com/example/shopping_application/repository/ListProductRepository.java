package com.example.shopping_application.repository;

import com.example.shopping_application.domain.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ListProductRepository {

    private static final Logger log = LoggerFactory.getLogger(ListProductRepository.class);
    private List<Product> products = new CopyOnWriteArrayList<>();
    private AtomicLong sequence = new AtomicLong(1L);

//---------------------------------- 상품 등록하기(Register) --------------------------------------
    public Product add(Product product) {

        product.setId(sequence.getAndAdd(1L));

        products.add(product);
        return product;
    }
//---------------------------------- 상품 조회하기(Find) --------------------------------------
    public Product findById(Long id) {
        return products.stream()
                .filter(product -> product.sameId(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Product> findAll() {
        return products;
    }

    public List<Product> findByNameContaining(String name) {
        return products.stream()
                .filter(product -> product.containsName(name))
                .toList();
    }
//---------------------------------- 상품 수정하기(Edit) --------------------------------------
    public Product update(Product product) {
        Integer indexToModify = products.indexOf(product);
        products.set(indexToModify, product);
        return product;
    }
}
