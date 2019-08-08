## 动态代理

###类的加载过程

 * 加载
 * 验证
 * 准备
 * 解析
 * 初始化
 * 使用
 * 卸载
 
 #### 加载
 第一步的加载只是将字节码文件读进内存
 其中字节码文件可以来自.class文件，网络，甚至是内存。
 动态代理期间所生成的代理类就是通过内存而加载的。
 
 ### Spring切入点表达式的写法
 
 - [访问修饰符] 方法返回值 包名.类名.方法名(参数)
 - public void com.github.excellent01.Useimpl(..)
 -  expression="execution(* com.github.excellent01.aop.UserImpl.*(..)))