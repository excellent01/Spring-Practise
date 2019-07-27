package com.github.excellent01;

import lombok.Data;

/**
 * @auther plg
 * @date 2019/7/27 22:16
 */

@Data
public class Demo3 {
    private Demo4 demo4;
    private String demo;

    public Demo3(String demo) {
        this.demo = demo;
    }

    public Demo3(){

    }
}
