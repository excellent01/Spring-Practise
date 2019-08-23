package com.github.excellent01.aop;

/**
 * @auther plg
 * @date 2019/8/7 17:47
 */
public class UserImpl implements IUser {
    @Override
    public void add() {
        System.out.println("add...");
    }

    @Override
    public void delete() {
        System.out.println("delete...");
    }

    @Override
    public void find() {
        System.out.println("find...");
    }

    @Override
    public void modify() {
        System.out.println("modify...");
    }
}
