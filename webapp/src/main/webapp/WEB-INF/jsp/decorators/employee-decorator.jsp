<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<title><decorator:title default="Hello World" /></title>
<decorator:head />
<link href="<c:url value='/resources/css/bootstrap.css'/>" rel="stylesheet">
<link href="<c:url value='/resources/css/bootstrap-theme.css'/>" rel="stylesheet">

</head>
<body>

	<div class="navbar navbar-inverse navbar-static-top" role="navigation">
		<div class="container">
			<a href="#" class="navbar-brand">Employee Page</a>
			<button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<div class="collapse navbar-collapse navHeaderCollapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href="<c:out value = "${pageContext.request.contextPath}/employee/"/>"><i class="icon-white icon-home"></i>Home</a></li>
					<li><a href="<c:out value = "${pageContext.request.contextPath}/employee/add/"/>">Add</a></li>
					<li><a href="<c:out value = "${pageContext.request.contextPath}/employee/list/"/>">List/Edit</a></li>
					<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"> Operations<b class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li><a href="#">A</a></li>
							<li><a href="#">B</a></li>
							<li><a href="#">C</a></li>
						</ul></li>
					<li><a href="#">About</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="container">
		<decorator:body />
	</div>

	<div class="navbar navbar-default navbar-fixed-bottom">
		<div class="container">
			<p class="navbar-text pull-left">Footer Text</p>
			<a href="#" class="navbar-btn btn-danger btn pull-right">Visit us at</a>
		</div>
	</div>
	<script src="<c:url value="/resources/js/jquery-2.1.0.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.min-3.1.1.js" />"></script>
	<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</body>
</html>