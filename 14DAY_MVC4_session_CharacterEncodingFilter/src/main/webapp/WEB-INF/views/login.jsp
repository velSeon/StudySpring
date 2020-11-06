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
login.jsp<br>


<h1>안녕하세요,  ${sessionScope.login.userid } 님. 반갑습니다. <br></h1>
비밀번호는는 ${sessionScope.login.passwd } 입니다. <br>

<!-- ${login.userid}로도 가능하다.  -->

DTO로 할 경우 <br>
<% Login login = (Login)session.getAttribute("login");%>
id는  <%=login.getUserid() %> <br>


<a href="logout">로그아웃</a>
</body>
</html>