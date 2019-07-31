package com.github.excellent.testdi;

/**
 * @auther plg
 * @date 2019/7/31 21:51
 */
public class StaticComputerFactory {
    private static Computer computer = new Computer();
    public static Computer getComputer(){
        return computer;
    }
}
