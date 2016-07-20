<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	
<script>
function productRegister(f) {
	var c = confirm('등록 하시겠습니까?');
	if (c == true) {
		f.action = 'product.mul?cmd=registerimpl';
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
				<td class="left">NAME</td>
				<td><input type="text" name="name" required></td>
			</tr>
			<tr>
				<td class="left">PRICE</td>
				<td><input type="text" name="price" required></td>
			</tr>
			<tr>
				<td class="left">IMG</td>
				<td><input type="file" name="img" required></td>
			</tr>
		</table>
		<br>
		<input class="myButton" type="button" onclick="productRegister(this.form);"
			value="REGISTER"> 
		<input type="submit" id="submit_handle"
			style="display: none;">
		
	</form>
</div>