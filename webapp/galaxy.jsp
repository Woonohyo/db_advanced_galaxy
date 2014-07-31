<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@ include file="/include/tags.jspf"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>Galaxy ID</td>
			<td>Galaxy Name</td>
			<td>Galaxy HP</td>
		</tr>
		<c:forEach var="galaxy" items="${galaxies}" varStatus="status">
			<tr>
				<td>${galaxy.gid}</td>
				<td>${galaxy.name}</td>
				<td>${galaxy.hp}</td>
			</tr>
		</c:forEach>
	</table>
	<form action="/attack.next">
	<input type="submit" value="Attack!">
	</form>
	<form action="/reset.next">
	<input type="submit" value="Reset">
	</form>
</body>
</html>