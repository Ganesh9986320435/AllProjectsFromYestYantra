<%@page import="mcdonaldsprojectjsp.dto.Menu"%>
<%@page import="java.util.List"%>
<%@ page
	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Menu> list = (List) request.getAttribute("list");
	%>
	<table>
		<tr>
			<th>id</th>
			<th>name</th>
			<th>desc</th>
			<th>price</th>
			<th>offer</th>
		</tr>
		<%
		for (Menu menu : list) {
		%>
		<tr>
			<td><%=menu.getId()%></td>
			<td ><a href="item?id=<%=menu.getId()%>" ><%=menu.getIname()%></a></td>
			<td><%=menu.getDesc()%></td>
			<td><%=menu.getPrice()%></td>
			<td><%=menu.getOffer()%></td>
			<td></td>
		</tr>
		<%
		}
		%>
	</table>
	<h5>
		if u want to add menu <a href="menu.jsp">click here</a>
	</h5>
</body>
</html>