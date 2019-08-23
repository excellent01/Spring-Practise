<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/14
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求体</title>
</head>
<body>
<form action="/test5" method="post">
    姓名：<input type="text" name="username"><br>
    密码：<input type="password" name="password"><br>
    年龄：<input type="text" name="age"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
