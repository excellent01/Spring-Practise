<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/11
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/test?username=tom&password=123">参数配置1</a><br>
    <a href="/jsp/user.jsp">参数配置2</a><br>
    <a href="/jsp/person.jsp">参数配置3</a><br>

    <a href="/test4?username=潘立刚">参数配置4</a><br>

    <a href="/jsp/requestBody.jsp">请求体获取</a><br>

    <a href="/test6/10">PathVariable</a><br>
    <a href="/test7">请求头</a><br>
    <a href="/test8">CookValue</a><br>
    <a href="/test9">ModuleAttribute</a><br>
    <a href="/abc/ab">测试</a><br>
    <a href="/jsp/upload.jsp">文件上传</a><br>


</body>
</html>