<%--
  Created by IntelliJ IDEA.
  User: yiny
  Date: 8/2/21
  Time: 7:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--在WEB-INF下的所有页面或者资源，只能通过Controller，或者servlet进行访问。--%>
<h1>登录页面</h1>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    <input type="text" class="text" name="username"/>
    <input type="text" class="text" name="password"/>
    <input type="submit" value="提交">
</form>
</body>
</html>
