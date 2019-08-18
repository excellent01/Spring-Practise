<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/18
  Time: 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>显示用户信息</title>

    <table border="1" align="center" width="100%">
        <tr>
            <th>userId</th>
            <th>userName</th>
            <th>birthday</th>
            <th>userSex</th>
            <th>Address</th>
        </tr>

        <c:forEach items="${list}" var="i" >
            <tr align="center">
                <td>${i.userId}</td>
                <td>${i.userName}</td>
                <td>${i.birthday}</td>
                <td>${i.userSex}</td>
                <td>${i.userAddr}</td>
            </tr>
        </c:forEach>

    </table>
</head>
<body>

</body>
</html>
