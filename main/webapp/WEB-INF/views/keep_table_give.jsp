<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	if(confirm("해당 일기를 보관하시겠습니까?")){
		alert("일기가 보관되었습니다.");
		self.close();
	} else {
		alert("일기가 보관되지 않았습니다.");
		self.location("/read_table_give");
	}
	
</script>
</body>
</html>