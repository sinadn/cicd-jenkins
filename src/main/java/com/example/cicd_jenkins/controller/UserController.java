package com.example.cicd_jenkins.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {


    @GetMapping("/getUser/")
    public ResponseEntity<?> getUser() {
        return ResponseEntity.ok("hello user!");
    }



}
