<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String message=(String)request.getAttribute("message"); %>
<%if(message!=null){ %>
<%=message %>
<%} %><br>
<form action="login" method="post">

email:<input type="email" name="email">
password:<input type="text" name="password">
<input type="submit">
</form>
</body>
</html>