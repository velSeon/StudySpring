<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
login.jsp<br>
id: ${userid }<br>
pass: ${passwd }<br>

id: <%=request.getAttribute("userid") %> <br>
pass: <%=request.getAttribute("passwd") %>
</body>
</html>