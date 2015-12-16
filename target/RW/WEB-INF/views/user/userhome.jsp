<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
  <title>Home</title>
</head>
<body>
<h1>YOU ARE SUCCESFULL ENTER AS CUSTOMER</h1>

<spring:url value="alltrains/" var="alltrainsUrl" />
<a href="${urlcont}${alltrainsUrl}" title="All trains">Show all trains</a><br />


<spring:url value="logout/" var="logoutUrl" />
<a href="${urlcont}${logoutUrl}" title="user">user</a><br />

<a href="j_spring_security_logout">logout </a>



</body>
</html>

