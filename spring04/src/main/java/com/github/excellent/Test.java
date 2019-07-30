package com.github.excellent;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import javax.annotation.Resource;

/**
 * @auther plg
 * @date 2019/7/30 10:45
 */

/**
 * ClassPathXmlAppilcationContext   --- 加载classpath下的文件
 * FileSystemXmlApplicationContext  --- 加载磁盘任意位置的文件（权限允许）
 * AnnotationConfigerApplicationContext  --- 读取注解创建容器
 */
public class Test {
    private static  ApplicationContext context =null;
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("beanApplication.xml");
        System.out.println(context.getBean("bean1") == context.getBean("bean1") );
}


}
