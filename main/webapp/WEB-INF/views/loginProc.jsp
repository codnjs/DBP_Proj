<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/style.css" rel="stylesheet" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	function loginCheck() {
		if($("#userid").val().length < 1) {
			alert("아이디를 입력해주세요.");
			$("#userid").focus();
		}		 
		if($("#userpw").val().length < 1) {
			alert("비밀번호를 입력해주세요.");
			$("#userpw").focus();
		}		
	} 
</script>
</head>
<body>
<div class="row userDiv">
  <div class="panel panel-default">
  <div class="panel-heading"> 로그인 </div>
  <div class="panel-body">
	<form action="/" method="post">
	  <div class="form-group">	  
		<input type="text" id="userid" name="userid" placeholder="아이디">
	  </div>
	  <div class="form-group">	
		<input type="password" id="userpw" name="userpw" placeholder="비밀번호"><br>
	  </div>
		<button type="submit" class="btn btn-success" onclick="loginCheck()"> 로그인 </button>
	</form>
  </div>
</div>
</div>
</body>

</html>