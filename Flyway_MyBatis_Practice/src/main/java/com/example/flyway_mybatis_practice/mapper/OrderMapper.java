package com.example.flyway_mybatis_practice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {

    int addOrder(
            @Param("orders_id") int ordersId,
            @Param("customer_name") String customerName,
            @Param("total_amount") int total_amount,
            @Param("total_price") int total_price);
}
