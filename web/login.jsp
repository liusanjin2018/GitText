<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/20
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>您输入的注册信息</div>
    <div>您输入的注册信息</div>
    <div>用户名：<span>${requestScope.username}</span></div>
    <div>密码：<span>${requestScope.psw}</span></div>
    <div>信息来源：<span>
        <c:forEach items="${requestScope.lists}" var="val">
            ${val}&nbsp;&nbsp;
        </c:forEach>
    </span></div>
</body>
</html>
