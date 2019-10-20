<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/9
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session</title>
</head>
<body>
   ${sessionScope.user.username};
   ${sessionScope.user.password};
</body>
</html>
