var searchType1 = null;
var searchType2 = null;
var ram = null;
var status = null;
var prd = null;
$(document).ready(function() {

});

//var selected = $("input[type='radio'][name='type']:checked");
//if (selected.length > 0) {
//	searchType2 = selected.val();
//	alert("==="+searchType2)
//}
//else{
//	alert("plz select type before clicking search");
//}

$(document).on('change', '#atype', function() {
	$('#asearch').val('');
	 searchType1 = $('#atype').val();
});


//$( "#oem" ).click(function() {
//	 system="oem"
//  alert( "Oem Loaded" + system);
//});
//
//
//$( "#eapps" ).click(function() {
//	 system="eapps"
//  alert( "eapps Loaded" + system);
//});





$(document).on('change', '#mfg', function() {
	ram = $("#mfg").val();
//	alert("Manu : "+ram);
	
	if (ram != null && ram !=''){
//		alert("Manu : "+ram);		
	} 
});

$(document).on('change', '.radio_type', function() {
//	$('#radio_type').val('');
	 searchType2 =$(this).attr('id');
	 searchType2 = $("#"+searchType2).val();
//	 alert("::"+searchType2);
	/*if (searchType1 != null && searchType1 !='') {
		if(searchType1=="policy"){
//			loadAllPolicyData(searchType1);
		}else if(searchType1=="receipt"){
//			loadAllReceiptData(searchType1);
		}
	} else {
		}*/
});

$(document).on('click', '#abutton', function() {
		searchType1 = $("#atype").val();
//	alert("searchType2"+searchType2);
		var searchvalue = $("#asearch").val();
		var system1= "OEM";
		if(/*(searchType1!=null && searchType1!='') && */searchvalue!=null && searchvalue!='') {
			if(searchType1=='policy') {
				loadPolicyDataByPolicyNoOrReceiptNo(searchType1, searchvalue,system1);
			}
			else if(searchType1=='receipt') {
				loadReceiptDataByReceiptNoOrPolicyNo(searchType1, searchvalue,system1);
			}
			else
				alert("plz select type before clicking search");
		}
		else {
			alert("plz enter policy/receipt no with type");
		}
});


$(document).on('click', '#eabutton', function() {
	searchType1 = $("#atype").val();
//alert("searchType2"+searchType2);
	var searchvalue = $("#asearch").val();
	var system1= "EAPPS";
	if(/*(searchType1!=null && searchType1!='') && */searchvalue!=null && searchvalue!='') {
		if(searchType1=='policy' ) {
			loadPolicyDataByPolicyNoOrReceiptNo(searchType1, searchvalue,system1);
		}
		else if(searchType1=='receipt') {
			loadReceiptDataByReceiptNoOrPolicyNo(searchType1, searchvalue,system1);
		}
		else
			alert("plz select type before clicking search");
	}
	else {
		alert("plz enter policy/receipt no with type");
	}
});




