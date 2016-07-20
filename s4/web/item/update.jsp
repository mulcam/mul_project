<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<script>
	function itemUpdate(f) {
		var c = confirm('수정 하시겠습니까?');
		if (c == true) {
			f.action = 'item.mul?cmd=updateimpl';
			f.method = 'POST';
			submit_handle.click();
		}
	};
</script>
<div id="item_register" class="center">
	<h1>item Register</h1>

	<form enctype="multipart/form-data">
		<table>
			<tr>
				<td class="left">ID</td>
				<td><input type="text" readonly
					style="background: none; border: none; color: white;" name="id"
					value="${updateitem.id}"></td>
			</tr>
			<tr>
				<td class="left">NAME</td>
				<td><input type="text" name="name" value="${updateitem.name}" required></td>
			</tr>
			<tr>
				<td class="left">PRICE</td>
				<td><input type="text" name="price" value="${updateitem.price}" required></td>
			</tr>
			<tr>
				<td class="left">IMG1</td>
				<td><input type="file" name="newimg1"><input type="hidden" name="img1" value="${updateitem.imgname1}"></td>
			</tr>
			<tr><td colspan="2">Existing IMG1 : ${updateitem.imgname1}</td></tr>
			<tr>
				<td class="left">IMG1</td>
				<td><input type="file" name="newimg2"><input type="hidden" name="img2" value="${updateitem.imgname2}"></td>
			</tr>
			<tr><td colspan="2">Existing IMG2 : ${updateitem.imgname2}</td></tr>
		</table>
		<br> <input class="myButton" type="button"
			onclick="itemUpdate(this.form);" value="UPDATE"> <input
			type="submit" id="submit_handle" style="display: none;">

	</form>
</div>