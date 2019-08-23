package com.github.excellent.utils;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * 字符串转换为日期
 * @auther plg
 * @date 2019/8/14 17:39
 */
public class StringToDate implements Converter<String,Date> {
    @Override
    public  Date convert(String source) {
        if(source == null){
            throw new RuntimeException("参数异常");
        }
        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static <W>void method(W t)
    {
        System.out.println("method: "+t);
    }



}
