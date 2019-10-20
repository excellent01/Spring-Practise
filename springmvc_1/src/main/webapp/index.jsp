<html>
<body>
<h2>Hello World!</h2>
<fieldset>
    POST:<br>
    <form action="${pageContext.request.contextPath}/abc/order/101" method="post">
        <input type="submit" value="post">
    </form>

    DELETE:<br>
    <form action="${pageContext.request.contextPath}/abc/order/101" method="post">
        <input type="hidden" name="_method" value="DELETE">
        <input type="submit" value="delete">
    </form>

    PUT:<br>
    <form action="${pageContext.request.contextPath}/abc/order/101" method="post">
        <input type="hidden" name="_method" value="HEAD">
        <input type="submit" value="put">
    </form>
</fieldset>

<fieldset>
    <hr>
    <form action="${pageContext.request.contextPath}/abc/testUser" method="post">
        <br>username:<input type="text" name="userName" value="zs"><br>
        <%--<br>password:<input type="text" name="password" value="123"><br>--%>
        <br><input type="text" name="id" value="1">
        <br><input type="submit"  value="testUser"><br>
    </form>>
</fieldset>

<fieldset>
    <form action="${pageContext.request.contextPath}/abc/uplode" method="post" enctype="multipart/form-data">
        文件上传： <input type="file" name="file" value=""><br>
        <input type="submit" value="uplode">
    </form>
</fieldset>
</body>
</html>
