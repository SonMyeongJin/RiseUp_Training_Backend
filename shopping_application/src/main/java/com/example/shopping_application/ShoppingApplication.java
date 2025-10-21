package com.example.shopping_application;

import org.modelmapper.ModelMapper;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootApplication
public class ShoppingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
                .setFieldMatchingEnabled(true);
        return new ModelMapper();
    }

    // 데이터베이스랑 연결되었는지 확인하는 용도인데 활성화 시키면 테스트가 안됨.
    // 보통 첫 요청이 들어와야 dataBase를 컨테이너에 빈으로 등록하는데 여기에 이 코드를 선언함으로써 프로젝트 실행하면서 DB 빈을 만들어 놓음.
//    @Bean
//    public ApplicationRunner runner(DataSource dataSource) {
//        return args -> {
//
//            Connection connection = dataSource.getConnection();
//            System.out.println("DataSource = " + dataSource);
//        };
//    }
}
