package com.example.springcicd_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

    @RequestMapping("/")
    public String homepage() {
        return "hello everyone! this is anshika tamak from india................hope you are doing good";
    }


}
