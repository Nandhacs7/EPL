<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%--
	response.setHeader("Cache-Control", "no-cache"); //Forces caches to obtain a new copy of the page from the origin server
	response.setHeader("Cache-Control", "no-store"); //Directs caches not to store the page under any circumstance
	response.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
	response.setHeader("Pragma", "no-cache");
--%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap.min.css' />">

<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/dataTables.bootstrap.min.css' />">

<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/responsive.bootstrap.min.css' />">

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

<link rel="stylesheet" href="<c:url value='/resources/css/jquery.dataTables.min.css' />">

<link href="<c:url value='/resources/css/sweetalert.min.css' />" rel="stylesheet" />
<script src="<c:url value='/resources/js/sweetalert.min.js' />"></script>
<!--core css-->
<!-- <link rel="stylesheet" href="css/bootstrap.min.css"> -->
<link rel="stylesheet" href="<c:url value='/resources/css/styles.css' />">
<!--title icon css-->
<link rel="SHORTCUT ICON" href="<c:url value='/resources/images/favicon.ico?' />" type="image/x-icon" />



<!-- core font styles-->
<link rel="stylesheet" href="<c:url value='/resources/fonts/font-awesome.min.css' />">
<!-- jura font styles-->
<link rel="stylesheet" href="<c:url value='/resources/fonts/jura.css' />">
<!--plugin css-->

<link href="<c:url value='/resources/css/bootstrap-datetimepicker.min.css' />" rel="stylesheet">
<script src="<c:url value='/resources/js/policy_data_chq_cn.js'/>"></script>

<!-- 	<script src="js/bootstrap.min.js"></script> -->


</head>
<body>
	<div class="container-fluid top_con">
		<div class="row">
<!-- 			<div class="menus"> -->
<!-- 				<span class="glyphicon glyphicon-th" id="clk_icon"></span> -->
<!-- 				<div class="menu_list_bg" id="menu_list_bg"> -->
<%-- 					<div class="menu_list" id="menu_list">

<p class="menu_list_1">
							<a href="<c:url value='/exceluploadpage' />">Excel Upload Page</a>
						</p>
						<p class="menu_list_2">
							<a href="<c:url value='/getallrtomasterspage' />">RTO Masters
								Data</a>
						</p>
						<p class="menu_list_3">
							<a href="<c:url value='/getallsuccesspolicydata' />">Get All
								Success Policy Data</a>
						</p>
						<p class="menu_list_4">
							<a href="<c:url value='/bulkprintpage' />">Bulk Print</a>
						</p>
						<p class="menu_list_5">
							<a href="<c:url value='/mfrheaderdownloadpage' />">Manufacturer
								Header Download</a></p>
					</div> --%>
<!-- 				</div> -->
<!-- 			</div> -->
			<div class="toproyalimg text-center">
				<img src="<c:url value='/resources/images/royallogo.png'/>" alt="ROYAL SUNDARAM" width="" height="">
			</div>
		</div>
	</div>

	<div class="container-fluid topnav">

		<div class="row text-center">
			
<%-- 			<div class="col-md-6 brandname">
				<label  >WELCOME,<c:out
						value="${username}"></c:out></label>
			</div> --%>
			
			 <div class="col-md-3 text-left">
			 <label  ><a class="logout_a"  href="<c:url value='/'/>">WELCOME,<c:out
						value="${username}"></c:out></a></label>
			</div>
			
			<div class="col-md-3 text-left">
			<a class="logout_a"  href="<c:url value='/getallpolicyerrordatapage'/>">Get All Policy Data</a>
			</div>			 			
			<div class="col-md-3 text-right">
				
					<a class="logout_a" href="<c:url value='/receiptPage'/>">Get All Recipt Data</a>
				</div>
			 <div class="col-md-3 text-right">
				<a class="logout_a" href="<c:url value='/logout' />"> LOGOUT</a>
			</div>
<%-- 			<div class="col-md-6 logout">
				<a class="logout_a" href="<c:url value='/logout' />"> LOGOUT</a>
			</div> --%>
		</div>
	</div>

	<!-- home1-->
	<div class="container-fluid homebg">
		<div class="row">
