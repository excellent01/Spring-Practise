package com.github.excellent01.dynimicproxy;



/**
 * @auther plg
 * @date 2019/8/1 15:41
 */
public class Main {
    public static void main(String[] args) {
      ProxySubject proxySubject = new ProxySubject(new RealSubject());
      ISubject proxyIntance = (ISubject) proxySubject.getProxyIntance();
      proxyIntance.work1();
      proxyIntance.work2();
      System.out.println(proxyIntance.getClass().getName());
    }
}
