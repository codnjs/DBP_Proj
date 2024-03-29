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
</head>
<body>
<div class="row userDiv">
  <div class="panel panel-default">
  <div class="panel-heading"> 회원가입 </div>
  <div class="panel-body">
	<form action="/login" method="post">
	  <div class="form-group">	  
		<input type="text" name="userid" placeholder="아이디">
	  </div>
	  <div class="form-group">	
		<input type="password" name="userpw" placeholder="비밀번호"><br>
		<input type="password" name="userpw2" placeholder="비밀번호 확인">
	  </div>
	  <div class="form-group">	
		<input type="text" name="username" placeholder="사용할 닉네임">
	  </div>
		<button type="submit" class="btn btn-success" onclick="signupCheck"> 완료 </button>
	</form>
  </div>
</div>
</div>
</body>
<script>
	function signupCheck() {
		var userid = $("#userid").val();
		var userpw = $("#userpw").val();
		var userpw2 = $("#userpw2").val();
		var username = $("#username").val();
		var msg = "${msg}";
		
		if(userid.length == 0) {
			alert("아이디를 입력해주세요");
			$("#userid").focus();
			return false;
		}
		
		if(userpw.length == 0) {
			alert("비밀번호를 입력해주세요");
			$("#userpw").focus();
			return false;
		}
		
		if(userpw != userpw2) {
			alert("비밀번호가 서로 다릅니다. 비밀번호를 다시 확인해주세요");
			$("#userpw2").focus();
			return false;
		}
		
		if(username.length == 0) {
			alert("닉네임을 입력해주세요");
			$("#username").focus();
			return false;
		}
		
		if(confirm("회원가입을 하시겠습니까?")) {
			if(msg == "REGISTERED") {
				alert("회원가입이 완료되었습니다!");
			} else {
				alert("회원가입에 실패하였습니다ㅠㅠ");
			}
		}
		
	}
</script>
</html>