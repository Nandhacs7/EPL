<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
  <title>ROYAL SUNDARAM</title>
  <meta charset="utf-8">
  <meta name="description" content="Insurance">
  <meta name="keywords" content="Car,Bike,Health,Safety">
  <meta name="author" content="Insurance">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!--custom css-->
  
  <!--core css-->
   <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.min.css'/>">
  <!--title icon css-->
  <link rel="SHORTCUT ICON" href="<c:url value='/resources/images/favicon.ico?'/>" type="image/x-icon"/>
  
  <link rel="stylesheet" href="<c:url value='/resources/css/EappsStyles.css'/>"> 
  
  <%-- <link rel="stylesheet" href="<c:url value='/resources/css/styles.css'/>"> --%>
  
  <link href="<c:url value='https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css" rel="stylesheet'/>">
   
  <!-- core font styles-->
   <link rel="stylesheet" href="<c:url value='/resources/fonts/font-awesome.min.css'/>">
  <!-- jura font styles-->
    
   <link rel="stylesheet" href="<c:url value='/resources/fonts/jura.css'/>">
    
  <link href="<c:url value='/resources/css/bootstrap-datetimepicker.min.css" rel="stylesheet'/>">
  
</head>
<body>
	<div class="container-fluid top_con">
		<div class="row navigation_row">
			<div class="col-xs-12 col-sm-12">
				<div class="col-xs-4 col-sm-4">
					<div class="text-left">
						<img src="<c:url value='/resources/images/royallogo_1.png" alt="ROYAL SUNDARAM" width="" height="'/>">
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
						<p><span>Welcome,&nbsp;</span><span>${username}</span></p>
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
				<li class="active"><a href="<c:url value='/home' />" target="_self">HOME</a></li>
				 <li class="dropdown nav navbar-nav" >
                   <a href="#" class="dropdown-toggle"  data-toggle="dropdown">SEARCH</a>
                   <ul class="dropdown-menu ">
                   <li>  <a  class="ram" id="oem"  href="<c:url value='/search'/>">OEM</a></li>
                   <li>  <a class="ram" id="eapps" href="<c:url value='/eappsearch'/>">EAPPS</a></li>
                   </ul>
                  </li>
             	
			   
				<!-- <li><a href="<c:url value='/search'/>" target="_self">SEARCH</a></li> -->
				<li><a href="<c:url value='/royal_dashboard' />" target="_self">DASHBOARD</a></li>
			</ul>
		</div>
	</div>
	
	
		<div class="container-fluid homebg">
		<!-- row_split-->
		<div class="row">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 all_cases_col">
				<div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 all_cases_col_by_rec">
				
					<h5 class="text-center">SEARCH BY POLICY OR RECEIPT NO</h5>
					<div class="row">
					
                  <!-- 	<div class="col-xs-6 col-sm-6 col-md-5 col-lg-5 sub_col righthandtype">
							<div class="form-group">
								<div class="input-group">                       
									<span class="input-group-addon"><span class="glyphicon glyphicon-list-alt"></span></span>									
 									  <select  class="form-control" id="atype" >
										<option value=''>Select Type</option>
										<option value='receipt'>Receipt</option>
										<option value='policy'>Policy</option>
									  </select>
								</div>
							</div>
						</div> -->
					
						<div class="col-xs-6 col-sm-6 col-md-5 col-lg-5 sub_col rectt">
							<div class="form-group">
								<div class="input-group">                       
									<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
									<input type="text" class="form-control" id="asearch" placeholder="Enter Policy/Receipt No">
								</div>
							</div>
						</div>
						
						
					    <div class="col-xs-12 col-sm-12 col-md-2 col-lg-2 sub_col buttmm text-center">								                     
                                  
                                   
                                   <button class="btn btn-default search" id="eabutton">Search</button>    							
						</div>
						
						
						
						
						
						
						
						
						</div>
						<!-- <div class="row"> -->
						<!-- <div class="col-xs-6 col-sm-4 text-center sub_col"></div> -->
						<!-- <div class="col-xs-6 col-sm-6 text-center sub_col"> -->
							 <!-- <div class="form-group">  -->
					          <!-- <div class="input-group">  -->
								
							<!-- </div>  -->
							 <!-- </div> -->
						<!-- </div> -->
						<!-- </div> -->
<!-- 						<div class="row"  style="padding-top:10px;padding-bottom:10px;"> -->
<!-- 						<div class="col-xs-12 col-sm-12 text-center sub_col"> -->
<!-- 							<button class="btn btn-default search" id="abutton">Search</button> -->
<!-- 						</div> -->
<!-- 					</div> -->
				
				</div>
				<div class="col-xs-12 col-sm-8 col-md-8 col-lg-8 ">
					<h5 class="text-center">SEARCH BY DATE AND STATUS</h5>
					<div class="row">
						<div class="col-xs-6 col-sm-2 col-md-2 col-lg-2 sub_col slt_status startdate">
						<span class="labels">From:</span>
							<div class="form-group">
								<div class="input-group date form_date date_calendar">                       
									<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
									<input type="text" class="form-control" id="startdate" placeholder="Strat Date" >
								</div>
							</div>
						</div>
						<div class="col-xs-6 col-sm-2 col-md-2 col-lg-2 sub_col slt_status enddate">
						<span class="labels">To:</span>
							<div class="form-group">
								<div class="input-group date form_date date_calendar">                       
									<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
									<input type="text" class="form-control" id="enddate" placeholder="End Date" >
								</div>
							</div>
						</div>
					
