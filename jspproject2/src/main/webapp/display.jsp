<%@page import="org.apache.taglibs.standard.tag.el.core.ForEachTag"%>
<%@page import="jspproject2.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String value=(String)request.getAttribute("value"); %>
changed by<%=value %>
<table border="1px">
<tr>
<th>id</th>
<th>name</th>
<th>address</th>
<th>email</th>
<th>password</th>
<th>image</th>
<th>delete</th>
<th>update</th>







</tr>
<% List<Employee> list =(List)request.getAttribute("list"); %>
<%for(Employee employee:list) {%>

<tr>
<td><%=employee.getId()%></td>
<td><%=employee.getName()%></td>
<td><%=employee.getAddress()%></td>
<td><%=employee.getEmail()%></td>
<td><%=employee.getPassword()%></td>
<td><img alt="<%=employee.getImage() %>" src="image"></td>
<td><a href="delete?id=<%=employee.getId()%>"><button>delete</button></a></td>
<td><a href="update?id=<%=employee.getId()%>"><button>update</button></a></td>

</tr>
<%} %>















</table>
<img alt="" src="">
</body>
</html>