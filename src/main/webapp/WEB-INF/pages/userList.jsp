<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/ssm/bootstrap.min.css">
</head>
<body>
	<button id="search" class="btn btn-success">search</button>
	<table
		class="table table-striped table-borderedtable-condensed  table-hover">
		<thead>
			<th>ID</th>
			<th>用户名</th>
			<th>密码</th>
			<th>级别</th>
			<th>描述</th>
			<th>手机</th>
			<th>地址</th>
			<th>操作</th>
		</thead>
		<tbody id="tb"></tbody>
	</table>
</body>
<script type="text/javascript" src="/ssm/jQuery-2.2.0.min.js"></script>
<script type="text/javascript" src="/ssm/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#search').bind('click', function() {
			$.ajax({
				type : 'post',
				url : '/ssm/user',
				success : function(data) {
					var tbHtml = "";
					$.each(data, function(index, value) {
						tbHtml += ("<tr>");
						tbHtml += ("<td>" + value.userId + "</td>");
						tbHtml += ("<td>" + value.userName + "</td>");
						tbHtml += ("<td>" + value.userPassword + "</td>");
						tbHtml += ("<td>" + value.userLevel + "</td>");
						tbHtml += ("<td>" + value.userDes + "</td>");
						tbHtml += ("<td>" + value.userTel + "</td>");
						tbHtml += ("<td>" + value.userAddress + "</td>");
						tbHtml += ("<td><a name='deleteBtn' id='"+value.userId+"' class='btn btn-info'>删除</a></td>");
						tbHtml += ("<tr>");
					});
					$('#tb').html(tbHtml);
					$('a[name="deleteBtn"]').bind('click',function(){
						$.ajax({
							type:'delete',
							url:'/ssm/user/'+$(this).attr('id'),
							success:function(){
								$('#search').click();
								alert('删除成功');
							}
						});
						
					});
				}
			});
		});
	});
</script>
</html>