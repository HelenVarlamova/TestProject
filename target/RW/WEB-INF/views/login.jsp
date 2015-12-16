<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 31.10.2015
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page session="false"%>
<html>
<head>
  <title></title>
</head>
<body>

<form  action="<c:url value='j_spring_security_check' />"
       method='POST'>
  <div >
    <c:if test="${not empty msg}">
      <div class="msg">${msg}</div>
    </c:if>
    <div class="login1">
      <table>
        <tr>
          <td>Имя <input type='text' name='j_username'>
          </td>
        </tr>
        <tr>
          <td>Пароль <input type='password' name='j_password' />
          </td>
        </tr>
      </table>
      <br /> <input name="submit" type="submit"
                    value="Вход" /> <br />
    </div>
  </div>
</form>
</body>
</html>

