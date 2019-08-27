<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/style.css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style>
	/* .btns-right {
		text-align: center;
		position: fixed;
		top: 10%;
		padding-left: 20px;
	} */
</style>
</head>
<body>
<div class="container" style="width: 100%;">
  <div class="list-group">
    <button class="list-group-item" onclick="javascript:location.href='/'" style="background-color: #50B15A">메인으로</a>
    <button class="list-group-item" onclick="javascript:location.href='/signup'">회원가입</a>
    <button class="list-group-item" onclick="javascript:location.href='/login'">로그인</a>
    <!-- <button class="list-group-item" onclick="javascript:location.href='/logout'">로그아웃</a> -->
    <button class="list-group-item" onclick="javascript:location.href='/info'">지갑을 탁! 소개</a>
  </div>
</div>
</body>
</html>