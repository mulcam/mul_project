<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<script>
	function itemRegister(f) {
		var c = confirm('등록 하시겠습니까?');
		if (c == true) {
			f.action = 'item.mul?cmd=registerimpl';
			f.method = 'POST';
			submit_handle.click();
		}
	};
</script>
<div id="item_register" class="center">
	<h1>Item Register</h1>

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
				<td class="left">IMG1</td>
				<td><input type="file" name="img1" required></td>
			</tr>
			<tr>
				<td class="left">IMG2</td>
				<td><input type="file" name="img2" required></td>
			</tr>
		</table>
		<br> <input class="myButton" type="button"
			onclick="itemRegister(this.form);" value="REGISTER"> <input
			type="submit" id="submit_handle" style="display: none;">

	</form>
</div>