package com.mmlogs.admin.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @GetMapping("name")
    public String test() {
        String name = "我是后台应用程序";

        System.out.println(name);

        return name;
    }
}
