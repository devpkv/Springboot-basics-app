package com.springapp.BasicSpringbootApp;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/hello/{name}")
    public HelloResponse hello(@PathVariable String name)
    {
        return new HelloResponse("Hello "+ name);
    }

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World!";
    }

    @PostMapping("/hello")
    public HelloResponse helloPost(@RequestBody String name)
    {
        return new HelloResponse("Hello "+ name);
    }
}
