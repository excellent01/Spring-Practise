<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/13
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>参数绑定</title>
</head>
<body>
<form action="/test3" method="post">
    姓名：<input type="text" name="username"><br>
    密码：<input type="password" name="password"><br>
    年龄：<input type="text" name="age"><br>
    日期：<input type="text" name="date"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>

