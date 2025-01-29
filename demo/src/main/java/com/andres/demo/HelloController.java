package com.andres.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return buildAString();
    }

    private String buildAString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append("!");
        sb.append(" ");
        sb.append("World");
        sb.append("!");
        return sb.toString();
    }

}