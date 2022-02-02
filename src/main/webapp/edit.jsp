<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="ru">
<head>
    <title>Meals</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<hr>
<h2>Meals</h2>
<h3><a href="index.html">Add Meal</a></h3>
<table border="1">
    <tbody>
    <c:set var="meal" value="${requestScope.data}"></c:set>
    <tr>
        <td>Id</td>
        <td>${meal.id}</td>
    </tr>
    <tr>
        <td>Date</td>
        <td>${meal.dateTime}</td>
    </tr>
    <tr>
        <td>Description</td>
        <td>${meal.description}</td>
    </tr>
    <tr>
        <td>Calories</td>
        <td>${meal.calories}</td>
    </tr>
<%--    <c:forEach var="meal" items="${requestScope.data}">--%>
<%--        <tr style="color:${meal.excess ? "red" : "green"}">--%>
<%--            <td>${meal.dateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"))}</td>--%>
<%--            <td>${meal.description}</td>--%>
<%--            <td>${meal.calories}</td>--%>
<%--            <td><a href="index.html">Update</a></td>--%>
<%--            <td><a href="meals?action=delete&mealId=<c:out value="${meal.id}"/>">Delete</a></td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
    </tbody>
</table>
</body>
</html>