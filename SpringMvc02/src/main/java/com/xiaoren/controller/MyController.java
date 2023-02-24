package com.xiaoren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/xiaoren")
public class MyController {
    //定义一个处理请求方法

    /**
     * @return 返回String, 用表明跳转页面路径
     */
    @RequestMapping("/firstController.do")
    public String firstController() {
        System.out.println("firstController do ...");
        //return "/first,jsp"固定路径；固定在当前项目下
//        return "first.jsp";//原始写法
        //在spring.xml中配置了视图解释器
        return "first";
    }
}
