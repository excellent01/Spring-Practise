<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/12
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>showuser</title>
</head>
<body>

    <table border="1" align="center" width="100%">
        <tr>
            <th>Userid</th>
            <th>UserName</th>
            <th>UserAddr</th>
        </tr>
        <c:forEach items="${list}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.address}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>