package com.example.demo2.springboot.kcms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kcms")
public class IndexKcmsController {

    @GetMapping(value = {"/" ,"/index"})
    public String main() {

        return "kcms/layout/index/main";
    }

}
