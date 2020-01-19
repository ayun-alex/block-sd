package com.study.block.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HellonController {

    @RequestMapping("/hellon")
    public String hello() {
        return "hellon world";
    }
}
