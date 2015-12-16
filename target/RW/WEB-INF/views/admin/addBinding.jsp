<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
<form:form method="post" action="/admin/addBinding" commandName="stationBinding">
  <form:input path="DepartStation" />
  <form:input path="ArriveStation" />
  <input type="submit" value="Add new binding" />
</form:form>
</body>
</html>
