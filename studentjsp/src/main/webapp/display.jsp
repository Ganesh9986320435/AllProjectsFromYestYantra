<%@page import="java.util.List"%>
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
	<table border="1px" style="background-color:aqua;">
	<tr>
	<th>name</th>
		<th>fname</th>
		<th>email</th>
		<th>pass</th>
		<th>phone</th>
		<th>fees</th>
		<th>delete</th>
		<th>update</th>
	
	</tr>
	
	<%List<Student> list=(List)request.getAttribute("list"); %>
	<%for(Student student:list){ %>
	<tr>
	<td><%=student.getName() %></td>
		<td><%=student.getFname() %></td>
		<td><%=student.getEmail() %></td>
		<td><%=student.getPass() %></td>
		<td><%=student.getPhone() %></td>
		<td><%=student.getFees() %></td>
		<td><a  href="delete?email=<%=student.getEmail()%>"><button>delete</button></a>
		<td><a href="update?email=<%=student.getEmail()%>"><button>update</button></a>
		
	
	
	
	
	
	
	
	
	
	</tr>
	<%} %>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	</table>
</body>
</html>