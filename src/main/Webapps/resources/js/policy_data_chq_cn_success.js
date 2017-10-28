$(document).ready(function() {
	var startdate=$("#in_sdate").val();
	var enddate=$("#in_edate").val();
	loadPolicySuccessData(startdate,enddate);
	
	$('#get_success_data').click(function() {
		var startdate=$("#in_sdate").val();
		var enddate=$("#in_edate").val();
		alert("startdate"+startdate+"::"+enddate);
		loadPolicySuccessData(startdate,enddate);
	});
	
});

function loadPolicySuccessData(startdate,enddate){
	
//	var table = "<table class='table' id='pol_error_data_view_table' style='width:100%;'><thead><tr><th>S.No</th><th>POLICYNUMBER</th><th>IUWPONEPRDCD</th><th>IUWPONEENDTREAS</th><th>IUWPONEACCCD</th><th>IUWPONEBRCD</th><th>IUWPONEPOLNOGENID</th><th>ZSTAX</th><th>ZEDCS</th><th>ENDTNO</th><th>ERRORREASON</th><th>RESPONSE_XML</th><th>ZKCESS</th><th>POLICYSI</th><th>OPTIONS</th></tr></thead><tbody></tbody></table>";
//	$('#dataTables_pol_error_data').html(table);
	datatablePolicyData = $('#pol_success_data_view_table').dataTable(
			{ 
				
				"scrollX": true,
				"serverSide": true,
				 "searchDelay": 350,
				 "bDestroy": true,
				"oLanguage": { "sSearch": '<i class="glyphicon glyphicon-search" style="float:right;padding:5px;"></i>',
					"sEmptyTable": "No Data Available",},
				 "bLengthChange": true,
				 "bAutoWidth": false,
				 "bInfo" : true,
				 "lengthMenu":[ [10,25,50,75,100,],[10,25,50,75,100]],
				 
				 "ajax" : {
						"url" : 'getallsuccesspolicydata.json',
						"type" : 'POST',
						"data" : {
							"startdate":startdate,
							"enddate":enddate
						},
						"dataSrc" :"policyDataChequeCancelDtos",
						"error":function (response) {
							var r = JSON.stringify(response.responseText);
							localStorage.setItem("rvalue",r);
							errorFunctionTimeout();
						}
					},
				 
				 "fnDrawCallback":function(){
		             if($('table#pol_success_data_view_table td').hasClass('dataTables_empty')){
		            	 $('.dataTables_paginate').hide();
		             } else {
		            	 $('div.dataTables_paginate').show();
		             }
		        },
		        
		        "fnRowCallback" : function(nRow, aData, iDisplayIndex){      
                    var oSettings = datatablePolicyData.fnSettings();
                     $("td:first", nRow).html(oSettings._iDisplayStart+iDisplayIndex +1);
                     return nRow;
                },
			
				"columns" : [
				 {
					 "targets" : 0, 
					 "data" : null
				 },
				
				{
					 "data":"policyNumber"
				},
				{
					"data":"iuwpOnePrdCd"
				},
				
				{
					"data":"iuwpOneEndtReas"
				},
				{
					"data":"iuwpOneAccCd"
				},
				{
					"data":"iuwpOneBrCd"
				},
				{
					"data":"iuwpOnePolNoGenId"
				},
				{
					"data":"zstax"
				},
				{
					"data":"zedcs"
				},
				{
					"data":"endtno"
				},
				{
					"data":"errorReason"
				},
				{
					"data":"responseXml"
				},
				{
					"data":"zkcess"
				},
				{
					"data":"policySi"
				},
				
				{
					
					"sortable" : false,
					 "targets" : 0, 
					 "data" : null,
					 "render" : getPolicyDataActionButton
					
				}
			]
			}
		 );
}


function getPolicyDataActionButton(data,type,full,meta){
 	return "<td><input type='button' class='common-btn data-entry-org-dest-active download-pdf'style='background:#448ccb;padding:4px;'name='"+full['policyDataChqCnId']+ "' id='"+full['policyDataChqCnId']+ "' value='Download'/></td>";
}

$(document).on('click', '.download-pdf', function(){
	
	 var id= $(this).attr('id');
	 alert("id::"+id);
	 document.forms[0].action = "downloadpdf.json?policyId="+id;
		document.forms[0].submit();
//	 policyDataPdfDownload(id);
});

function policyDataPdfDownload(id){
//	alert(policyno);
//	 $('#policydata').modal('show');
//	 $('#policydata').modal('show');
	$.ajax({
		type : 'GET',
		url : 'downloadpdf.json',
		 contentType : 'application/pdf;charset=UTF-8',
//		data : {"policynumber":policyno},
		success : function(result) {
			document.forms[0].action = "downloadpdf.json";
			document.forms[0].submit();
//			window.location.href=result;
//			$("#policy_no").val(result.policyDataChequeCancelDto.policyNumber);
//			$("#prd_code").val(result.policyDataChequeCancelDto.iuwpOnePrdCd);
//			$("#end_reasn").val(result.policyDataChequeCancelDto.iuwpOneEndtReas);
//			$("#acc_code").val(result.policyDataChequeCancelDto.iuwpOneAccCd);
//			$("#br_code").val(result.policyDataChequeCancelDto.iuwpOneBrCd);
//			$("#pol_no_gen_id").val(result.policyDataChequeCancelDto.iuwpOnePolNoGenId);
//			$("#zstax").val(result.policyDataChequeCancelDto.zstax);
//			$("#zedcs").val(result.policyDataChequeCancelDto.zedcs);
//			$("#zkcess").val(result.policyDataChequeCancelDto.zkcess);
//			$("#inception_date").val(result.policyDataChequeCancelDto.inceptiondate);
//			$("#policy_si").val(result.policyDataChequeCancelDto.policySi);
			
		},
		error : function(jqXHR, textStatus, errorThrown) {
			alert(textStatus);
		}

	});
}
