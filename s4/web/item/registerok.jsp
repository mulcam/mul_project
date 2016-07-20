<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<div id="itemok_center" class="center">
	<h1>item REGISTER OK</h1>
	<h3>${itemok.id }</h3>
	<h3>${itemok.name }</h3>
	<h3>${itemok.price }</h3>
	<h3><img src="img/${itemok.imgname1 }" style="width:200px"></h3>
	<h3><img src="img/${itemok.imgname2 }" style="width:200px"></h3>
	<h3>${itemok.regDate} </h3>
	<h3>정상적으로 등록되었습니다.</h3>
	<h3>
		<a href="item.mul?cmd=list">ITEM LIST</a>
	</h3>
</div>