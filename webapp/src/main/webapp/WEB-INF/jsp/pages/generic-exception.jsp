<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Generic Exception</title>
</head>
<body>
	<h1>Sorry! :(</h1>
	<h3>Generic Exception :</h3>
	<!-- <p>Class : ${name} - Error :  ${message}</p>  -->	
	
	<c:forEach items="${exception.stackTrace}" var="element">
		<c:out value="${element}" />
	</c:forEach>
</body>
</html>