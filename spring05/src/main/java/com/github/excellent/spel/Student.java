package com.github.excellent.spel;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @auther plg
 * @date 2019/8/7 13:01
 */

@Data
@Component
public class Student {
    private String name;
    private Integer age;
    private School school;
}
