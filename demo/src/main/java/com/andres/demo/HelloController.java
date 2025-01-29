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
        sb.append(add(1, null));
        return sb.toString();
    }

    private int add(Integer a, Integer b) {
        return a + b;
    }

    @GetMapping("/hat")
    public String hat() {
        return madHatter(true);
    }

    private String madHatter(boolean hat) {
        if(hat) {
            return "Hat";
        } else {
            return buildAString();
        }
    }

    private int thisIsDeadCode(int var) {
        if(var < 10) {
            return 2^var;
        } else {
            return var/2;
        }
    }

    /**
     * multiplies something
     * @param var
     * @return
     */
    private int abs(int var) {
        if(var < 0) {
            return -1 * var;
        } else {
            return var;
        }
    }

}