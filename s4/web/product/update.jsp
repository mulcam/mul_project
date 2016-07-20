<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<script>
	function productUpdate(f) {
		var c = confirm('수정 하시겠습니까?');
		if (c == true) {
			f.action = 'product.mul?cmd=updateimpl';
			f.method = 'POST';
			submit_handle.click();
		}
	};
</script>
<div id="product_register" class="center">
	<h1>Product Register</h1>

	<form enctype="multipart/form-data">
		<table>
			<tr>
				<td class="left">ID</td>
				<td><input type="text" readonly
					style="background: none; border: none; color: white;" name="id"
					value="${updateproduct.id}"></td>
			</tr>
			<tr>
				<td class="left">NAME</td>
				<td><input type="text" name="name" value="${updateproduct.name}" required></td>
			</tr>
			<tr>
				<td class="left">PRICE</td>
				<td><input type="text" name="price" value="${updateproduct.price}" required></td>
			</tr>
			<tr>
				<td class="left">IMG</td>
				<td><input type="file" name="newimg"><input type="hidden" name="imgname" value="${updateproduct.imgname}"></td>
			</tr>
			<tr><td colspan="2">${updateproduct.imgname}</td></tr>
		</table>
		<br> <input class="myButton" type="button"
			onclick="productUpdate(this.form);" value="UPDATE"> <input
			type="submit" id="submit_handle" style="display: none;">

	</form>
</div>