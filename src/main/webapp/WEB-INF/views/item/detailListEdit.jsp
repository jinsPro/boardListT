<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책-제목/내용 수정</title>
</head>
<body>

<form action="detailListEdit_OK" method="post">
<table border="1">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>내용</th>
	</tr>
	<c:forEach items="${detailList}" var="dl">
		<tr align="center">
			<td>${dl.bno}
			<input type="hidden" id="bno" name="bno" value="${dl.bno}"/>
			</td>			
			<td><input type="text" value="${dl.title}" id="title" name="title" /></td>
			<td><input type="text" value="${dl.cont}" id="cont" name="cont" /></td>
		</tr>
	</c:forEach>
</table>
<input type="submit" value="수정완료">
<input type="reset" value="수정취소" onclick="history.back();" />    
</form>
</body>
</html>

