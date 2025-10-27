package com.example.flyway_mybatis_practice.domain;

public class Products {
    private int products_id;
    private String name;
    private String name_kana;
    private int maker_id;
    private int price01;
    int status;
    String makerName;

    public int getProducts_id() {
        return products_id;
    }

    public void setProducts_id(int products_id) {
        this.products_id = products_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_kana() {
        return name_kana;
    }

    public void setName_kana(String name_kana) {
        this.name_kana = name_kana;
    }

    public int getMaker_id() {
        return maker_id;
    }

    public void setMaker_id(int maker_id) {
        this.maker_id = maker_id;
    }

    public int getPrice01() {
        return price01;
    }

    public void setPrice01(int price01) {
        this.price01 = price01;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }
}
