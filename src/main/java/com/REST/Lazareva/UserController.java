package com.REST.Lazareva;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @GetMapping("/user")
    public User user() {
        return new User();
    }

    @PostMapping("/user")
    public User user(@RequestBody User postUser) throws ServiceException {
        if (!postUser.newEquals(new User())) {
            return new User(postUser.login, postUser.password);
        }
        else
            throw new ServiceException("The JSON file doesn't contain right variables");
        }

    }


