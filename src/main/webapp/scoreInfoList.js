$(document).ready(function() {
	$('#search').on('click', function() {
				dt.ajax.reload(null, true);
			});
	var dt = $('#dt').DataTable({
		"serverSide" : true,
		"ajax" : {
			url : ctx + '/score/page',
			data : function(params) {
				$.each($('form').serializeArray(), function(i, o) {
							params[o.name] = o.value;
						});
			},
			type : 'post'
		},
		"columns" : [{
					data : 'no'
				}, {
					data : 'name'
				}, {
					data : 'grade'
				}, {
					data : 'clazz'
				}, {
					data : 'math'
				}, {
					data : 'english'
				}, {
					data : 'chinese'
				}],
		"columnDefs" : [{
			"targets" : 7,// 操作按钮目标列
			"data" : null,
			"render" : function(entity, type, row) {
				return '<a name="deleteBtn" class="btn btn-info" entityId="'
						+ row.id + '">删除</a>';
			}
		}]
	});
	$('#dt').on('click', 'a[name="deleteBtn"]', function() {
		$.ajax({
					type : 'delete',
					url : ctx + '/score/' + $(this).attr('entityId') + '/delete',
					success : function() {
						$('#search').click();
						alert('删除成功');
					}
				});

	});
});