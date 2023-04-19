<%@ page
	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"
%>
<%@ taglib
	uri="http://java.sun.com/jsp/jstl/core"
	prefix="c" 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="2px">
		<tr>
			<td>id</td>
			<td>name</td>
			<td>subject</td>
		</tr>
		<c:forEach
			var="employee"
			items="${list}"
		>
			<tr>
				<td>${employee.id}</td>
				<td>${employee.name}</td>
				<td>${employee.role}</td>
				<td><a href="delete?id=${employee.id}">delete</a></td>
				<td><a href="edit?id=${employee.id}">edit</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>