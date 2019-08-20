<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
<link href="${pageContext.request.contextPath}/resources/style.css" rel="stylesheet" />
</head>
<jsp:forward page="template.jsp">
	<jsp:param name="CONTENTPAGE" value="main.jsp" />
	<jsp:param name="SIDEPAGE" value="right.jsp" />
</jsp:forward>