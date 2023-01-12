package com.example.eurekaserver.controller;

import com.example.eurekaserver.feign.SentinelRemoteFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class ServiceInstanceRestController {
    @Resource
    private SentinelRemoteFeign sentinelRemoteFeign;

    @GetMapping("/echo")
    public String echo(@RequestParam("hi") String content) {
        return content;
    }

    @GetMapping("/remote")
    public String remote() {
        sentinelRemoteFeign.echo("sentinel-remote");
        return "ok";
    }
}
