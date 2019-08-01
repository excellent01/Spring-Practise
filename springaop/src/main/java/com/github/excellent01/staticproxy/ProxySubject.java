package com.github.excellent01.staticproxy;

/**
 * @auther plg
 * @date 2019/8/1 15:39
 */
public class ProxySubject implements ISubject {
    private ISubject realSubject = null;
    public ProxySubject(ISubject realSubject){
        this.realSubject = realSubject;
    }
    public void work1() {
        this.before();
        realSubject.work1();
        this.after();
    }

    public void work2() {
        this.before();
        realSubject.work2();
        this.after();
    }

    private void before(){
        System.out.println("真实业务之前。。。");
    }
    private void after(){
        System.out.println("真实业务之后。。。");
    }
}
