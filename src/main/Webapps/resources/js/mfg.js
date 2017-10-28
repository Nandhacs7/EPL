var searchType1 = null;
var searchType2 = null;
var status = null;
var product=null;
$(document).ready(function() {
});

//alert("MFG loaded");

//var selected = $("input[type='radio'][name='type']:checked");
//if (selected.length > 0) {
//	searchType2 = selected.val();
//	alert("==="+searchType2)
//}
//else{
//	alert("plz select type before clicking search");
//}

$(document).on('change', '.radio_type', function() {
//	$('#radio_type').val('');
	  searchType2 =$(this).attr('id');
	 searchType2 = $("#"+searchType2).val();
//	 alert("::"+searchType2);
});

$(document).on('change', '#mfg', function() {
	 searchType1 = $("#mfg").val();
	if (searchType1 != null && searchType1 !=''){
//		alert("Manu : "+searchType1);
		
	} 
});


$(document).on('change', '#status', function() {
	status = $("#status").val();
//	alert("Status : "+status);
});

$(document).on('change', '#product', function() {
	product = $("#product").val();
//	alert("Status : "+status);
});


//$(document).on('change', '#etype', function() {
//	 searchType2 = $('#etype').val();
//	
//	if (searchType2 != null && searchType2 !='') {
//		if(searchType2=="policy"){
//			
//		}else if(searchType2=="receipt"){
//			
//		}
//	} else {	
//		}
//});

//&& (status != null && status !='') && (product != null && product != '')

$(document).on('click', '#ebutton', function() {
//	searchType2 = $("#etype").val();
	var startdate = $("#startdate").val();
	var enddate = $("#enddate").val();
	if ((searchType2 != null && searchType2 !='')&& ((startdate != null && startdate !='')&&(enddate != null && enddate !=''))) {
		
			if((searchType1 != null && searchType1 != '') && searchType2=="Policy" ){			
//			alert("Haii");
		    loadBymanufuture(searchType1,searchType2,startdate,enddate,status,product);	
			}
			else if((searchType1 != null && searchType1 != '') && searchType2=="Receipt"){
//			alert("receipt module");
				loadBymanufutureRec(searchType1,searchType2,startdate,enddate,status,product);
			 }
		   
/*			else{
//				alert("ProductCode,Status,mfg should not be null");
			}*/
	}
	else {
		alert("plz select type and status with start & end date");
	}
  
});




