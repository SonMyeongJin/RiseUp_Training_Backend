package com.example.flyway_mybatis_practice.domain;

import lombok.Data;

@Data
public class products {
    int products_id;
    String name;
    String name_kana;
    int maker_id;
    int price01;
}
