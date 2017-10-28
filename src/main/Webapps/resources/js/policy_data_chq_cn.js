var searchType =null;
$(document)
		.ready(
				function() {
					var policyno = 0;
					var startdate = $("#in_sdate").val();
					var enddate = $("#in_edate").val();
					$("#searchKey").css("display","none");
//					$('#searchtype').focusout(function() {
//						searchType=$("#searchtype").val();
//					});
					loadPolicyErrorData(searchType);
					// loadPolicyErrorData(startdate,enddate);
					
					$('#get_error_data').click(function() {
						var startdate = $("#in_sdate").val();
						var enddate = $("#in_edate").val();
						// loadPolicyErrorData(startdate,enddate);
					});
					$('#policy_data_update')
							.click(
									function() {
										event.preventDefault();
										var sendData = $(
												"#policy_data_updation")
												.serialize();
										$
												.ajax({
													type : 'POST',
													url : 'policydataupdation.json',
													data : sendData,
													success : function(result) {
														if (result.commonResponseDto == 'success') {
															swal(
																	"ROYAL SUNDARAM!",
																	result.commonResponseDto,
																	"success");
															loadPolicyErrorData(
																	startdate,
																	enddate);
														} else {
															swal(
																	"ROYAL SUNDARAM!",
																	result.commonResponseDto,
																	"error");
														}

													},
													error : function(jqXHR,
															textStatus,
															errorThrown) {
														alert(textStatus);
													}

												});
									});

				});

$(document).on('click', '#search_btn', function() {
	if(searchType==null && searchType=="") {
		alert("Please Select Search Type First");
	}
	else {
		var searchtype = $("#searchtype").val();
		var searchvalue = $("#searchKey").val();
		loadPolicyDataBySearch(searchtype,searchvalue);
	}
//	alert("searchtype::"+searchtype+"::"+searchvalue);
});


