<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<script>
	function custUpdate(f) {
		var c = confirm('수정하시겠습니까?');
		if (c == true) {
			f.action = 'customer.mul?cmd=updateimpl';
			f.method = 'POST';
			submit_handle.click();
		}
	};
</script>
<div id="customer_register" class="center">
	<h1>Customer Modify</h1>

	<form>
		<table>
			<tr>
				<td class="left">ID</td>
				<td><input type="text" readonly style="background:none;border:none;color:white;" name="id" value="${updatecust.id}" ></td>
			</tr>
			<tr>
				<td class="left">PWD</td>
				<td><input type="password" name="pwd"  value="${updatecust.pwd}"required></td>
			</tr>
			<tr>
				<td class="left">NAME</td>
				<td><input type="text" name="name"  value="${updatecust.name}"required></td>
			</tr>
		</table>
		<br>
		<input class="myButton" type="button" onclick="custUpdate(this.form);"
			value="UPDATE"> 
		<input type="submit" id="submit_handle"
			style="display: none;">
	</form>
</div>