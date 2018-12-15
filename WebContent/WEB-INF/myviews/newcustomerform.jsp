<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="ISO-8859-1">
<title>Create New Customer</title>
</head>
<body>
	<center>
		<h1>Create New Customer</h1>
		<table border="1">
			<f:form action="savecustomerservice">
				<tr>
					<td>ID:</td>
					<td><f:input path="id" /></td>
				</tr>
				<tr>
					<td>Username:</td>
					<td><f:input path="username" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><f:input path="password" /></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><f:input path="name" /></td>
				</tr>
				<tr>
					<td>Phone:</td>
					<td><f:input path="phone" /></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><f:input path="address" /></td>
				</tr>
				<tr>
					<td>Status:</td>
					<td><f:input path="status" /></td>
				</tr>
				<tr>
					<td colspan="1" align="center"></td>
					<td><f:button>Save</f:button></td>
				</tr>
			</f:form>
		</table>
	</center>
</body>
</html>