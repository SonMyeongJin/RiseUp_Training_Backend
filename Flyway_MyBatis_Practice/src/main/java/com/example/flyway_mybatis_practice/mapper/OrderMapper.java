package com.example.flyway_mybatis_practice.mapper;

import com.example.flyway_mybatis_practice.domain.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {

    int addOrder(
            @Param("orders_id") int ordersId,
            @Param("customer_name") String customerName,
            @Param("total_amount") int total_amount,
            @Param("total_price") int total_price);

    List<Orders> selectOrderByDate(
            @Param("orders_date") int orders_date
    );

    List<Orders> selectOrderByItemId(
            @Param("order_item_id") int order_item_id
    );

    List<Orders> selectOrderByPrice(
            @Param("total_price") int total_price
    );

    List<Orders> getOrdersDateMinItems(
            @Param("minItems") int minItems
    );

    List<Orders> testSqlInjection(
            @Param("customer_name") String input
    );
}
