<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
Add new train
<form:form method="post" action="/admin/addTrain" commandName="train">
  <form:input path="Name" />
  <form:input path="time" type="time" placeholder="hh:mm" />
  <input type="submit" value="Add train" />
</form:form>
</body>
</html>
