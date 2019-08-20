<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta charset="EUC-KR">
<title>게시판 목록</title>
</head>
<body>
<h2> 게시판 목록 </h2>
<div class="row">
  <div class="panel panel-default">
  <div class="panel-heading"> 게시판 목록 페이지
    <a href="/register"> Register(등록)</a>
  	<a href="/register">
  		<button type="button" class="btn btn-primary pull-right">등록버튼</button>  		
  	</a>
  	<form action="/list" method="post">
  		<select name="type">
  			<option value="">----</option>
  		</select>
  		<!-- <input type="text" name="keyword">
  		<button class="btn btn-success">검 색</button>   -->	
  	</form>
  </div>
  <div class="panel-body">
	<table class="table table-striped table-bordered table-hover">
	  <thead>
		<tr>
			<th> 번호 </th>
			<th> 누가 </th>
			<th> 언제 </th>
			<th> 왜 </th>
			<th> 얼마나 </th>			
	  </thead>	
	  <c:forEach items="${give_money_list }" var="board">
	  <tr>
		<td><c:out value="${board.bno }"></c:out></td>
		<td><a href="/board/get?bno=<c:out value="${board.bno}" />">
              <c:out value="${board.who}" />
              <%-- <c:if test="${board.replyCnt != 0 }">
              	<b>[ <c:out value="${board.replyCnt }"/> ] </b>
              </c:if> --%>
              </a></td>
		<td><fmt:formatDate value="${board.when_ }" pattern="yyyy-MM-dd"></fmt:formatDate></td>
		<td><c:out value="${board.why }" /></td>
		<td><c:out value="${board.how }" /></td>
	  </tr>				
	  </c:forEach>
    </table>
  </div>
</div>
</div>
</body>
</html>
