<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="item_list" class="center">
	<h1>ITEM LIST</h1>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>PRICE</th>
				<th>DATE</th>				
				<th>IMG1</th>
				<th>IMG2</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${ilist}">
				<tr>
					<td><a href="item.mul?cmd=detail&id=${item.id}">${item.id}</a></td>
					<td>${item.name}</td>
					<td>${item.price}</td>
					<td>${item.regDate}</td>
					<td><img src="img/${item.imgname1}" width="40"></td>
					<td><img src="img/${item.imgname2}" width="40"></td>					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>