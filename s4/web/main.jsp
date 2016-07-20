<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Main</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<link href="https://fonts.googleapis.com/css?family=Lobster"
	rel="stylesheet">
<link rel="stylesheet" href="main.css">
<script>
	$(document).ready(function() {
		var cheight = $('#center_aside').height();
		$('#left_aside').css('height', cheight + 'px');

	});

	$(function() {
		$("input:text").keydown(function(evt) {
			if (evt.keyCode == 13)
				return false;
		});
	});

	$(function() {
		$("input:password").keydown(function(evt) {
			if (evt.keyCode == 13)
				return false;
		});
	});
</script>
</head>
<body>
	<header>
		<nav id="top_nav">
			<c:choose>
				<c:when test="${logincustomer == null}">
					<a href="main.mul?view=login">LOGIN</a>
					<a href="main.mul?view=register">REGISTER</a>
					<a href="main.mul?view=about">ABOUT US</a>
				</c:when>
				<c:otherwise>
					${logincustomer.name}
					<a href="login.mul">LOGOUT</a>
				</c:otherwise>
			</c:choose>
		</nav>
		<hgroup>
			<h1>Mulcam-Team No.3</h1>
		</hgroup>
		<nav id="bottom_nav">
			<c:choose>
				<c:when test="${logincustomer == null}">
					CUSTOMER || PRODUCT || ITEM
				</c:when>
				<c:otherwise>
					<a href="main.mul?view=customer">CUSTOMER</a> ||
					<a href="main.mul?view=product">PRODUCT</a> ||
					<a href="main.mul?view=item">ITEM</a>
				</c:otherwise>
			</c:choose>

		</nav>
	</header>
	<nav id="navi">
		<c:choose>
			<c:when test="${navi == null}">
				<a href="main.mul">HOME</a>
			</c:when>
			<c:otherwise>
				${navi}
			</c:otherwise>
		</c:choose>
	</nav>
	<section>
		<aside id="left_aside">
			<c:choose>
				<c:when test="${left == null}">
					<jsp:include page="left.jsp"></jsp:include>
				</c:when>
				<c:otherwise>
					<jsp:include page="${left}.jsp"></jsp:include>
				</c:otherwise>
			</c:choose>
		</aside>
		<aside id="center_aside">
			<c:choose>
				<c:when test="${center == null}">
					<jsp:include page="center.jsp"></jsp:include>
				</c:when>
				<c:otherwise>
					<jsp:include page="${center}.jsp"></jsp:include>
				</c:otherwise>
			</c:choose>
		</aside>
	</section>
</body>
</html>