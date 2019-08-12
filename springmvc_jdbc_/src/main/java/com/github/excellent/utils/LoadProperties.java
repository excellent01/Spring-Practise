package com.github.excellent.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @auther plg
 * @date 2019/8/12 8:47
 */
public class LoadProperties {
    public static Properties load(String name){
        InputStream in = LoadProperties.class.getClassLoader().getResourceAsStream(name);
        Properties properties = new Properties();
        try {
            properties.load(in);
            return properties;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
