package com.example.eurekaserver.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("sentinel-client-1")
public interface SentinelRemoteFeign {

    @GetMapping("/echo")
    String echo(@RequestParam("hi") String content);
}
