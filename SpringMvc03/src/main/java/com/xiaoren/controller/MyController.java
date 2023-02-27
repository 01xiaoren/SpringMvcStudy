package com.xiaoren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
    //value配置多个访问路径
    @RequestMapping(value = {"/myCon.do", "/myCon1.do"})
    public String test() {
        return "success";
    }

    //设置提交方式method
    @RequestMapping(value = "testRequest", method = {RequestMethod.GET, RequestMethod.POST})
    public String testRequest() {
        System.out.println("testRequest");
        return "success";
    }

    //设置参数
    @RequestMapping(value = "testRequest02", params = "username")
    public String testRequest02() {
        System.out.println("testRequest02");
        return "success";
    }

    //testPathValue注解设置参数
    @RequestMapping("testPathValue/{id}/{username}")
    public String testPathValue(@PathVariable("id") Integer id, @PathVariable("username") String username) {
        System.out.println("id:" + id);
        System.out.println("username:" + username);
        return "success";

    }
}
