<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<script>
	function custdelete(){
		var c = confirm("삭제하시겠습니까?");
		if(c == true){
			location.href = "customer.mul?cmd=delete&id=${detailcust.id }";
		}
	}
</script>
	
<div id="customerok_center" class="center">
	<h1>CUSTOMER DETAIL</h1>
	<table>
			<tr>
				<td class="left">ID</td>
				<td>${detailcust.id }</td>
			</tr>
			<tr>
				<td class="left">PWD</td>
				<td>${detailcust.pwd }</td>
			</tr>
			<tr>
				<td class="left">NAME</td>
				<td>${detailcust.name }</td>
			</tr>
		</table>
	<br>
	<a class="myButton" href="#" onclick="custdelete();">DELETE</a>
	<a class="myButton" href="customer.mul?cmd=update&id=${detailcust.id }">UPDATE</a>
</div>