<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>logined.jsp</h1>

안녕하세요 .${userid }님, 반갑습니다. 


${passwd }
<br>
map
<% Map<String, String> map = (Map)request.getAttribute("map"); %>
<%= map %>
</body>
</html>