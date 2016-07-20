<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<script>
	function custRegister(f) {
		var c = confirm('등록 하시겠습니까?');
		if (c == true) {
			f.action = 'customer.mul?cmd=registerimpl';
			f.method = 'POST';
			submit_handle.click();
		}
	};
</script>
<div id="customer_register" class="center">
	<h1>Customer Register</h1>

	<form>
		<table>
			<tr>
				<td class="left">ID</td>
				<td><input type="text" name="id" required></td>
			</tr>
			<tr>
				<td class="left">PWD</td>
				<td><input type="password" name="pwd" required></td>
			</tr>
			<tr>
				<td class="left">NAME</td>
				<td><input type="text" name="name" required></td>
			</tr>
		</table>
		<br>
		<input class="myButton" type="button" onclick="custRegister(this.form);"
			value="REGISTER"> 
		<input type="submit" id="submit_handle"
			style="display: none;">
	</form>
</div>