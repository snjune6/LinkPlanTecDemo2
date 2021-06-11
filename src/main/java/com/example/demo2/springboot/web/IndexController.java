package com.example.demo2.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @GetMapping(value = {"/", "/index"})
    public String main() {
        return "web/layout/index/main";
    }

}
