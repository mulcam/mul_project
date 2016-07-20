<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<script>
	function login(f) {
		var c = confirm('로그인 하시겠습니까?');
		if (c == true) {
			f.action = 'login.mul';
			f.method = 'POST';
			submit_handle.click();
		}
	};
</script>

<div id="login_center" class="center">
	<h1>LOGIN</h1>
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
		</table>
		<br>
		<input class="myButton" type="button" value="LOGIN" onclick="login(this.form);"> <input
			type="submit" id="submit_handle" style="display: none">
	</form>
</div>