<!-- 			<div class="home"> -->
<!-- 			<div class="form-inline" style="text-align:center"> -->
<!-- 							<div class="form-group"> -->
<!-- 								<div class="input-group date form_date" > -->
<!-- 									<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span> -->
<!-- 									<input name="startdate" class="form-control in_sdate" id="in_sdate" size="16" type="text" value="" placeholder="START DATE" readonly> -->
<!-- 								</div>	 -->
<!-- 							</div> -->
							
<!-- 							<div class="form-group"> -->
<!-- 								<div class="input-group date form_date" > -->
<!-- 									<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span> -->
<!-- 									<input name="enddate" class="form-control in_edate" id="in_edate" size="16" type="text" value="" placeholder="END DATE" readonly> -->
<!-- 								</div>	 -->
<!-- 							</div>	 -->
<!-- 						</div> -->
						
<!-- 						<div class="download"> -->
<!-- 							<div> -->
<!-- 							<input type="button" class="btn btn-primary" name="" id="get_error_data" value="Get Data"> -->
<!-- 							</div> -->
<!-- 						</div> -->
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
			<table id="pol_error_data_view_table" class="table" style="over-flow:scroll;" cellspacing="0" width="100%">
        <thead>
            <tr>
<!--              <th>S.NO</th> -->
                <th>POLICY_NO</th>
                <th>RECEIPT_NO</th>                
                <th>POLICY_ID</th>
                <th>RECEIPT_ID</th>
                <th>STATUS</th>
                <th>ATTEMPT</th>
                <th>ERROR_CODE</th>
                <th>RESPONSE_XML</th>
                <th>OPTIONS</th>
               
            </tr>
        </thead>
       
    </table> 
    
    
    <table id="pol_error_data_view_table" class="display" cellspacing="0" width="100%">
    </table>
				
  <div class="modal fade" id="policydata" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Policy Data New Bussiness Manual Updation</h4>
        </div>
        <div class="modal-body">
        
        <form method="POST" id="policy_data_updation" action="#" >
						
        <label>POLICY_NUMBER</label>
        <input type="text" name="policy_no" id="policy_no" readonly/><br/>
		<label>PRODUCT_CODE</label><input type="text" name="prd_code" id="prd_code" /><br/>
		<label>ENDORSEMENT_REASON</label><input type="text" name="end_reasn" id="end_reasn" /><br/>
		<label>CLIENT_CODE</label><input type="text" name="acc_code" id="acc_code" /><br/>
		<label>BR_CODE</label><input type="text" name="br_code" id="br_code" /><br/>
<!-- 		<label>POL_NO_GEN_ID</label><input type="text" name="pol_no_gen_id" id="pol_no_gen_id"/><br/>
 		<label>ZSTAX</label><input type="text" name="zstax" id="zstax" /><br/>
		<label>ZEDCS</label><input type="text" name="zedcs" id="zedcs" /><br/> 
		<label>ZKCESS</label><input type="text" name="zkcess" id="zkcess" /><br/> -->
		<label>INCEPTION DATE</label><input type="text" name="inception_date" id="inception_date" readonly/><br/>
		<label>POLICY_SI</label><input type="text" name="policy_si" id="policy_si" /><br/>
		<div class="subload">
				<div>
						<input type="submit" class="btn btn-primary" data-toggle="modal" data-target="#policydata" id="policy_data_update" value="Update" />
				</div>
		</div>
						</form>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
</div>

</div>
		
<!-- 		</div> -->
	<script src="<c:url value='/resources/js/bootstrap-datetimepicker.min.js' />"></script>
<!-- plugin for flip js-->
 <script>
	$(document).ready(function(){
		/*$("#clk_icon").hover(function(){
			$("#menu_list_bg p").show();
		},function(){}
		);*/
		
		$('#clk_icon').mouseover(function(){
		$('#menu_list_bg').slideToggle();
		});
		
		$('#menu_list_bg').mouseleave(function(){
		$('#menu_list_bg').hide();
		});
		
		$('.form_date').datetimepicker({
        //language:  'fr',
        weekStart: 1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 4,
        format: 'dd/mm/yyyy'
	
		});
		
	});
 </script>	
		
</body>
</html>