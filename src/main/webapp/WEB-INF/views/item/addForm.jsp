<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<body>

<h2>게시판</h2>
<form method="post" action="addForm_OK">
	<table border="1">
		<tr>
			<th>제목</th>
			<td><input type="text" id="title" name="title" required></td>
		</tr>	
		<tr>
			<th>내용</th>
			<td><input type="text" id="cont" name="cont" required></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="작성">
				<input type="button" value="취소" onclick="location='bookList';" />    
				
			</td>
		</tr>
	</table>
</form>
</body>
</html>