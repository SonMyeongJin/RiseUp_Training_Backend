package com.example.flyway_mybatis_practice;


import com.example.flyway_mybatis_practice.mapper.productsMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FlywayMybatisApplicationTests {

    @Autowired
    productsMapper productsMapper;

    @Test
    void updateStatus2ById() {
        Long id = 1002L;
        int affected = productsMapper.updateStatus2ById(id);
        System.out.println("압데이트 = " + affected);
    }
}
