<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
%@< page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<%--<p>Cars:</p>--%>
<h1><spring:message  code="label.cars"  /></h1>
<c:forEach var="carMy" items="${carsList1}">
    <h1>${carMy}</h1>
</c:forEach>

</body>
</html>