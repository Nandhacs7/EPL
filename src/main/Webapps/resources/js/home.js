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
//		alert("SUCCESS");

}).fail(function(){
//	alert("FAIL");
});     
alert("Enabled in Properties");

  } else {
	     $.post('changeinprops', {switchvalue:"false"}, 
	    		    function(response){
//	    	               alert("SUCCESS");

	    		}).fail(function(){	    			
//    		      alert("FAIL");	    			
	    		}); 
       alert("Disabled In Properties");
   }
}


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
//	   alert("SUCCESS");
	}).fail(function(){
//		alert("FAIL");		
	});    
	     
      alert("Enabled In Schedular");
	  } else {
		  $.post('changeinschedular.json', {switchvalue2:"flase"}, 
				    function(response){
//		    	 alert("SUCCESS");
		}).fail(function(){
//			alert("FAIL");		
		});  
	       alert("Disabled In Schedular");
		   
	}
}