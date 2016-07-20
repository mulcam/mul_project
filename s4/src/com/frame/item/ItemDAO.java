package com.frame.item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.frame.frame.DAO;
import com.frame.frame.Sql;
import com.test.LogPreparedStatement;
import com.vo.Item;

public class ItemDAO extends DAO {

	@Override
	public void insert(Object obj) throws Exception {
		Item i = (Item) obj;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(Sql.insertItem);
			pstmt.setString(1, i.getName());
			pstmt.setInt(2, i.getPrice());
			pstmt.setString(3, i.getImgname1());
			pstmt.setString(4, i.getImgname2());
			
			System.out.println(i);
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
		Item i = (Item) obj;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(Sql.updateItem);
			pstmt.setString(1, i.getName());
			pstmt.setInt(2, i.getPrice());
			pstmt.setString(3, i.getImgname1());
			pstmt.setString(4, i.getImgname2());
			pstmt.setString(5, i.getId());
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
		Item i = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(Sql.selectItem);
			pstmt.setString(1, obj.toString());
			rset = pstmt.executeQuery();
			rset.next();

			i = new Item(rset.getString("ID"), rset.getString("NAME"), rset.getInt("PRICE"), rset.getString("IMGNAME1"),
					rset.getString("IMGNAME2"), rset.getString("REGDATE"));

		} catch (Exception e) {
			throw e;
		} finally {
			close(rset);
			close(pstmt);
			close(con);
		}
		return i;
	}

	@Override
	public ArrayList<Object> select() throws Exception {
		ArrayList<Object> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(Sql.selectAllItem);

			rset = pstmt.executeQuery();
			while (rset.next()) {
				list.add(new Item(rset.getString("ID"), rset.getString("NAME"), rset.getInt("PRICE"),
						rset.getString("IMGNAME1"), rset.getString("IMGNAME2"), rset.getString("REGDATE")));
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
			pstmt = con.prepareStatement(Sql.deleteItem);
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
