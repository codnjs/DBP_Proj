<!DOCTYPE html>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
  <title>Bootstrap Example</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://fonts.googleapis.com/css?family=Black+Han+Sans|Gugi|Gaegu|Do+Hyeon|Jua|Poor+Story|Nanum+Gothic:400,700&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2 style="color: #00ACE1; font-family: 'Nanum Gothic', sans-serif; font-weight: 700;">00님 잊지말고 받아가세요!</h2>
  <p style="color: #00ACE1; font-family: 'Nanum Gothic', sans-serif; font-weight: 400;">제목을 클릭해서 일기 내용을 확인해요!</p>
   <div class="sort-div" style="float: right;">
	   <div class="btn-class" style="float: right; margin-bottom: 8px;">
	   	<button type="button" class="btn btn-primary">정렬 적용</button>
	   </div>
	   <span class="custom-control custom-checkbox mb-3" style="width: 150px;">
	      <input type="checkbox" class="custom-control-input" id="customCheck" name="example1">
	      <label class="custom-control-label" for="customCheck">이자 설정</label>
	   </span>
	   
	   <select name="cars" class="custom-select mb-3" style="width: 250px;">
	      <option selected>정렬 방식</option>
	      <option value="date_recent">날짜순-최근</option>
	      <option value="date_past">날짜순-오래된</option>
	      <option value="term_long">기한순-긴</option>
	      <option value="term_short">기한순-짧은</option>
	      <option value="price_high">가격순-비싼</option>
	      <option value="price_low">가격순-싼</option>
	    </select>
	</div>
	<div class="container-list" style="clear: both;">
	  <div class="list-group">
	  	<c:forEach var="board" items="${get_money_list}">
	    	<a href="#" class="list-group-item"><fmt:formatDate value="${board.when_ }" pattern="yyyy년 MM월 dd일 작성"></fmt:formatDate></a>
	    </c:forEach>
	  </div>
	</div>  
  <!-- The Modal -->
  <div class="modal fade" id="myModal">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Modal Heading</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
          Modal body..
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        </div>
        
      </div>
    </div>
  </div>
  
</div>
    
</body>
</html>
