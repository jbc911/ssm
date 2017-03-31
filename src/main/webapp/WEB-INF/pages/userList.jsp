<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@include file="../../../common.jsp"%>
</head>
<body>
	<button id="search" class="btn btn-success">search</button>
	<table id="dt"
		class="table table-striped table-borderedtable-condensed  table-hover">
		<thead>
			<th>用户名</th>
			<th>密码</th>
			<th>级别</th>
			<th>描述</th>
			<th>手机</th>
			<th>地址</th>
			<th>操作</th>
		</thead>
		<tbody></tbody>
	</table>
	<script type="text/javascript" src="${ctx}/userList.js"></script>
	<script type="text/javascript">
		var ctx = '${ctx}';
	</script>
</body>
</html>