package com.example.shopping_application.repository;

import com.example.shopping_application.domain.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class DatabaseProductRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public DatabaseProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //---------------------------------- 상품 등록하기(Register) --------------------------------------
    public Product add(Product product) {
        jdbcTemplate
                .update("INSERT INTO products(name, price ,amount) VALUES (?, ?, ?)",
                        product.getName(),
                        product.getPrice(),
                        product.getAmount());
        return product;
    }

    //---------------------------------- 상품 조회하기(Find) --------------------------------------
    public Product findById(Long id) {

        return null;
    }

    public List<Product> findAll() {
        return Collections.emptyList();
    }

    public List<Product> findByNameContaining(String name) {
        return Collections.emptyList();
    }

    //---------------------------------- 상품 수정하기(Edit) --------------------------------------
    public Product update(Product product) {
        return null;
    }

    // ---------------------------------- 상품 삭제하기(Delete) --------------------------------------
    public void delete(Long id) {
        // do nothing
    }

}
