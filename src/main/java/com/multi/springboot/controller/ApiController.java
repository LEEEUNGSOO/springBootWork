package com.multi.springboot.controller;

import com.multi.springboot.model.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")//namespace
public class ApiController {

    @GetMapping("/hello")
    public String hello(){
        return "hello SpringBoot~";
    }
    @GetMapping("user")
    public UserDTO user(){
        return new UserDTO(100,"홍예린","you@naver.com");
    }
}
