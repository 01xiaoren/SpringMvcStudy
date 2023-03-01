package com.xiaoren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/save")
    @ResponseBody
    public String save(String name, int age) {
        System.out.println("普通参数name: ->>>" + name);
        System.out.println("普通参数age：->>>" + age);
        System.out.println("user save do ...");
        return "{'module':'user  save ....'}";
    }
}
