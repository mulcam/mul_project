<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<script>
	function productDelete() {
		var c = confirm("삭제하시겠습니까?");
		if (c == true) {
			location.href = "product.mul?cmd=delete&id=${detailpro.id }";
		}
	}
</script>

<div id="productdetail_center" class="center">
	<h1>PRODUCT DETAIL</h1>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>PRICE</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${detailpro.id }</td>
				<td>${detailpro.name }</td>
				<td>${detailpro.price }</td>
			</tr>

			<tr>
				<td class="left">IMG</td>
				<td colspan="2"><img src="img/${detailpro.imgname }" width="200"></td>
			</tr>
		</tbody>

	</table>
	<br> <a class="myButton" href="#" onclick="productDelete();">DELETE</a>
	<a class="myButton"
		href="product.mul?cmd=update&id=${detailpro.id }">UPDATE</a>
</div>