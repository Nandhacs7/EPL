
var monthlyPolicyStatus = $("#monthly_policy_status_value").val();
var monthly_policy_status_fail_value = $("#monthly_policy_status_fail_value").val();
// alert(monthlyPolicyStatus);

/*alert("monthlyPolicyStatus : "+monthlyPolicyStatus);
alert("monthly_policy_status_fail_value : "+monthly_policy_status_fail_value);*/
 google.charts.load("current", {packages:["corechart"]});
 google.charts.setOnLoadCallback(drawChartMaruti);
 function drawChartMaruti() {
   var data = google.visualization.arrayToDataTable([
     ['Task', 'POLICY'],
     ['SUCCESS',parseInt(monthlyPolicyStatus)],
     ['FAIL',    parseInt(monthly_policy_status_fail_value)]
     
//     ['SUCCESS',50],
//     ['FAIL',    50]
   ]);
   
   var options = {
     title: 'POLICY',
     is3D: true,
     width:500,
     height:500
   };

   var chart = new google.visualization.PieChart(document.getElementById('month_policy_status'));
   chart.draw(data, options);
 }

/*$(document).on('change', '#stype', function() {
	 var searchType2 = $('#stype').val();
	
	if (searchType2 != null && searchType2 !='') {
		if(searchType2=="policy"){
			$('#month_receipt_status').hide();
			$('#today_receipt_status').hide();				
			$('#weekly_receipt_status').hide();
			
			
			
//			$('#common').show();
			$('#piechart_3d1').show();
			$('#today_policy_status').show();				
			$('#weekly_policy_status').show();
		}else if(searchType2=="receipt"){
		}
	}
});*/
/////////////////////////////////////////////////////////////////////////////////
var today_policy_status_value = $("#today_policy_status_value").val();
var today_policy_status_fail_value = $("#today_policy_status_fail_value").val();
//alert(today_policy_status_value);

/*alert("today_policy_status_value : "+today_policy_status_value);
alert("today_policy_status_fail_value : "+today_policy_status_fail_value);*/

google.charts.load("current", {packages:["corechart"]});
google.charts.setOnLoadCallback(drawTodayReceiptStatus);
function drawTodayReceiptStatus() {
  var data = google.visualization.arrayToDataTable([
    ['Task', 'POLICY'],
    ['SUCCESS',parseInt(today_policy_status_value)],
    ['FAIL',    parseInt(today_policy_status_fail_value)]
    
//    ['SUCCESS',50],
//    ['FAIL',    50]
    
  ]);
  
  var options = {
    title: 'POLICY',
    is3D: true,
    width:500,
    height:500
  };

  var chart = new google.visualization.PieChart(document.getElementById('today_policy_status'));
  chart.draw(data, options);
}
/////////////////////////////////////////////////////////////////////////////////
var weeklyPolicyStatus = $("#weekly_policy_status_value").val();
var weekly_policy_status_fail_value = $("#weekly_policy_status_fail_value").val();
//alert(weeklyPolicyStatus);

/*alert("weeklyPolicyStatus : "+weeklyPolicyStatus);
alert("weekly_policy_status_fail_value : "+weekly_policy_status_fail_value);*/

google.charts.load("current", {packages:["corechart"]});
google.charts.setOnLoadCallback(drawWeeklyReceiptStatus);
function drawWeeklyReceiptStatus() {
  var data = google.visualization.arrayToDataTable([
    ['Task', 'POLICY'],
    ['SUCCESS',parseInt(weeklyPolicyStatus)],
    ['FAIL',    parseInt(weekly_policy_status_fail_value)]
    
//    ['SUCCESS',50],
//    ['FAIL',    50]
    
  ]);
  
  var options = {
    title: 'POLICY',
    is3D: true,
    width:500,
    height:500
  };

  var chart = new google.visualization.PieChart(document.getElementById('weekly_policy_status'));
  chart.draw(data, options);
}

