package com.example.demo.controller;

import com.example.demo.entities.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController extends BaseController<User, Integer, User, User>
{
    public UserController()
    {
        super(User.class, User.class, User.class);
    }
}
