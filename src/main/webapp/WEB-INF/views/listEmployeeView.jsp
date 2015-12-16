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
listEmployeeView
${message}

<table id="listOfTrains" border="1">
  <tr>
    <td>ID</td>
    <td>Name</td>
    <td>dfs</td>
  </tr>
</table>
<form:form method="post" action="/addTrain" commandName="train">
  <form:input path="Name" />
  <input type="submit" value="Submit" />
</form:form>

</body>
</html>