function loadPolicyDataByPolicyNoOrReceiptNo(searchType1, searchvalue,sys) {
	$('#dataTables_pol_error_data').html("");
	var table;
	if(sys == "EAPPS"){
		table= "<table class='table' id='policy_data' style='width:100%;'><thead><tr><th>POLICYNO</th><th>RECEIPTNO</th><th>STATUS</th><th>ATTEMPTS</th><th>ATTEMPT TIME</th><th>ERROR CODE</th><th>RESPONSE</th><th>PRODUCT CODE</th></tr></thead><tbody></tbody></table>";		
		$('#dataTables_pol_error_data').html(table);
		datatablePolicyData = $('#policy_data')
				.dataTable(
						{
							"scrollX" : true,
							"serverSide" : true,
							"searchDelay" : 350,
							"bDestroy" : true,
							"bFilter" : false,
							"oLanguage" : {
//						"sSearch" : '<i class="glyphicon glyphicon-search" style="float:right;padding:5px;display:none"></i>',
								"sEmptyTable" : "No Data Available",
							},
							"bLengthChange" : true,
							"bAutoWidth" : false,
							"bInfo" : true,
							"lengthMenu" : [ [ 10, 25, 50, 75, 100, ],
									[ 10, 25, 50, 75, 100 ] ],

							"ajax" : {
								"url" : 'getPolicyDataByPolicyNoOrReceiptNo.json',
								"type" : 'POST',
								"data" : {
									"searchtype" : searchType1,
									"searchvalue" : searchvalue
								},
								"dataSrc" : "payListDtos",
								"error" : function(response) {
									alert("Problem with ajax call getPolicyDataByPolicyNoOrReceiptNo"+response);
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
								},{
									"data" : "attempt",
								},{
									"data" : "attemptTime",
								},{
									"data" : "errorcode",
								},{
									"data" : "responsexml",
									"sortable" : false
								},{
									"data" : "productCode",
									"sortable" : false
								},
								 ]
						});	

	}else{
		table= "<table class='table' id='policy_data' style='width:100%;'><thead><tr><th>POLICYNO</th><th>RECEIPTNO</th><th>STATUS</th><th>MFGNAME</th><th>ATTEMPTS</th><th>ATTEMPT TIME</th><th>ERROR CODE</th><th>RESPONSE</th><th>PRODUCT CODE</th></tr></thead><tbody></tbody></table>";
		
		$('#dataTables_pol_error_data').html(table);
		datatablePolicyData = $('#policy_data')
				.dataTable(
						{
							"scrollX" : true,
							"serverSide" : true,
							"searchDelay" : 350,
							"bDestroy" : true,
							"bFilter" : false,
							"oLanguage" : {
//						"sSearch" : '<i class="glyphicon glyphicon-search" style="float:right;padding:5px;display:none"></i>',
								"sEmptyTable" : "No Data Available",
							},
							"bLengthChange" : true,
							"bAutoWidth" : false,
							"bInfo" : true,
							"lengthMenu" : [ [ 10, 25, 50, 75, 100, ],
									[ 10, 25, 50, 75, 100 ] ],

							"ajax" : {
								"url" : 'getPolicyDataByPolicyNoOrReceiptNo.json',
								"type" : 'POST',
								"data" : {
									"searchtype" : searchType1,
									"searchvalue" : searchvalue
								},
								"dataSrc" : "payListDtos",
								"error" : function(response) {
									alert("Problem with ajax call getPolicyDataByPolicyNoOrReceiptNo"+response);
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
								},{
									"data" : "status",
								},{
									"data" : "mfgname",
								},{
									"data" : "attempt",
								},{
									"data" : "attemptTime",
								},{
									"data" : "errorcode",
								},{
									"data" : "responsexml",
									"sortable" : false
								},{
									"data" : "productCode",
									"sortable" : false
								},
								 ]
						});	

	}
	
}
function loadReceiptDataByReceiptNoOrPolicyNo(searchType1, searchvalue,sys) {
	$('#dataTables_pol_error_data').html("");
	var table;
	if(sys == "EAPPS"){
		 table = "<table class='table' id='receipt_data' style='width:100%;'><thead><tr><th>POLICYNO</th><th>RECEIPTNO</th><th>STATUS</th><th>ATTEMPT TIME</th><th>ERROR CODE</th><th>ATTEMPTS</th><th>RESPONSE</th><th>PRODUCT CODE</th></tr></thead><tbody></tbody></table>";		 
			$('#dataTables_pol_error_data').html(table);
			datatablePolicyData = $('#receipt_data')
					.dataTable(
							{
								"scrollX" : true,
								"serverSide" : true,
								"searchDelay" : 350,
								"bDestroy" : true,
								"bFilter" : false,
								"oLanguage" : {
//									"sSearch" : '<i class="glyphicon glyphicon-search" style="float:right;padding:5px;display:none"></i>',
									"sEmptyTable" : "No Data Available",
								},
								"bLengthChange" : true,
								"bAutoWidth" : false,
								"bInfo" : true,
								"lengthMenu" : [ [ 10, 25, 50, 75, 100, ],
										[ 10, 25, 50, 75, 100 ] ],

								"ajax" : {
									"url" : 'getReceiptDataByReceiptNoOrPolicyNo.json',
									"type" : 'POST',
									"data" : {
										"searchtype" : searchType1,
										"searchvalue" : searchvalue
									},
									"dataSrc" : "payListDtos",
									"error" : function(response) {
										alert("Problem with ajax call getReceiptDataByReceiptNoOrPolicyNo"+response);
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
									"data" : "policyNo",
									"sortable" : false
									
								}, {
									"data" : "receiptNo",
									"sortable" : false
								},{
									"data" : "status",
									"sortable" : false								
								},{
									"data" : "attemptTime",
									"sortable" : false
								},{
									"data" : "errorcode",
									"sortable" : false
								},{
									"data" : "noofattempts",
									"sortable" : false
								},{
									"data" : "response",
									"sortable" : false
								},{
									"data" : "productCode",
									"sortable" : false
								}
								]
							});
 
		}else{
			 table = "<table class='table' id='receipt_data' style='width:100%;'><thead><tr><th>POLICYNO</th><th>RECEIPTNO</th><th>STATUS</th><th>MFGNAME</th><th>ATTEMPT TIME</th><th>ERROR CODE</th><th>ATTEMPTS</th><th>RESPONSE</th><th>PRODUCT CODE</th></tr></thead><tbody></tbody></table>";	
				$('#dataTables_pol_error_data').html(table);
				datatablePolicyData = $('#receipt_data')
						.dataTable(
								{
									"scrollX" : true,
									"serverSide" : true,
									"searchDelay" : 350,
									"bDestroy" : true,
									"bFilter" : false,
									"oLanguage" : {
//										"sSearch" : '<i class="glyphicon glyphicon-search" style="float:right;padding:5px;display:none"></i>',
										"sEmptyTable" : "No Data Available",
									},
									"bLengthChange" : true,
									"bAutoWidth" : false,
									"bInfo" : true,
									"lengthMenu" : [ [ 10, 25, 50, 75, 100, ],
											[ 10, 25, 50, 75, 100 ] ],

									"ajax" : {
										"url" : 'getReceiptDataByReceiptNoOrPolicyNo.json',
										"type" : 'POST',
										"data" : {
											"searchtype" : searchType1,
											"searchvalue" : searchvalue
										},
										"dataSrc" : "payListDtos",
										"error" : function(response) {
											alert("Problem with ajax call getReceiptDataByReceiptNoOrPolicyNo"+response);
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
										"data" : "policyNo",
										"sortable" : false
										
									}, {
										"data" : "receiptNo",
										"sortable" : false
									},{
										"data" : "status",
										"sortable" : false								
									},{
										"data" : "mfgname",
									},
									{
										"data" : "attemptTime",
										"sortable" : false
									},{
										"data" : "errorcode",
										"sortable" : false
									},{
										"data" : "noofattempts",
										"sortable" : false
									},{
										"data" : "response",
										"sortable" : false
									},{
										"data" : "productCode",
										"sortable" : false
									}
									]
								}); 		 
		}
//	var table = "<table class='table' id='receipt_data' style='width:100%;'><thead><tr><th>POLICY NO</th><th>RECEIPTNO</th><th>STATUS</th><th>MFGNAME</th><th>ATTEMPTTIME</th><th>ERRORCODE</th><th>NO OF ATTEMPTS</th><th>RESPONSE</th><th>PRODUCT CODE</th></tr></thead><tbody></tbody></table>";

}

