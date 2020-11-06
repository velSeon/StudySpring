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
<h1>main.jsp<br></h1>

${xxx }
<% ArrayList<String> list = (ArrayList)request.getAttribute("xxx"); 
for( int i = 0; i < list.size(); i++){
%>
<%= list.get(i) %>
<%} %>

</body>
</html>