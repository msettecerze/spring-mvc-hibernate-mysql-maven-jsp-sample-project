<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<html>
<body>
	<h1>Edit Employee</h1>
	<br /> ${message}
	<br />
	<div class="container">
		<div class="row">
			<div class="col-sm-6">
				<c:if test="${not empty employee}">
					<f:form method="POST" class="well" commandName="employee" action="${pageContext.request.contextPath}/employee/edit/process">
						<table class="table  table-striped">
							<tbody>
								<tr>
									<td><label>First Name:</label></td>
									<td><f:input path="firstName" class="input-small" placeholder="First Name" /></td>
								</tr>
								<tr>
									<td><label>Last Name:</label></td>
									<td><f:input path="lastName" class="input-small" placeholder="Last Name" /></td>
								</tr>
								<tr>
									<td><label>Salary:</label></td>
									<td><f:input path="salary" class="input-small" /></td>
								</tr>
								<tr>
									<td><f:hidden path="id" /> <f:hidden path="version" /></td>
									<td><input type="submit" value="Update" /></td>
								</tr>
							</tbody>
						</table>
					</f:form>
				</c:if>
			</div>
		</div>
	</div>
</body>
</html>