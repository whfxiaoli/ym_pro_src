package com.beeboot.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {

	@RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
