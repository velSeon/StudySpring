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

안녕하세요. ${sessionScope.login.userid }님, 반갑습니다. <br>
비밀번호는 ${login.passwd }입니다. <br>

<a href="logout">로그아웃</a>
<a href="main">main으로 가기</a>
</body>
</html>