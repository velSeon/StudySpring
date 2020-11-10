<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
$(function(){
$("#eee").on("click", function(){
	$.ajax({
		url:"eee",
		type:"get",
		dataType:"text",
		data:{
			mesg:"hello" //서버에 mesg 변수명으로 데이터 전송
		},
		success:function(data, status, xhr){
			console.log(data);
			$("#result").text(data);
		},
		error: function(xhr, status, error){
			console.log(error);
			}
		});
	});
	
$("#fff").on("click", function(){
	$.ajax({
		url:"fff",
		type:"post",
		dataType:"text",
		data:{
			mesg:"hello_fff" //서버에 mesg 변수명으로 데이터 전송
		},
		headers:{//post방식 전송시 추가
			"Content_type":"application/text"
		},
		success:function(data, status, xhr){
			console.log(data);
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
<button id="eee"> eee호출 : </button>
<button id="fff"> fff호출 : </button>
<button id="aaa"> aaa호출 : </button>
<button id="bbb"> bbb호출 : </button>
<button id="ccc"> ccc호출 : </button>
<button id="ddd">String</button>
<div id="result"></div>
</body>
</html>