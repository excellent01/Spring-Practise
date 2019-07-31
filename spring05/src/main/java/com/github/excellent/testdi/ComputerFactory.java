package com.github.excellent.testdi;

/**
 * @auther plg
 * @date 2019/7/31 21:50
 */

/**
 * 普通工厂
 */
public class ComputerFactory {

    private Computer computer = new Computer();
    public Computer getInstance(){
        return computer;
    }

}
