<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/27
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <form method="post" enctype="multipart/form-data" action="/upload">
        <input name="head" type="file" value="上传头像"/><<br>>
        <input type="submit" value="提交"><br>
    </form>
</body>
</html>
