package com.example.eurekaserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@RestController
public class ServiceInstanceRestController {
    private static final Logger logger = LoggerFactory.getLogger(ServiceInstanceRestController.class);

    @PostConstruct
    public void init() {
    }

    @GetMapping("/echo")
    public String echo(@RequestParam("hi") String content) {
//        Entry entry = null;
//        try {
//            entry = SphU.entry("123");
////            Thread.sleep(5999);
//            logger.info("echo:{}", content);
//        } catch (Exception e) {
//            logger.error("echo block", e);
//        } finally {
//            if (entry != null) {
//                entry.exit();
//            }
//        }

        return content;
    }

    @GetMapping("/echo2")
    public String echo2(@RequestParam("hi") String content) {
//        Entry entry = null;
//        try {
//            entry = SphU.entry("sentinel-1-echo");
////            Thread.sleep(5999);
//            logger.info("echo2:{}", content);
//        } catch (Exception e) {
//            logger.error("echo2 block", e);
//        }
//        if (entry != null) {
//            entry.exit();
//        }
        return content;
    }
}
