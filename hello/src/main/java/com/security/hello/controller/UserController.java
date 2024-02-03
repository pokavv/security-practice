package com.security.hello.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @PostMapping("/login")
    public ResponseEntity<String> login() {
        return ResponseEntity.ok().body("로그인 token 생성");
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup() {
        return ResponseEntity.ok().body("회원가입완료");
    }
}
