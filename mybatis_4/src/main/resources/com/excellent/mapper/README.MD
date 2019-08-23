####  一对一（多对一）

- 扩展类   

  * 继承一个类，并且添加不存在的属性

- 组合

    * 一个类中注入另一个类的对象
    
  <resultMap id="queryOrderToUser2Map" type="com.excellent.po.Orders">
         <id column="id" property="id"/>
         <result column="user_id" property="userid"/>
         <result column="number" property="number"/>
         <result column="createtime" property="createtime"/>
         <result column="note" property="note"/>
 
         <!--
             property : Type当中的属性值,Orders类中的属性
             javaType ： property 属性值的类型
             column : 关联字段
             property： javaType中指定的类型的属性名称
         -->
         <association property="user" javaType="com.excellent.po.User">
             <id column="user_id" property="id"/>
             <result column="username" property="username"/>
             <result column="sex" property="sex"/>
             <result column="address" property="address"/>
         </association>
     </resultMap>