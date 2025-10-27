package com.example.flyway_mybatis_practice.domain;

public class Orders {
    int orders_id;
    int customer_id;
    int total_price;
    int total_amount;
    int orders_date;

    public int getOrders_date() {
        return orders_date;
    }

    public void setOrders_date(int orders_date) {
        this.orders_date = orders_date;
    }


    public int getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(int orders_id) {
        this.orders_id = orders_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public int getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(int total_amount) {
        this.total_amount = total_amount;
    }
}
