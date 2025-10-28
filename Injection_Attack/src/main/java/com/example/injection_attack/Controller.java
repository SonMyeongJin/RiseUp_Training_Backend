package com.example.injection_attack;

import com.example.injection_attack.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;

@RestController
public class Controller {
    private final Service service;

    // 생성자 주입
    public Controller(Service service) { this.service = service; }

    @PostMapping("/login")
    public User login(@RequestParam("username") String username,
                      @RequestParam("password") String password) {
        return service.saveService(username, password);
    }
}
