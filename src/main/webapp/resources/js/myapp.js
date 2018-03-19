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
			jsonUrl = window.contextRoot + '/json/data/products';
		} else {
			jsonUrl = window.contextRoot + '/json/data/category/' + window.categoryId
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

									return '<img src="' + window.contextRoot
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
								data : 'quantity'
							},
							{
								data : 'productId',
								bSortable : false,
								mRender : function(data, type, row) {
									var str = '';
									str += '<a href="'
											+ window.contextRoot+'/'
											+ data
											+ '/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> &#160;';
									str += '<a href="'
											+ window.contextRoot+'/'
											+ data
											+ '/product" class="btn btn-primary"><span class="glyphicon glyphicon-shopping-cart"></span></a> &#160;';
									return str;
								}
							} ]
				});
	}

});