function loadPolicyErrorData(searchType) {
//	var searchType="";
//	searchType = $('#searchtype').val();
//	alert("searchType::"+searchType);
	// var table = "<table class='table' id='pol_error_data_view_table'
	// style='width:100%;'><thead><tr><th>S.No</th><th>POLICYNUMBER</th><th>IUWPONEPRDCD</th><th>IUWPONEENDTREAS</th><th>IUWPONEACCCD</th><th>IUWPONEBRCD</th><th>IUWPONEPOLNOGENID</th><th>ZSTAX</th><th>ZEDCS</th><th>ENDTNO</th><th>ERRORREASON</th><th>RESPONSE_XML</th><th>ZKCESS</th><th>POLICYSI</th><th>OPTIONS</th></tr></thead><tbody></tbody></table>";
	// $('#dataTables_pol_error_data').html(table);
	datatablePolicyData = $('#pol_error_data_view_table')
			.dataTable(
					{

						"scrollX" : true,
						"serverSide" : true,
						"searchDelay" : 350,
						"bDestroy" : true,
						"bFilter": false,
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
							"url" : 'getallpolicyerrordata.json',
							"type" : 'POST',
							"data" : {
								"searchtype" : searchType
							},
							"dataSrc" : "newBussinessresponeseDtos",
							"error" : function(response) {
								alert("enter");
								var r = JSON.stringify(response.responseText);
								localStorage.setItem("rvalue", r);
								errorFunctionTimeout();
							}
						},

						"fnDrawCallback" : function() {
							if ($('table#pol_error_data_view_table td')
									.hasClass('dataTables_empty')) {
								$('.dataTables_paginate').hide();
							} else {
								$('div.dataTables_paginate').show();
							}
						},

//						"fnRowCallback" : function(nRow, aData, iDisplayIndex) {
//							var oSettings = datatablePolicyData.fnSettings();
//							$("td:first", nRow).html(
//									oSettings._iDisplayStart + iDisplayIndex
//											+ 1);
//							return nRow;
//						},

						"columns" : [ 
						{
							"data" : "policyNo"
						}, {
							"data" : "receiptNo"
						},

						{
							"data" : "policyId"
						}, {
							"data" : "receiptId"
						}, {
							"data" : "status",
								"sortable" : false
						}, {
							"data" : "attempts"
						}, {
							"data" : "errorCode",
							"sortable" : false
						}, {
							"data" : "responseXml",
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

function getPolicyData(policyno) {
	// alert(policyno);
	$('#policydata').modal('show');
	// $('#policydata').modal('show');
	$.ajax({
		type : 'POST',
		url : 'getdatabypolicynumber.json',
		data : {
			"policynumber" : policyno
		},
		success : function(result) {

			$("#policy_no").val(result.policyDataChequeCancelDto.policyNumber);
			$("#prd_code").val(result.policyDataChequeCancelDto.iuwpOnePrdCd);
			$("#end_reasn").val(
					result.policyDataChequeCancelDto.iuwpOneEndtReas);
			$("#acc_code").val(result.policyDataChequeCancelDto.iuwpOneAccCd);
			$("#br_code").val(result.policyDataChequeCancelDto.iuwpOneBrCd);
			$("#pol_no_gen_id").val(
					result.policyDataChequeCancelDto.iuwpOnePolNoGenId);
			$("#zstax").val(result.policyDataChequeCancelDto.zstax);
			$("#zedcs").val(result.policyDataChequeCancelDto.zedcs);
			$("#zkcess").val(result.policyDataChequeCancelDto.zkcess);
			$("#inception_date").val(
					result.policyDataChequeCancelDto.inceptiondate);
			$("#policy_si").val(result.policyDataChequeCancelDto.policySi);

		},
		error : function(jqXHR, textStatus, errorThrown) {
			alert(textStatus);
		}

	});
}
	
	function loadPolicyDataBySearch(searchtype,searchvalue) {
//		var searchType="";
//		searchType = $('#searchtype').val();
//		alert("searchType::"+searchtype);
		// var table = "<table class='table' id='pol_error_data_view_table'
		// style='width:100%;'><thead><tr><th>S.No</th><th>POLICYNUMBER</th><th>IUWPONEPRDCD</th><th>IUWPONEENDTREAS</th><th>IUWPONEACCCD</th><th>IUWPONEBRCD</th><th>IUWPONEPOLNOGENID</th><th>ZSTAX</th><th>ZEDCS</th><th>ENDTNO</th><th>ERRORREASON</th><th>RESPONSE_XML</th><th>ZKCESS</th><th>POLICYSI</th><th>OPTIONS</th></tr></thead><tbody></tbody></table>";
		// $('#dataTables_pol_error_data').html(table);
		datatablePolicyData = $('#pol_error_data_view_table')
				.dataTable(
						{

							"scrollX" : true,
							"serverSide" : true,
							"searchDelay" : 350,
							"bDestroy" : true,
							"bFilter": false,
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
								"url" : 'getallpolicyerrordatabysearch.json',
								"type" : 'POST',
								"data" : {
									"searchtype" : searchtype,
									"searchvalue" : searchvalue
								},
								"dataSrc" : "newBussinessresponeseDtos",
								"error" : function(response) {
									alert("enter");
									var r = JSON.stringify(response.responseText);
									localStorage.setItem("rvalue", r);
									errorFunctionTimeout();
								}
							},

							"fnDrawCallback" : function() {
								if ($('table#pol_error_data_view_table td')
										.hasClass('dataTables_empty')) {
									$('.dataTables_paginate').hide();
								} else {
									$('div.dataTables_paginate').show();
								}
							},

//							"fnRowCallback" : function(nRow, aData, iDisplayIndex) {
//								var oSettings = datatablePolicyData.fnSettings();
//								$("td:first", nRow).html(
//										oSettings._iDisplayStart + iDisplayIndex
//												+ 1);
//								return nRow;
//							},

							"columns" : [ 
							{
								"data" : "policyNo"
							}, {
								"data" : "receiptNo"
							},

							{
								"data" : "policyId"
							}, {
								"data" : "receiptId"
							}, {
								"data" : "status"
							}, {
								"data" : "attempts"
							}, {
								"data" : "errorCode"
							}, {
								"data" : "responseXml"
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
//	    alert("searchType"+searchType);
	    if(searchType!=""){
	    	$("#searchKey").css("display","block");
	    }else{
	    	$("#searchKey").css("display","none");
	    }
//	    alert("searchType::"+searchType);
	    if(searchType=="policyno") {
	    	alert("Please Enter Policy No");
	    }
	    else if(searchType=="receiptno"){
	    	alert("Please Enter Receipt No");
	    }
	});
	
	$("#searchtype").focusout(function() {
	    var end = this.value;
	    
	});