<!-- 							<div class="col-xs-6 col-sm-2 col-md-2 col-lg-2 sub_col slt_status type">
								<div class="form-group">
									<div class="input-group">
									<span class="input-group-addon"><span class="glyphicon glyphicon-list-alt"></span></span>
										 <select  class="form-control" id="eapptype">
											<option value=''>Select Type</option>
											<option value='policy'>Policy</option>
											<option value='receipt'>Receipt</option>
										</select>
										</div>
									</div>
								</div> -->
							
							
	                        <div class="col-xs-6 col-sm-2 col-md-2 col-lg-2 sub_col slt_prd">
								<div class="form-group">
									<div class="input-group">                       
										<span class="input-group-addon"><span class="glyphicon glyphicon-list-alt"></span></span>
										<select  class="form-control" id="product" >
											<option value=''>Select ProductCode</option>
											<option value='VPC'>VPC</option>
											<option value='VPCV'>VPCV</option>
											<option value='VGC'>VGC</option>
											<option value='VOC'>VOC</option>
											<option value='VFA'>VFA</option>
										</select>
									</div>
								</div>
							</div>
							
									<!-- For Status -->
							<div class="col-xs-6 col-sm-2 col-md-2 col-lg-2 sub_col slt_mfr">
								<div class="form-group">
									<div class="input-group">                       
										<span class="input-group-addon"><span class="glyphicon glyphicon-list-alt"></span></span>
										<select  class="form-control" id="status" >
											<option value=''>Select Status</option>
											<option value='SUCCESS'>SUCCESS</option>
											<option value='FAIL'>FAIL</option>
											<option value='Invalid Request'>Invalid Request</option>
										</select>
									</div>
								</div>
							</div>
							
                                
							<div class="col-xs-6 col-sm-2 col-md-2 col-lg-1">	
							<button class="btn btn-default search-by-data" id="eappebutton">Search</button>	
							</div>	
							</div>

<!-- </div> -->
						
						
					
<!-- 						<div class="row" style="padding-top:10px;padding-bottom:10px;"> -->
<!-- 							<div class="col-xs-12 col-sm-12 sub_col text-center"> -->
<!-- 								<button class="btn btn-default search" id="ebutton">Search</button> -->
<!-- 							</div> -->
<!-- 						</div> -->
				</div>
			</div>
		</div>
	</div>
		
	<!--<div class="container-fluid footer_section">
		<div class="row">
			<div class="col-xs-12 col-sm-12 text-center">
				<p style="margin:0px">Powered By | FA Software Services Pvt Ltd</p>		
			</div>
		</div>
	</div>-->
	
<div id="dataTables_pol_error_data" class="display" cellspacing="0" width="100%" >

</div>	
	
	
		
<!--core js-->	
<script src="<c:url value='/resources/js/jquery.min.js'/>"></script>
<script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script> 


<script type="text/javascript" charset="utf8"
	src="<c:url value='/resources/js/jquery.dataTables.min.js' />"></script>

<script type="text/javascript" charset="utf8"
	src="<c:url value='/resources/js/dataTables.bootstrap.min.js' />"></script>

<script type="text/javascript" charset="utf8"
	src="<c:url value='/resources/js/dataTables.responsive.min.js' />"></script>



<script src="<c:url value='/resources/js/Nbsearch.js'/>"></script>

<%-- <script src="<c:url value='/resources/js/mfg.js'/>"></script> --%>
<script src="<c:url value='/resources/js/bootstrap-datetimepicker.min.js'/>"></script>
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
		
		$('.date_calendar').datetimepicker({
				//language:  'fr',
				weekStart: 1,
				autoclose: 1,
				todayHighlight: 1,
				startView: 2,
				minView: 2,
				forceParse: 0,
				 /* endDate: '+0d', */ 
				format: 'dd/mm/yyyy'
			});


		/* $(".date_calendar").datetimepicker({
	        numberOfMonths: 2,
	        onSelect: function(selected) {
	          $("#txtToDate").datepicker("option","minDate", selected)
	        }
	    });
	    $(".date_calendar").datetimepicker({ 
	        numberOfMonths: 2,
	        onSelect: function(selected) {
	           $("#txtFromDate").datepicker("option","maxDate", selected)
	        }
	    }); */  		
		
			
	});
	

	$(function(){
	    $(".dropdown").hover(            
	            function() {
	                $('.dropdown-menu', this).stop( true, true ).fadeIn("slow");
	                $(this).toggleClass('open');
	                $('b', this).toggleClass("caret caret-up"); 
					$(".ram").css("color" , "black");

	            },
	            function() {
	                $('.dropdown-menu', this).stop( true, true ).fadeOut("slow");
	                $(this).toggleClass('open');
	                $('b', this).toggleClass("caret caret-up");
				    $(".ram").css("color" , "black");

	            });
	    });
 </script>

<!--manuel js-->

</body>
</html>