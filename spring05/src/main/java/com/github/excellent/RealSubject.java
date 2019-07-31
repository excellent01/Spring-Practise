package com.github.excellent;


import org.springframework.stereotype.Component;

/**
 * @auther plg
 * @date 2019/7/31 16:51
 */


@Component("readsubject")
public class RealSubject {
   public void add(){
       System.out.println("============添加 一个元素==============");
   }

   public void delete(){
       System.out.println("============删除一个元素==============");
   }

   public void modify(){
       System.out.println("=============修改一个元素=============");
   }
   public void search(){
       System.out.println("============查找一个元素===============");
   }

}
