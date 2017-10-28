<!DOCTYPE html>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="en">
<head>
<%
	if (session.getAttribute("appSessionDto") == null) {
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setDateHeader("Expires", 0);
		response.sendRedirect(request.getContextPath());

	}
%>
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
<link rel="SHORTCUT ICON" href="<c:url value='/resources/images/favicon.ico?'/>type="image/x-icon/">
<link rel="stylesheet" href="<c:url value='/resources/css/styles.css'/>">


<!-- core font styles-->
<link rel="stylesheet" href="<c:url value='/resources/fonts/font-awesome.min.css'/>">
<!-- jura font styles-->
<link rel="stylesheet" href="<c:url value='/resources/fonts/jura.css'/>">
<!--plugin css-->


<!--[if lt IE 9]>
  <script src="resources/js/html5shiv.js"></script>
<![endif]-->

</head>
<body class="overhide">
	<div class="container-fluid top_con">
		<div class="row">
<!-- 			<div class="menus"> -->
<!-- 				<span class="glyphicon glyphicon-th" id="clk_icon"></span> -->
<!-- 				<div class="menu_list_bg" id="menu_list_bg"> -->
<!-- 					<div class="menu_list" id="menu_list"> -->
<!-- 						<p class="menu_list_1"> -->
<%-- 							<a href="<c:url value='/getallpolicyerrordatapage'/>"> "Policy --%>
<!-- 								Data All Error Data" </a> -->
<!-- 						</p> -->
<%-- <%-- 						<p class="menu_list_2"> --%>
<%-- 							<a href="<c:url value='/getallrtomasterspage' />">RTO Masters --%>
<%-- 								Data</a> --%>
<%-- 						</p> --%>
<%-- 						<p class="menu_list_3"> --%>
<%-- 							<a href="<c:url value='/getallsuccesspolicydata' />">Get All --%>
<%-- 								Success Policy Data</a> --%>
<%-- 						</p> --%>
<%-- 						<p class="menu_list_4"> --%>
<%-- 							<a href="<c:url value='/bulkprintpage' />">Bulk Print</a> --%>
<%-- 						</p> --%>
<%-- 						<p class="menu_list_5"> --%>
<%-- 							<a href="<c:url value='/mfrheaderdownloadpage' />">Manufacturer --%>
<%-- 								Header Download</a> --%>
<%-- 						</p> --%> 
<!-- 												<p class="menu_list_4"><a href="login.html">MENU 4</a></p> -->
<!-- 												<p class="menu_list_5"><a href="login.html">MENU 5</a></p> -->
<!-- 												<p class="menu_list_6"><a href="login.html">MENU 6</a></p> -->
<!-- 					</div> -->
<!-- 				</div> -->
<!-- 			</div> -->
			<div class="toproyalimg text-center">
				<img src="<c:url value='/resources/images/royallogo.png'/>" alt="ROYAL SUNDARAM" width=""
					height="">
			</div>
		</div>
	</div>
	<!--navigation-->
	<%-- <a href="<c:url value='/downloadpdf' />">Sample PDF Download</a> --%>
	<!-- <br/> -->
	<%-- <a href="<c:url value='/pushdatatofgpage' />">Data Push on FG To User</a><br/> --%>
	<%-- <a href="<c:url value='/getallpolicyerrordata' />">Policy Data Cheque Cancel All Error Data </a><br/> --%>
	<%-- <a href="<c:url value='/policydataupdationpage' />">Policy Data Cheque Cancel Manual Updation </a><br/> --%>
	<%-- <a href="<c:url value='/getallrtomasterspage' />">RTO Masters Data</a><br/> --%>
	<%-- <a href="<c:url value='/getallsuccesspolicydata' />">Get All Success Policy Data</a><br/> --%>

	<div class="container-fluid topnav">

		<div class="row text-center">
			<!-- 		<div class="username"> -->
			<%-- 				<a class="royal_a" href="#" target="_self">WELCOME,<c:out value="${username}"></c:out></a> --%>
			<!-- 			</div> -->
			<div class="col-md-6 brandname">
				<div class="col-md-6">
				<label class="" >WELCOME,<c:out
						value="${username}"></c:out></label>
					</div>	
					<div class="col-md-6 text-left">
						<a class="logout_a"  href="<c:url value='#'/>">Get All Policy Data</a>   <!-- /getallpolicyerrordatapage -->
					</div>			 
			</div>

			<div class=" col-md-6 logout">
				<div class="col-md-6 text-right">
					<a class="logout_a" href="<c:url value='#'/>" >Get All Recipt Data</a>  <!-- /receiptPage -->
				</div>
				<div class="col-md-6"></div>
					<a class="logout_a" href="<c:url value='#' />"> LOGOUT</a>  <!-- /logout -->
				</div>
				
			</div>
		</div>
	</div>

	<!-- home1-->
<%-- 	<div class="container-fluid homebg">
		<div class="row">
			<div class="home">
				<div class="home_inner">
					<form:form method="POST" commandName="excelupload"
						action="chequecancelexcelupload" enctype="multipart/form-data">
						<div class="form-group">
							<label for="select Company" class="labelname">Please
								select the Manufacturer:</label>
							<form:select path="mfrCompanyName" required="true">
								<option value="NONE" label="--- Select ---" />
								<c:forEach items="${listOfManufacturerNames}" var="companyNames">
									<option value="${companyNames.mfrCmpnyName}"><c:out
											value="${companyNames.mfrCmpnyName}" /></option>
								</c:forEach>
							</form:select>

						</div>

						<div class="form-group">
							<label class="labelfile" id="" for="file">File input</label>
							<form:input type="file" path="file" id="file" />
						</div>
						<div class="subload">
							<div>
								<input type="submit" class="btn btn-primary" value="UPLOAD" />
							</div>
						</div>
					</form:form>
				</div>
			</div>
		</div>

	</div>
 --%>
	<!--core js-->
	<script src="<c:url value='/resources/js/jquery.min.js'/>"></script>
	<script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
	<script src="<c:url value='/resources/js/royal.js'/>"></script>
	<!-- plugin for flip js-->
	<!--manuel js-->

</body>
</html>