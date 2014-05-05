<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>404 Error</title>
</head>
<body>
	<h1>Sorry! :(</h1>
	<!-- <p>Class : ${name} - Error :  ${message}</p>  -->	
	
	<c:if test="${not empty exception.errCode}">
		<h1>${exception.errCode}:SystemErrors</h1>
	</c:if>

	<c:if test="${empty exception.errCode}">
		<h1>System Errors</h1>
	</c:if>

	<c:if test="${not empty exception.errMsg}">
		<h4>${exception.errMsg}</h4>
	</c:if>
	<c:forEach items="${exception.stackTrace}" var="element">
		<c:out value="${element}"/>
	</c:forEach>
</body>
</html>