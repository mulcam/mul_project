<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<div id="product_center" class="center">
	<h1>PRODUCT</h1>
	<article>
		<p>1. PRO_SEQ 持失<br>
		CREATE SEQUENCE PRO_SEQ<br>
		 INCREMENT BY 1 START WITH 100;</p>

		<p>2.TB_PRO 持失<br>
		CREATE TABLE TB_PRO(<br>
		 ID NUMBER(10) PRIMARY KEY,<br>
			NAME VARCHAR2(20),<br> PRICE NUMBER(10),<br> IMGNAME VARCHAR2(20)<br> );</p>
	</article>
</div>