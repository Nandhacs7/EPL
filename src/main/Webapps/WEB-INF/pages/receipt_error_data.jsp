<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!--custom css-->
<link rel="stylesheet" href="<c:url value='/resources/css/styles.css' />">
<!--core css-->
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap.min.css' />">

<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/dataTables.bootstrap.min.css' />">

<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/responsive.bootstrap.min.css' />">
<!--title icon css-->
<link rel="SHORTCUT ICON" href="<c:url value='/resources/images/favicon.ico?' />" type="image/x-icon" />

<!--core js-->
<script src="<c:url value='/resources/js/jquery.min.js' />"></script>

<script src="<c:url value='/resources/js/bootstrap.min.js' />"></script>

<script type="text/javascript" charset="utf8"
	src="<c:url value='/resources/js/jquery.dataTables.min.js' />"></script>

<script type="text/javascript" charset="utf8"
	src="<c:url value='/resources/js/dataTables.bootstrap.min.js' />"></script>

<script type="text/javascript" charset="utf8"
	src="<c:url value='/resources/js/dataTables.responsive.min.js' />"></script>

<script type="text/javascript" charset="utf8"
	src="<c:url value='/resources/js/responsive.bootstrap.min.js' />"></script>
<!--manual js-->
<script src="<c:url value='/resources/js/receipt_error_data.js'/>"></script>

<link rel="stylesheet" href="<c:url value='/resources/css/jquery.dataTables.min.css' />">
<link href="<c:url value='/resources/css/sweetalert.min.css' />" rel="stylesheet" />
<script src="<c:url value='/resources/js/sweetalert.min.js' />"></script>

<!-- core font styles-->
<link rel="stylesheet" href="<c:url value='/resources/fonts/font-awesome.min.css' />">
<!-- jura font styles-->
<link rel="stylesheet" href="<c:url value='/resources/fonts/jura.css' />">
<link href="<c:url value='/resources/css/bootstrap-datetimepicker.min.css' />" rel="stylesheet">
<title>ROYAL SUNDARAM</title>
</head>
<body >
	<div class="container-fluid">
		<div class="row text-center">
			<div class="toproyalimg">
				<img src="<c:url value='/resources/images/royallogo.png'/>" alt="ROYAL SUNDARAM" width=""
					height="">
			</div>
		</div>
	</div>
	<!--navigation-->
	  
<%-- 	<a href="<c:url value='/policy' />">Policy Information </a>
	<br />
	<a href="<c:url value='/receipt' />">Receipt Error Data </a><br/> --%>

	<div class="container-fluid topnav">

		<div class="row text-center">
			<div class="col-md-3 text-left">
				<a class="logout_a" href="<c:url value='/' />" target="_self">WELCOME <c:out value="${username}"></c:out> </a>
			</div>
			
			<div class="col-md-3">
				<a class="logout_a" href="<c:url value='/getallpolicyerrordatapage' />"target="_self">All Policy Data </a>
			</div>
			
			<div class="col-md-3">
				<a class="logout_a" href="<c:url value='/receiptPage' />" target="_self">All Receipt Data </a>
			</div>			

			<div class="col-md-3 text-right">
				<a class="logout_a" href="<c:url value='/logout' />"> LOGOUT</a>
			</div>
			
		</div>
	</div>

	<!-- home1-->
	<div class="container-fluid homebg">
		<div class="row">
			<!-- <div class="home"> -->
			<div class="row ">
				<div class="col-sm-6 text-left">
				<select name="searchtype" id="searchtype" required>
								<option value="">Select SearchType</option>
								<option value="policyno">Policy No</option>
								<option value="receiptno">Receipt No</option>
							</select>
				</div>
				<div class="col-sm-6 text-right">
						<div class="col-sm-offset-6 col-sm-4 text-left" style="padding:0px">			
							<input type="text" name="searchKey" id="searchKey" style="border:1px solid #444;width: 100%;"/>
						</div>
						<div class="col-sm-1 text-left" style="padding:0px;padding-left:5px">
							<input type="button" class="btn btn-primary"  id="search_btn" value="Search" />
						</div>
			</div>
			</div>


				<table id="receipt_error_data" class="display" cellspacing="0" width="100%" >
					<thead>
						<tr>
							<!-- <th>S.No</th> -->
							<th>POLICY NO</th>
							<th>RECEIPTNO</th>
							<!-- <th>AGENTCODE</th>
							<th>PRODUCTCODE</th> -->
							<th>RECEIPT_ID</th>
							<th>POLICY_ID</th>
							<th>STATUS</th>
							<th>ATTEMPTTIME</th>
							<th class="text-center">RESPONSE</th>
							<th>OPTIONS</th>
						</tr>
					</thead>
				</table>
				
				
							<div class="modal fade" id="receiptdata" role="dialog">
				<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Receipt Data Manual
								Updation</h4>
						</div>
						<div class="modal-body">

							<form method="POST" id="update_payment_data" action="#">
								
								<label>Payment Id</label> <input type="text" name="payment_id"
									id="payment_id" readonly="readonly" /><br />
								<label>RECEIPT NO</label> <input type="text" name="receipt_no"
									id="receipt_no" readonly="readonly" /><br />								
								<label>RECEIPT AMOUNT</label> <input type="text" name="receipt_amount"
									id="receipt_amount"  /><br /> <label>PAYMENT AMOUNT</label><input
									type="text" name="payment_amount" id="payment_amount" required="required" /><br /> <label>INSTRUMENT NO</label><input
									type="text" name="instrument_no" id="instrument_no" required="required" /><br /> <label>CBC</label><input
									type="text" name="cbc" id="cbc" required="required" /><br /> 
								<div class="subload">
									<div>
										<input type="submit" class="btn btn-primary"
											data-toggle="modal" data-target="#receiptdata"
											id="payment_data_update" value="Update" />
									</div>
								</div>
							</form>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
						</div>
					</div>

				</div>
			</div>
				
			</div>

		</div>
	<!-- </div> -->

</body>
</html>