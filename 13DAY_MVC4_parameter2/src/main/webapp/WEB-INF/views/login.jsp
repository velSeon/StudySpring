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
login.jsp
id:${loginDTO.userid }<br>
passwd:${loginDTO.passwd }<br>


<%Login login = (Login)request.getAttribute("loginDTO"); %>
<%= login.getUserid() %>
<%= login.getPasswd() %>

${stringLogin}
</body>
</html>
