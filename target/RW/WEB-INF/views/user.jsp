<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<form:form method="post" action="/addNewUser" commandName="user">
    <form:input path="name" />
    <form:input path="last_name" />
    <form:input path="birth_date" type="date" placeholder="dd-mm-yyy" />
    <form:input path="username" />
    <form:input path="login" />
    <form:input path="password" />
    <input type="submit" value="Registration" />
</form:form>
</body>
</html>
