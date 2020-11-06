<%@page import="com.dto.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
login2.jsp<br>
id:${xxx.userid }<br>
passwd:${xxx.passwd }<br>

<% Login login = (Login)request.getAttribute("xxx"); %>
<%= login.getUserid() %><br>
<%= login.getPasswd() %><br>


</body>
</html>
