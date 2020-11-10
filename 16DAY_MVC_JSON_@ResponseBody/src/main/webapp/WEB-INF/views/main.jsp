<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
$(function(){
$("#ddd").on("click", function(){
	$.ajax({
		url:"ddd",
		type:"get",
		dataType:"text",
		data:{
			mesg:"kkkkkk" //서버에 mesg 변수명으로 데이터 전송
		},
		success:function(data, status, xhr){
			$("#result").text(data);
		},
		error: function(xhr, status, error){
			console.log(error);
			}
		});
	});
	
$("#aaa").on("click",function(){
	$.ajax({
		url:"aaa",
		type:"get",
		datatype:"json",
		success:function(data, status, xhr){//json데이터 비동기 받기
			console.log(data, data.userid, data.passwd);
			$("#result").text(JSON.stringify(data));//json데이터를 문자열로 변동 후 브라우저에 출력
		},
		error: function(xhr, status, error){
			console.log(error);
			}
		
		
	});
});

$("#bbb").on("click",function(){
	$.ajax({
		url:"bbb",
		type:"get",
		datatype:"json",
		success:function(data, status, xhr){//json데이터 비동기 받기
			console.log(data, data.length);
			for(var i = 0; i < data.length ; i++){
				console.log(data[i].userid, data[i].passwd);
			}
			$("#result").text(JSON.stringify(data));//json데이터를 문자열로 변동 후 브라우저에 출력
		},
		error: function(xhr, status, error){
			console.log(error);
			}
		
		
	});
});
	

$("#ccc").on("click",function(){
	$.ajax({
		url:"ccc",
		type:"get",
		datatype:"json",
		success:function(data, status, xhr){//json데이터 비동기 받기
			console.log(data);
			console.log(data, data.one);
			console.log(data, data.two);
			
			$("#result").text(JSON.stringify(data));//json데이터를 문자열로 변동 후 브라우저에 출력
		},
		error: function(xhr, status, error){
			console.log(error);
			}
		
		
	});
});
	
});

</script>


<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>
<h1>
main.jsp
</h1>
<button id="aaa"> aaa호출 : login 호출</button>
<button id="bbb"> bbb호출 : ArrayList</button>
<button id="ccc"> ccc호출 : HashMap</button>
<button id="ddd">String</button>
<div id="result"></div>
</body>
</html>