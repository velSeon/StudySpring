<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
loginForm.jsp

<h1>로그인 화면</h1>
<form action="login" method="post">
아이디:<input type="text" name="userid"><br><!-- action부분을 수정하여 테스트 할것 -->
비밀번호:<input type="text" name="passwd"><br><!-- login 5시 userid값 입력없음 -->

<input type="submit" value="로그인">
</form>
<a href="main">이동하기</a>
</body>
</html>