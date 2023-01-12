package com.example.eurekaserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
public class ServiceInstanceRestController {

    @GetMapping("/echo")
    public String echo(@RequestParam("hi") String content) {
        System.out.println(LocalDateTime.now() + "   " + content);
        return content;
    }
}
