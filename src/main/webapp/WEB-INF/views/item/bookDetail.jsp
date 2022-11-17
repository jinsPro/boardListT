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

<table border="1">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>내용</th>
	</tr>
	<c:forEach items="${detailList}" var="dl">
		<tr align="center">
			<td>${dl.bno }</td>
			<td>${dl.title}</td>
			<td>${dl.cont}</td>
		</tr>
	</c:forEach>
</table>
<br>
<input type="submit" value="수정" onclick="location='detailListEdit?bno=${bno}';" >
<button type="button" onclick="delOK()">삭제</button>
<input type="reset" value="목록" onclick="location='bookList';" />    
</body>
<script type="text/javascript">
	function delOK() {
		if(confirm("정말 삭제하시겠습니까?") == true) {
			location.href="detailListDel?bno=${bno}"
		} else {
			return;
		}
	}
</script>
</html>