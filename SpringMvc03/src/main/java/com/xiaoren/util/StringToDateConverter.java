package com.xiaoren.util;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//配置转换器类
public class StringToDateConverter implements Converter<String, Date> {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Date convert(String source) {
        Date date = null;
        try {
            date = dateFormat.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException("日期转换异常");
        }
        return date;
    }
}
