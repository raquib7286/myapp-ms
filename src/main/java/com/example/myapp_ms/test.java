package com.example.myapp_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @GetMapping("/flight")
    public String getData() {return  "Please book your flight ticket from yatra app on  20% discount" ; }
}