<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h5 style="text-align: center">MAIN Menu</h5>
<c:choose>
	<c:when test="${logincustomer == null}">
		<div class="m_button">CUSTOMER</div>
		<div class="m_button">PRODUCT</div>
		<div class="m_button">ITEM</div>
	</c:when>
	<c:otherwise>
		<div class="m_button">
			<a href="main.mul?view=customer">CUSTOMER</a>
		</div>
		<div class="m_button">
			<a href="main.mul?view=product">PRODUCT</a>
		</div>
		<div class="m_button">
			<a href="main.mul?view=item">ITEM</a>
		</div>
	</c:otherwise>
</c:choose>