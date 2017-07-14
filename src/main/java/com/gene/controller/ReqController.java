package com.gene.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * spring-boot 接收参数demo
 * @author: Gene
 */

@RestController
@RequestMapping("/req")
public class ReqController {

    /**
     * 通过HttpServletRequest对象接收参数，支持GET、POST
     * @param request
     * @return
     */
    @RequestMapping(value = "/demo2")
    public String demo2(HttpServletRequest request) {
        String username = request.getParameter("username");
        String age = request.getParameter("age");
        System.out.println("param: " + username + " -- " + age);

        return "接收到参数：" + username + "--" + age;
    }


    /**
     * 参数形式接收，类型必须保持一致，不然会报错，且只支持GET方式
     * @param username
     * @param age
     * @return
     */
    @RequestMapping(value = "/demo1", method = RequestMethod.GET)
    public String demo1(String username, Integer age) {
        System.out.println("param: " + username + " -- " + age);

        return "接收到参数：" + username + "--" + age;
    }


}
