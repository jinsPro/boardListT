<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책-제목/내용</title>
</head>
<body>
<table border="1">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>내용</th>
	</tr>
	<c:forEach items="${bookList}" var="b">
		<tr align="center">
			<td>${b.bno }</td>
			<td>
				<input type="button" value="${b.title}" onclick="location='bookDetail?bno=${b.bno}';" />
			</td>
			<td>${b.cont}</td>		
		</tr>
	</c:forEach>
</table>
<input type="button" value="글쓰기" onclick="location='addForm';" />    
</body>
</html>