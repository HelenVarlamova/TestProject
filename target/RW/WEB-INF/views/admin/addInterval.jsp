<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
  <title></title>
</head>
<body>
Add new interval
<form:form method="post" action="/admin/addInterval" commandName="interval">
  <form:input path="time" type="time" value="03:15" min="00:01" max="06:00"/>
  <form:input path="station_id"  />
  <form:input path="stationIdArrive.name" />
  <input type="submit" value="Add interval" />
</form:form>
</body>
</html>
