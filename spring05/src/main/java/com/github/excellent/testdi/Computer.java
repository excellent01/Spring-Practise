package com.github.excellent.testdi;

import lombok.Data;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @auther plg
 * @date 2019/7/31 21:49
 */
@Data
@Component(value = "computer")
@ComponentScan(value = "com.github.excellent.testdi")
public class Computer {
    private String name;
    private double proice;
}