function loadBymanufuture(searchType1,searchType2,startdate,enddate,status,product) {
	$('#dataTables_pol_error_data').html("");
	if (status == 'SUCCESS'){
		var table = "<table class='table' id='policy_error_data' style='width:100%;'><thead><tr><th>POLICYNO</th><th>RECEIPTNO</th><th>STATUS</th><th>MFGNAME</th><th>ATTEMPTS</th><th>ERROR CODE</th><th>ATTEMPT TIME</th><th>PRODUCT CODE</th></tr></thead><tbody></tbody></table>";
		$('#dataTables_pol_error_data').html(table);
		datatablePolicyData = $('#policy_error_data')
				.dataTable(
						{

							"scrollX" : true,
							"serverSide" : true,
							"searchDelay" : 350,
							"bDestroy" : true,
							"bFilter" : true,
							"oLanguage" : {
								"sSearch" : '<i class="glyphicon glyphicon-search" style="float:right;padding:5px;display:none"></i>',
								"sEmptyTable" : "No Data Available",
							},
							"bLengthChange" : true,
							"bAutoWidth" : false,
							"bInfo" : true,
							"lengthMenu" : [ [ 10, 25, 50, 75, 100, ],
									[ 10, 25, 50, 75, 100 ] ],

							"ajax" : {
								"url" : 'getbymfg.json',
								"type" : 'POST',
								"data" : {"mfgtype" : searchType1,"searchtype" : searchType2,"startdate":startdate,"enddate":enddate,"status" : status,"product" : product},
								"dataSrc" : "mfgListDtos",
								"error" : function(response) {
									alert("Problem with ajax call loadPolicyFailDataByDateRange"+response.payListDtos);
									var r = JSON.stringify(response.responseText);
									localStorage.setItem("rvalue", r);
									errorFunctionTimeout();
								}
							},
							"fnDrawCallback" : function() {
								if ($('table#receipt_error_data td')
										.hasClass('dataTables_empty')) {
									$('.dataTables_paginate').hide();
								} else {
									$('div.dataTables_paginate').show();
								}
							},
							"columns" : [ 
								{
								"data" : "policyno"
							}, {
								"data" : "reciptno"
							}, {
								"data" : "status",
							}, {
								"data" : "mfgname",
							},  {
								"data" : "attempt",
							}, {
								"data" : "errorcode",
							},	{
								"data" : "attemptTime",
								"sortable" : false
							},{
								"data" : "productCode",
								"sortable" : false
							},
							]
						});

	}else{
		var table = "<table class='table' id='policy_error_data' style='width:100%;'><thead><tr><th>POLICYNO</th><th>RECEIPTNO</th><th>STATUS</th><th>MFGNAME</th><th>ATTEMPTS</th><th>ERROR CODE</th><th>ATTEMPT TIME</th><th>PRODUCT CODE</th><th>RESPONSE</th></tr></thead><tbody></tbody></table>";
		$('#dataTables_pol_error_data').html(table);
		datatablePolicyData = $('#policy_error_data')
				.dataTable(
						{

							"scrollX" : true,
							"serverSide" : true,
							"searchDelay" : 350,
							"bDestroy" : true,
							"bFilter" : true,
							"oLanguage" : {
								"sSearch" : '<i class="glyphicon glyphicon-search" style="float:right;padding:5px;display:none"></i>',
								"sEmptyTable" : "No Data Available",
							},
							"bLengthChange" : true,
							"bAutoWidth" : false,
							"bInfo" : true,
							"lengthMenu" : [ [ 10, 25, 50, 75, 100, ],
									[ 10, 25, 50, 75, 100 ] ],

							"ajax" : {
								"url" : 'getbymfg.json',
								"type" : 'POST',
								"data" : {"mfgtype" : searchType1,"searchtype" : searchType2,"startdate":startdate,"enddate":enddate,"status" : status,"product" : product},
								"dataSrc" : "mfgListDtos",
								"error" : function(response) {
									alert("Problem with ajax call loadPolicyFailDataByDateRange"+response.payListDtos);
									var r = JSON.stringify(response.responseText);
									localStorage.setItem("rvalue", r);
									errorFunctionTimeout();
								}
							},
							"fnDrawCallback" : function() {
								if ($('table#receipt_error_data td')
										.hasClass('dataTables_empty')) {
									$('.dataTables_paginate').hide();
								} else {
									$('div.dataTables_paginate').show();
								}
							},
							"columns" : [ 
								{
								"data" : "policyno"
							}, {
								"data" : "reciptno"
							}, {
								"data" : "status",
							}, {
								"data" : "mfgname",
							},  {
								"data" : "attempt",
							}, {
								"data" : "errorcode",
							},	{
								"data" : "attemptTime",
								"sortable" : false
							},{
								"data" : "productCode",
								"sortable" : false
							},{
								"data" : "responsexml",
								"sortable" : false
							}
							]
						});
		
	}
}