$(document).on('change', '#eapptype', function() {
	 searchType2 = $('#eapptype').val();
	
//
//	if (searchType2 != null && searchType2 !='') {
//		if(searchType2=="Policy"){
//			
//
//			
//		}else if(searchType2=="receipt"){
//			
//		}
//	} else {	
//		}
});

$(document).on('change', '#status', function() {
	status = $("#status").val();
//	alert("Status : "+status);
});

$(document).on('change', '#product', function() {
	prd = $("#product").val();
//	alert("prd : "+prd);
});

//if(prd!= null && prd !=''){	
//
//}else{
//	alert("ProductCode and status Both Should be selected");
//}
//&&(status != null && status !='')
//&& ram =='')
// && (ram == null && ram =='')
//(prd!= null && prd !='')
//.val().length != 0

//$('yourvariable').val() != null && $('yourvariable').val() != ''
$(document).on('click', '#oemebutton', function() {
	
//	searchType2 = $("#etype").val();
//	alert("::searchType2"+searchType2);
	var startdate = $("#startdate").val();
	var enddate = $("#enddate").val();
	var system="OEM";
	if ((searchType2 != null && searchType2 !='') && ((startdate != null && startdate !='')&&(enddate != null && enddate !=''))) {		
			if(searchType2=="Policy" && (ram == null || ram =='')){
				loadPolicyFailDataByDateRange(searchType2,startdate,enddate,system,status,prd);
			}else if(searchType2=="Receipt" && (ram == null || ram =='')){
				loadReceiptFailDataByDateRange(searchType2,startdate,enddate,system,status,prd);
			}
	}
	else {
		alert("plz select type with start & end date");
	}
});



