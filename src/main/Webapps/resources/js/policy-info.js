var searchType1 = null;
var searchType2 = null;
$(document).ready(function() {
		var policyno = 0;
		$("#searchKey").hide();
		$("#startdate").hide();
		$("#enddate").hide();
	});

$(document).on('change', '#stype', function() {
	searchType1 = $('#stype').val();
	if (searchType1 != "") {
		if(searchType1=="policy"){
			$("#searchKey").show();
			
		}else if(searchType1=="receipt"){
			loadAllReceiptData(searchType1);
			$("#searchKey").show();
		}
	} else {
		$("#searchKey").css("display", "none");
		}
});

function loadAllReceiptData(searchType1) {
	$('#dataTables_pol_error_data').html("");
	var table = "<table class='table' id='receipt_error_data' style='width:100%;'><thead><tr><th>S.No</th><th>POLICY NO</th><th>RECEIPTNO</th><th>AGENTCODE</th><th>PRODUCTCODE</th><th>RECEIPT_ID</th><th>POLICY_ID</th><th>STATUS</th><th>ATTEMPTTIME</th><th>RESPONSE</th><th>OPTIONS</th> </tr></thead><tbody></tbody></table>";
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
							"url" : 'getStatusData.json',
							"type" : 'POST',
							"data" : {"searchtype" : searchType1},
							"dataSrc" : "payListDtos",
							"error" : function(response) {
								alert("Problem with ajax call getStatusData"+response.payListDtos);
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
						}, /*{

							"sortable" : false,
							"targets" : 0,
							"data" : null,
							"render" : getPolicyDataActionButton

						}*/ ]
					});

}

$(document).on('change', '#searchtype', function() {
	if($("#searchtype").val()!='') {
		searchType2 = $("#searchtype").val();
		if(searchType2=='policy') {
			loadPolicyErrorData(searchType2);
			$("#startdate").show();
			$("#enddate").show();
		}
		else if(searchType2=='receipt') {
			loadReceiptErrorData(searchType2);
			$("#startdate").show();
			$("#enddate").show();
		}
	}
	else {
		alert("plz enter receipt/policy type");
		$("#searchKey").hide();
		$("#startdate").hide();
		$("#enddate").hide();
	}
});

function loadPolicyErrorData(searchType2) {
	
	var table = "<table class='table' id='policy_error_data' style='width:100%;'><thead><tr><th>POLICY_ID</th><th>ACCOUNT_DATE</th><th>COVERNOTE_DATE</th><th>AGENT_CODE</th><th>OACODE</th><th>POLICY_NO</th></tr></thead><tbody></tbody></table>";
	$('#dataTables_pol_error_data').html(table);
//	alert("Before populating data for policy");
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
							"url" : 'getPolicyData.json',
							"type" : 'POST',
							"data" : {'searchType' : searchType2},
							"dataSrc" : "polListDtos",
							"error" : function(response) {
								alert("Problem with ajax call getPolicyData of policy-info js file"+response.payListDtos);
								var r = JSON.stringify(response.responseText);
								localStorage.setItem("rvalue", r);
								errorFunctionTimeout();
							}
						},
						"columns" : [ 
							{
							"data" : "polid"
						}, {
							"data" : "accountDate"
						}, {
							"data" : "covernotedate"
						},{
							"data" : "agentcode"
						}, {
							"data" : "oacode"
						}, {
							"data" : "polno",
						} ]
					});

}

function loadReceiptErrorData(searchType2) {
	$('#dataTables_pol_error_data').html("");
	var table = "<table class='table' id='receipt_error_data' style='width:100%;'><thead><tr><th>S.No</th><th>POLICY NO</th><th>RECEIPTNO</th><th>AGENTCODE</th><th>PRODUCTCODE</th><th>RECEIPT_ID</th><th>POLICY_ID</th><th>STATUS</th><th>ATTEMPTTIME</th><th>RESPONSE</th><th>OPTIONS</th> </tr></thead><tbody></tbody></table>";
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
							"data" : {"searchtype" : searchType2},
							"dataSrc" : "payListDtos",
							"error" : function(response) {
								alert("Problem with ajax call getReceiptErrorData"+response.payListDtos);
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
						},

						{
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
						}, /*{

							"sortable" : false,
							"targets" : 0,
							"data" : null,
							"render" : getPolicyDataActionButton

						} */]
					});

}

