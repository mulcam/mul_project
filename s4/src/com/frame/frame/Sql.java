package com.frame.frame;

public class Sql {
	// Customer SQL
	public static String insertCustomer = "INSERT INTO TB_CUST VALUES(?,?,?)";
	public static String deleteCustomer = "DELETE FROM TB_CUST WHERE ID = ?";
	public static String updateCustomer = "UPDATE TB_CUST SET PWD=?, NAME=? WHERE ID = ?";
	public static String selectCustomer = "SELECT * FROM TB_CUST WHERE ID = ?";
	public static String selectAllCustomer = "SELECT * FROM TB_CUST ORDER BY ID";

	// Product SQL
	public static String insertProduct = "INSERT INTO TB_PRO VALUES(PRO_SEQ.NEXTVAL, ?,?,?)";
	public static String deleteProduct="DELETE FROM TB_PRO WHERE ID = ?";
	public static String updateProduct="UPDATE TB_PRO SET NAME = ?,PRICE = ?,IMGNAME = ? WHERE ID = ?";
	public static String selectProduct = "SELECT * FROM TB_PRO WHERE ID = ?";
	public static String selectAllProduct = "SELECT * FROM TB_PRO ORDER BY ID DESC";
	
	// Item SQL
	public static String insertItem = "INSERT INTO TB_ITEM VALUES(CONCAT(TO_CHAR(SYSDATE, 'yyyymmdd'),ITEM_SEQ.NEXTVAL), ?, ?, ?, ?,SYSDATE)";				
	public static String deleteItem="DELETE FROM TB_ITEM WHERE ID = ?";
	public static String updateItem="UPDATE TB_ITEM SET NAME = ?,PRICE = ?,IMGNAME1 = ?, IMGNAME2 = ? WHERE ID = ?";
	public static String selectItem = "SELECT * FROM TB_ITEM WHERE ID = ?";
	public static String selectAllItem = "SELECT * FROM TB_ITEM ORDER BY ID DESC";

}