$(document).on('click', '#eappebutton', function() {
	
//	searchType2 = $("#etype").val();
//	alert("::searchType2"+searchType2);
	var startdate = $("#startdate").val();	 
	var enddate = $("#enddate").val();
	var system="EAPPS";
	if ((searchType2 != null && searchType2 !='') && ((startdate != null && startdate !='')&&(enddate != null && enddate !=''))) {		
			if(searchType2=="policy"){
				loadPolicyFailDataByDateRange(searchType2,startdate,enddate,system,status,prd);
			}else if(searchType2=="receipt"){
				loadReceiptFailDataByDateRange(searchType2,startdate,enddate,system,status,prd);
			}
	}
	else {
		alert("plz select type with start & end date");
	}
});


function loadPolicyFailDataByDateRange(searchType2,startdate,enddate,system,status,prd) {
	$('#dataTables_pol_error_data').html("");
	var table;
	if (status == 'SUCCESS'){
		if(system == "EAPPS"){
			table = "<table class='table' id='policy_error_data' style='width:100%;'><thead><tr><th>POLICY NO</th><th>RECEIPTNO</th><th>STATUS</th><th>ATTEMPTS</th><th>ERROR CODE</th><th>ATTEMPT DATE</th><th>PRODUCT CODE</th></tr></thead><tbody></tbody></table>";
			$('#dataTables_pol_error_data').html(table);
			datatablePolicyData = $('#policy_error_data')
					.dataTable(
							{
								
								"scrollX" : true,
								"serverSide" : true,
								"searchDelay" : 350,
								"bDestroy" : true,
								"bFilter" : false,
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
									"url" : 'getPolicyFailDataByDateRange.json',
									"type" : 'POST',
									"data" : {"searchtype" : searchType2,"startdate":startdate,"enddate":enddate,"status" : status,"productd" : prd , "fromsystem" : system},
									"dataSrc" : "payListDtos",
									"error" : function(response) {
										alert("Problem with ajax call loadPolicyFailDataByDateRange"+response.payListDtos);
										var r = JSON.stringify(response.responseText);
										localStorage.setItem("rvalue", r);
										errorFunctionTimeout();
									}
								},
								"fnDrawCallback" : function() {
									if ($('table#receipt_error_data td')
											.hasClass('dataTables_empty')){
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
								},{
									"data" : "status",
								},{
									"data" : "attempt",
								}, {
									"data" : "errorcode",
								},{
									"data" : "attemptTime",
									"sortable" : false
								},{
									"data" : "productCode",
									"sortable" : false
								},
								]
							});				
		}else{
		     table = "<table class='table' id='policy_error_data' style='width:100%;'><thead><tr><th>POLICY NO</th><th>RECEIPTNO</th><th>STATUS</th><th>MFGNAME</th><th>ATTEMPTS</th><th>ERROR CODE</th><th>ATTEMPT DATE</th><th>PRODUCT CODE</th></tr></thead><tbody></tbody></table>";
		     $('#dataTables_pol_error_data').html(table);
				datatablePolicyData = $('#policy_error_data')
						.dataTable(
								{
									
									"scrollX" : true,
									"serverSide" : true,
									"searchDelay" : 350,
									"bDestroy" : true,
									"bFilter" : false,
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
										"url" : 'getPolicyFailDataByDateRange.json',
										"type" : 'POST',
										"data" : {"searchtype" : searchType2,"startdate":startdate,"enddate":enddate,"status" : status,"productd" : prd , "fromsystem" : system},
										"dataSrc" : "payListDtos",
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
									},{
										"data" : "status",
									},{
										"data" : "mfgname",
									},{
										"data" : "attempt",
									}, {
										"data" : "errorcode",
									},{
										"data" : "attemptTime",
										"sortable" : false
									},{
										"data" : "productCode",
										"sortable" : false
									},
									]
								});
		}		
	}else{
		var table;
		if(system == "EAPPS"){
			table = "<table class='table' id='policy_error_data' style='width:100%;'><thead><tr><th>POLICY NO</th><th>RECEIPTNO</th><th>STATUS</th><th>ATTEMPTS</th><th>ERROR CODE</th><th>RESPONSE XML</th><th>ATTEMPT DATE</th><th>PRODUCT CODE</th></tr></thead><tbody></tbody></table>";			
			$('#dataTables_pol_error_data').html(table);
			datatablePolicyData = $('#policy_error_data')
					.dataTable(
							{
								
								"scrollX" : true,
								"serverSide" : true,
								"searchDelay" : 350,
								"bDestroy" : true,
								"bFilter" : false,
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
									"url" : 'getPolicyFailDataByDateRange.json',
									"type" : 'POST',
									"data" : {"searchtype" : searchType2,"startdate":startdate,"enddate":enddate,"status" : status,"productd" : prd, "fromsystem" : system},
									"dataSrc" : "payListDtos",
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
								},{
									"data" : "attempt",
								}, {
									"data" : "errorcode",
								},	{
									"data" : "responsexml",
									"sortable" : false
								},{
									"data" : "attemptTime",
									"sortable" : false
								},{
									"data" : "productCode",
									"sortable" : false
								},
								]
							});
	
		}else{
		   table = "<table class='table' id='policy_error_data' style='width:100%;'><thead><tr><th>POLICY NO</th><th>RECEIPTNO</th><th>STATUS</th><th>MFGNAME</th><th>ATTEMPTS</th><th>ERROR CODE</th><th>RESPONSE XML</th><th>ATTEMPT DATE</th><th>PRODUCT CODE</th></tr></thead><tbody></tbody></table>";		 
		   $('#dataTables_pol_error_data').html(table);
			datatablePolicyData = $('#policy_error_data')
					.dataTable(
							{
								
								"scrollX" : true,
								"serverSide" : true,
								"searchDelay" : 350,
								"bDestroy" : true,
								"bFilter" : false,
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
									"url" : 'getPolicyFailDataByDateRange.json',
									"type" : 'POST',
									"data" : {"searchtype" : searchType2,"startdate":startdate,"enddate":enddate,"status" : status,"productd" : prd, "fromsystem" : system},
									"dataSrc" : "payListDtos",
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
								},{
									"data" : "mfgname",
								},{
									"data" : "attempt",
								}, {
									"data" : "errorcode",
								},	{
									"data" : "responsexml",
									"sortable" : false
								},{
									"data" : "attemptTime",
									"sortable" : false
								},{
									"data" : "productCode",
									"sortable" : false
								},
								]
							}); 
		}
		
