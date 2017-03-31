$(document).ready(function() {
	var dt = $('#dt').DataTable({
		"serverSide" : true,
		"ajax" : {
			url : ctx + '/user/list',
			type : 'post'
		},
		"columns" : [{
					data : 'userName'
				}, {
					data : 'userPassword'
				}, {
					data : 'userLevel'
				}, {
					data : 'userDes'
				}, {
					data : 'userTel'
				}, {
					data : 'userAddress'
				}],
		"columnDefs" : [{
			"targets" : 6,// 操作按钮目标列
			"data" : null,
			"render" : function(entity, type, row) {
				return '<a name="deleteBtn" class="btn btn-info" entityId="'
						+ row.userId + '">删除</a>';
			}
		}]
	});
	$('#search').on('click', function() {
				dt.ajax.reload(null, false);
			});
	$('#dt').on('click', 'a[name="deleteBtn"]', function() {
		$.ajax({
					type : 'delete',
					url : ctx + '/user/' + $(this).attr('entityId') + '/delete',
					success : function() {
						$('#search').click();
						alert('删除成功');
					}
				});

	});
});