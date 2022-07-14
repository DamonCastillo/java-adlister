<%--
Created by IntelliJ IDEA.
User: damoncastillo
Date: 7/13/22
Time: 4:30 PM
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="partials/head.jsp" %>

<html>

<head>

    <title>Title</title>
</head>

<body>


<form action="login.jsp" method="post">
    <fieldset class="width-80">
        <div class="form-group">
            <label for="username" class="form-label">Username</label>
            <input type="text" id="username" name="username" class="form-control">
        </div>
        <div class="form-group">
            <label for="password" class="form-label">Password</label>
            <input type="password" id="password" name="password" class="form-control">
        </div>
        <button class="btn btn-block">Login</button>
    </fieldset>
</form>
<c:if test="${(param.username != null) && (param.password !=null)}">
    <c:choose>
        <c:when test='${(param.username.equals("admin")) && (param.password.equals("password"))}'>
            <%response.sendRedirect("/profile.jsp");%>
        </c:when>
        <c:otherwise>
            <% response.sendRedirect("/login.jsp"); %>
        </c:otherwise>
    </c:choose>
</c:if>
</body>

</html>
