package com.wuman.config;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式转换器
 * @author lmf
 * @version 1.0
 * @date 2022/10/20 16:03
 */
public class DateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        Date parse=null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
           parse = simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;
    }
}
