package com.xiaoren.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.text.html.parser.DTD;
import java.util.Date;

@Controller
public class UserController {


    //日期参数
    //使用@DateTimeFormat注解设置日期类型数据格式，默认格式yyyy/MM/dd
    @RequestMapping("/dataParam")
    @ResponseBody//json数据
    public String date(Date date,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
                       @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date date2
    ) {
        System.out.println("参数传递 date >>>." + date);
        System.out.println("参数传递 yyyy-MM-dd>>>" + date1);
        System.out.println("参数传递 yyyy/MM/dd HH:mm:ss>>>" + date2);
        return "{'module':'user date'}";
    }
}
