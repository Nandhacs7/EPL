<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>

<!--custom css-->
  
  <!--core css-->
  <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.min.css' />">
  <!--title icon css-->
  <link rel="SHORTCUT ICON" href="images/favicon.ico?" type="image/x-icon"/>
  
  <link rel="stylesheet" href="<c:url value='/resources/css/styles.css' />">
  
  <!-- core font styles-->
  <link rel="stylesheet" href="<c:url value='/resources/fonts/font-awesome.min.css' />">
  <!-- jura font styles-->
  <link rel="stylesheet" href="<c:url value='/resources/fonts/jura.css' />">
  <link href="<c:url value='/resources/css/bootstrap-datetimepicker.min.css' />" rel="stylesheet">
  <!--plugin css-->
 
  
   <!--[if lt IE 9]>
  <script src="js/html5shiv.js"></script>
<![endif]-->
  

</head>
<body>
<div class="container-fluid top_con">
		<div class="row navigation_row">
			<div class="col-xs-12 col-sm-12">
				<div class="col-xs-4 col-sm-4">
					<div class="text-left">
						<img src="<c:url value='/resources/images/royallogo_1.png'/>" alt="ROYAL SUNDARAM" width="" height="">
					</div>
				</div>
				<div class="col-xs-4 col-sm-4 module_title">
					<div class="text-center">
						<h1>EPL</h1>
					</div>
				</div>
				<div class="col-xs-4 col-sm-4 logout_col">
					<div class="text-right">
						<p class="logout_wel"><a href="<c:url value='/logout' />"><span class="glyphicon glyphicon-log-out"></span>&nbsp;Logout</a></p>
						<p><span>Welcome,&nbsp;</span><span><c:out value="${username}"/></span></p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--navigation-->
	
	
	<div class="container-fluid topnav">
		<!-- menu_list-->
		<div class="row">
			<ul class="list_items">
				<li class="active"><a href="<c:url value='#' />" target="_self">HOME</a></li>
				<li><a href="<c:url value='/search' />" target="_self">SEARCH</a></li>
				<li><a href="/royal_dashboard" target="_self">DASHBOARD</a></li>
			</ul>
		</div>
	</div>
	
	<div class="container-fluid homebg">
		<!-- row_split-->
		
		 <div class="row">
			<div class='col-xs-12 col-sm-12 text-right' style='margin-top:6px;font-size:16px;'>
					<select name="stype" id="stype" required style='padding:10px;'>
								<option value="">Select SearchType</option>
								<option value="policy">Policy</option>
								<option value="receipt">Receipt</option>
					</select>
			</div>
		 </div>
		
		<div id='common'>
			<div class="row">
				<div class='col-xs-4 col-sm-4 text-center'>Today</div>
				<div class='col-xs-4 col-sm-4 text-center'>Week</div>
				<div class='col-xs-4 col-sm-4 text-center'>Month</div>
			</div>
		</div> 
		
		<div class="row">
			
			<div class='col-sm-4 '>
				<div id="today_policy_status" ></div>
				<!-- <div id="today_policy_status" style="width: 50px; height: 20px;"></div> -->
			</div>
			
			<div class='col-sm-4 '>
				<div id="weekly_policy_status" ></div>
				<!-- <div id="weekly_policy_status" style="width: 50px; height: 20px;"></div> -->
			</div>
			<div class='col-sm-4 '>
				<div id="month_policy_status"></div>
				<!-- <div id="month_policy_status" style="width: 50px; height: 20px;"></div> -->
			</div>
		</div>
		
		<div class="row">
			
			<div class='col-sm-4 '>
				<div id="today_receipt_status" ></div>
				<!-- <div id="today_receipt_status" style="width: 250px; height: 100px;"></div> -->
			</div>
			
			<div class='col-sm-4 '>
				<div id="weekly_receipt_status" ></div>
				<!-- <div id="weekly_receipt_status" style="width: 250px; height: 100px;"></div> -->
			</div>
			<div class='col-sm-4 '>
				<div id="month_receipt_status" ></div>
				<!-- <div id="month_receipt_status" style="width: 250px; height: 100px;"></div> -->
			</div>
		</div>
		
	</div>
	<input type="text" id="monthly_policy_status_value" name="monthly_policy_status_value" style="display:none" value="<c:out value="${monthlyNoOfPolicySuccessRecords}"/>"/>
	<input type="text" id="monthly_policy_status_fail_value" name="monthly_policy_status_fail_value" style="display:none" value="<c:out value="${monthlyNoOfPolicyFailRecords}"/>"/>
	<input type="text" id="weekly_policy_status_value" name="weekly_policy_status_value" style="display:none" value="<c:out value="${weeklyNoOfPolicySuccessRecords}"/>"/>
	<input type="text" id="weekly_policy_status_fail_value" name="weekly_policy_status_fail_value" style="display:none" value="<c:out value="${weeklyNoOfPolicyFailRecords}"/>"/>
	<input type="text" id="today_policy_status_value" name="today_policy_status_value" style="display:none" value="<c:out value="${todayNoOfPolicySuccessRecords}"/>"/>
	<input type="text" id="today_policy_status_fail_value" name="today_policy_status_fail_value" style="display:none" value="<c:out value="${todayNoOfPolicyFailRecords}"/>"/>
	
	<input type="text" id="monthly_receipt_status" name="monthly_receipt_status" style="display:none" value="<c:out value="${monthlyNoOfReceiptSuccessRecords}"/>"/>
	<input type="text" id="monthly_receipt_status_fail_value" name="monthly_receipt_status_fail_value" style="display:none" value="<c:out value="${monthlyNoOfReceiptFailRecords}"/>"/>
	<input type="text" id="weekly_receipt_status_value" name="weekly_receipt_status_value" style="display:none" value="<c:out value="${weeklyNoOfReceiptSuccessRecords}"/>"/>
	<input type="text" id="weekly_receipt_status_fail_value" name="weekly_receipt_status_fail_value" style="display:none" value="<c:out value="${weeklyNoOfReceiptFailRecords}"/>"/>
	<input type="text" id="today_receipt_status_value" name="today_receipt_status_value" style="display:none" value="<c:out value="${todayNoOfReceiptSuccessRecords}"/>"/>
	<input type="text" id="today_receipt_status_fail_value" name="today_receipt_status_fail_value" style="display:none" value="<c:out value="${todayNoOfReceiptFailRecords}"/>"/>
	
<!-- 	<div class="container-fluid footer_section">
		<div class="row">
			<div class="col-xs-12 col-sm-12 text-center">
				<p style="margin:0px">Powered By | FA Software Services Pvt Ltd</p>		
			</div>
		</div>
	</div> -->
	
		
<!--core js-->	
<script src="<c:url value='/resources/js/jquery.min.js' />"></script>
<script src="<c:url value='/resources/js/bootstrap.min.js' />"></script> 
<script src="<c:url value='/resources/js/loader.js' />"></script>
<script src="<c:url value='/resources/js/policy_piechart.js' />"></script> 
<script src="<c:url value='/resources/js/receipt_piechart.js' />"></script>

<%-- <script src="<c:url value='/resources/js/policy_n_receipt_piechart.js' />"></script> --%>

<!-- plugin for flip js-->

<!--manuel js-->

</body>
</html>