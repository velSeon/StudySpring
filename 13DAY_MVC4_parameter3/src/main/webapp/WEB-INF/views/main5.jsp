<%@page import="com.dto.Login"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
main5.jsp<br>
${login}



<%Login login = (Login)request.getAttribute("login"); %>
<%=login.getUserid() %>
<%=login.getPasswd() %>



</body>
</html>