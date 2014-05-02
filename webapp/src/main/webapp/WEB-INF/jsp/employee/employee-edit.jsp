<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<html>
<body>
	<div id="content">
		${message} <br />
		<c:if test="${not empty employee}">
		<f:form method="POST" commandName="employee"
			action="${pageContext.request.contextPath}/employee/edit/process">
			<table>
				<tbody>
					<tr>
						<td>First Name:</td>
						<td><f:input path="firstName" /></td>
					</tr>
					<tr>
						<td>Last Name:</td>
						<td><f:input path="lastName" /></td>
					</tr>
					<tr>
						<td>Salary:</td>
						<td><f:input path="salary" /></td>
					</tr>
					<tr>
						<td><input type="submit" value="Update" /></td>
						<td><f:hidden path="id" /><f:hidden path="version" /> </td>
					</tr>
				</tbody>
			</table>
		</f:form>
		</c:if>
	</div>
</body>
</html>