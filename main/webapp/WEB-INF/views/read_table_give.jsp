<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
       <input type="text" class="form-control" id="who" name='who' value="${board.who }" readonly="readonly" style="width:200px; float: left;">&nbsp;(이)에게/께
    </td>
   </tr> 
    <tr>
    <td width=100>
       언제
    </td>
    <td>
       <input type="text" class="form-control" name="when_" value="${board.when_ }" readonly="readonly" id="DatePicker" style="width:200px; float: left;">&nbsp;에
    </td>
   </tr> 
    <tr>
    <td width=100>
       왜
    </td>
    <td>
       <input type="text" class="form-control" id="" value="${board.why }" readonly="readonly" name="why" style="">
    </td>
   </tr> 
    <tr>
    <td width=100>
       얼만큼
    </td>
    <td>
       <input type="text" class="form-control" id="" value="${board.how }" readonly="readonly" name="how" style="width:200px; float: left;">&nbsp;원을 빌려갔다!!<br>
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
얼른 갚아야할듯" readonly="readonly" name="memo">
    </td>
   </tr>   
</table>    
</body>
</html>