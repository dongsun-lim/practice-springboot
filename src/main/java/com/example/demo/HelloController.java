package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dongsun Lim on 2018. 5. 18..
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "Hello, Spring Boot!";
    }

    @RequestMapping(value="hey1",method = RequestMethod.GET)
    public String getMethod() {
        return "get";
    }

    @RequestMapping(value="hey1", method = RequestMethod.PUT)
    public String putMethod() {
        return "put";
    }

    @RequestMapping(value = "/hey1", method = RequestMethod.POST)
    public String postMethod1() {
        return "post";
    }

    @RequestMapping(value = "/hey2", method = RequestMethod.POST)
    public String postMethod2() {
        return "hey post";
    }


}
