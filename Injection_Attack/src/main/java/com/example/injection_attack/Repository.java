package com.example.injection_attack;

import com.example.injection_attack.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;

@org.springframework.stereotype.Repository
public class Repository {

    private final JdbcTemplate jdbcTemplate;

    public Repository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // save 함수 구현해서 아이디 비밀번호 저장
    public User saveRepo(String username, String password) {
        // jdbcTemplate 사용해서 sql 문으로 저장
        jdbcTemplate.update("INSERT INTO users (username, password) VALUES (?, ?)", username, password);
        return new User(username, password);


        // mybatis 사용 했을때 injection attack 예시
        // select <

    }
}
