
$(document).ready(function() {
//	alert("loaded");
	//loadBymanufuture();
	 $('#more').hide(); 
	 $('#retryonproduct').hide();
	 $('#retrytype').hide();
	 $('#resetdata').hide();
	
});



var switchvalue= null;
var switchvalue2= null;
var source= null;
var type=null;
var homeproduct=null;
var retrytype=null;
var resetdata=null;

function changeinproperties(){
  if (document.getElementById('property').checked) 
  {
    $.post('changeinprops', {switchvalue:"true"}, 
    function(response){
    alert("Enabled in Properties");
}).fail(function(){
	alert("FAIL");
});    
}else if(!document.getElementById('property').checked){
	$.post('changeinprops', {switchvalue:"false"}, 
	  function(response){
	    alert("Disabled In Properties");	    
	    }).fail(function(){	    			
    		alert("FAIL");	    			
	    }); 	 
   }
}

$.get("swithchvalue", function(status){
	if(status == 'true'){         
			$(document).ready(function(){
//				 $("[name='my-checkbox']").prop('checked', true);
				 $("#property").bootstrapSwitch('state', true);
//				 $("#property").bootstrapSwitch('disabled',true);
			});
	}
//	 $('#property').prop('checked', true);
	else{
		 $("#property").bootstrapSwitch('state', false);
	}
	 
});


/*function documentFilter(trigger, target) {
    var $target = $(target);

    $(trigger).change(function () {
        $target.toggle(this.checked);
    });
}


$(document).on('click', '.sam', function() {
  
	alert("ram");
  
});*/

/*$('#property').click(function() {
    $("#property").toggle(this.checked);
});
*/

$('#retryonproduct').change(function(){
	homeproduct=$("#retryonproduct").val(); 
});

$('#retrytype').change(function(){
	retrytype=$("#retrytype").val(); 	
});

$('#resetdata').change(function(){
	resetdata=$("#resetdata").val(); 	
});

$(function() {
    $('#retry').change(function(){
        if ($(this).val() == 'EMOTOR')
        {     
        	type="EMOTOR";
             $('#more').show(); 
             $('#retryonproduct').hide();
             $('#retrytype').hide();
        }else if($(this).val() == 'OEM'){
        	type="OEM";
        	$('#more').show();
        	$('#retryonproduct').show();
        	 $('#retrytype').show();
        	 $('#resetdata').show();
        }else{
       	 $('#more').hide(); 
    	 $('#retryonproduct').hide();
    	 $('#retrytype').hide();
    	 $('#resetdata').hide();
        }     	      
    });
});

$(document).on('click', '#more', function() {
	if(resetdata!=null && resetdata!=''){
	    $.post('emotortry', {source:type,prd:homeproduct,oemretry:retrytype,oemreset:resetdata}, 
			    function(response){
	    	alert(jQuery.parseJSON(response)+"  No Of Policies Updated In TTRN_POLICY_INFO Table");
			}).fail(function(){	    			
			}); 
	}else{
		alert("RESET TYPE IS REQUIRED");
	}


});

function changeinschedular(){
	  if (document.getElementById('schedular').checked) 
	  {
	     $.post('changeinschedular.json', {switchvalue2:"true"}, 
	    function(response){
	    	  alert("Enabled In Schedular");
//	   alert("SUCCESS");
	}).fail(function(){
		alert("FAIL");		
	});    
	     
    
	  } else {
		  $.post('changeinschedular.json', {switchvalue2:"flase"}, 
				    function(response){
			  alert("Disabled In Schedular");
//		    	 alert("SUCCESS");
		}).fail(function(){
			alert("FAIL");		
		});  
	      
		   
	}
}
