package com.example.demospring2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyExample {

//    private static final Logger logger = LogManager.getLogger(MyExample.class);

    @RequestMapping("/")
    String home(){
//        logger.info("Info log");
        return "Hello World!!@@@@";
    }
}
