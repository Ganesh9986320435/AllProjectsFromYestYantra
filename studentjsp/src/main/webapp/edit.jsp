<%@page import="com.google.protobuf.Value"%>
<%@page import="studentjsp.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%Student student=(Student)request.getAttribute("student") ;%>
<form action="edit">
name:<input type="text" name="name" value="<%=student.getName()%>">
fnmae:<input type="text" name="fname" value="<%=student.getFname()%>">
email:<input type="text" name="email" value="<%=student.getEmail()%>" readonly="true">
pass:<input type="text" name="pass" value="<%=student.getPass()%>">
phone:<input type="tel" name="phone" value="<%=student.getPhone()%>">
fees:<input type="number" name="fees" value="<%=student.getFees()%>" readonly="true">
<input type="submit">

</body>
</html>