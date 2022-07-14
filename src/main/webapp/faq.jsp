<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: damoncastillo
  Date: 7/13/22
  Time: 2:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    if (request.getParameter("color") != null) {
        request.getParameter("color");
    }
%>
<% List<String> trails = new ArrayList<>();
    trails.add("Salado, Creek Greenway");
    trails.add("Leon, Creek Greenway");
    trails.add("Geology Trail");
%>


<% request.setAttribute("trails", trails); %>
<% request.setAttribute("numbers", "1,2,3,4,5"); %>
<p>${param.numbers}</p>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>
<h1> Frequently Asked Questions</h1>
<form action="faq.jsp" method="post">
    <label for="color"> What is your favorite color?</label>
    <input type="text" name="color" id="color" value="blue">
    <button type="submit">Submit</button>
</form>

<c:if test="${param.color!= null}">
    <p> This is your favorite color : ${param.color}</p>
</c:if>

<ul>
    <c:forEach var="trail" items="${trails}">
        <li>${trail}</li>

    </c:forEach>
</ul>
<c:if test="${param.color !=null}">
    <c:choose>
        <c:when test='${param.color.equalsIgnoreCase("blue")}'>
            <h1>Whoa blue is my favorite color!</h1>
        </c:when>
        <c:otherwise>
            <h1> But... ${param.color} is not blue...</h1>
        </c:otherwise>
    </c:choose>
</c:if>

</body>
</html>