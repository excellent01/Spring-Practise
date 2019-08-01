package com.github.excellent01.staticproxy;

/**
 * @auther plg
 * @date 2019/8/1 15:41
 */
public class Main {
    public static void main(String[] args) {
        ISubject subject = new ProxySubject(new RealSubject());
        subject.work1();
        subject.work2();
    }
}
