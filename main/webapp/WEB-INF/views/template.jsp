<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String contentPage = request.getParameter("CONTENTPAGE");
	String sidePage = request.getParameter("SIDEPAGE");
%>
<head>

<link href="https://fonts.googleapis.com/css?family=Black+Han+Sans|Gugi|Gaegu|Do+Hyeon|Jua|Poor+Story|Nanum+Gothic:400,700&display=swap" rel="stylesheet">
<!-- 
font-family: 'Black Han Sans', sans-serif; 
font-family: 'Gugi', cursive; 
font-family: 'Jua', sans-serif;
font-family: 'Gaegu', cursive;
font-family: 'Do Hyeon', sans-serif;
font-family: 'Poor Story', cursive;
font-family: 'Nanum Gothic', sans-serif;
-->
<style>
	 table {
		width: 98%;
		height: 98%;
		border: 2px solid #e8e8e8;
	} 
</style>
<title>지갑을 탁 !</title>
</head>
<body>
	<table cellspacing="0">
	<tr>
		<td width="85%">
			<jsp:include page="<%= contentPage %>" flush="false"/>
		</td>	
		<td width="15%">
			<jsp:include page="<%= sidePage %>" flush="false"/>
		</td>		
	</tr>	
	</table>

</body>