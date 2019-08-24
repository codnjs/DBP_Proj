<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<style>
	#right-icon {
		margin-bottom: 50px;
	}

	#right-icon img{
		width: 70px;
		height: auto;		
	}
	
	#right-icon button {
		border: none;
		background-color: #ffffff;
	}
</style>
<body>
	<div class="right-icons">
		<div id="right-icon">
			<button type="button" data-toggle="modal" data-target="#give_regi_modal"><img src="${pageContext.request.contextPath}/resources/img/edit.png"></button>
		</div>
		<div id="right-icon">
			<button type="button" data-toggle="modal" data-target="#myModal"><img src="${pageContext.request.contextPath}/resources/img/calendar (2).png"></button>
		</div>
		<div id="right-icon">
			<img src="${pageContext.request.contextPath}/resources/img/inbox.png">
		</div>
		<div id="right-icon">
			<img src="${pageContext.request.contextPath}/resources/img/businessman.png" style="margin-top: 100px;">
		</div>

	</div>
</body>
</html>