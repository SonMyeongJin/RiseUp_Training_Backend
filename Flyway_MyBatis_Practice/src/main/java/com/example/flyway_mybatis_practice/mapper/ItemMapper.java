package com.example.flyway_mybatis_practice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ItemMapper {

    int addItem(
            @Param("order_item_id") int orderItemId,
            @Param("orders_id") int ordersId,
            @Param("item_name") String itemName,
            @Param("price") int price,
            @Param("quantity") int quantity);
}
