$(document).ready(function(){
//	$('#common').hide();
	$('#month_receipt_status').hide();
	$('#today_receipt_status').hide();				
	$('#weekly_receipt_status').hide();
	
	$('#month_policy_status').hide();
	$('#today_policy_status').hide();				
	$('#weekly_policy_status').hide();
});
var monthlyreceiptStatus = $("#monthly_receipt_status").val();
var monthly_receipt_status_fail_value = $("#monthly_receipt_status_fail_value").val();
// alert("monthlyreceiptStatus value : "+monthlyreceiptStatus);
// alert("monthly_receipt_status_fail_value : "+monthly_receipt_status_fail_value);
 google.charts.load("current", {packages:["corechart"]});
 google.charts.setOnLoadCallback(drawChartMaruti);
 function drawChartMaruti() {
   var data = google.visualization.arrayToDataTable([
     ['Task', 'receipt'],
     ['SUCCESS',parseInt(monthlyreceiptStatus)],
     ['FAIL',    parseInt(monthly_receipt_status_fail_value)]
//     ['SUCCESS',50],
//     ['FAIL',    50]
   ]);
   
   var options = {
     title: 'RECEIPT',
     is3D: true,
     width:500,
     height:500
   };

   var chart = new google.visualization.PieChart(document.getElementById('month_receipt_status'));
   chart.draw(data, options);
 }

$(document).on('change', '#stype', function() {
	 var searchType2 = $('#stype').val();
//	alert(searchType2);
	if (searchType2 != null && searchType2 !='') {
		if(searchType2=="receipt"){
			$('#month_policy_status').hide();
			$('#today_policy_status').hide();				
			$('#weekly_policy_status').hide();
			
			
			
			
//			$('#common').show();
			$('#month_receipt_status').show();
			$('#today_receipt_status').show();				
			$('#weekly_receipt_status').show();
	
		}else if(searchType2=="policy"){
			$('#month_receipt_status').hide();
			$('#today_receipt_status').hide();				
			$('#weekly_receipt_status').hide();
			
			
			$('#month_policy_status').show();
			$('#today_policy_status').show();				
			$('#weekly_policy_status').show();
		}
	}
});
/////////////////////////////////////////////////////////////////////////////////
var today_receipt_status_value = $("#today_receipt_status_value").val();
var today_receipt_status_fail_value = $("#today_receipt_status_fail_value").val();
//alert("today_receipt_status_value  : "+today_receipt_status_value);
//alert("today_receipt_status_fail_value : "+today_receipt_status_fail_value)
//alert(today_receipt_status_value);
google.charts.load("current", {packages:["corechart"]});
google.charts.setOnLoadCallback(drawTodayReceiptStatus);
function drawTodayReceiptStatus() {
  var data = google.visualization.arrayToDataTable([
    ['Task', 'receipt'],
    ['SUCCESS',parseInt(today_receipt_status_value)],
    ['FAIL',    parseInt(today_receipt_status_fail_value)]
    
//    ['SUCCESS',50],
//    ['FAIL',    50]
  ]);
  
  var options = {
    title: 'RECEIPT',
    is3D: true,
    width:500,
    height:500
  };

  var chart = new google.visualization.PieChart(document.getElementById('today_receipt_status'));
  chart.draw(data, options);
}
/////////////////////////////////////////////////////////////////////////////////
var weekly_receipt_status_value = $("#weekly_receipt_status_value").val();
var weekly_receipt_status_fail_value = $("#weekly_receipt_status_fail_value").val();

//alert(monthlyreceiptStatus);
//alert("weekly_receipt_status_value : "+weekly_receipt_status_value);
//alert("weekly_receipt_status_fail_value : "+weekly_receipt_status_fail_value);
google.charts.load("current", {packages:["corechart"]});
google.charts.setOnLoadCallback(drawWeeklyReceiptStatus);
function drawWeeklyReceiptStatus() {
  var data = google.visualization.arrayToDataTable([
    ['Task', 'receipt'],
    ['SUCCESS',parseInt(weekly_receipt_status_value)],
    ['FAIL',    parseInt(weekly_receipt_status_fail_value)]
    
//    ['SUCCESS',50],
//    ['FAIL',    50]
//    ['SUCCESS'],
//    ['FAIL']
    
  ]);
  
  var options = {
    title: 'RECEIPT',
    is3D: true,
    width:500,
    height:500
  };

  var chart = new google.visualization.PieChart(document.getElementById('weekly_receipt_status'));
  chart.draw(data, options);
}

