<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	.regi_table td {
		padding: 15px;
	}
</style>
</head>
<body>
	<table border="1" class="regi_table" style="border: 5px solid #00ACE1;">
   <tr>
    <td width=100>
       누가
    </td>
    <td width=500>
       <input type="text" class="form-control" id="" placeholder="나의 친구 담비" name="who" style="width:200px; float: left;">&nbsp;(이)에게/께
    </td>
   </tr> 
    <tr>
    <td width=100>
       언제
    </td>
    <td>
       <input type="text" class="form-control" name="when_" id="DatePicker" style="width:200px; float: left;">&nbsp;에
    </td>
   </tr> 
    <tr>
    <td width=100>
       왜
    </td>
    <td>
       <input type="text" class="form-control" id="" placeholder="내 교통카드에 잔액이 부족해서.." name="why" style="">
    </td>
   </tr> 
    <tr>
    <td width=100>
       얼만큼
    </td>
    <td>
       <input type="text" class="form-control" id="" placeholder="20000" name="how" style="width:200px; float: left;">&nbsp;원을 빌려갔다!!<br>
        <p style="clear: both;"><br>그래서</p>
    </td>
   </tr> 
    <tr>
    <td width=100>
       기한
    </td>
    <td>
       <input type="text" class="form-control" name="until_" id="DatePicker" style="width:200px; float: left;"> 까지
    </td>
   </tr> 
    <tr>
    <td width=100>
       메모
    </td>
    <td>
       <input type="text" class="form-control" id="" placeholder="이번이 벌써 네 번째인데... 미안해죽겠다.. 
얼른 갚아야할듯" name="memo">
    </td>
   </tr>   
</table>    
</body>
</html>