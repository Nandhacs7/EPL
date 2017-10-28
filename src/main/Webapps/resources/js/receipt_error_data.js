var searchType = null;
$(document).ready(function() {
		var policyno = 0;
			$("#searchKey").css("display", "none");
			loadPolicyErrorData(searchType);
	});

$(document).on('click', '#search_btn', function() {
	if(searchType==null) {
		alert("Please Enter Policy/Receipt No");
	}
	else {
		var searchtype = $("#searchtype").val();
		var searchvalue = $("#searchKey").val();
		loadPolicyDataBySearch(searchtype, searchvalue);
	}
});

function loadPolicyErrorData(searchType) {
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
							"data" : {"searchtype" : searchType},
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
						}, {

							"sortable" : false,
							"targets" : 0,
							"data" : null,
							"render" : getPolicyDataActionButton

						} ]
					});

}

function getPolicyDataActionButton(data, type, full, meta) {
	return "<td><input type='button' class='common-btn data-entry-org-dest-active edit-btn-id'style='background:#448ccb;padding:4px;'name='"
			+ full['policyId']
			+ "' id='"
			+ full['policyId']
			+ "' value='Edit'/></td>";
}

$(document).on('click', '.edit-btn-id', function() {

	policyno = $(this).attr('id');
	// alert("policyno::"+policyno);
	getPolicyData(policyno);
});

function loadPolicyDataBySearch(searchtype, searchvalue) {
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
							"url" : 'get_databy_search.json',
							"type" : 'POST',
							"data" : {
								"searchtype" : searchtype,
								"searchvalue" : searchvalue
							},
							"dataSrc" : "payListDtos",
							"error" : function(response) {
								alert("Problem with ajax call getallpolicyerrordatabysearch"+response);
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
						}, {

							"sortable" : false,
							"targets" : 0,
							"data" : null,
							"render" : getPolicyDataActionButton

						} ]
					});

}

$(document).on('change', '#searchtype', function() {

	searchType = $('#searchtype').val();
	if (searchType != "") {
		$("#searchKey").css("display", "block");
		if(searchType=="policyno"){
			alert("Plz Enter PolicyNo");
		}else if(searchType=="receiptno"){
			alert("Plz Enter ReceiptNo");
		}
		
	} else {
		$("#searchKey").css("display", "none");
	}
});

//$("#searchtype").focusout(function() {
//	alert("within focusout function");
//	var end = this.value;
//
//});