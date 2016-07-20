package com.frame.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.frame.frame.DAO;
import com.frame.frame.Sql;
import com.vo.Customer;

public class CustomerDAO extends DAO {

	@Override
	public void insert(Object obj) throws Exception {
		Customer c = (Customer) obj;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(Sql.insertCustomer);
			pstmt.setString(1, c.getId());
			pstmt.setString(2, c.getPwd());
			pstmt.setString(3, c.getName());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
			close(con);
		}

	}

	@Override
	public void update(Object obj) throws Exception {
		Customer c = (Customer) obj;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		System.out.println( "customerdao :"  + obj);
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(Sql.updateCustomer);
			pstmt.setString(1, c.getPwd());
			pstmt.setString(2, c.getName());
			pstmt.setString(3, c.getId());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
			close(con);
		}

	}

	@Override
	public Object select(Object obj) throws Exception {
		Customer c = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(Sql.selectCustomer);
			pstmt.setString(1, obj.toString());
			rset = pstmt.executeQuery();
			rset.next();

			c = new Customer(rset.getString("ID"), rset.getString("PWD"), rset.getString("NAME"));

		} catch (Exception e) {
			throw e;
		} finally {
			close(rset);
			close(pstmt);
			close(con);
		}
		return c;
	}

	@Override
	public ArrayList<Object> select() throws Exception {
		ArrayList<Object> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(Sql.selectAllCustomer);

			rset = pstmt.executeQuery();
			while (rset.next()) {
				list.add(new Customer(rset.getString("ID"), rset.getString("PWD"), rset.getString("NAME")));
			}

		} catch (Exception e) {
			throw e;
		} finally {
			close(rset);
			close(pstmt);
			close(con);
		}
		return list;
	}

	@Override
	public void delete(Object obj) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(Sql.deleteCustomer);
			pstmt.setString(1, obj.toString());

			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
			close(con);
		}

	}

}
