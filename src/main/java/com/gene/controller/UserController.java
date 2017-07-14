package com.gene.controller;

import com.gene.exception.BaseException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gene on 2017/7/14.
 */
@RestController
public class UserController {


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String test() {

        return "gene hha";
    }

}
