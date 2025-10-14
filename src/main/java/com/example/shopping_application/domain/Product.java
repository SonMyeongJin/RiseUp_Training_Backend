package com.example.shopping_application.domain;

public class Product {
    private Long id;
    private String name;
    private Integer price;
    private Integer amount;

    public void setId(Long id) {
        this.id = id;
    }

    // ProdcutDTO 만들었으므로 getter 삭제
}
