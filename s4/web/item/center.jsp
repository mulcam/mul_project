<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<div id="item_center" class="center">
	<h1>ITEM</h1>
	<article>
		<p>
			1. TB_ITEM ����<br /> CREATE TABLE TB_ITEM(<br /> ID VARCHAR2(20)
			PRIMARY KEY,<br /> NAME VARCHAR2(20),<br /> PRICE NUMBER(10),<br />
			IMGNAME1 VARCHAR2(20),<br /> IMGNAME2 VARCHAR2(20),<br /> REGDATE
			DATE<br /> );
		</p>
		<p>2. ����ȭ�鿡 ITEM�� �߰��Ͽ� CRUD�� �ϼ��Ͻÿ�</p>
		<ul>
			<li>- JSP Directory: item</li>
			<li>- Servlet Directory: com.component</li>
			<li>- Biz, DAO Directory: com.frame.item</li>
		</ul>
	</article>
</div>