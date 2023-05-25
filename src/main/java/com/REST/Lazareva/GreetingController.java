package com.REST.Lazareva;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    //@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}){};
    @PostMapping("/user")
    public ResponseEntity<ReturnUser> create(@RequestBody PostUser postUser) {
        return new ResponseEntity<>(new ReturnUser(postUser.login(), LocalDate.now()), HttpStatus.OK);
    }
}