$(document).on('click', '#search', function() {
	if($("#startdate").val()!='' && $("#enddate").val()!='') {
		searchType2 = $("#searchtype").val();
		var startdate = $("#startdate").val();
		var enddate = $("#enddate").val();
		alert("startdate : "+startdate+" "+"enddate : "+enddate+" "+"searchtype : "+searchType2);
		if(searchType2=='policy') {
			loadPolicyDataByDateRange(searchType2, startdate,enddate);
		}
		else if(searchType2=='receipt') {
			loadReceiptDataByDateRange(searchType2,startdate, enddate)
		}
	}
	else {
		alert("plz enter date range");
	}
});

function loadPolicyDataByDateRange(searchType2, startdate,enddate) {
	
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
							"url" : 'getDataBySearch.json',
							"type" : 'POST',
							"data" : {
								"searchtype" : searchType2,
								"startdate" : startdate,
								"enddate" : enddate
							},
							"dataSrc" : /*"policyDataDtos"*/"polListDtos",
							"error" : function(response) {
								alert("Problem with ajax call getDataBySearch"+response);
								var r = JSON.stringify(response.responseText);
								localStorage.setItem("rvalue", r);
								errorFunctionTimeout();
							}
						},

//						"fnDrawCallback" : function() {
//							if ($('table#policy_error_data td')
//									.hasClass('dataTables_empty')) {
//								$('.dataTables_paginate').hide();
//							} else {
//								$('div.dataTables_paginate').show();
//							}
//						},

						// "fnRowCallback" : function(nRow, aData,
						// iDisplayIndex) {
						// var oSettings = datatablePolicyData.fnSettings();
						// $("td:first", nRow).html(
						// oSettings._iDisplayStart + iDisplayIndex
						// + 1);
						// return nRow;
						// },

						"columns" : [ 
							/*{
								"targets" : 0,
								"data" : null
							},*/
							{
								"data" : "polid"
							}, {
								"data" : "accountDate"
							}, {
								"data" : "covernotedate"
							},{
								"data" : "agentcode"
							}, {
								"data" : "oacode"
							}, {
								"data" : "polno",
							} ]
					});
}

function loadReceiptDataByDateRange(searchType2,startdate, enddate) {
	alert("loadReceiptDataBySearch");
	$('#dataTables_pol_error_data').html("");
	var table = "<table class='table' id='receipt_search_error_data' style='width:100%;'><thead><tr><th>S.No</th><th>POLICY NO</th><th>RECEIPTNO</th><th>AGENTCODE</th><th>PRODUCTCODE</th><th>RECEIPT_ID</th><th>POLICY_ID</th><th>STATUS</th><th>ATTEMPTTIME</th><th>RESPONSE</th><th>OPTIONS</th> </tr></thead><tbody></tbody></table>";
	$('#dataTables_pol_error_data').html(table);
	datatablePolicyData = $('#receipt_search_error_data')
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
							"url" : 'getReceiptDataByDateRange.json',
							"type" : 'POST',
							"data" : {
								"searchtype" : searchType,
								"startdate" : startdate,
								"enddate" : enddate
							},
							"dataSrc" : "payListDtos",
							"error" : function(response) {
								alert("Problem with ajax call getReceiptDataByDateRange"+response);
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
							/*{
								"targets" : 0,
								"data" : null
							},*/
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
						}, /*{

							"sortable" : false,
							"targets" : 0,
							"data" : null,
							"render" : getPolicyDataActionButton

						}*/ ]
					});
}

$(document).on('click', '#search_btn', function() {
	var searchkey = $('#searchKey').val();
	searchType1 = $('#stype').val();
	if (searchType1 != "") {
		if(searchType1=='policyno') {
			loadPolicyReceiptErrorData(searchType1);
		}
		else if(searchType1=='receiptno') {
			loadPolicyReceiptErrorData(searchType1);
		}
	} else {
		if(searchType1=="policyno"){
			alert("Plz Enter PolicyNo");
		}else if(searchType1=="receiptno"){
			alert("Plz Enter ReceiptNo");
		}
		$("#searchKey").css("display", "none");
	}
});
