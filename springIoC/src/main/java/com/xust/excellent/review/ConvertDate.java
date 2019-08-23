package com.xust.excellent.review;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 类型转换器
 * String --- > Date
 * @auther plg
 * @date 2019/8/10 20:27
 */
public class ConvertDate extends PropertyEditorSupport {
    private String parttern = "yyyy-MM-dd";
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(parttern);
        try {
            Date date = simpleDateFormat.parse(text);
            this.setValue(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
