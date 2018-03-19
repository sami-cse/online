$(function() {
	switch (menu) {
	case 'Home':
		$('#home').addClass('active');
		break;
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
	default:
		/*
		 * if (menu == 'Home') break;
		 */
		$('#listProducts').addClass('active');
		$('#a_' + menu).addClass('active');
		break;

	}

	
	var $table = $('#productListTable');

	if ($table.length) {

		var jsonUrl = '';
		if (window.categoryId == '') {
			jsonUrl = window.contextPath + '/json/data/products';
		} else {
			jsonUrl = window.contextPath + '/json/data/category/' + window.categoryId
					+ '/products';
		}
		// console.log('Inside The Table');
		$table
				.DataTable({

					lengthMenu : [ [ 3, 5, 10, -1 ], [ '3', '5', '10', 'All' ] ],
					pageLength : 3,
					ajax : {
						url : jsonUrl,
						dataSrc : ''
					},
					columns : [
							{
								data : 'imageUrl',
								bSortable : false,
								mRender : function(data, type, row) {

									return '<img src="' + window.contextPath
											+ '/resources/images/' + data
											+ '" class="dataTableImg"/>';
								}
							},
							{
								data : 'productName'
							},
							{
								data : 'productPrize',
								mRender : function(data, type, row) {
									return '&#2547; ' + data;
								}
							},
							{
								data : 'quantity',
								mRender : function(data, type, row) {

									if (data < 1) {
										return '<span style="color:red">Out of Stock!</span>';
									}

									return data;

								}
							},
							{
								data : 'productId',
								bSortable : false,
								mRender : function(data, type, row) {
									var str = '';
									str += '<a href="'
											+ window.contextPath+'/product/'
											+ data+'" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> &#160;';
									
									
									if(row.quantity < 1){
										str += '<a href="javascript:void(0)" class="btn btn-success disabled"><span class="glyphicon glyphicon-shopping-cart"></span></a> &#160;';
									}else {
										str += '<a href="'
											+ window.contextPath+'/product/'
											+ data
											+'" class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></span></a> &#160;';
									}
									
									return str;
								}
							} ]
				});
	}

});
