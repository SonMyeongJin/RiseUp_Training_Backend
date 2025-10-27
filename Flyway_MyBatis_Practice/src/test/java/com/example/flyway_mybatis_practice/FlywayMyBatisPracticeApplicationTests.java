package com.example.flyway_mybatis_practice;


import com.example.flyway_mybatis_practice.mapper.ItemMapper;
import com.example.flyway_mybatis_practice.mapper.OrderMapper;
import com.example.flyway_mybatis_practice.mapper.ProductsMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FlywayMybatisApplicationTests {

    @Autowired
    ProductsMapper productsMapper;

    @Test
    void updateStatus2ById() {
        Long id = 1002L;
        int affected = productsMapper.updateStatus2ById(id);
        System.out.println("압데이트 = " + affected);
    }

    @BeforeEach
    void setupOrders() {
        // (필요시) 기존 데이터 정리
        // orderMapper.deleteAllOrderItems();
        // orderMapper.deleteAllOrders();

        // 부모 주문 생성 (이미 있으면 예외 처리 혹은 무시 로직 필요)
        orderMapper.addOrder(1, "myeong jin", 10, 2000);
        orderMapper.addOrder(2, "Hirayama", 5, 1500);
    }

    @Autowired
    ItemMapper itemMapper;

    @Test
    void addItemTest() {
        // 첫번째 아이템 추가
        int order_item_id = 1;
        int orders_id = 1;
        String itemName = "RiseUp Coffee";
        int price = 5000;
        int quantity = 2;

        int affected = itemMapper.addItem(order_item_id,orders_id, itemName, price, quantity);
        System.out.println("Items 추가 = " + affected);

        // 두번째 아이템 추가
        int order_item_id2 = 2;
        int orders_id2 = 2;
        String itemName2 = "RiseUp Milk";
        int price2 = 8000;
        int quantity2 = 4;

        int affected2 = itemMapper.addItem(order_item_id2,orders_id2, itemName2, price2, quantity2);
        System.out.println("Items 추가 = " + affected2);
    }

    @Autowired
    OrderMapper orderMapper;

    @Test
    void addOrderTest() {
        // 첫번째 주문 추가
        int orderId = 1;
        String customerName = "myeong jin";
        int total_amount = 10;
        int total_price = 2000;

        int affected = orderMapper.addOrder(orderId ,customerName, total_amount, total_price);
        System.out.println("Orders 추가 = " + affected);

        // 두번째 주문 추가
        int orderId2 = 2;
        String customerName2 = "Hirayama";
        int total_amount2 = 5;
        int total_price2 = 1500;

        int affected2 = orderMapper.addOrder(orderId2, customerName2, total_amount2, total_price2);
        System.out.println("Orders 추가 = " + affected2);
    }
}
