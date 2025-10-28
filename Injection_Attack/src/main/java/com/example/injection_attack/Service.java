package com.example.injection_attack;


import com.example.injection_attack.domain.User;

@org.springframework.stereotype.Service
public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    // save 함수 호출해서 레포지토리에 아이디 비밀번호 저장
    public User saveService(String username, String password) {
        return repository.saveRepo(username, password);
    }
}
