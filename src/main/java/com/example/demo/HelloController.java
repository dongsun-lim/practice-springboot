package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dongsun Lim on 2018. 5. 29..
 *
 * http://easy-coding.tistory.com/1
 */
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @GetMapping
    public Hello get() {
        return new Hello(0, "Hello spring boot");
    }
}