//	var table = "<table class='table' id='policy_error_data' style='width:100%;'><thead><tr><th>POLICY NO</th><th>RECEIPTNO</th><th>STATUS</th><th>MFGNAME</th><th>ATTEMPTS</th><th>ERROR CODE</th><th>RESPONSE XML</th><th>ATTEMPT  DATE</th><th>PRODUCT CODE</th></tr></thead><tbody></tbody></table>";
	
  }
}

function loadReceiptFailDataByDateRange(searchType2,startdate,enddate,system,status,prd) {
	$('#dataTables_pol_error_data').html("");
	var table;
	if (status == 'SUCCESS'){
		if(system == "EAPPS"){
			 table = "<table class='table' id='receipt_error_data' style='width:100%;'><thead><tr><th>POLICY NO</th><th>RECEIPTNO</th><th>STATUS</th><th>ATTEMPT DATE</th><th>ERROR CODE</th><th>ATTEMPTS</th><th>PRODUCT CODE</th></tr></thead><tbody></tbody></table>";
			 
			 $('#dataTables_pol_error_data').html(table);
				datatablePolicyData = $('#receipt_error_data')
						.dataTable(
								{

									"scrollX" : true,
									"serverSide" : true,
									"searchDelay" : 350,
									"bDestroy" : true,
									"bFilter" : false,
									"oLanguage" : {
										"sSearch" : '<i class="glyphicon glyphicon-search" style="float:right;padding:5px;display:none;"></i>',
										"sEmptyTable" : "No Data Available",
									},
									"bLengthChange" : true,
									"bAutoWidth" : false,
									"bInfo" : true,
									"lengthMenu" : [ [ 10, 25, 50, 75, 100, ],
											[ 10, 25, 50, 75, 100 ] ],

									"ajax" : {
										"url" : 'getReceiptFailDataByDateRange.json',
										"type" : 'POST',
										"data" : {"searchtype" : searchType2,"startdate":startdate,"enddate":enddate,"status" :status,"productd" : prd ,"fromsystem" : system},
										"dataSrc" : "payListDtos",
										"error" : function(response) {
											alert("Problem with ajax call loadReceiptFailDataByDateRange"+response);
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
										/*{
											"targets" : 0,
											"data" : null
										},*/
										{
										"data" : "policyNo",
										/*"sortable" : false*/
										
									}, {
										"data" : "receiptNo",
										/*"sortable" : false*/
									}, {
										"data" : "status",
										/*"sortable" : false*/
									},{
										"data" : "attemptTime",
										/*"sortable" : false*/
									}, {
										"data" : "errorcode",
										/*"sortable" : false*/
									},{
										"data" : "noofattempts",
										/*"sortable" : false*/
									},

									{
										"data" : "productCode",
										/*"sortable" : false*/
									}, 
									]
								});	 

				
}else{
			 table = "<table class='table' id='receipt_error_data' style='width:100%;'><thead><tr><th>POLICY NO</th><th>RECEIPTNO</th><th>STATUS</th><th>MFGNAME</th><th>ATTEMPT DATE</th><th>ERROR CODE</th><th>ATTEMPTS</th><th>PRODUCT CODE</th></tr></thead><tbody></tbody></table>";
			 $('#dataTables_pol_error_data').html(table);
				datatablePolicyData = $('#receipt_error_data')
						.dataTable(
								{

									"scrollX" : true,
									"serverSide" : true,
									"searchDelay" : 350,
									"bDestroy" : true,
									"bFilter" : false,
									"oLanguage" : {
										"sSearch" : '<i class="glyphicon glyphicon-search" style="float:right;padding:5px;display:none;"></i>',
										"sEmptyTable" : "No Data Available",
									},
									"bLengthChange" : true,
									"bAutoWidth" : false,
									"bInfo" : true,
									"lengthMenu" : [ [ 10, 25, 50, 75, 100, ],
											[ 10, 25, 50, 75, 100 ] ],

									"ajax" : {
										"url" : 'getReceiptFailDataByDateRange.json',
										"type" : 'POST',
										"data" : {"searchtype" : searchType2,"startdate":startdate,"enddate":enddate,"status" :status,"productd" : prd ,"fromsystem" : system},
										"dataSrc" : "payListDtos",
										"error" : function(response) {
											alert("Problem with ajax call loadReceiptFailDataByDateRange"+response);
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
										"data" : "policyNo",
										/*"sortable" : false*/
										
									}, {
										"data" : "receiptNo",
										/*"sortable" : false*/
									}, {
										"data" : "status",
										/*"sortable" : false*/
									},{
										"data" : "mfgname",
									},{
										"data" : "attemptTime",
										/*"sortable" : false*/
									}, {
										"data" : "errorcode",
										/*"sortable" : false*/
									},{
										"data" : "noofattempts",
										/*"sortable" : false*/
									},

									{
										"data" : "productCode",
										/*"sortable" : false*/
									}, 
									]
								});
		}

		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	else{	
		var table;
		if(system == "EAPPS"){
			table = "<table class='table' id='receipt_error_data' style='width:100%;'><thead><tr><th>POLICY NO</th><th>RECEIPTNO</th><th>STATUS</th><th>ATTEMPT DATE</th><th>ERROR CODE</th><th>ATTEMPTS</th><th>RESPONSE</th><th>PRODUCT CODE</th></tr></thead><tbody></tbody></table>";
			$('#dataTables_pol_error_data').html(table);
			datatablePolicyData = $('#receipt_error_data')
					.dataTable(
							{

								"scrollX" : true,
								"serverSide" : true,
								"searchDelay" : 350,
								"bDestroy" : true,
								"bFilter" : false,
								"oLanguage" : {
									"sSearch" : '<i class="glyphicon glyphicon-search" style="float:right;padding:5px;display:none;"></i>',
									"sEmptyTable" : "No Data Available",
								},
								"bLengthChange" : true,
								"bAutoWidth" : false,
								"bInfo" : true,
								"lengthMenu" : [ [ 10, 25, 50, 75, 100, ],
										[ 10, 25, 50, 75, 100 ] ],

								"ajax" : {
									"url" : 'getReceiptFailDataByDateRange.json',
									"type" : 'POST',
									"data" : {"searchtype" : searchType2,"startdate":startdate,"enddate":enddate,"status" :status,"productd" : prd,"fromsystem" : system},
									"dataSrc" : "payListDtos",
									"error" : function(response) {
										alert("Problem with ajax call loadReceiptFailDataByDateRange"+response);
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
									/*{
										"targets" : 0,
										"data" : null
									},*/
									{
									"data" : "policyNo",
									/*"sortable" : false*/
									
								}, {
									"data" : "receiptNo",
									/*"sortable" : false*/
								},

								/*{
									"data" : "paymentId",
									"sortable" : false
								}, {
									"data" : "policyId",
									"sortable" : false
								},*/ {
									"data" : "status",
									/*"sortable" : false*/
								},{
									"data" : "attemptTime",
									/*"sortable" : false*/
								}, {
									"data" : "errorcode",
									/*"sortable" : false*/
								},{
									"data" : "noofattempts",
									/*"sortable" : false*/
								},

								{
									"data" : "response",
									/*"sortable" : false*/
								}, 
								{
									"data" : "productCode",
									/*"sortable" : false*/
								}, 
								]
							});
			
		}else{
			 table = "<table class='table' id='receipt_error_data' style='width:100%;'><thead><tr><th>POLICY NO</th><th>RECEIPTNO</th><th>STATUS</th><th>MFGNAME</th><th>ATTEMPT DATE</th><th>ERROR CODE</th><th>ATTEMPTS</th><th>RESPONSE</th><th>PRODUCT CODE</th></tr></thead><tbody></tbody></table>";
			 $('#dataTables_pol_error_data').html(table);
				datatablePolicyData = $('#receipt_error_data')
						.dataTable(
								{

									"scrollX" : true,
									"serverSide" : true,
									"searchDelay" : 350,
									"bDestroy" : true,
									"bFilter" : false,
									"oLanguage" : {
										"sSearch" : '<i class="glyphicon glyphicon-search" style="float:right;padding:5px;display:none;"></i>',
										"sEmptyTable" : "No Data Available",
									},
									"bLengthChange" : true,
									"bAutoWidth" : false,
									"bInfo" : true,
									"lengthMenu" : [ [ 10, 25, 50, 75, 100, ],
											[ 10, 25, 50, 75, 100 ] ],

									"ajax" : {
										"url" : 'getReceiptFailDataByDateRange.json',
										"type" : 'POST',
										"data" : {"searchtype" : searchType2,"startdate":startdate,"enddate":enddate,"status" :status,"productd" : prd,"fromsystem" : system},
										"dataSrc" : "payListDtos",
										"error" : function(response) {
											alert("Problem with ajax call loadReceiptFailDataByDateRange"+response);
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
										/*{
											"targets" : 0,
											"data" : null
										},*/
										{
										"data" : "policyNo",
										/*"sortable" : false*/
										
									}, {
										"data" : "receiptNo",
										/*"sortable" : false*/
									},

									/*{
										"data" : "paymentId",
										"sortable" : false
									}, {
										"data" : "policyId",
										"sortable" : false
									},*/ {
										"data" : "status",
										/*"sortable" : false*/
									},{
										"data" : "mfgname",
									},
									{
										"data" : "attemptTime",
										/*"sortable" : false*/
									}, {
										"data" : "errorcode",
										/*"sortable" : false*/
									},{
										"data" : "noofattempts",
										/*"sortable" : false*/
									},

									{
										"data" : "response",
										/*"sortable" : false*/
									}, 
									{
										"data" : "productCode",
										/*"sortable" : false*/
									}, 
									]
								});
		}
		
//		var table = "<table class='table' id='receipt_error_data' style='width:100%;'><thead><tr><th>POLICY NO</th><th>RECEIPTNO</th><th>STATUS</th><th>MFGNAME</th><th>ATTEMPTTIME</th><th>ERRORCODE</th><th>ATTEMPTS</th><th>RESPONSE</th><th>PRODUCT CODE</th></tr></thead><tbody></tbody></table>";
		
	}
	
}

/*function loadReceiptErrorData(searchType2) {
//	alert("searchtype : "+searchType2);
	$('#dataTables_pol_error_data').html("");
	var table = "<table class='table' id='receipt_error_data' style='width:100%;'><thead><tr><th>POLICY NO</th><th>RECEIPTNO</th><th>RECEIPT_ID</th><th>POLICY_ID</th><th>STATUS</th><th>ATTEMPTTIME</th><th>RESPONSE</th></tr></thead><tbody></tbody></table>";
	$('#dataTables_pol_error_data').html(table);
	datatablePolicyData = $('#receipt_error_data')
			.dataTable(
					{

						"scrollX" : true,
						"serverSide" : true,
						"searchDelay" : 350,
						"bDestroy" : true,
						"bFilter" : false,
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
							"url" : 'getReceiptErrorData.json',
							"type" : 'POST',
							"data" : {
								"searchtype" : searchType2,
							},
							"dataSrc" : "payListDtos",
							"error" : function(response) {
								alert("Problem with ajax call getReceiptErrorData"+response);
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

						// "fnRowCallback" : function(nRow, aData,
						// iDisplayIndex) {
						// var oSettings = datatablePolicyData.fnSettings();
						// $("td:first", nRow).html(
						// oSettings._iDisplayStart + iDisplayIndex
						// + 1);
						// return nRow;
						// },

						"columns" : [ 
							{
								"targets" : 0,
								"data" : null
							},
							{
							"data" : "policyNo",
							"sortable" : false
							
						}, {
							"data" : "receiptNo",
							"sortable" : false
						},

						{
							"data" : "paymentId",
							"sortable" : false
						}, {
							"data" : "policyId",
							"sortable" : false
						}, {
							"data" : "status",
							"sortable" : false
						}, {
							"data" : "attemptTime",
							"sortable" : false
						},

						{
							"data" : "response",
							"sortable" : false
						}, ]
					});
}

function loadPolicyErrorData(searchType2) {
	$('#dataTables_pol_error_data').html("");
	var table = "<table class='table' id='policy_error_data' style='width:100%;'><thead><tr><th>POLICY NO</th><th>RECEIPTNO</th><th>POLICY_ID</th><th>RECEIPT_ID</th><th>STATUS</th><th>ATTEMPT</th><th>ERROR CODE</th><th>RESPONSE XML</th></tr></thead><tbody></tbody></table>";
	$('#dataTables_pol_error_data').html(table);
	datatablePolicyData = $('#policy_error_data')
			.dataTable(
					{

						"scrollX" : true,
						"serverSide" : true,
						"searchDelay" : 350,
						"bDestroy" : true,
						"bFilter" : false,
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
							"url" : 'getPolicyFailData.json',
							"type" : 'POST',
							"data" : {"searchtype" : searchType2},
							"dataSrc" : "payListDtos",
							"error" : function(response) {
								alert("Problem with ajax call getPolicyFailData"+response.payListDtos);
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
							"data" : "policyid"
						}, {
							"data" : "reciptid"
						}, {
							"data" : "status",
						}, {
							"data" : "attempt",
						}, {
							"data" : "errorcode",
						},	{
							"data" : "responsexml",
							"sortable" : false
						},
						]
					});
}

function loadAllPolicyData(searchType1) {
	$('#dataTables_pol_error_data').html("");
	var table = "<table class='table' id='policy_data' style='width:100%;'><thead><tr><th>POLICY NO</th><th>RECEIPTNO</th><th>PAYMENT_ID</th><th>RECEIPT_ID</th><th>STATUS</th><th>ATTEMPT</th><th>ERROR CODE</th><th>RESPONSE XML</th>< </tr></thead><tbody></tbody></table>";
	$('#dataTables_pol_error_data').html(table);
	datatablePolicyData = $('#policy_data')
			.dataTable(
					{

						"scrollX" : true,
						"serverSide" : true,
						"searchDelay" : 350,
						"bDestroy" : true,
						"bFilter" : false,
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
							"url" : 'getAllPolicyData.json',
							"type" : 'POST',
							"data" : {"searchtype" : searchType1},
							"dataSrc" : "payListDtos",
							"error" : function(response) {
								alert("Problem with ajax call getAllPolicyData"+response.payListDtos);
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
							"data" : "policyid"
						}, {
							"data" : "reciptid"
						}, {
							"data" : "status",
						}, {
							"data" : "attempt",
						}, {
							"data" : "errorcode",
						},	{
							"data" : "responsexml",
							"sortable" : false
						},
						]
					});
}

function loadAllReceiptData(searchType1) {
	$('#dataTables_pol_error_data').html("");
	var table = "<table class='table' id='receipt_data' style='width:100%;'><thead><tr><th>POLICY NO</th><th>RECEIPTNO</th><th>RECEIPT_ID</th><th>POLICY_ID</th><th>STATUS</th><th>ATTEMPTTIME</th><th>RESPONSE</th></tr></thead><tbody></tbody></table>";
	$('#dataTables_pol_error_data').html(table);
	datatablePolicyData = $('#receipt_data')
			.dataTable(
					{

						"scrollX" : true,
						"serverSide" : true,
						"searchDelay" : 350,
						"bDestroy" : true,
						"bFilter" : false,
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
							"url" : 'getAllReceiptData.json',
							"type" : 'POST',
							"data" : {"searchtype" : searchType1},
							"dataSrc" : "payListDtos",
							"error" : function(response) {
								alert("Problem with ajax call getAllReceiptData"+response.payListDtos);
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
							"data" : "paymentId"
						}, {
							"data" : "policyId"
						}, {
							"data" : "status",
							"sortable" : false
						}, {
							"data" : "attemptTime",
							"sortable" : false
						},

						{
							"data" : "response",
							"sortable" : false
						}, {

							"sortable" : false,
							"targets" : 0,
							"data" : null,
							"render" : getPolicyDataActionButton

						} ]
					});

}*/