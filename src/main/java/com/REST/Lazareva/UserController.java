package com.REST.Lazareva;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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


    //@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}){};
    @PostMapping("/user")
    public ResponseEntity<User> create(@RequestBody User postUser) {
        System.out.println(postUser);
        return new ResponseEntity<>(new User(postUser.Login(), postUser.Password()), HttpStatus.OK);
    }
}
