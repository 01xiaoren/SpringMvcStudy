package com.xiaoren.controller;

import com.xiaoren.pojo.Person1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testPojo01 {
    @RequestMapping("getDataByPojo1")
    public String testGetPoJo(Person1 person) {
        System.out.println(person);
        return "success";
    }
}
