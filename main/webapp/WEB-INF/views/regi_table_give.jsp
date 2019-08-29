<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>일기장 등록</title>
<style>
	.regi_table td {
		padding: 15px;
	}
</style>
</head>
<body>
<form action="/regi_table_give" method="post">
	<table border="1" class="regi_table" style="border: 5px solid #00ACE1;">
   <tr>
    <td width=100>
       <b>누가</b>
    </td>
    <td width=500>
       <input type="text" class="form-control" id="" placeholder="나의 친구 담비" name="who" style="width:200px; float: left;">&nbsp;(이)에게/께
    </td>
   </tr> 
    <tr>
    <td width=100>
       <b>언제</b>
    </td>
    <td>
       <input type="date" class="form-control" name="when_" id="DatePicker" style="width:200px; float: left;">&nbsp;에
    </td>
   </tr> 
    <tr>
    <td width=100>
       <b>왜</b>
    </td>
    <td>
       <input type="text" class="form-control" id="" placeholder="내 교통카드에 잔액이 부족해서.." name="why" style="">
    </td>
   </tr> 
    <tr>
    <td width=100>
       <b>얼만큼</b>
    </td>
    <td>
       <input type="text" class="form-control" id="" placeholder="20000" name="how" style="width:200px; float: left;">&nbsp;원을 빌려갔다!!<br>
        <p style="clear: both;"><br>그래서</p>
    </td>
   </tr> 
    <tr>
    <td width=100>
       <b>기한</b>
    </td>
    <td>
       <input type="date" class="form-control" name="until_" id="DatePicker" style="width:200px; float: left;"> 까지
    </td>
   </tr> 
    <tr>
    <td width=100>
       <b>메모</b>
    </td>
    <td>
       <textarea class="form-control" id="" placholder="이번이 벌써 네 번째인데... 미안해죽겠다.. 빨리 갚아야지!" name="memo">${board.memo }</textarea>
    </td>
   </tr> 
   <tr>
    <td width=100>
       <b>이자 설정</b><br><a href="#" title="이자율은 1.2%만 가능합니다!" data-toggle="popover" data-trigger="hover" data-content="이자율은 1.2%만 가능합니다.">참고 사항</a>
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
<button type="submit" class="btn btn-secondary">완료</button> 
</form>
</body>
</html>