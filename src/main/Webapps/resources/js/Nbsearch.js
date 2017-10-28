var status = null;
var prd = null;
var ram = null;
$(document).ready(function() {

});

$(document).on('change', '#status', function() {
	status = $("#status").val();
//	alert("Status : "+status);
});

$(document).on('change', '#mfg', function() {
	ram = $("#mfg").val();
//	alert("Manu : "+ram);
	
	if (ram != null && ram !=''){
//		alert("Manu : "+ram);		
	} 
});


$(document).on('change', '#product', function() {
	prd = $("#product").val();
//	alert("prd : "+prd);
});

$(document).on('click', '#eabutton', function() {
	var searchvalue = $("#asearch").val();
	if(searchvalue!=null && searchvalue!='') {
		loadByPolicyNo(searchvalue);
	}
	else {
		alert("Please Enter Policy/Receipt No");
	}
});


$(document).on('click', '#abutton', function() {
	var searchvalue = $("#asearch").val();
	if(searchvalue!=null && searchvalue!='') {
		loadByPolicyNoforOEM(searchvalue);
	}
	else {
		alert("Please Enter Policy/Receipt No");
	}
});


function loadByPolicyNoforOEM(searchvalue,sys) {
	$('#dataTables_pol_error_data').html("");
	var table;
	table= "<table class='table' id='policy_data' style='width:100%;'><thead><tr><th>POLICYNO</th><th>RECEIPTNO</th><th>POLICY_STATUS</th><th>RECEIPT_STATUS</th><th>POLICY_ERRORDETAILS</th><th>RECEIPT_ERRORDETAILS</th><th>POLICY_ATTEMPT_TIME</th><th>RECEIPT_ATTEMPT_TIME</th><th>PRODUCTCODE</th><th>MANUFACTURER</th></tr></thead><tbody></tbody></table>";
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
								"url" : 'PolicyNoData.json',
								"type" : 'POST',
								"data" : {
									"searchvalue" : searchvalue
								},
								"dataSrc" : "policynoDtos",
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
									"data" : "receiptno"
								}, {
									"data" : "policy_status",
								},{
									"data" : "receipt_status",
								},{
									"data" : "policy_errordeatils",
								},{
									"data" : "receipt_errordetails",
								},,{
									"data" : "policy_attempt_time",
								},{
									"data" : "receipt_attempt_time",
								},{
									"data" : "productcode",
									"sortable" : false
								},{
									"data" : "mfgname",
									"sortable" : false
								},
							 ]
						});	
            }



function loadByPolicyNo(searchvalue,sys) {
	$('#dataTables_pol_error_data').html("");
	var table;
		table= "<table class='table' id='policy_data' style='width:100%;'><thead><tr><th>POLICYNO</th><th>RECEIPTNO</th><th>STATUS</th><th>ATTEMPT_TIME</th><th>ERRORDETAILS</th><th>PRODUCTCODE</th></tr></thead><tbody></tbody></table>";		
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
								"url" : 'PolicyNoData.json',
								"type" : 'POST',
								"data" : {
									"searchvalue" : searchvalue
								},
								"dataSrc" : "policynoDtos",
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
									"data" : "receiptno"
								}, {
									"data" : "policy_status",
								},{
									"data" : "policy_attempt_time",
								},{
									"data" : "policy_errordeatils",
								},{
									"data" : "productcode",
									"sortable" : false
								},
								 ]
						});	
            }


$(document).on('click', '#eappebutton', function() {
	var startdate = $("#startdate").val();	 
	var enddate = $("#enddate").val();
	var system="EAPPS";
	if ((startdate != null && startdate !='')&&(enddate != null && enddate !='')) {			
	loadPolicyDataForEmotor(startdate,enddate,system,status,prd,ram);
	}
	else {
		alert("Please Enter  start & end date");
	}
});


function loadPolicyDataForEmotor(startdate,enddate,system,status,prd) {
	
	$('#dataTables_pol_error_data').html("");
	var table;
		table= "<table class='table' id='policy_data' style='width:100%;'><thead><tr><th>POLICYNO</th><th>RECEIPTNO</th><th>STATUS</th><th>ATTEMPT_TIME</th><th>ERRORDETAILS</th><th>PRODUCTCODE</th></tr></thead><tbody></tbody></table>";		
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
								"url" : 'DaterangeData.json',
								"type" : 'POST',
								"data" : {
									"startdate" : startdate,
									"enddate" : enddate,
									"fromsystem" : system,
									"status" : status,
									"productd" : prd,
									
								},
								"dataSrc" : "DaterangeDtos",
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
									"data" : "policyno",
								     "sortable" : false
								}, {
									"data" : "receiptno",
									"sortable" : false
								}, {
									"data" : "policy_status",
									"sortable" : false
								},{
									"data" : "policy_attempt_time",
									"sortable" : true
								},{
									"data" : "policy_errordeatils",
									"sortable" : false
								},{
									"data" : "productcode",
									"sortable" : false
									
								},
								 ]
						});		
}

$(document).on('click', '#oemebutton', function() {
	
//	searchType2 = $("#etype").val();
//	alert("::searchType2"+searchType2);
	var startdate = $("#startdate").val();
	var enddate = $("#enddate").val();
	var system="OEM";
	if ((startdate != null && startdate !='')&&(enddate != null && enddate !='')) {			
		loadPolicyDataForOEM(startdate,enddate,system,status,prd,ram);
		}
		else {
			alert("Please Enter  start & end date");
		}
});


function loadPolicyDataForOEM(startdate,enddate,system,status,prd,ram) {
	
	$('#dataTables_pol_error_data').html("");
	var table;
	  table= "<table class='table' id='policy_data' style='width:100%;'><thead><tr><th>POLICYNO</th><th>RECEIPTNO</th><th>POLICY_STATUS</th><th>RECEIPT_STATUS</th><th>POLICY_ERRORDETAILS</th><th>RECEIPT_ERRORDETAILS</th><th>POLICY_ATTEMPT_TIME</th><th>RECEIPT_ATTEMPT_TIME</th><th>PRODUCTCODE</th><th>MANUFACTURER</th></tr></thead><tbody></tbody></table>";		
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
								"url" : 'DaterangeDataoem.json',
								"type" : 'POST',
								"data" : {
									"startdate" : startdate,
									"enddate" : enddate,
									"fromsystem" : system,
									"status" : status,
									"productd" : prd,
									"mfgname"  :ram
								},
								"dataSrc" : "DaterangeDtos",
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
									"data" : "policyno",
									"sortable" : false
								}, {
									"data" : "receiptno",
									"sortable" : false
								}, {
									"data" : "policy_status",
									"sortable" : false
								},{
									"data" : "receipt_status",
									"sortable" : false
								},{
									"data" : "policy_errordeatils",
									"sortable" : false
								},{
									"data" : "receipt_errordetails",
									"sortable" : false
								},{
									"data" : "policy_attempt_time",
								},{
									"data" : "receipt_attempt_time",
								},{
									"data" : "productcode",
									"sortable" : false
								},{
									"data" : "mfgname",
									"sortable" : false
								},
								 ]
						});			
}




