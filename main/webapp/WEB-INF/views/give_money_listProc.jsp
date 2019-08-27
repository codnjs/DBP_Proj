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
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
</head>
<body>

<div class="container">
  <h2 style="color: #00ACE1; font-family: 'Nanum Gothic', sans-serif; font-weight: 700;">00님 잊지말고 주고가세요!</h2>
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
	  	<c:forEach var="board" items="${give_money_list}">
	    	<a class="list-group-item"><button type="button" data-toggle="modal" data-target="#give_read_modal" style="border: none; background-color: #ffffff;">
	    		&nbsp;&nbsp;&nbsp;<fmt:formatDate value="${board.when_ }" pattern="yyyy년 MM월 dd일 작성"></fmt:formatDate></button></a>
	    </c:forEach>
	  </div>
	</div> 
	 
  <!-- 등록 modal -->
  <div class="modal fade" id="give_regi_modal">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">일기장 등록</h4>         
        </div>        
        <!-- Modal body -->
        <div class="modal-body">
          <jsp:include page="regi_table_give.jsp"></jsp:include>   
        </div>
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="submit" class="btn btn-primary" onclick="regiCheck()" >등록</button>
          <button type="button" class="btn btn" data-dismiss="modal">닫기</button>
        </div>        
      </div>
    </div>
  </div>
  
  <!-- 캘린더 modal -->
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
          
        </div>       
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="submit" class="btn btn-primary">등록</button>
          <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        </div>      
      </div>
    </div>
  </div> 
  
    <!-- 조회 modal -->
  <div class="modal fade" id="give_read_modal">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">일기장 조회</h4>         
        </div>       
        <!-- Modal body -->
        <form action="/give_money_list" method="post">
	        <div class="modal-body">
	         		<jsp:include page="read_table_give?bno=${board.bno }/>" />
	         		<c:out value="${board.bno}"></c:out>
	        </div>
	        <!-- Modal footer -->
	        <div class="modal-footer">
	          <button type="submit" class="btn btn-primary" >등록</button>
	          <button type="button" class="btn btn" data-dismiss="modal">닫기</button>
	        </div>  
        </form>      
      </div>
    </div>
  </div> 
</div>
    
</body>
<script>

function regiCheck() {
	if(confirm("글을 등록하시겠습니까?")) {
		alert("일기를 등록하였습니다!")
		location.href="/give_money_list";
	} else {
		alert("일기가 등록되지 않았습니다");
	}
}

</script>
</html>
