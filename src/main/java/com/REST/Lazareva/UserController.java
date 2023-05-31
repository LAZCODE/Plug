package com.REST.Lazareva;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class UserController {

    @GetMapping("/user")
    public User user() {
        return new User();
    }

    @PostMapping("/user")
    public User user(User postUser) {
        return (new User(postUser.Login(), postUser.Password()));
    }
}
