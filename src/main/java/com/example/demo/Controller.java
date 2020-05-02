package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @GetMapping("/greeting")
    public ResponseEntity greeting()
    {
        return ResponseEntity.ok().body("Hello world");
    }

    @GetMapping("/test")
    public ResponseEntity test()
    {
        return ResponseEntity.ok().body("Test");
    }
}
