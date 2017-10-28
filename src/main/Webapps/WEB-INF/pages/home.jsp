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
 <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.min.css'/>"> 
  <!--title icon css-->
  <link rel="SHORTCUT ICON" href="<c:url value='/resources/images/favicon.ico?'/>" type="image/x-icon"/>
  
	<link rel="stylesheet" href="<c:url value='/resources/css/styles.css'/>">
  
  <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap-switch.css'/>">
    
  <!-- core font styles-->
  <link rel="stylesheet" href="<c:url value='/resources/fonts/font-awesome.min.css'/>">
  <!-- jura font styles-->
  <link rel="stylesheet" href="<c:url value='/resources/fonts/jura.css'/>">
  
  <link href="<c:url value='/resources/css/bootstrap-datetimepicker.min.css" rel="stylesheet'/>">

  
<%--    <link href="<c:url value='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" rel="stylesheet'/>"> --%>
  
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
		
	
<%-- 	<div class="container-fluid topnav">
		<!-- menu_list-->
		<div class="row">
			<ul class="list_items">
				<li class="active"><a href="<c:url value='/home' />" target="_self">HOME</a></li>
				<li><a href="<c:url value='/search' />" target="_self">SEARCH</a></li>
				<li><a href="<c:url value='/royal_dashboard' />" target="_self">DASHBOARD</a></li>
			</ul>
		</div>
	</div> --%>


	<div class="container-fluid ram_con">		
	  <div class="row">
			<div class="col-xs-12 col-sm-12 ">
				<div class="col-xs-12 col-sm-6">
				<h5 class="text-center hri" >TURN OFF SWITCH FROM PROPERTIES</h5>
                 <input type="checkbox" id="property" name="my-checkbox" checked class="switchadd" onchange="changeinproperties();">
				</div>
				<div class="col-xs-12 col-sm-6">
				<h5 class="text-center hri">TURN OFF SWITCH FROM SCHEDULAR</h5>
                 <input type="checkbox"  id="schedular" name="my-checkbox" checked class="switchadd" onchange="changeinschedular();">
				</div>
			</div>	
		</div>	
	</div>




 	<div class="container-fluid ram_con">		
	  <div class="row">
			<div class="col-xs-12 col-sm-12">
			<div class="col-xs-12 col-sm-6">
				<h5 class="text-center sam" >RETRY IN EPL</h5>
                      <select  class="form-control" id="retry" >
                       <option value=''>SELECT SOURCE OF RETRY</option>
						  <option value='EMOTOR'>EMOTOR</option>
					      <option value='OEM'>OEM</option>
	                 </select>
	                 </div>
 	              <div class="col-xs-12 col-sm-6"> 
	                <button  id="more" class="btn btn-success ">RETRY IN EPL</button>
	               </div>  
			</div>	
		</div>	
	</div> 
	
<!--    <div class="container-fluid">		
   	</div> -->
	  <div class="row">
	  <div class="col-xs-12 col-sm-12">
			<div class="col-xs-12 col-sm-4 homeproduct">
			<div class="form-group ">
                      <select  class="selectpicker form-control"  id="retryonproduct" >
                       <option value=''>SELECT PRODUCT FOR RETRY</option>
						  <option value='VPC'>VPC</option>
					      <option value='VPCV'>VPCV</option>
					      <option value='VGC'>VGC</option>
					      <option value='VOC'>VOC</option>
					      <option value='VFA'>VFA</option>
	                 </select>
	             </div>
			</div>	
		<div class="col-xs-12 col-sm-4">
			<div class="form-group">
                      <select  class="selectpicker form-control"  id="retrytype" >
                       <option value=''>SELECT TYPE OF RETRY</option>
						  <option value='RECEIPT'>RECEIPT</option>
					      <option value='POLICY'>POLICY</option>
	                 </select>
	             </div>
			</div>	
			
		<div class="col-xs-12 col-sm-4">
			<div class="form-group">
                    <select  class="selectpicker form-control"  id="resetdata" >
                       <option value=''>SELECT DATA RESET</option>
						  <option value='FAIL'>FAIL</option>
					      <option value='Retry With Valid Data'>Invalid Request</option>
	                 </select>
	             </div>
			</div>
		</div>
		</div>
		
	<div class="container-fluid footer_section">
		<div class="row">
			<div class="col-xs-12 col-sm-12 text-center">
				<p style="margin:0px">Powered By | FA Software Services Pvt Ltd</p>		
			</div>
		</div>
	</div>
	
		

<!--core js-->	
<script src="<c:url value='/resources/js/jquery.min.js'/>"></script>
<script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
<script src="<c:url value='/resources/js/bootstrap-datetimepicker.min.js'/>"></script>

<script src="<c:url value='/resources/js/bootstrap-switch.js'/>"></script>

<script src="<c:url value='/resources/js/home.js'/>"></script>

<script src="<c:url value='/resources/js/search.js'/>"></script>

<%-- <script src="<c:url value='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js'/>"></script>

<script src="<c:url value='https://code.jquery.com/jquery-3.2.1.slim.min.js'/>"></script>

<script src="<c:url value='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js'/>"></script> --%>

<!-- plugin for flip js-->
 <script>
 $("[name='my-checkbox']").bootstrapSwitch();
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
				format: 'dd/mm/yyyy'
			});
			
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