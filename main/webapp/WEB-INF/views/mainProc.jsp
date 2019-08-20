<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/resources/style.css" rel="stylesheet" />
<title>Insert title here</title>
<style>
	/* .start-wrapper img {
		position: relative;
		width: 100%;
	}
	#buttons {
	  background-color: #ffffff;
	  border: 2px solid #50B15A;
	  border-radius: 5px;
	  color: #50B15A;
	  padding: 16px 32px;
	  font-family: 'Do Hyeon', sans-serif;
	  text-align: center;
	  text-decoration: none;
	  display: inline-block;
	  font-size: 30px;
	  margin: 4px 2px;
	  -webkit-transition-duration: 0.4s; /* Safari */
	  transition-duration: 0.4s;
	  cursor: pointer;
	}	
	#buttons:hover{
	  background-color: #50B15A;
	  color: #ffffff;
	}
	
	.btns-main {
		position: absolute;
		top: 70%;
		left: 43%;
		transform: translate( -50%, -50% );
		text-align: center;
	} */

</style>
</head>
<body>
	<div class="start-wrapper">
		<img src="${pageContext.request.contextPath}/resources/img/전체화면.jpg">
		<div class="btns-main">
			<button id="buttons" onclick="javascript:location.href='/give_money_list'">잊지 않고 주기</button>&nbsp;&nbsp;&nbsp;
			<button id="buttons" onclick="javascript:location.href='/get_money_list'">잊지 않고 받기</button>
			
		</div>
	</div>


</body>
</html>