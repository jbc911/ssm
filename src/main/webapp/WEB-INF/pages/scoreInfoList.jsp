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
	<form>
		<div class="row">
			<div class="col-sm-2">
				<input name="no" class="form-control" placeholder="No.">
			</div>
			<div class="col-sm-2">
				<input name="name" class="form-control" placeholder="姓名">
			</div>
			<div class="col-sm-1">
				<input name="grade" class="form-control" placeholder="年级">
			</div>
			<div class="col-sm-1">
				<input name="clazz" class="form-control" placeholder="班级">
			</div>
			<div class="col-sm-1">
				<input name="math" class="form-control" placeholder="数学">
			</div>
			<div class="col-sm-1">
				<input name="engilsh" class="form-control" placeholder="英语">
			</div>
			<div class="col-sm-1">
				<input name="chinese" class="form-control" placeholder="语文">
			</div>
			<div class="col-sm-1">
				<select class="form-control" placeholder="语文">
					<option>test1</option>
					<option>test2</option>
					<option>test3</option>
				</select>
			</div>
		</div>
	</form>
	<button id="search" class="btn btn-success">search</button>
	<table id="dt"
		class="table table-striped table-borderedtable-condensed  table-hover">
		<thead>
			<th>No.</th>
			<th>姓名</th>
			<th>年级</th>
			<th>班级</th>
			<th>数学</th>
			<th>英语</th>
			<th>语文</th>
			<th>操作</th>
		</thead>
		<tbody></tbody>
	</table>
	<script type="text/javascript" src="${ctx}/scoreInfoList.js"></script>
	<script type="text/javascript">
		var ctx = '${ctx}';
	</script>
</body>
</html>