function loadBymanufutureRec(searchType1,searchType2,startdate,enddate,status,product) {
	$('#dataTables_pol_error_data').html("");
	if(status=='SUCCESS'){
		var table = "<table class='table' id='policy_error_data' style='width:100%;'><thead><tr><th>POLICY NO</th><th>RECEIPTNO</th><th>STATUS</th><th>MFGNAME</th><th>ATTEMPTS</th><th>ERROR CODE</th><th>ATTEMPT TIME</th><th>PRODUCT CODE</th></tr></thead><tbody></tbody></table>";
		$('#dataTables_pol_error_data').html(table);
		datatablePolicyData = $('#policy_error_data')
				.dataTable(
						{

							"scrollX" : true,
							"serverSide" : true,
							"searchDelay" : 350,
							"bDestroy" : true,
							"bFilter" : true,
							"oLanguage" : {
								"sSearch" : '<i class="glyphicon glyphicon-search" style="float:right;padding:5px;display:none"></i>',
								"sEmptyTable" : "No Data Available",
							},
							"bLengthChange" : true,
							"bAutoWidth" : false,
							"bInfo" : true,
							"lengthMenu" : [ [ 10, 25, 50, 75, 100, ],
									[ 10, 25, 50, 75, 100 ] ],

							"ajax" : {
								"url" : 'getbymfgrec.json',
								"type" : 'POST',
								"data" : {"mfgtype" : searchType1,"searchtype" : searchType2,"startdate":startdate,"enddate":enddate,"status" : status,"product" : product},
								"dataSrc" : "getbymfgrec",
								"error" : function(response) {
									alert("Problem with ajax call loadPolicyFailDataByDateRange"+response.payListDtos);
									var r = JSON.stringify(response.responseText);
									localStorage.setItem("rvalue", r);
									errorFunctionTimeout();
								}
							},
							"fnDrawCallback" : function() {
								if ($('table#receipt_error_data td')
										.hasClass('dataTables_empty')) {
									$('.dataTables_paginate').hide();
								} else {
									$('div.dataTables_paginate').show();
								}
							},
							"columns" : [ 
							   {
								"data" : "policyNo"
							}, {
								"data" : "receiptNo"
							}, {
								"data" : "status"
							},{
								"data" : "mfgname"
							},{
								"data" : "noofattempts"
							}, {
								"data" : "errorcode"
							},{
								"data" : "attemptTime",
								/*"sortable" : false*/
							},{
								"data" : "productCode",
								/*"sortable" : false*/
							},
							]
						});		
	}else{
		var table = "<table class='table' id='policy_error_data' style='width:100%;'><thead><tr><th>POLICY NO</th><th>RECEIPTNO</th><th>STATUS</th><th>MFGNAME</th><th>ATTEMPTS</th><th>ERROR CODE</th><th>RESPONSE XML</th><th>ATTEMPT TIME</th><th>PRODUCT CODE</th></tr></thead><tbody></tbody></table>";
		$('#dataTables_pol_error_data').html(table);
		datatablePolicyData = $('#policy_error_data')
				.dataTable(
						{

							"scrollX" : true,
							"serverSide" : true,
							"searchDelay" : 350,
							"bDestroy" : true,
							"bFilter" : true,
							"oLanguage" : {
								"sSearch" : '<i class="glyphicon glyphicon-search" style="float:right;padding:5px;display:none"></i>',
								"sEmptyTable" : "No Data Available",
							},
							"bLengthChange" : true,
							"bAutoWidth" : false,
							"bInfo" : true,
							"lengthMenu" : [ [ 10, 25, 50, 75, 100, ],
									[ 10, 25, 50, 75, 100 ] ],

							"ajax" : {
								"url" : 'getbymfgrec.json',
								"type" : 'POST',
								"data" : {"mfgtype" : searchType1,"searchtype" : searchType2,"startdate":startdate,"enddate":enddate,"status" : status,"product" : product},
								"dataSrc" : "getbymfgrec",
								"error" : function(response) {
									alert("Problem with ajax call loadPolicyFailDataByDateRange"+response.payListDtos);
									var r = JSON.stringify(response.responseText);
									localStorage.setItem("rvalue", r);
									errorFunctionTimeout();
								}
							},
							"fnDrawCallback" : function() {
								if ($('table#receipt_error_data td')
										.hasClass('dataTables_empty')) {
									$('.dataTables_paginate').hide();
								} else {
									$('div.dataTables_paginate').show();
								}
							},
							"columns" : [ 
							   {
								"data" : "policyNo"
							}, {
								"data" : "receiptNo"
							}, {
								"data" : "status"
							},{
								"data" : "mfgname"
							},{
								"data" : "noofattempts"
							}, {
								"data" : "errorcode"
							},	{
								"data" : "response",
								"sortable" : false
							},{
								"data" : "attemptTime",
								/*"sortable" : false*/
							},{
								"data" : "productCode",
								/*"sortable" : false*/
							},
							]
						});		
	}
	
}