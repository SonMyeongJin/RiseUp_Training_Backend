package com.example.flyway_mybatis_practice;

import com.example.flyway_mybatis_practice.mapper.MakerMapper;
import com.example.flyway_mybatis_practice.mapper.OrderMapper;
import com.example.flyway_mybatis_practice.mapper.ProductsMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FlywayMyBatisPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlywayMyBatisPracticeApplication.class, args);
    }

    // 애플리케이션 시작 후 매퍼 호출하여 콘솔 출력
    @Bean
    CommandLineRunner runQueries(MakerMapper makerMapper, ProductsMapper productsMapper, OrderMapper orderMapper) {
        return args -> {
            System.out.println("===== Startup Query: makerMapper.selectFlg0() =====");
            var makers = makerMapper.selectFlg0();

            System.out.println("===== Startup Query: productsMapper.selectStatus1( makerId=1 ) =====");
            var products = productsMapper.selectStatus1(1L);

            System.out.println("===== selectOrderByDate( orders_date = 20250527 ) =====");
            var orders = orderMapper.selectOrderByDate(20250527);

            System.out.println("===== selectOrderByItemId( order_item_id = 1 ) =====");
            var orderByItem = orderMapper.selectOrderByItemId(1);

            System.out.println("==== selectOrderByPrice( total_price = 2000 ) =====");
            var orderByPrice = orderMapper.selectOrderByPrice(2000);

        };
    }
}
