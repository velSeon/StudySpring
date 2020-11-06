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
<h1>main2.jsp<br></h1>

${address }
${ username}


<%ArrayList list = (ArrayList)request.getAttribute("list"); %>
<%=list.size() %>
<%=list.get(1) %>

</body>
</html>