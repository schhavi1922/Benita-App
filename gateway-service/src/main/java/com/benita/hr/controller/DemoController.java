package com.benita.hr.controller;

import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/demo")
public class DemoController {

    @GetMapping()
    public String test() {
        return "Hello World!";
    }

}
