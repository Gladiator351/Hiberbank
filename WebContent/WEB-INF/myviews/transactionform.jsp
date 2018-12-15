<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Transaction</h1>
	<div>
		How much would you like to #deposit/transfer# ?
	</div>
	<table>		
		<f:form action="savetransaction">
			<tr>
				<td>Amount: </td>
				<td><f:input path="amount"/></td>
			</tr>
			
			<tr>
				<td>Tid: </td>
				<td><f:input path="tid"/></td>
			</tr>
			
			<tr>
				<td>time: </td>
				<td><f:input path="time"/></td>
			</tr>
			
			<tr>
				<td>With: </td>
				<td><f:input path="withdrawal"/></td>
			</tr>
			
			<tr>
				<td>Dep: </td>
				<td><f:input path="deposit"/></td>
			</tr>			
			
			
			<tr>
				<td>
					<f:button>Go</f:button>
				</td>
			</tr>	
		</f:form>
	</table>
</body>
</html>