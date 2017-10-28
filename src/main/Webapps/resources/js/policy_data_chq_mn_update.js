$(document).ready(function() {
//	e.preventDefault();
	
	$('#get_policy_details').click(function() {
//		event.preventDefault();
		var policyno=$("#policynumber").val();
		
		$.ajax({
			type : 'POST',
			url : 'getdatabypolicynumber.json',
			data : {"policynumber":policyno},
			success : function(result) {
				
				$("#policy_no").val(result.policyDataChequeCancelDto.policyNumber);
				$("#prd_code").val(result.policyDataChequeCancelDto.iuwpOnePrdCd);
				$("#end_reasn").val(result.policyDataChequeCancelDto.iuwpOneEndtReas);
				$("#acc_code").val(result.policyDataChequeCancelDto.iuwpOneAccCd);
				$("#br_code").val(result.policyDataChequeCancelDto.iuwpOneBrCd);
				$("#pol_no_gen_id").val(result.policyDataChequeCancelDto.iuwpOnePolNoGenId);
				$("#zstax").val(result.policyDataChequeCancelDto.zstax);
				$("#zedcs").val(result.policyDataChequeCancelDto.zedcs);
				$("#zkcess").val(result.policyDataChequeCancelDto.zkcess);
				$("#inception_date").val(result.policyDataChequeCancelDto.inceptiondate);
				$("#policy_si").val(result.policyDataChequeCancelDto.policySi);
				
			},
			error : function(jqXHR, textStatus, errorThrown) {
				alert(textStatus);
			}

		});
	});
	
	$('#policy_data_update').click(function() {
		event.preventDefault();
		var sendData = $("#policy_data_updation").serialize();
//		alert("Form Data::"+sendData);
		$.ajax({
			type : 'POST',
			url : 'policydataupdation.json',
			data : sendData,
			success : function(result) {
				if (result.commonResponseDto == 'success') {
					swal("ROYAL SUNDARAM!",result.commonResponseDto,"success");
				}else{
					swal("ROYAL SUNDARAM!",result.commonResponseDto,"error");
				}
				
			},
			error : function(jqXHR, textStatus, errorThrown) {
				alert(textStatus);
			}

		});
	});

	
});
