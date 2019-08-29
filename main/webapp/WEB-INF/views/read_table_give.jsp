<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>일기장 조회</title>
<style>
	.regi_table td {
		padding: 15px;
	}
</style>
</head>
<body>
	<table border="1" class="regi_table" style="border: 5px solid #00ACE1;">
   <tr>
    <td width=150>
       <b>누가</b>
    </td>
    <td width=500>
       <input type="text" class="form-control" id="who" name='who' value="${board.who }" readonly="readonly" style="width:200px; float: left;">&nbsp;(이)에게/께
    </td>
   </tr> 
    <tr>
    <td width=100>
       <b>언제</b>
    </td>
    <td>
       <input type="text" class="form-control" name="when_" value="<fmt:formatDate value="${board.when_ }" pattern="yyyy년 MM월 dd일"></fmt:formatDate>" readonly="readonly" id="DatePicker" style="width:200px; float: left;">&nbsp;에
    </td>
   </tr> 
    <tr>
    <td width=100>
       <b>왜</b>
    </td>
    <td>
       <input type="text" class="form-control" id="" value="${board.why }" readonly="readonly" name="why" style="">
    </td>
   </tr> 
    <tr>
    <td width=100>
       <b>얼만큼</b>
    </td>
    <td>
       <input type="text" class="form-control" id="" value="${board.how }" readonly="readonly" name="how" style="width:200px; float: left;">&nbsp;원을 빌려갔다!!<br>
        <p style="clear: both;"><br>그래서</p>
    </td>
   </tr> 
    <tr>
    <td width=100>
       <b>기한</b>
    </td>
    <td>
       <input type="text" class="form-control" name="until_" id="DatePicker" value="<fmt:formatDate value="${board.until_ }" pattern="yyyy년 MM월 dd일"></fmt:formatDate>" style="width:200px; float: left;"> 까지
    </td>
   </tr> 
    <tr>
    <td width=100>
       <b>메모</b>
    </td>
    <td>
       <textarea class="form-control" id="" readonly="readonly" name="memo">${board.memo }</textarea>
    </td>
   </tr> 
   <tr>
    <td width=100>
       <b>이자 설정</b>
    </td>
    <td>
       <div class="custom-control custom-switch">
	      <input type="checkbox" class="custom-control-input" id="switch1" name="interest">
	      <label class="custom-control-label" for="switch1"></label>
	    </div>
    </td>
   </tr>   
</table> 
<br>
<p>
	<a href="modi_table_give?bno=${board.bno }"><button type="button" class="btn btn-success">수정</button></a>
	<a href="keep_table_give?bno=${board.bno }"><button type="button" class="btn btn-info">보관</button></a>
	<a href="del_table_give?bno=${board.bno }"><button type="button" class="btn btn-danger">삭제</button></a>
</p>	
</body>
</html>