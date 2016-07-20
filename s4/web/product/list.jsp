<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="product_list" class="center">
	<h1>PRODUCT LIST</h1>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>PRICE</th>
				<th>IMG</th>				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="product" items="${plist}">
				<tr>
					<td><a href="product.mul?cmd=detail&id=${product.id}">${product.id}</a></td>
					<td>${product.name}</td>
					<td>${product.price}</td>
					<td><img src="img/${product.imgname}" width="50"></td>					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>