<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false"%>
<html>
<head>
  <title>Admin</title>
</head>
<body>
<h1>Admin zone</h1>

<spring:url value="admin/addTrain/" var="addTrainUrl" />
<a href="${addTrainUrl}" title="Add new train">Add new train</a><br />


<spring:url value="admin/addStation/" var="addStationUrl" />
<a href="${urlcont}${addStationUrl}" title="Add new station">Add new station</a><br />

<spring:url value="admin/addInterval/" var="addIntervalUrl" />
<a href="${urlcont}${addIntervalUrl}" title="Add new interval">Add new interval</a><br />

<spring:url value="admin/addBinding/" var="addBindingUrl" />
<a href="${urlcont}${addBindingUrl}" title="Add new binding between stations">Add new binding between stations</a><br />


<spring:url value="admin/addUser/" var="addUserUrl" />
<a href="${addUserUrl}" title="LOGOUT">LOGOUT</a><br />
</body>
</html>
