package com.example.openpay;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Validated
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @PostMapping("/greeting/post")
    public String greetingPost(@Valid @RequestBody Greeting greeting) {
        System.out.println(greeting.getContent());
        return "Yeesssssss";
    }
}