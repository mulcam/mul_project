package com.frame.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.frame.frame.DAO;
import com.frame.frame.Sql;
import com.vo.Customer;
import com.vo.Product;

public class ProductDAO extends DAO {

	@Override
	public void insert(Object obj) throws Exception {
		Product p = (Product) obj;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(Sql.insertProduct);
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getPrice());
			pstmt.setString(3, p.getImgname());
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
		Product p = (Product) obj;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(Sql.updateProduct);
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getPrice());
			pstmt.setString(3, p.getImgname());
			pstmt.setInt(4, p.getId());
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
		Product p = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(Sql.selectProduct);
			pstmt.setString(1, obj.toString());
			rset = pstmt.executeQuery();
			rset.next();

			p = new Product(rset.getInt("ID"), rset.getString("NAME"), rset.getInt("PRICE"), rset.getString("IMGNAME"));

		} catch (Exception e) {
			throw e;
		} finally {
			close(rset);
			close(pstmt);
			close(con);
		}
		return p;
	}

	@Override
	public ArrayList<Object> select() throws Exception {
		ArrayList<Object> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(Sql.selectAllProduct);

			rset = pstmt.executeQuery();
			while (rset.next()) {
				list.add(new Product(rset.getInt("ID"), rset.getString("NAME"), rset.getInt("PRICE"), rset.getString("IMGNAME")) );
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
			pstmt = con.prepareStatement(Sql.deleteProduct);
			pstmt.setInt(1, Integer.parseInt((String) obj));

			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
			close(con);
		}

	}

}
