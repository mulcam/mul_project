<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<script>
	function itemDelete() {
		var c = confirm("삭제하시겠습니까?");
		if (c == true) {
			location.href = "item.mul?cmd=delete&id=${detailitem.id }";
		}
	}
</script>

<div id="itemdetail_center" class="center">
	<h1>ITEM DETAIL</h1>
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
				<td>${detailitem.id }</td>
				<td>${detailitem.name }</td>
				<td>${detailitem.price }</td>
			</tr>
			<tr>
				<td class="left">DATE</td>
				<td colspan="2">${detailitem.regDate}</td>
			</tr>

			<tr>
				<td class="left">IMG1</td>
				<td colspan="2"><img src="img/${detailitem.imgname1 }" width="200"></td>
			</tr>
		<tr>
				<td class="left">IMG2</td>
				<td colspan="2"><img src="img/${detailitem.imgname2 }" width="200"></td>
			</tr>			
		</tbody>

	</table>
	<br> <a class="myButton" href="#" onclick="itemDelete();">DELETE</a>
	<a class="myButton"
		href="item.mul?cmd=update&id=${detailitem.id }">UPDATE</a>
</div>