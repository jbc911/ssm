<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>用户名</th>
				<th>密码</th>
				<th>级别</th>
				<th>描述</th>
				<th>手机</th>
				<th>地址</th>
			</tr>
		</thead>
		<c:forEach items="${userList}" var="i">
			<tr>	
				<td><c:out value="${i.userId}" /></td>
				<td><c:out value="${i.userName}" /></td>
				<td><c:out value="${i.userPassword}" /></td>
				<td><c:out value="${i.userLevel}" /></td>
				<td><c:out value="${i.userDes}" /></td>
				<td><c:out value="${i.userTel}" /></td>
				<td><c:out value="${i.userAddress}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>