<%@page import="jspproject2.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%Employee employee=(Employee)request.getAttribute("employee"); %>
<form action="edit">
Id:<input type="number" name="id" value="<%=employee.getId() %>" readonly="true">
name:<input type="text" name="name" value="<%=employee.getName() %>">
adress:<input type="text" name="address" value="<%=employee.getAddress() %>">
email:<input type="email" name="email" value="<%=employee.getEmail() %>">
password:<input type="text" name="password" value="<%=employee.getPassword() %>">
<input type="submit">
</body>
</html>