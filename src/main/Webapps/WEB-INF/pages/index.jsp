<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="en">
<head>
  <title>ROYAL SUNDARAM</title>
  <%--
response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
response.setHeader("Cache-Control","no-cache");

response.setHeader("Pragma","no-cache");
response.setDateHeader ("Expires", 0);    
--%>
  <meta charset="utf-8">
  <meta name="description" content="Insurance">
  <meta name="keywords" content="Car,Bike,Health,Safety">
  <meta name="author" content="Insurance">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 
  <!--custom css-->
  <link rel="stylesheet" href="<c:url value='/resources/css/styles.css' />">
  <!--core css-->
  <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.min.css' />">
  <!--title icon css-->
  <link rel="SHORTCUT ICON" href="<c:url value='/resources/images/favicon.ico?' />" type="image/x-icon"/>
  
	
  
  <!-- core font styles-->
  <link rel="stylesheet" href="<c:url value='/resources/fonts/font-awesome.min.css'/>"/>
  <!-- jura font styles-->
  <link rel="stylesheet" href="<c:url value='/resources/fonts/jura.css'/>"/>
  <!--plugin css-->
  <link rel="stylesheet" href="<c:url value='/resources/css/dreyanim.css'/>"/>
  
   <!--[if lt IE 9]>
  <script src="resources/js/html5shiv.js"></script>
<![endif]-->
  <style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>

</head>
<body class="overhide">
<div class="logincon container-fluid">

	<div class="row logo_row">
		<div class="col-md-12 col-sm-12 col-xs-12">
			<div class="text-center">
				<img src="<c:url value='/resources/images/royallogo.png'/>" class="logo_element" alt="ROYAL SUNDARAM" width="-5" height="-1"/>
			</div>
		</div>
	</div>	
	<div align="center" style="color:#d40a37;"><c:out value="${message}"></c:out></div>
	<form:form method="POST" commandName="loginForm" action="login">
		<div class="login_form_row row">
			<div class="col-md-12 col-sm-12 col-xs-12">
				<div class="login_form_border col-md-offset-4 col-md-4 col-sm-offset-3 col-sm-6 col-xs-offset-2 col-xs-8">
					<div class="login_form_border_inner">
						<div class="username form-group">
							<div class="input-group input-group_username">
							
								<span class=" uesr_icon_name input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
								<form:input type="text" class="login_texts form-control" path="username" id="username" placeholder="Name" required="required"/>
								<form:errors path="username" cssClass="error" />
								<div class="line_effect_side">
								</div>
							</div>	
						</div>
						
						<div class="userpassword form-group">
							<div class="input-group input-group_userpassword">
								<span class=" uesr_icon_password input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
								<form:input type="password" class="login_password form-control" path="password" id="password" placeholder="password" required="required"/>
								<form:errors path="password" cssClass="error" />
								<div class="line_effect_side">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		
			<div class="col-md-12 col-sm-12 col-xs-12">
				<div class="col-md-offset-4 col-md-4 col-sm-offset-3 col-sm-6 col-xs-offset-2 col-xs-8 login_buttons text-center">
					<div class="login_form_border_inner">
						
						<div class="clear_right">
						<input type="reset" class="login_down btn btn-warning" value="CLEAR">
							
						</div>
						<div class="login_left">
							<input type="submit" class="login_down btn btn-warning" value="LOGIN">
						</div>
					
					</div>
				</div>
			</div>
		</div>
	</form:form>
	
</div>
<!--core js-->	
<script src="<c:url value='/resources/js/jquery.min.js'/>"></script>
<script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script> 

<!-- plugin for flip js-->
<script src="<c:url value='/resources/js/dreyanim_resource.js'/>"></script>
<script src="<c:url value='/resources/js/dreyanim.js'/>"></script>  




<!--manuel js-->
<script>
	
	$('.logo_element').dreyanim({
	animationType : "zoomIn"

})
	$('.logo_element').dreyanim({
	animationType : "zoomIn",
	animationTime :300,
	animationDelay :0,
	})
</script>
</body>
</html>