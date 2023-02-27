package com.xiaoren.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person1 {
    private String pname;
    private String page;
    private String gender;
    private String[] hobby;

    //日期转换注解
   //注解 @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdate;
}
