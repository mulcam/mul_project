<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="customer_list" class="center">
	<h1>CUSTOMER LIST</h1>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="cust" items="${clist}">
				<tr>
					<td><a href="customer.mul?cmd=detail&id=${cust.id}">${cust.id}</a></td>
					<td>${cust.name}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>