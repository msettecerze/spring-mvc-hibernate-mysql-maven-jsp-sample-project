<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	<div id="content">
		${message} <br /> All Employees <br/>

		<table>
			<tr>
				<th></th>
				<th><fmt:message key="form.count"></fmt:message></th>
				<th><fmt:message key="employee.form.id"></fmt:message></th>
				<th><fmt:message key="employee.form.firstName"></fmt:message></th>
				<th><fmt:message key="employee.form.lastName"></fmt:message></th>
				<th><fmt:message key="employee.form.salary"></fmt:message></th>
				<th>Action</th>
			</tr>
			<c:forEach var="employee" items="${employees}" varStatus="status">
				<tr>
					<td><input type="checkbox"/></td>
					<td><c:out value = "${status.count}"/></td>
					<td>${employee.id}</td>
					<td>${employee.firstName}</td>
					<td>${employee.lastName}</td>
					<td>${employee.salary}</td>
					<td>
						<a href = "<c:out value = "${pageContext.request.contextPath}/employee/edit/${employee.id}"/>"> Edit</a> 
						<a href = "<c:out value = "${pageContext.request.contextPath}/employee/delete/${employee.id}"/>"> Delete</a> 
					</td>
				</tr>
			</c:forEach>
		</table>

	</div>
</body>
</html>