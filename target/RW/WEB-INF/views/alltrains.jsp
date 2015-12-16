<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 19.10.2015
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title></title>
</head>
<body>
<table id="listOfTrains" border="1">
  <tr>
    <td>ID</td>
    <td>Name</td>
    <td>dfs</td>
  </tr>
  <c:forEach items="${listOfTrains}" var="train">
    <tr>
      <td>${train.train_id}</td>
      <td>${train.name}</td>
    </tr>
  </c:forEach>
</table>

</body>
</html>
