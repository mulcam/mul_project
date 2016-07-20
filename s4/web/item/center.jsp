<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<div id="item_center" class="center">
	<h1>ITEM</h1>
	<article>
		<p>
			1. TB_ITEM 생성<br /> CREATE TABLE TB_ITEM(<br /> ID VARCHAR2(20)
			PRIMARY KEY,<br /> NAME VARCHAR2(20),<br /> PRICE NUMBER(10),<br />
			IMGNAME1 VARCHAR2(20),<br /> IMGNAME2 VARCHAR2(20),<br /> REGDATE
			DATE<br /> );
		</p>
		<p>2. 메인화면에 ITEM을 추가하여 CRUD를 완성하시오</p>
		<ul>
			<li>- JSP Directory: item</li>
			<li>- Servlet Directory: com.component</li>
			<li>- Biz, DAO Directory: com.frame.item</li>
		</ul>
	</article>
</div>