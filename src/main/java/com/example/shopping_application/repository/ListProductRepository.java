package com.example.shopping_application.repository;

import com.example.shopping_application.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Repository
public class ListProductRepository {

    private List<Product> products = new CopyOnWriteArrayList<>();

    public Product add(Product product) {
        products.add(product);
        return product;
    }

}
