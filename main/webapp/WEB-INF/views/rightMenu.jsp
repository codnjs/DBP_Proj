<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
	#right-icon img{
		width: 70px;
		height: auto;
		margin-bottom: 50px;
	}
</style>
<body>
	<div class="right-icons">
		<div id="right-icon">
			<img src="${pageContext.request.contextPath}/resources/img/edit.png">
		</div>
		<div id="right-icon">
			<img src="${pageContext.request.contextPath}/resources/img/calendar (2).png">
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