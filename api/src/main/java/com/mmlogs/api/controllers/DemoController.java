package com.mmlogs.api.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {


    @GetMapping("get-name")
    public String test() {
        String name = "我是API接口项目";

        System.out.println(name);

        return name;
    }
}
