package com.frame.frame;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class DAO {
	// 변수
	private static String user = "db";
	private static String password = "dbdbdb";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";

	public DAO() {
		// Oracle 접속을 위한 Driver를 메모리에 올린다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver Loading Fail ..");
		}
	}

	public void close(ResultSet rset) throws SQLException {
		if (rset != null) {
			rset.close();
		}
	}

	public void close(Statement stmt) throws SQLException {
		if (stmt != null) {
			stmt.close();
		}
	}

	public void close(Connection con) throws SQLException {
		if (con != null) {
			con.close();
		}
	}

	public Connection getConnection() throws SQLException {
		Connection con = null;
		con = DriverManager.getConnection(url, user, password);
		return con;
	}

	public abstract void insert(Object obj) throws Exception;

	public abstract void update(Object obj) throws Exception;
	
	public abstract void delete(Object obj) throws Exception;

	public abstract Object select(Object obj) throws Exception;

	public abstract ArrayList<Object> select() throws Exception;

}
