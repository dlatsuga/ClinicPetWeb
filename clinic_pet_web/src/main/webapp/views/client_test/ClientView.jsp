<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
    <table border="1">
        <tr>
              <td>Имя клиента</td>
        </tr>

            <c:forEach items="${clients}" var="client" varStatus="status">
        <tr valign="top">
              <td>${client.login}</td>
        </tr>
            </c:forEach>

    </table>
</body>
</html>
